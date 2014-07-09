package org.chw.game.ui.editor;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class Xml2AsEditor extends XtextEditor
{
	@Override
	protected boolean isEditorInputIncludedInContextMenu()
	{
		return true;
	}
	
	@Override
	protected void createActions()
	{
		super.createActions();
		
		ResourceBundle boundle=new ResourceBundle()
		{
			@Override
			public Enumeration<String> getKeys()
			{
				return null;
			}

			@Override
			protected Object handleGetObject(String key)
			{
				return null;
			}
		};
		
		TextOperationAction action;
		
		action=new TextOperationAction(boundle, "", this, ISourceViewer.FORMAT);
		action.setText("∏Ò ΩªØ");
		action.setActionDefinitionId("org.eclipse.xtext.ui.FormatAction");
		setAction("chw_formatAction", action);
		
		action=new TextOperationAction(boundle, "", this, ISourceViewer.FORMAT);
		action.setText("≤‚ ‘");
		action.setActionDefinitionId("org.eclipse.xtext.ui.FormatAction");
		setAction("chw_testAction", action);
		
	}
	
	@Override
	protected void editorContextMenuAboutToShow(IMenuManager menu)
	{
		menu.add(new Separator(ITextEditorActionConstants.GROUP_COPY));
		menu.add(new Separator(ITextEditorActionConstants.GROUP_PRINT));
		menu.add(new Separator("innerEdit"));
		menu.add(new Separator(ITextEditorActionConstants.GROUP_FIND));
		menu.add(new Separator(ITextEditorActionConstants.GROUP_REST));
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

		if (isEditable())
		{
			addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.CUT);
			addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.COPY);
			addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.PASTE);
		}
		else
		{
			addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.COPY);
		}
		
		addAction(menu, "innerEdit", "chw_formatAction");
		addAction(menu, "innerEdit", ITextEditorActionConstants.CONTENT_ASSIST);
		addAction(menu, "innerEdit", ITextEditorActionConstants.SHIFT_RIGHT);
		addAction(menu, "innerEdit", ITextEditorActionConstants.SHIFT_LEFT);
		addAction(menu, "innerEdit", "chw_testAction");
	}
}
