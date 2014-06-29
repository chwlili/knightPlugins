import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main
{

	public static void main(String[] args)
	{
		try
		{
			SAXParserFactory.newInstance().newSAXParser().parse(new File("C:\\Users\\chw\\.eclipse\\workspace\\Xml2As\\src\\test.xml"), new MyHandler());
		}
		catch (SAXException | IOException | ParserConfigurationException e)
		{
			e.printStackTrace();
		}
	}

	public static class MyHandler extends DefaultHandler
	{
		private String								xpath;

		private Field								root;
		private Hashtable<String, ModelDef>			name2model	= new Hashtable<String, ModelDef>();

		private Hashtable<String, ArrayList<Field>>	path2Field	= new Hashtable<String, ArrayList<Field>>();

		private Stack<ArrayList<Field>>				stackFields	= new Stack<ArrayList<Field>>();

		/**
		 * 构造函数
		 */
		public MyHandler()
		{
			ModelDef main = new ModelDef("/root", "Root");
			FieldDef rootField = new FieldDef("data", "datas", "Row", true);
			main.addField(rootField);

			ModelDef row = new ModelDef("", "Row");
			FieldDef rowField1 = new FieldDef("id", "id", "int", false);
			FieldDef rowField2 = new FieldDef("name", "name", "String", false);
			FieldDef rowField3 = new FieldDef("@comm", "comm", "String", false);
			row.addField(rowField1);
			row.addField(rowField2);
			row.addField(rowField3);

			name2model.put("Root", main);
			name2model.put("Row", row);

			root = new Field("", new FieldDef("/root", "root", "Root", false));
			path2Field.put(root.def.xpath, new ArrayList<Field>());
			path2Field.get(root.def.xpath).add(root);
		}

		private void onEnterElement(String xpath)
		{
			System.out.println(">" + xpath);

			ArrayList<Field> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			stackFields.push(new ArrayList<Field>());

			for (Field field : fields)
			{
				if (!field.def.isExtendType())
				{
					continue;
				}

				if (field.value != null && !field.def.isRepeted())
				{
					continue;
				}

				ModelDef model = name2model.get(field.def.type);
				if (model == null)
				{
					throw new Error("字段类型未找到! (" + field.def.type + ")");
				}

				Data fieldValue = new Data();

				for (FieldDef childFieldDef : model.fields)
				{
					String path = xpath + "/" + childFieldDef.xpath;

					Field childField = new Field(path, childFieldDef);

					fieldValue.fields.add(childField);

					if (!path2Field.containsKey(path))
					{
						path2Field.put(path, new ArrayList<Field>());
					}
					path2Field.get(path).add(childField);

					stackFields.lastElement().add(childField);
				}

				if (field.def.isRepeted())
				{
					if (field.values == null)
					{
						field.values = new ArrayList<Object>();
					}
					field.values.add(fieldValue);
				}
				else
				{
					field.value = fieldValue;
				}
			}
		}

		private void onAttribute(String xpath, String attributeName, String attributeValue)
		{
			System.out.println(" " + xpath + "@" + attributeName + " = " + attributeValue);

			xpath = xpath + "/@" + attributeName;

			ArrayList<Field> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			for (Field field : fields)
			{
				if (field.def.isExtendType())
				{
					continue;
				}

				if (field.value != null && !field.def.isRepeted())
				{
					continue;
				}

				Object fieldValue = null;

				if (field.def.isBoolean())
				{
					fieldValue = attributeValue.equals("true");
				}
				else if (field.def.isInt() || field.def.isUint())
				{
					fieldValue = Integer.parseInt(attributeValue);
				}
				else if (field.def.isNumber())
				{
					fieldValue = Float.parseFloat(attributeValue);
				}
				else if (field.def.isString())
				{
					fieldValue = attributeValue;
				}

				if (field.def.isRepeted())
				{
					if (field.values == null)
					{
						field.values = new ArrayList<Object>();
					}
					field.values.add(fieldValue);
				}
				else
				{
					field.value = fieldValue;
				}
			}
		}

		private void onText(String xpath, String text)
		{
			System.out.println(" " + xpath + " = " + text);

			ArrayList<Field> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			for (Field field : fields)
			{
				if (field.def.isExtendType())
				{
					continue;
				}

				if (field.value != null && !field.def.isRepeted())
				{
					continue;
				}

				Object fieldValue = null;

				if (field.def.isBoolean())
				{
					fieldValue = text.equals("true");
				}
				else if (field.def.isInt() || field.def.isUint())
				{
					fieldValue = Integer.parseInt(text);
				}
				else if (field.def.isNumber())
				{
					fieldValue = Float.parseFloat(text);
				}
				else if (field.def.isString())
				{
					fieldValue = text;
				}

				if (field.def.isRepeted())
				{
					if (field.values == null)
					{
						field.values = new ArrayList<Object>();
					}
					field.values.add(fieldValue);
				}
				else
				{
					field.value = fieldValue;
				}
			}
		}

		private void onExitElement(String xpath)
		{
			System.out.println("<" + xpath);

			ArrayList<Field> fields = stackFields.pop();
			for (Field field : fields)
			{
				String path=field.xpath;
				
				ArrayList<Field> table=path2Field.get(path);
				if(table!=null)
				{
					table.remove(field);
				}
			}
		}

		@Override
		public void startDocument() throws SAXException
		{
			xpath = "/";
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
		{
			if (xpath.equals("/"))
			{
				xpath = xpath + qName;
			}
			else
			{
				xpath = xpath + "/" + qName;
			}

			onEnterElement(xpath);

			for (int i = 0; i < attributes.getLength(); i++)
			{
				String attName = attributes.getQName(i);
				String attValue = attributes.getValue(i);

				onAttribute(xpath, attName, attValue);
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException
		{
			String text = new String(ch, start, length);
			text = text.trim();
			if (!text.isEmpty())
			{
				onText(xpath, text);
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException
		{
			onExitElement(xpath);
			xpath = xpath.substring(0, xpath.length() - qName.length() - 1);
		}

		@Override
		public void endDocument() throws SAXException
		{
			super.endDocument();
		}
	}

	public static class Field
	{
		public String				xpath;
		public FieldDef				def;

		public Object				value;
		public ArrayList<Object>	values;

		public Field(String xpath, FieldDef def)
		{
			this.xpath = xpath;
			this.def = def;
		}
	}

	public static class Data
	{
		public ArrayList<Field>	fields	= new ArrayList<Field>();
	}

	public static class ModelDef
	{
		private String				xpath;

		private String				name;
		private ArrayList<FieldDef>	fields	= new ArrayList<>();

		public ModelDef(String xpath, String name)
		{
			this.xpath = xpath;
			this.name = name;
		}

		public String getXPath()
		{
			return xpath;
		}

		public String getName()
		{
			return name;
		}

		public void addField(FieldDef field)
		{
			fields.add(field);
		}

		public int getFieldLength()
		{
			return fields.size();
		}

		public FieldDef getFieldAt(int index)
		{
			return fields.get(index);
		}
	}

	public static class FieldDef
	{
		private String	xpath;

		private String	name;
		private String	type;

		private Boolean	repeted;

		public FieldDef(String xpath, String name, String type, boolean repeted)
		{
			this.xpath = xpath;
			this.name = name;
			this.type = type;
			this.repeted = repeted;
		}

		public String getXPath()
		{
			return xpath;
		}

		public String getName()
		{
			return name;
		}

		public String getType()
		{
			return type;
		}

		public boolean isRepeted()
		{
			return repeted;
		}

		public boolean isNativeType()
		{
			return isBoolean() || isInt() || isUint() || isNumber() || isString();
		}

		public boolean isExtendType()
		{
			return !isNativeType();
		}

		public boolean isBoolean()
		{
			return type.equals("boolean");
		}

		public boolean isInt()
		{
			return type.equals("int");
		}

		public boolean isUint()
		{
			return type.equals("uint");
		}

		public boolean isNumber()
		{
			return type.equals("Number");
		}

		public boolean isString()
		{
			return type.equals("String");
		}
	}
}
