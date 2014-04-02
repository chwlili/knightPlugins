package org.chw.game.editor;

import java.util.ArrayList;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;

public class EditProvider
{
	/**
	 * 初始化内容提供器
	 * 
	 * @param checkboxTableViewer
	 */
	private static void initContentProvider(CheckboxTableViewer checkboxTableViewer)
	{
		checkboxTableViewer.setContentProvider(new IStructuredContentProvider()
		{
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
			{
			}

			@Override
			public void dispose()
			{
			}

			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
			public Object[] getElements(Object inputElement)
			{
				if (inputElement instanceof ArrayList)
				{
					return ((ArrayList) inputElement).toArray(new Object[((ArrayList) inputElement).size()]);
				}
				return new Object[0];
			}
		});
	}

	/**
	 * 初始化编辑策略
	 * 
	 * @param viewer
	 * @return
	 */
	public static void initEditStrategy(CheckboxTableViewer checkboxTableViewer)
	{
		TableViewerEditor.create(checkboxTableViewer, new ColumnViewerEditorActivationStrategy(checkboxTableViewer)
		{
			@Override
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event)
			{
				if (((IStructuredSelection) getViewer().getSelection()).size() == 1)
				{
					return (event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC || event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL);
				}
				return false;
			}
		}, ColumnViewerEditor.DEFAULT);
	}

	// ---------------------------------------------------------------------------------------

	/**
	 * 初始化版本表
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 * @param column3
	 * @param column4
	 */
	public static void initVerViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3, TableViewerColumn column4)
	{
		// 内容提供器
		initContentProvider(tableViewer);

		// 双击编辑单元格
		initEditStrategy(tableViewer);

		// 选择-标签提供器
		column1.setLabelProvider(new ColumnLabelProvider());

		// 名称-标签提供器
		column2.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof VerNode)
				{
					return ((VerNode) element).name;
				}
				return "";
			}
		});

		// 地址-标签提供器
		column3.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof VerNode)
				{
					return ((VerNode) element).path;
				}
				return "";
			}
		});

		// 策略-标签提供器
		column4.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof VerNode)
				{
					return ((VerNode) element).policy;
				}
				return "";
			}
		});

		// 名称-编辑提供器
		column2.setEditingSupport(new EditingSupport(column2.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((VerNode) element).name;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				VerNode node = (VerNode) element;
				if (!node.name.equals(value.toString()))
				{
					node.name = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 地址-编辑提供器
		column3.setEditingSupport(new EditingSupport(column3.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((VerNode) element).path;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				VerNode node = (VerNode) element;
				if (!node.path.equals(value.toString()))
				{
					node.path = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 策略-编辑提供器
		column4.setEditingSupport(new EditingSupport(column4.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((VerNode) element).policy;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				VerNode node = (VerNode) element;
				if (!node.policy.equals(value.toString()))
				{
					node.policy = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});
	}

	// ---------------------------------------------------------------------------------------

	/**
	 * 初始化日志验证表
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 */
	public static void initLogViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3)
	{
		// 内容提供器
		initContentProvider(tableViewer);

		// 双击编辑单元格
		initEditStrategy(tableViewer);

		// 选择-标签提供器
		column1.setLabelProvider(new ColumnLabelProvider());

		// 名称-标签提供器
		column2.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof LogNode)
				{
					return ((LogNode) element).name;
				}
				return "";
			}
		});

		// 地址-标签提供器
		column3.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof LogNode)
				{
					return ((LogNode) element).path;
				}
				return "";
			}
		});

		// 名称-编辑提供器
		column2.setEditingSupport(new EditingSupport(column2.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((LogNode) element).name;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				LogNode node = (LogNode) element;
				if (!node.name.equals(value.toString()))
				{
					node.name = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 地址-编辑提供器
		column3.setEditingSupport(new EditingSupport(column3.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((LogNode) element).path;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				LogNode node = (LogNode) element;
				if (!node.path.equals(value.toString()))
				{
					node.path = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});
	}

	// ---------------------------------------------------------------------------------------

	/**
	 * 初始化验证表
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 */
	public static void initAuthViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2)
	{
		// 内容提供器
		initContentProvider(tableViewer);

		// 双击编辑单元格
		initEditStrategy(tableViewer);

		// 选择-标签提供器
		column1.setLabelProvider(new ColumnLabelProvider());

		// 名称-标签提供器
		column2.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof NameNode)
				{
					return ((NameNode) element).name;
				}
				return "";
			}
		});

		// 名称-编辑提供器
		column2.setEditingSupport(new EditingSupport(column2.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((NameNode) element).name;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				NameNode node = (NameNode) element;
				if (!node.name.equals(value.toString()))
				{
					node.name = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});
	}

	// ---------------------------------------------------------------------------------------

	/**
	 * 初始化服务表
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 * @param column3
	 * @param column4
	 */
	public static void initServerViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3, TableViewerColumn column4, TableViewerColumn column5)
	{
		// 内容提供器
		initContentProvider(tableViewer);

		// 双击编辑单元格
		initEditStrategy(tableViewer);

		// 选择-标签提供器
		column1.setLabelProvider(new ColumnLabelProvider());

		// 名称-标签提供器
		column2.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof ServerNode)
				{
					return ((ServerNode) element).name;
				}
				return "";
			}
		});

		// 域名-标签提供器
		column3.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof ServerNode)
				{
					return ((ServerNode) element).path;
				}
				return "";
			}
		});

		// 端口-标签提供器
		column4.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof ServerNode)
				{
					return ((ServerNode) element).port;
				}
				return "";
			}
		});

		// 世界ID-标签提供器
		column5.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				if (element instanceof ServerNode)
				{
					return ((ServerNode) element).world;
				}
				return "";
			}
		});

		// 名称-编辑提供器
		column2.setEditingSupport(new EditingSupport(column2.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((ServerNode) element).name;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				ServerNode node = (ServerNode) element;
				if (!node.name.equals(value.toString()))
				{
					node.name = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 域名-编辑提供器
		column3.setEditingSupport(new EditingSupport(column3.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((ServerNode) element).path;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				ServerNode node = (ServerNode) element;
				if (!node.path.equals(value.toString()))
				{
					node.path = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 端口-编辑提供器
		column4.setEditingSupport(new EditingSupport(column4.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((ServerNode) element).port;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				ServerNode node = (ServerNode) element;
				if (!node.port.equals(value.toString()))
				{
					node.port = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});

		// 世界-编辑提供器
		column5.setEditingSupport(new EditingSupport(column5.getViewer())
		{
			@Override
			protected boolean canEdit(Object element)
			{
				return true;
			}

			@Override
			protected Object getValue(Object element)
			{
				return ((ServerNode) element).world;
			}

			@Override
			protected void setValue(Object element, Object value)
			{
				ServerNode node = (ServerNode) element;
				if (!node.world.equals(value.toString()))
				{
					node.world = value.toString();
					tableViewer.refresh();
					editor.setDirty(true);
				}
			}

			@Override
			protected CellEditor getCellEditor(Object element)
			{
				return new TextCellEditor(tableViewer.getTable());
			}
		});
	}
}
