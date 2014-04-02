package org.chw.game.ide.ui.editor.parts;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.ui.editor.IconProvider;
import org.eclipse.draw2d.AbstractBackground;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public abstract class AbsTypeEditPart extends AbstractGraphicalEditPart
{
	private Figure box;
	private Figure labelBox;
	private ImageFigure arrow;
	private Figure contentPane;

	private boolean expanded = false;
	private boolean entered = false;

	private static MarginBorder blankBorder = new MarginBorder(1, 1, 1, 1);
	private static TreeNodeOverBorder overingBorder=new TreeNodeOverBorder();
	private static Label tip=new Label();
	
	/**
	 * 是否已经展开
	 * @return
	 */
	protected boolean isExpaned()
	{
		return expanded;
	}
	
	/**
	 * 创建显示对象
	 */
	@Override
	protected IFigure createFigure()
	{
		Figure head = new Figure();
		head.setLayoutManager(new ToolbarLayout(true));
		
		arrow = new ImageFigure();
		head.add(arrow);

		labelBox = new Figure();
		labelBox.setBorder(blankBorder);
		labelBox.setLayoutManager(new ToolbarLayout(true));
		labelBox.addMouseMotionListener(label_mouseMotionListener);
		createLabel(labelBox);
		head.add(labelBox);

		if(hasChildren())
		{
			labelBox.addMouseListener(label_mouseListener);
			arrow.addMouseListener(arrow_mouseListener);
			arrow.addMouseMotionListener(arrow_mouseMotionListener);
		}

		box = new Figure();
		box.setLayoutManager(new ToolbarLayout(false));
		box.add(head);

		return box;
	}
	
	/**
	 * 创建标签内容
	 * @param parent
	 */
	protected abstract void createLabel(Figure parent);
	
	/**
	 * 创建内容面板
	 */
	@Override
	public IFigure getContentPane()
	{
		if (contentPane == null)
		{
			contentPane = new Figure();
			contentPane.setBorder(new MarginBorder(0, 20, 0, 0));
			contentPane.setLayoutManager(new ToolbarLayout(false));
			box.add(contentPane);
		}

		return contentPane;
	}
	
	/**
	 * 是否有子级内容
	 * @return
	 */
	protected abstract boolean hasChildren();
	
	/**
	 * 更新显示
	 */
	@Override
	protected void refreshVisuals()
	{
		super.refreshVisuals();
		
		String path = "/icons/arrow_null.gif";

		if (hasChildren())
		{
			if (expanded)
			{
				path = entered ? "/icons/arrow_open_over.png" : "/icons/arrow_open.png";
			}
			else
			{
				path = entered ? "/icons/arrow_close_over.png" : "/icons/arrow_close.png";
			}
		}

		arrow.setImage(IconProvider.getIcon(path));
	}
	
	// ----------------------------------------------------------

	private MouseListener arrow_mouseListener = new MouseListener()
	{
		@Override
		public void mousePressed(MouseEvent me)
		{
			me.consume();

			expanded = !expanded;
			refresh();
		}

		@Override
		public void mouseReleased(MouseEvent me)
		{
		}

		@Override
		public void mouseDoubleClicked(MouseEvent me)
		{
		}
	};

	private MouseMotionListener arrow_mouseMotionListener = new MouseMotionListener()
	{
		@Override
		public void mouseMoved(MouseEvent me)
		{
		}

		@Override
		public void mouseHover(MouseEvent me)
		{
		}

		@Override
		public void mouseEntered(MouseEvent me)
		{
			entered = true;
			refreshVisuals();
		}

		@Override
		public void mouseExited(MouseEvent me)
		{
			entered = false;
			refreshVisuals();
		}

		@Override
		public void mouseDragged(MouseEvent me)
		{
		}
	};

	private MouseListener label_mouseListener = new MouseListener()
	{
		@Override
		public void mousePressed(MouseEvent me)
		{
			me.consume();
		}

		@Override
		public void mouseReleased(MouseEvent me)
		{
		}

		@Override
		public void mouseDoubleClicked(MouseEvent me)
		{
			expanded = !expanded;
			refresh();
		}
	};
	private MouseMotionListener label_mouseMotionListener = new MouseMotionListener()
	{
		@Override
		public void mouseMoved(MouseEvent me)
		{
		}

		@Override
		public void mouseHover(MouseEvent me)
		{
		}

		@Override
		public void mouseEntered(MouseEvent me)
		{
			labelBox.setBorder(overingBorder);
			
			if(getModel() instanceof EObject)
			{
				String text=getComment((EObject)getModel());
				if(text!=null && text.isEmpty()==false)
				{
					tip.setText(text);
					labelBox.setToolTip(tip);
				}
			}
		}

		@Override
		public void mouseExited(MouseEvent me)
		{
			labelBox.setBorder(blankBorder);
			if(getModel() instanceof EObject)
			{
				labelBox.setToolTip(null);
			}
		}

		@Override
		public void mouseDragged(MouseEvent me)
		{
		}
	};
	
	//-----------------------------------------------------------------

	private String getComment(EObject o)
	{
		if ((o instanceof MessageField) || (o instanceof EnumField))
		{
			ICompositeNode obj = NodeModelUtils.findActualNodeFor(o);
			INode node = obj.getNextSibling();

			if (node != null)
			{
				if (node.getGrammarElement() instanceof RuleCall)
				{
					if (((RuleCall) node.getGrammarElement()).getRule().getName().equals("Comment_ALL"))
					{
						return getLastComment(node.getText());
					}
				}
			}
		}

		return null;
	}

	private String getLastComment(String text)
	{
		if (text != null)
		{
			text = text.trim();

			if (text.startsWith("//"))
			{
				return text.substring(2);
			}
			else if (text.startsWith("/*"))
			{
				return text.substring(2, text.length() - 2);
			}
		}
		return null;
	}
	
	private static class TreeNodeOverBorder extends AbstractBackground
	{
		@Override
		public Insets getInsets(IFigure figure)
		{
			return new Insets(1);
		}
		
		@Override
		public void paintBackground(IFigure figure, Graphics graphics, Insets insets)
		{
			Rectangle rect=new Rectangle();
			rect.setBounds(figure.getBounds());
			rect.width-=1;
			rect.height-=1;
			//rect.shrink(getInsets(figure));
			
			int h=rect.height;
			
			graphics.setLineWidth(1);
			graphics.setLineStyle(Graphics.LINE_SOLID);
			graphics.setBackgroundColor(new Color(null, 237, 245, 255));
			graphics.fillRoundRectangle(rect, 5, 5);
			
			rect.setHeight(rect.height/2);
			graphics.setBackgroundColor(ColorConstants.white);
			graphics.fillRoundRectangle(rect, 5, 5);
			
			rect.setHeight(h);
			graphics.setForegroundColor(new Color(null, 185, 215, 253));
			graphics.drawRoundRectangle(rect, 5, 5);
		}
	}
}
