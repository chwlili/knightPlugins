package org.chw.game.ide.ui.textHover;

import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.Model;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class ProtoHoverProvider extends DefaultEObjectHoverProvider implements IEObjectHoverProvider
{

	@Override
	protected boolean hasHover(EObject o)
	{
		if (o instanceof Element)
		{
			return true;
		}
		else if ((o instanceof MessageField) || (o instanceof EnumField) || (o instanceof MapField))
		{
			return true;
		}

		return false;
	}

	@Override
	protected String getFirstLine(EObject o)
	{
		if (o instanceof Element)
		{
			return "<b>" + getTypeName(o) + "</b> (" + getFileName(o) + ")";
		}
		else if (o instanceof MessageSimpleField)
		{
			return "<b>" + ((MessageSimpleField) o).getName() + " : " + ((MessageSimpleField) o).getType() + "</b>";
		}
		else if (o instanceof MessageComplexField)
		{
			return "<b>" + ((MessageComplexField) o).getName() + " : " + getTypeName(o) + "</b> (" + getFileName(o) + ")";
		}
		else if (o instanceof EnumField)
		{
			return "<b>" + ((EnumField) o).getName() + "</b>";
		}
		else if (o instanceof MapField)
		{
			MapField field = (MapField) o;
			if (field.getFilter() != null)
			{
				Map filter = field.getFilter();
				return "<b>" + ((MapField) o).getName() + " : " + getTypeName(filter) + "</b> (" + getFileName(filter) + ")";
			}
			else
			{
				MapRef ref = field.getLinks();
				if (ref != null)
				{
					while (ref.getChild() != null)
					{
						ref = ref.getChild();
					}
					if (ref != null)
					{
						MessageField dest = ref.getLink();
						if (dest instanceof MessageComplexField)
						{
							return "<b>" + ((MapField) o).getName() + " : " + getTypeName(dest) + "</b> (" + getFileName(dest) + ")";
						}
						else
						{
							return "<b>" + ((MapField) o).getName() + " : " + ((MessageSimpleField) dest).getType() + "</b>";
						}
					}
				}
			}
			return "<b>" + ((MapField) o).getName() + "</b>";
		}
		return "";
	}

	/**
	 * 获取文件名
	 * 
	 * @param element
	 * @return
	 */
	private String getFileName(EObject element)
	{
		return element.eResource().getURI().toString().replaceFirst(element.eResource().getURI().trimSegments(3).toString() + "/", "");
	}

	/**
	 * 获取包名
	 * 
	 * @param element
	 * @return
	 */
	private String getTypeName(EObject element)
	{
		String pack = "";
		while (element != null)
		{
			if (element instanceof Element)
			{
				pack = ((Element) element).getName() + "." + pack;
			}
			else if (element instanceof Model)
			{
				pack = ((Model) element).getName() + "." + pack;
			}
			element = element.eContainer();
		}
		if (pack.endsWith("."))
		{
			pack = pack.substring(0, pack.length() - 1);
		}
		return pack;
	}

	@Override
	protected String getDocumentation(EObject o)
	{
		if (o instanceof Element)
		{
			ICompositeNode obj = NodeModelUtils.findActualNodeFor(o);
			INode node = obj.getPreviousSibling();

			if (node != null)
			{
				if (node.getGrammarElement() instanceof RuleCall)
				{
					if (((RuleCall) node.getGrammarElement()).getRule().getName().equals("Comment_ALL"))
					{
						return getLastComment(node.getText());
					}
				}
			}
		}
		else if ((o instanceof MessageField) || (o instanceof EnumField))
		{
			ICompositeNode obj = NodeModelUtils.findActualNodeFor(o);
			INode node = obj.getNextSibling();

			if (node != null)
			{
				if (node.getGrammarElement() instanceof RuleCall)
				{
					if (((RuleCall) node.getGrammarElement()).getRule().getName().equals("Comment_ALL"))
					{
						return getLastComment(node.getText());
					}
				}
			}
		}
		else if (o instanceof MapField)
		{
			MapField field = (MapField) o;

			ICompositeNode obj = NodeModelUtils.findActualNodeFor(o);
			INode node = obj.getPreviousSibling();

			if (node != null)
			{
				if (node.getGrammarElement() instanceof RuleCall)
				{
					if (((RuleCall) node.getGrammarElement()).getRule().getName().equals("Comment_ALL"))
					{
						return getLastComment(node.getText());
					}
				}
			}

			MapRef ref = field.getLinks();
			if (ref != null)
			{
				while (ref.getChild() != null)
				{
					ref = ref.getChild();
				}
				if (ref != null)
				{
					o = ref.getLink();
					obj = NodeModelUtils.findActualNodeFor(o);
					node = obj.getNextSibling();

					if (node != null)
					{
						if (node.getGrammarElement() instanceof RuleCall)
						{
							if (((RuleCall) node.getGrammarElement()).getRule().getName().equals("Comment_ALL"))
							{
								return getLastComment(node.getText());
							}
						}
					}
				}
			}
		}
		return null;
	}

	private String getLastComment(String text)
	{
		if (text != null)
		{
			text = text.trim();

			if (text.startsWith("//"))
			{
				return text.substring(2);
			}
			else if (text.startsWith("/*"))
			{
				return text.substring(2, text.length() - 2);
			}
		}
		return null;
	}
}
