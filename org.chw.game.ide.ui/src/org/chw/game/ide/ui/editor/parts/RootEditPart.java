package org.chw.game.ide.ui.editor.parts;

import java.util.List;

import org.chw.game.ide.proto.Model;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class RootEditPart extends AbstractGraphicalEditPart
{
	public RootEditPart(Model model)
	{
		setModel(model);
	}
	
	@Override
	protected IFigure createFigure()
	{
		Figure panel = new Figure();
		panel.setBorder(new MarginBorder(10, 10, 10, 10));
		panel.setLayoutManager(new ToolbarLayout(false));

		return panel;
	}

	@Override
	protected void createEditPolicies()
	{

	}

	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelChildren()
	{
		Model model = (Model) getModel();
		return model.getElements();
	}

}
