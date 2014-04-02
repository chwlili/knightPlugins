package org.chw.game.ide.ui.editor.parts;

import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;

public class MapFieldEditPart extends AbsTypeEditPart
{
	public MapFieldEditPart(MapField data)
	{
		setModel(data);
	}
	
	public MapField getData()
	{
		return (MapField)getModel();
	}
	
	@Override
	protected void createLabel(Figure parent)
	{
		Label label = new Label(getData().getName());
		label.setIcon(IconProvider.getIcon("/icons/requiredFieldIcon.gif"));

		parent.add(label);
	}

	@Override
	protected boolean hasChildren()
	{
		return false;
	}

	@Override
	protected void createEditPolicies()
	{
	}

}
