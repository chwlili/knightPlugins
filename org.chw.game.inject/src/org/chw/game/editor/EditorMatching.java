package org.chw.game.editor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.FileEditorInput;


public class EditorMatching implements IEditorMatchingStrategy
{

	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput input)
	{
		if(input instanceof FileEditorInput)
		{
			FileEditorInput fileInput=(FileEditorInput)input;
			if(fileInput.getName().endsWith("server.xml")||fileInput.getName().endsWith("client.xml"))
			{
				if(editorRef.getId().equals("org.chw.game.editor.clientEditor"))
				{
					return true;
				}
			}
		}
		
		return false;
	}

}
