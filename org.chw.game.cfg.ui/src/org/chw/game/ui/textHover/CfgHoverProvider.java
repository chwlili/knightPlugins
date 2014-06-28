package org.chw.game.ui.textHover;

import org.chw.game.cfg.Field;
import org.chw.game.cfg.Type;
import org.eclipse.emf.ecore.EObject;
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

		if (comm.isEmpty() == false)
		{
			comm = comm.trim();
			if (comm.isEmpty() == false)
			{
				if (comm.startsWith("//"))
				{
					return comm.substring(2);
				}
				else if(comm.startsWith("/*"))
				{
					comm = comm.substring(2, comm.length() - 2);
					comm.trim();
					if(comm.isEmpty()==false)
					{
						StringBuilder sb=new StringBuilder();
						
						String[] parts=comm.split("(\\r\\n|\\r|\\n)");
						for(String part:parts)
						{
							part=part.trim();
							if(!part.isEmpty())
							{
								part=part.replaceFirst("\\*\\s*", "");
								if(!part.isEmpty())
								{
									sb.append(part+"<br/>");
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
}
