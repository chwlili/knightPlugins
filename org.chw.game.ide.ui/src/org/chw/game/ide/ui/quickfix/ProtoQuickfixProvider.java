package org.chw.game.ide.ui.quickfix;

import java.util.Arrays;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.validation.ProtoValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class ProtoQuickfixProvider extends DefaultQuickfixProvider
{
	@Fix(ProtoValidator.Message_Field_Index_Conflict)
	public void fixMessageFieldIndexConflict(final Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, "自动选择可用标识", "自动选择可用标识", "requiredFieldIcon.gif", new ISemanticModification()
		{
			public void apply(EObject element, IModificationContext context) throws Exception
			{
				MessageType type = (MessageType) element.eContainer();
				if (type != null)
				{
					int[] indexs = new int[type.getFields().size()];

					int index = 0;
					for (MessageField field : type.getFields())
					{
						indexs[index] = field.getIndex();
						index++;
					}

					Arrays.sort(indexs);

					int curr = indexs[0];
					for (int i = 1; i < indexs.length; i++)
					{
						if (indexs[i] > curr + 1)
						{
							((MessageField) element).setIndex(curr + 1);
							return;
						}
						curr = indexs[i];
					}

					((MessageField) element).setIndex(curr + 1);
				}
			}
		});
	}

	@Fix(ProtoValidator.Enum_Field_Index_Conflict)
	public void fixEnumFieldIndexConflict(final Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, "自动选择可用标识", "自动选择可用标识", "requiredFieldIcon.gif", new ISemanticModification()
		{
			public void apply(EObject element, IModificationContext context) throws Exception
			{
				EnumType type = (EnumType) element.eContainer();
				if (type != null)
				{
					int[] indexs = new int[type.getFields().size()];

					int index = 0;
					for (EnumField field : type.getFields())
					{
						indexs[index] = field.getIndex();
						index++;
					}

					Arrays.sort(indexs);

					int curr = indexs[0];
					for (int i = 1; i < indexs.length; i++)
					{
						if (indexs[i] > curr + 1)
						{
							((EnumField) element).setIndex(curr + 1);
							return;
						}
						curr = indexs[i];
					}

					((EnumField) element).setIndex(curr + 1);
				}
			}
		});
	}
}
