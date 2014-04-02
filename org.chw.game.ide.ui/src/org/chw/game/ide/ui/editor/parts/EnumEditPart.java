package org.chw.game.ide.ui.editor.parts;

import java.util.List;

import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;

public class EnumEditPart extends AbsTypeEditPart
{
	/**
	 * 构造函数
	 * 
	 * @param data
	 */
	public EnumEditPart(EnumType data)
	{
		setModel(data);
	}

	/**
	 * 获取消息
	 * 
	 * @return
	 */
	public EnumType getData()
	{
		return (EnumType) getModel();
	}

	/**
	 * 获取子级数据
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelChildren()
	{
		if (isExpaned() && getData().getFields().size() > 0)
		{
			return getData().getFields();
		}

		return super.getModelChildren();
	}
	
	/**
	 * 创建编辑策略
	 */
	@Override
	protected void createEditPolicies()
	{
	}


	@Override
	protected void createLabel(Figure parent)
	{
		Label label = new Label(getData().getName());
		label.setIcon(IconProvider.getIcon("/icons/enumIcon.gif"));
		
		parent.add(label);
	}

	@Override
	protected boolean hasChildren()
	{
		return true;
	}
}
