package org.chw.game.editor;

import java.util.ArrayList;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class DragStrategy
{
	private BaseEditor editor;
	private CheckboxTableViewer viewer;
	private Node temp;

	private DragSource source;
	private DropTarget target;

	private boolean draging = false;

	/**
	 * 初始化拖动策略
	 * 
	 * @param viewer
	 */
	public static void initDragStrategy(BaseEditor editor, CheckboxTableViewer viewer, Node temp)
	{
		new DragStrategy(editor, viewer, temp);
	}

	/**
	 * 构造函数
	 * 
	 * @param viewer
	 */
	private DragStrategy(BaseEditor editor, CheckboxTableViewer viewer, Node temp)
	{
		this.editor=editor;
		this.viewer = viewer;
		this.temp = temp;

		initMenu();
		initDragSource();
		initDropTarget();
	}

	/**
	 * 初始化菜单
	 */
	private void initMenu()
	{
		Table table = viewer.getTable();

		Menu menu = new Menu(table);
		table.setMenu(menu);

		final MenuItem addItem = new MenuItem(menu, SWT.NONE);
		addItem.setText("\u6DFB\u52A0");
		addItem.addSelectionListener(new SelectionAdapter()
		{
			@SuppressWarnings("unchecked")
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				@SuppressWarnings("rawtypes")
				ArrayList list = (ArrayList) viewer.getInput();
				
				Node node=temp.createClone();
				list.add(node);

				viewer.refresh();
				viewer.setChecked(node, node.select);
				
				editor.setDirty(true);
			}
		});

		final MenuItem delItem = new MenuItem(menu, SWT.NONE);
		delItem.setText("\u5220\u9664");
		delItem.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				@SuppressWarnings("rawtypes")
				ArrayList list = (ArrayList) viewer.getInput();

				Object[] selection = ((StructuredSelection) viewer.getSelection()).toArray();
				for (Object select : selection)
				{
					list.remove(select);
				}

				viewer.refresh();
				editor.setDirty(true);
			}
		});

		menu.addMenuListener(new MenuListener()
		{
			@Override
			public void menuShown(MenuEvent e)
			{
				delItem.setEnabled(viewer.getTable().getSelectionCount() > 0);
			}

			@Override
			public void menuHidden(MenuEvent e)
			{
			}
		});
	}

	private void initDragSource()
	{
		source = new DragSource(viewer.getTable(), DND.DROP_MOVE | DND.DROP_COPY);
		source.setTransfer(new Transfer[] { TextTransfer.getInstance() });
		source.addDragListener(new DragSourceListener()
		{
			@Override
			public void dragStart(DragSourceEvent event)
			{
				if (viewer.getTable().getSelectionCount() == 0)
				{
					event.doit = false;
				}
				else
				{
					draging = true;
				}
			}

			@Override
			public void dragSetData(DragSourceEvent event)
			{
				if (TextTransfer.getInstance().isSupportedType(event.dataType))
				{
					int[] indices = viewer.getTable().getSelectionIndices();
					StringBuilder sb = new StringBuilder();
					for (int index : indices)
					{
						if (sb.length() > 0)
						{
							sb.append(",");
						}
						sb.append(index);
					}

					event.data = sb.toString();
				}
			}

			@Override
			public void dragFinished(DragSourceEvent event)
			{
				draging = false;
			}
		});
	}

	private void initDropTarget()
	{
		target = new DropTarget(viewer.getTable(), DND.DROP_DEFAULT | DND.DROP_MOVE | DND.DROP_COPY);
		target.setTransfer(new Transfer[] { TextTransfer.getInstance() });
		target.addDropListener(new DropTargetListener()
		{
			@Override
			public void dragEnter(DropTargetEvent event)
			{
				if (!draging)
				{
					event.detail = DND.DROP_NONE;
					return;
				}
				if (event.detail == DND.DROP_COPY)
				{
					event.detail = DND.DROP_MOVE;
				}
			}

			@Override
			public void dragOver(DropTargetEvent event)
			{
				if (!draging)
				{
					event.feedback = DND.FEEDBACK_NONE;
					return;
				}
				event.feedback = DND.FEEDBACK_SCROLL | DND.FEEDBACK_INSERT_AFTER | DND.FEEDBACK_INSERT_BEFORE;
			}

			@Override
			public void dragOperationChanged(DropTargetEvent event)
			{
				if (!draging)
				{
					event.detail = DND.DROP_NONE;
					return;
				}
				if (event.detail == DND.DROP_DEFAULT)
				{
					event.detail = DND.DROP_MOVE;
				}
			}

			@Override
			public void dragLeave(DropTargetEvent event)
			{

			}

			@Override
			public void dropAccept(DropTargetEvent event)
			{

			}

			@SuppressWarnings("unchecked")
			@Override
			public void drop(DropTargetEvent event)
			{
				if (!draging)
				{
					event.detail = DND.DROP_NONE;
					return;
				}

				if (event.detail != DND.DROP_MOVE && event.detail != DND.DROP_COPY)
				{
					event.detail = DND.DROP_NONE;
					return;
				}

				TableItem item = (TableItem) event.item;
				TableItem[] items = viewer.getTable().getItems();
				for (int i = 0; i < items.length; i++)
				{
					if (items[i] == item)
					{
						int insertIndex = i;

						@SuppressWarnings("rawtypes")
						ArrayList list = (ArrayList) viewer.getInput();
						Object[] selection = ((StructuredSelection) viewer.getSelection()).toArray();
						ArrayList<Node> copys = new ArrayList<Node>();

						for (Object select : selection)
						{
							Node copy = select instanceof Node ? ((Node) select).createClone() : null;
							copys.add(copy);
							list.add(insertIndex, copy);

							insertIndex++;
						}

						if (event.detail == DND.DROP_MOVE)
						{
							for (Object select : selection)
							{
								list.remove(select);
							}
						}

						viewer.refresh();

						for (Node copy : copys)
						{
							viewer.setChecked(copy, copy.select);
						}
						editor.setDirty(true);
						break;
					}
				}
			}
		});
	}
}
