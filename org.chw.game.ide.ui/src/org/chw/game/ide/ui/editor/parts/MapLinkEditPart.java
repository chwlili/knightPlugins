package org.chw.game.ide.ui.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.chw.game.ide.proto.Map;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class MapLinkEditPart extends AbstractGraphicalEditPart
{
	private Figure box;
	private Figure content;

	public MapLinkEditPart(Map data)
	{
		super.setModel(data);
	}

	private Map getData()
	{
		return (Map) getModel();
	}

	@Override
	protected IFigure createFigure()
	{
		box = new Figure();
		box.setLayoutManager(new ToolbarLayout(false));

		content = new Figure();
		content.setLayoutManager(new LinkLayout());
		box.add(content);

		return box;
	}

	@Override
	protected void createEditPolicies()
	{
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelChildren()
	{
		ArrayList<Object> datas = new ArrayList<Object>();
		datas.add(getData());
		datas.add(getData().getBind());

		return datas;
	}

	@Override
	public IFigure getContentPane()
	{
		return content;
	}

	class LinkLayout implements LayoutManager
	{

		@Override
		public Object getConstraint(IFigure child)
		{
			return null;
		}

		@Override
		public Dimension getMinimumSize(IFigure container, int wHint, int hHint)
		{
			return getPreferredSize(container, wHint, hHint);
		}

		@Override
		public Dimension getPreferredSize(IFigure container, int wHint, int hHint)
		{
			IFigure left = (IFigure) container.getChildren().get(0);
			IFigure right = (IFigure) container.getChildren().get(1);

			Dimension leftSize = left.getPreferredSize(wHint, hHint);
			Dimension rightSize = right.getPreferredSize(wHint, hHint);

			Dimension d = new Dimension(leftSize.width + rightSize.width, Math.max(leftSize.height, rightSize.height));

			Insets insets = container.getInsets();
			d.expand(insets.getWidth(), insets.getHeight());

			return d;
		}

		@Override
		public void invalidate()
		{
		}

		@Override
		public void layout(IFigure container)
		{
			if (container.getChildren().size() == 2)
			{
				Rectangle bounds = container.getClientArea();

				IFigure left = (IFigure) container.getChildren().get(0);
				IFigure right = (IFigure) container.getChildren().get(1);
				
				Rectangle leftRect = bounds.getCopy().shrink(0, bounds.width / 3);
				Rectangle rightRect = bounds.getCopy().shrink(0, bounds.width / 3);
				rightRect.setX(bounds.width - rightRect.width);
				
				leftRect.height=rightRect.height=Math.max(left.getPreferredSize().height, right.getPreferredSize().height);

				left.setBounds(leftRect);
				right.setBounds(rightRect);
			}
		}

		@Override
		public void remove(IFigure child)
		{
		}

		@Override
		public void setConstraint(IFigure child, Object constraint)
		{
		}
	}
}
