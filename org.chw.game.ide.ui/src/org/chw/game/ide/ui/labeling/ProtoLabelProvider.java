package org.chw.game.ide.ui.labeling;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.ImportInfo;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.OptionInfo;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

public class ProtoLabelProvider extends DefaultEObjectLabelProvider
{

	@Inject
	public ProtoLabelProvider(AdapterFactoryLabelProvider delegate)
	{
		super(delegate);
	}

	@Override
	protected Object doGetText(Object element)
	{
		if (element instanceof ImportInfo)
		{
			ImportInfo node = (ImportInfo) element;
			String text = node.getImportURI();
			text = text.substring(1, text.length() - 1);
			return text;
		}
		else if (element instanceof OptionInfo)
		{
			OptionInfo node = (OptionInfo) element;
			String text = node.getName() + "=" + node.getValue().substring(1, node.getValue().length() - 1);
			return text;
		}
		return super.doGetText(element);
	}

	@Override
	protected Object doGetImage(Object element)
	{
		if (element instanceof MessageField)
		{
			MessageField field = (MessageField) element;
			if (field.getAttr().equals("repeated"))
			{
				return "repeatedFieldIcon.gif";
			}
			else if (field.getAttr().equals("optional"))
			{
				return "optionalFieldIcon.gif";
			}
			else
			{
				return "requiredFieldIcon.gif";
			}
		}
		else if (element instanceof EnumField)
		{
			return "enumFieldIcon.gif";
		}
		else if (element instanceof MessageType)
		{
			return "messageIcon.gif";
		}
		else if (element instanceof EnumType)
		{
			return "enumIcon.gif";
		}
		else if (element instanceof Model)
		{
			return "packageIcon.gif";
		}
		else if (element instanceof ImportInfo)
		{
			return "importIcon.gif";
		}
		else if (element instanceof OptionInfo)
		{
			return "optionIcon.gif";
		}
		else if (element instanceof String)
		{
			return element;
		}
		return "messageFieldIcon.gif";
	}
}
