package org.chw.game.ide.ui.editor.parts;

import java.util.List;

import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.swt.graphics.Color;

public class MessageFieldEditPart extends AbsTypeEditPart
{
	private Label nameLabel;
	private Label typeLabel;

	/**
	 * 构造函数
	 * 
	 * @param field
	 */
	public MessageFieldEditPart(MessageField field)
	{
		super.setModel(field);
	}

	/**
	 * 获取数据
	 * 
	 * @return
	 */
	private MessageField getData()
	{
		return (MessageField) getModel();
	}

	/**
	 * 获取子级数据
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelChildren()
	{
		if(isExpaned() && hasChildren())
		{
			MessageComplexField field = (MessageComplexField) getData();
			MessageType type = (MessageType) field.getType();
			
			return type.getFields();
		}

		return super.getModelChildren();
	}


	@Override
	protected void createLabel(Figure parent)
	{
		nameLabel = new Label(getData().getName());
		if (getData().getAttr().equals("repeated"))
		{
			nameLabel.setIcon(IconProvider.getIcon("/icons/repeatedFieldIcon.gif"));
		}
		else if (getData().getAttr().equals("optional"))
		{
			nameLabel.setIcon(IconProvider.getIcon("/icons/optionalFieldIcon.gif"));
		}
		else
		{
			nameLabel.setIcon(IconProvider.getIcon("/icons/requiredFieldIcon.gif"));
		}
		parent.add(nameLabel);
		
		typeLabel = new Label();
		typeLabel.setForegroundColor(new Color(null, 149, 125, 71));
		if (getData() instanceof MessageSimpleField)
		{
			typeLabel.setText(" : " + ((MessageSimpleField) getData()).getType() + " ");
		}
		else if (getData() instanceof MessageComplexField)
		{
			typeLabel.setText(" : " + ((MessageComplexField) getData()).getType().getName() + " ");
		}
		parent.add(typeLabel);
	}

	/**
	 * 是否有子级
	 */
	@Override
	protected boolean hasChildren()
	{
		if (getData() instanceof MessageComplexField)
		{
			MessageComplexField field = (MessageComplexField) getData();
			if (field.getType() instanceof MessageType)
			{
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 创建编辑策略
	 */
	@Override
	protected void createEditPolicies()
	{

	}
}
