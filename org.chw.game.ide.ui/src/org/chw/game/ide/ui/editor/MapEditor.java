package org.chw.game.ide.ui.editor;

import org.chw.game.ide.proto.Model;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class MapEditor extends GraphicalEditor
{

	@Inject
	private Provider<XtextResourceSetProvider> resourceProvider;

	private Model model;

	public MapEditor()
	{
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void configureGraphicalViewer()
	{
		super.configureGraphicalViewer();

		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new MapEditPartFactory());
		viewer.setRootEditPart(new ScalableRootEditPart());
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);

		IFileEditorInput fileInput = (IFileEditorInput) input;

		XtextResourceSetProvider provider = resourceProvider.get();
		ResourceSet resSet = provider.get(fileInput.getFile().getProject());

		URI uri = URI.createURI(fileInput.getFile().getFullPath().toString());

		Resource obj = resSet.getResource(uri, true);
		EList<EObject> allContent = obj.getContents();

		model = (Model) allContent.get(0);
		
		setTitle(fileInput.getName());
	}

	@Override
	protected void initializeGraphicalViewer()
	{
		GraphicalViewer viewer=getGraphicalViewer();
		viewer.setContents(model);
	}

	@Override
	public void doSave(IProgressMonitor monitor)
	{
	}

}
