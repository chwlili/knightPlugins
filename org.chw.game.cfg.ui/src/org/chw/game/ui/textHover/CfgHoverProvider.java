package org.chw.game.ui.textHover;

import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
import org.chw.game.cfg.Param;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class CfgHoverProvider extends DefaultEObjectHoverProvider implements IEObjectHoverProvider
{

	@Override
	protected boolean hasHover(EObject o)
	{
		if (o instanceof Type)
		{
			return true;
		}
		else if (o instanceof Field)
		{
			return true;
		}
		else if (o instanceof NativeType || o instanceof ListType || o instanceof HashType)
		{
			return true;
		}
		else if (o instanceof Param)
		{
			return true;
		}
		return false;
	}

	@Override
	protected String getFirstLine(EObject o)
	{
		if (o instanceof Type)
		{
			return "<b>" + ((Type) o).getName() + "</b>";
		}
		else if (o instanceof Field)
		{
			return "<b>" + ((Field) o).getFieldName() + "</b>";
		}
		else if (o instanceof Param)
		{
			Param param = (Param) o;
			HashType hashType = (HashType) NodeModelUtils.findActualNodeFor(param).getParent().getSemanticElement();
			Type type = getType(param.eResource(), hashType.getType());
			for (Field field : type.getFields())
			{
				if(param.getParamName().equals(field.getFieldName()))
				{
					return getFirstLine(field);
				}
			}
		}
		else
		{
			String typeName = null;
			if (o instanceof NativeType)
			{
				typeName = ((NativeType) o).getType();
			}
			else if (o instanceof ListType)
			{
				typeName = ((ListType) o).getType();
			}
			else if (o instanceof HashType)
			{
				typeName = ((HashType) o).getType();
			}

			if (isNativeType(typeName))
			{
				return "<b>" + typeName + "</b>";
			}
			else
			{
				Type fieldType = getType(o.eResource(), typeName);
				if (fieldType != null)
				{
					return getFirstLine(fieldType);
				}
			}
		}
		return "";
	}

	@Override
	protected String getDocumentation(EObject o)
	{
		String comm = "";

		if (o instanceof Type)
		{
			comm = ((Type) o).getComm();
		}
		else if (o instanceof Field)
		{
			comm = ((Field) o).getComm();
		}
		else if (o instanceof Param)
		{
			Param param = (Param) o;
			HashType hashType = (HashType) NodeModelUtils.findActualNodeFor(param).getParent().getSemanticElement();
			Type type = getType(param.eResource(), hashType.getType());
			for (Field field : type.getFields())
			{
				if(param.getParamName().equals(field.getFieldName()))
				{
					return getDocumentation(field);
				}
			}
		}
		else
		{
			String typeName = null;
			if (o instanceof NativeType)
			{
				typeName = ((NativeType) o).getType();
			}
			else if (o instanceof ListType)
			{
				typeName = ((ListType) o).getType();
			}
			else if (o instanceof HashType)
			{
				typeName = ((HashType) o).getType();
			}

			if (isNativeType(typeName))
			{
				return "<b>" + typeName + "</b>";
			}
			else
			{
				Type fieldType = getType(o.eResource(), typeName);
				if (fieldType != null)
				{
					return getDocumentation(fieldType);
				}
			}
		}

		if (comm.isEmpty() == false)
		{
			comm = comm.trim();
			if (comm.isEmpty() == false)
			{
				if (comm.startsWith("//"))
				{
					return comm.substring(2);
				}
				else if (comm.startsWith("/*"))
				{
					comm = comm.substring(2, comm.length() - 2);
					comm.trim();
					if (comm.isEmpty() == false)
					{
						StringBuilder sb = new StringBuilder();

						String[] parts = comm.split("(\\r\\n|\\r|\\n)");
						for (String part : parts)
						{
							part = part.trim();
							if (!part.isEmpty())
							{
								part = part.replaceFirst("\\*\\s*", "");
								if (!part.isEmpty())
								{
									sb.append(part + "<br/>");
								}
							}
						}
						return sb.toString();
					}
				}
			}
		}

		return null;
	}

	private boolean isNativeType(String text)
	{
		return text.equals("boolean") || text.equals("int") || text.equals("uint") || text.equals("Number") || text.equals("String");
	}

	private Type getType(Resource resource, String typeName)
	{
		if (resource != null)
		{
			EList<EObject> list = resource.getContents();

			if (list.size() > 0)
			{
				XML2 xml2 = (XML2) list.get(0);
				if (xml2 != null)
				{
					for (Type type : xml2.getTypes())
					{
						if (typeName.equals(type.getName()))
						{
							return type;
						}
					}
				}
			}
		}
		return null;
	}
}
