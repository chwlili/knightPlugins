package org.chw.game.builder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FileDef
{
	private static String xpath;
	private static InstanceField root;
	private static Hashtable<String, TypeDef> name2model;
	private static Hashtable<String, ArrayList<InstanceField>> path2Field;
	private static Stack<ArrayList<InstanceField>> stackFields;

	/**
	 * 打开输入流
	 * 
	 * @param stream
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	public static Instance build(InputStream stream, TypeDef[] allType, TypeDef mainType) throws SAXException, IOException, ParserConfigurationException
	{
		xpath = null;
		root = null;
		name2model = new Hashtable<String, TypeDef>();
		path2Field = new Hashtable<String, ArrayList<InstanceField>>();
		stackFields = new Stack<ArrayList<InstanceField>>();

		for (TypeDef type : allType)
		{
			name2model.put(type.getName(), type);
		}

		if (mainType != null)
		{
			root = new InstanceField("", new TypeFieldDef(mainType.getXPath(), "root", "", mainType.getName()));
			path2Field.put(root.getDef().xpath, new ArrayList<InstanceField>());
			path2Field.get(root.getDef().xpath).add(root);

			SAXParserFactory.newInstance().newSAXParser().parse(stream, new MyHandler());

			return (Instance) root.getValue();
		}

		return null;
	}

	private static class MyHandler extends DefaultHandler
	{
		@SuppressWarnings("unchecked")
		private void onEnterElement(String xpath)
		{
			System.out.println(">" + xpath);

			stackFields.push(new ArrayList<InstanceField>());

			ArrayList<InstanceField> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			for (InstanceField field : fields)
			{
				if (!field.getDef().isExtendType())
				{
					continue;
				}

				if (field.getValue() != null && !field.getDef().repeted)
				{
					continue;
				}

				TypeDef model = name2model.get(field.getDef().type);
				if (model == null)
				{
					throw new Error("字段类型未找到! (" + field.getDef().type + ")");
				}

				Instance fieldValue = new Instance(model);

				for (TypeFieldDef childFieldDef : model.fields)
				{
					String path = xpath + "/" + childFieldDef.xpath;

					InstanceField childField = new InstanceField(path, childFieldDef);

					fieldValue.getFields().add(childField);

					if (!path2Field.containsKey(path))
					{
						path2Field.put(path, new ArrayList<InstanceField>());
					}
					path2Field.get(path).add(childField);

					stackFields.lastElement().add(childField);
				}

				if (field.getDef().repeted)
				{
					if (field.getValue() == null)
					{
						field.setValue(new ArrayList<Object>());
					}

					((List<Instance>) field.getValue()).add(fieldValue);
				}
				else
				{
					field.setValue(fieldValue);
				}
			}
		}

		@SuppressWarnings("unchecked")
		private void onAttribute(String xpath, String attributeName, String attributeValue)
		{
			System.out.println(" " + xpath + "@" + attributeName + " = " + attributeValue);

			xpath = xpath + "/@" + attributeName;

			ArrayList<InstanceField> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			for (InstanceField field : fields)
			{
				if (field.getDef().isExtendType())
				{
					continue;
				}

				if (field.getValue() != null && !field.getDef().repeted)
				{
					continue;
				}

				Object fieldValue = null;

				if (field.getDef().isBoolean())
				{
					fieldValue = attributeValue.equals("true");
				}
				else if (field.getDef().isInt() || field.getDef().isUint())
				{
					fieldValue = Integer.parseInt(attributeValue);
				}
				else if (field.getDef().isNumber())
				{
					fieldValue = Float.parseFloat(attributeValue);
				}
				else if (field.getDef().isString())
				{
					fieldValue = attributeValue;
				}

				if (field.getDef().repeted)
				{
					if (field.getValue() == null)
					{
						field.setValue(new ArrayList<Object>());
					}

					((List<Object>) field.getValue()).add(fieldValue);
				}
				else
				{
					field.setValue(fieldValue);
				}
			}
		}

		@SuppressWarnings("unchecked")
		private void onText(String xpath, String text)
		{
			System.out.println(" " + xpath + " = " + text);

			ArrayList<InstanceField> fields = path2Field.get(xpath);
			if (fields == null)
			{
				return;
			}

			for (InstanceField field : fields)
			{
				if (field.getDef().isExtendType())
				{
					continue;
				}

				if (field.getValue() != null && !field.getDef().repeted)
				{
					continue;
				}

				Object fieldValue = null;

				if (field.getDef().isBoolean())
				{
					fieldValue = text.equals("true");
				}
				else if (field.getDef().isInt() || field.getDef().isUint())
				{
					fieldValue = Integer.parseInt(text);
				}
				else if (field.getDef().isNumber())
				{
					fieldValue = Float.parseFloat(text);
				}
				else if (field.getDef().isString())
				{
					fieldValue = text;
				}

				if (field.getDef().repeted)
				{
					if (field.getValue() == null)
					{
						field.setValue(new ArrayList<Object>());
					}

					((List<Object>) field.getValue()).add(fieldValue);
				}
				else
				{
					field.setValue(fieldValue);
				}
			}
		}

		private void onExitElement(String xpath)
		{
			System.out.println("<" + xpath);

			ArrayList<InstanceField> fields = stackFields.pop();
			for (InstanceField field : fields)
			{
				String path = field.getXPath();

				ArrayList<InstanceField> table = path2Field.get(path);
				if (table != null)
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

}
