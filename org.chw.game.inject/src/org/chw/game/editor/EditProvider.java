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
	 * ��ʼ�������ṩ��
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
	 * ��ʼ���༭����
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
	 * ��ʼ���汾��
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 * @param column3
	 * @param column4
	 */
	public static void initVerViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3, TableViewerColumn column4)
	{
		// �����ṩ��
		initContentProvider(tableViewer);

		// ˫���༭��Ԫ��
		initEditStrategy(tableViewer);

		// ѡ��-��ǩ�ṩ��
		column1.setLabelProvider(new ColumnLabelProvider());

		// ����-��ǩ�ṩ��
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

		// ��ַ-��ǩ�ṩ��
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

		// ����-��ǩ�ṩ��
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

		// ����-�༭�ṩ��
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

		// ��ַ-�༭�ṩ��
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

		// ����-�༭�ṩ��
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
	 * ��ʼ����־��֤��
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 */
	public static void initLogViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3)
	{
		// �����ṩ��
		initContentProvider(tableViewer);

		// ˫���༭��Ԫ��
		initEditStrategy(tableViewer);

		// ѡ��-��ǩ�ṩ��
		column1.setLabelProvider(new ColumnLabelProvider());

		// ����-��ǩ�ṩ��
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

		// ��ַ-��ǩ�ṩ��
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

		// ����-�༭�ṩ��
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

		// ��ַ-�༭�ṩ��
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
	 * ��ʼ����֤��
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 */
	public static void initAuthViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2)
	{
		// �����ṩ��
		initContentProvider(tableViewer);

		// ˫���༭��Ԫ��
		initEditStrategy(tableViewer);

		// ѡ��-��ǩ�ṩ��
		column1.setLabelProvider(new ColumnLabelProvider());

		// ����-��ǩ�ṩ��
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

		// ����-�༭�ṩ��
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
	 * ��ʼ�������
	 * 
	 * @param tableViewer
	 * @param column1
	 * @param column2
	 * @param column3
	 * @param column4
	 */
	public static void initServerViewer(final BaseEditor editor, final CheckboxTableViewer tableViewer, TableViewerColumn column1, TableViewerColumn column2, TableViewerColumn column3, TableViewerColumn column4, TableViewerColumn column5)
	{
		// �����ṩ��
		initContentProvider(tableViewer);

		// ˫���༭��Ԫ��
		initEditStrategy(tableViewer);

		// ѡ��-��ǩ�ṩ��
		column1.setLabelProvider(new ColumnLabelProvider());

		// ����-��ǩ�ṩ��
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

		// ����-��ǩ�ṩ��
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

		// �˿�-��ǩ�ṩ��
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

		// ����ID-��ǩ�ṩ��
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

		// ����-�༭�ṩ��
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

		// ����-�༭�ṩ��
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

		// �˿�-�༭�ṩ��
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

		// ����-�༭�ṩ��
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
