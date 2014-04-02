package org.chw.game.ide.ui.editor.parts;

import org.chw.game.ide.proto.Element;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class ElementPart extends AbstractGraphicalEditPart
{
	public ElementPart(Element model)
	{
		setModel(model);
	}
	
	public Element getElement()
	{
		return (Element)getModel();
	}
	
	@Override
	protected IFigure createFigure()
	{
		return new Label(getElement().getName());
	}

	@Override
	protected void createEditPolicies()
	{
	}

}
