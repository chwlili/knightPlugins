package org.chw.game.ide.ui.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.chw.game.ide.proto.Map;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;

public class MapEditPart extends AbsTypeEditPart
{
	public MapEditPart(Map data)
	{
		setModel(data);
	}

	private Map getData()
	{
		return (Map) getModel();
	}

	@Override
	protected void createLabel(Figure parent)
	{
		Label label = new Label(getData().getName());
		label.setIcon(IconProvider.getIcon("/icons/packageIcon.gif"));

		parent.add(label);
	}

	@Override
	protected boolean hasChildren()
	{
		return true;
	}
	
	@Override
	public IFigure getContentPane()
	{
		IFigure panel=super.getContentPane();
		panel.setLayoutManager(new ToolbarLayout(true));
		return panel;
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

	@Override
	protected void createEditPolicies()
	{
	}

}
