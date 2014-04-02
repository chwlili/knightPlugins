package org.chw.game.ide.ui.editor.parts;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;

public class EnumFieldEditPart extends AbsTypeEditPart
{
	public EnumFieldEditPart(EnumField data)
	{
		setModel(data);
	}
	
	private EnumField getData()
	{
		return (EnumField)getModel();
	}
	
	@Override
	protected void createEditPolicies()
	{
	}

	@Override
	protected void createLabel(Figure parent)
	{
		Label label=new Label(getData().getName());
		label.setIcon(IconProvider.getIcon("/icons/enumFieldIcon.gif"));
		
		parent.add(label);
	}

	@Override
	protected boolean hasChildren()
	{
		return false;
	}

}
