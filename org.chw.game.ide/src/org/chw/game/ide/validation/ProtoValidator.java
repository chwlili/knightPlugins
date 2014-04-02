package org.chw.game.ide.validation;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.ProtoPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

public class ProtoValidator extends AbstractProtoValidator
{

	public static final String Message_Field_Index_Conflict = "message_field_index_conflict";
	public static final String Enum_Field_Index_Conflict = "enum_field_index_conflict";

	@Check
	public void checkMessageField(MessageField field)
	{
		MessageType type = (MessageType) field.eContainer();
		if (type != null)
		{
			boolean nameConflicted = false;
			boolean indexConflicted = false;

			for (int i = 0; i < type.eContents().size(); i++)
			{
				EObject item = type.eContents().get(i);

				if (!item.equals(field) && item instanceof MessageField)
				{
					MessageField msgItem = (MessageField) item;
					if (!nameConflicted && msgItem.getName().equals(field.getName()))
					{
						warning("字段名称冲突", ProtoPackage.Literals.MESSAGE_FIELD__NAME);
						nameConflicted = true;
					}
					if (!indexConflicted && msgItem.getIndex() == field.getIndex())
					{
						warning("字段标识冲突 : " + field.getName() + " 和 " + msgItem.getName(), ProtoPackage.Literals.MESSAGE_FIELD__INDEX, Message_Field_Index_Conflict);
						indexConflicted = true;
					}
				}

				if (nameConflicted && indexConflicted)
				{
					return;
				}
			}
		}
	}

	@Check
	public void checkEnumField(EnumField field)
	{
		EnumType type = (EnumType) field.eContainer();
		if (type != null)
		{
			boolean nameConflicted = false;
			boolean indexConflicted = false;

			for (int i = 0; i < type.eContents().size(); i++)
			{
				EObject item = type.eContents().get(i);

				if (!item.equals(field) && item instanceof EnumField)
				{
					EnumField msgItem = (EnumField) item;
					if (!nameConflicted && msgItem.getName().equals(field.getName()))
					{
						warning("字段名称冲突", ProtoPackage.Literals.ENUM_FIELD__NAME);
						nameConflicted = true;
					}
					if (!indexConflicted && msgItem.getIndex() == field.getIndex())
					{
						warning("字段标识冲突 : " + field.getName() + " 和 " + msgItem.getName(), ProtoPackage.Literals.ENUM_FIELD__INDEX, Enum_Field_Index_Conflict);
						indexConflicted = true;
					}
				}

				if (nameConflicted && indexConflicted)
				{
					break;
				}
			}
		}
	}
}
