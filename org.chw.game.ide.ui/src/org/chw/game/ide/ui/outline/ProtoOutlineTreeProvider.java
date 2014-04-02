package org.chw.game.ide.ui.outline;

import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.ImportInfo;
import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.OptionInfo;
import org.chw.game.ide.proto.Type;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

import com.google.inject.Inject;

public class ProtoOutlineTreeProvider extends DefaultOutlineTreeProvider
{

	private static TextStyle defStyle;
	private static TextStyle commStyle;

	@Inject
	private IImageHelper imgHelper;

	@Inject
	private StylerFactory styleFactory;

	/**
	 * 默认样式
	 * 
	 * @return
	 */
	private TextStyle getDefStyle()
	{
		if (defStyle == null)
		{
			defStyle = new TextStyle();
			defStyle.setColor(new RGB(00, 00, 00));
		}
		return defStyle;
	}

	/**
	 * 灰色样式
	 * 
	 * @return
	 */
	private TextStyle getCommStyle()
	{
		if (commStyle == null)
		{
			commStyle = new TextStyle();
			commStyle.setColor(new RGB(149, 125, 71));
		}
		return commStyle;
	}

	/**
	 * Model
	 * 
	 * @param parent
	 * @param model
	 * 
	 */
	protected void _createNode(DocumentRootNode parent, Model model)
	{
		if (model.getName() != null)
		{
			new EObjectNode(model, parent, imgHelper.getImage("packageIcon.gif"), model.getName(), true);
		}

		if (model.getImports().size() > 0)
		{
			EObjectNode importsNode = new EObjectNode(model.getImports().get(0), parent, imgHelper.getImage("importsIcon.gif"), "imports", false);
			for (ImportInfo importNode : model.getImports())
			{
				createNode(importsNode, importNode);
			}
		}

		if (model.getOptions().size() > 0)
		{
			EObjectNode optionsNode = new EObjectNode(model.getOptions().get(0), parent, imgHelper.getImage("optionsIcon.gif"), "options", false);
			for (OptionInfo optionNode : model.getOptions())
			{
				createNode(optionsNode, optionNode);
			}
		}

		if (model.getElements().size() > 0)
		{
			for (Element element : model.getElements())
			{
				createNode(parent, element);
			}
		}
	}

	// Import
	protected Image _image(ImportInfo data)
	{
		return imgHelper.getImage("importIcon.gif");
	}

	protected Object _text(ImportInfo data)
	{
		return data.getImportURI().substring(1, data.getImportURI().length() - 1);
	}

	protected boolean _isLeaf(ImportInfo data)
	{
		return true;
	}

	// Option
	protected Image _image(OptionInfo data)
	{
		return imgHelper.getImage("optionIcon.gif");
	}

	protected Object _text(OptionInfo data)
	{
		return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" = " + data.getValue().substring(1, data.getValue().length() - 1), getCommStyle()));
	}

	protected boolean _isLeaf(OptionInfo data)
	{
		return true;
	}

	// Message
	protected Image _image(MessageType data)
	{
		return imgHelper.getImage("messageIcon.gif");
	}

	protected Object _text(MessageType data)
	{
		return data.getName();
	}

	protected boolean _isLeaf(MessageType data)
	{
		return false;
	}

	protected void _createChildren(IOutlineNode parent, MessageType type)
	{
		for (MessageField field : type.getFields())
		{
			createNode(parent, field);
		}
		for (Type childType : type.getTypes())
		{
			createNode(parent, childType);
		}
	}

	// Enum
	protected Image _image(EnumType data)
	{
		return imgHelper.getImage("enumIcon.gif");
	}

	protected Object _text(EnumType data)
	{
		return data.getName();
	}

	protected boolean _isLeaf(EnumType data)
	{
		return false;
	}

	protected void _createChildren(IOutlineNode parent, EnumType type)
	{
		for (EnumField field : type.getFields())
		{
			createNode(parent, field);
		}
	}

	// Map
	protected Image _image(Map data)
	{
		return imgHelper.getImage("mapIcon.gif");
	}

	protected Object _text(Map data)
	{
		return data.getName();
	}

	protected boolean _isLeaf(Map data)
	{
		return false;
	}

	protected void _createChildren(IOutlineNode parent, Map type)
	{
		for (MapField field : type.getFields())
		{
			createNode(parent, field);
		}
	}

	// MessageField
	protected Image _image(MessageField data)
	{
		if ("required".equals(data.getAttr()))
		{
			return imgHelper.getImage("requiredMapFieldIcon.gif");
		}
		else if ("optional".equals(data.getAttr()))
		{
			return imgHelper.getImage("optionalMapFieldIcon.gif");
		}
		else if ("repeated".equals(data.getAttr()))
		{
			return imgHelper.getImage("repeatedMapFieldIcon.gif");
		}
		else
		{
			return imgHelper.getImage("requiredMapFieldIcon.gif");
		}
	}

	protected Object _text(MessageComplexField data)
	{
		return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" : " + data.getType().getName(), getCommStyle()));
	}

	protected Object _text(MessageSimpleField data)
	{
		return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" : " + data.getType(), getCommStyle()));
	}

	protected boolean _isLeaf(MessageField data)
	{
		return true;
	}

	// EnumField
	protected Image _image(EnumField data)
	{
		return imgHelper.getImage("enumFieldIcon.gif");
	}

	protected Object _text(EnumField data)
	{
		return data.getName();
	}

	protected boolean _isLeaf(EnumField data)
	{
		return true;
	}

	// MapField
	protected Image _image(MapField data)
	{
		if ("required".equals(data.getAttr()))
		{
			return imgHelper.getImage("requiredFieldIcon.gif");
		}
		else if ("optional".equals(data.getAttr()))
		{
			return imgHelper.getImage("optionalFieldIcon.gif");
		}
		else if ("repeated".equals(data.getAttr()))
		{
			return imgHelper.getImage("repeatedFieldIcon.gif");
		}
		else
		{
			return imgHelper.getImage("messageFieldIcon.gif");
		}
	}

	protected Object _text(MapField data)
	{
		if (data.getFilter() != null)
		{
			return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" : " + data.getFilter().getName(), getCommStyle()));
		}
		else
		{
			MapRef ref = data.getLinks();
			while (ref.getChild() != null)
			{
				ref = ref.getChild();
			}
			if (ref != null)
			{
				MessageField field = ref.getLink();
				if (field instanceof MessageComplexField)
				{
					return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" : " + ((MessageComplexField) ref.getLink()).getType().getName(), getCommStyle()));
				}
				else if (field instanceof MessageSimpleField)
				{
					return styleFactory.createFromXtextStyle(data.getName(), getDefStyle()).append(styleFactory.createFromXtextStyle(" : " + ((MessageSimpleField) ref.getLink()).getType(), getCommStyle()));
				}
			}
			return data.getName();
		}
	}

	protected boolean _isLeaf(MapField data)
	{
		return true;
	}
}
