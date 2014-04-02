package org.chw.game.inject.inject.view;

import java.util.ArrayList;

import org.chw.game.inject.inject.data.Element;
import org.chw.game.inject.inject.data.ModuleType;
import org.chw.game.inject.inject.data.Package;
import org.chw.game.inject.inject.project.Project;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ContentProvider implements ITreeContentProvider
{

	@Override
	public void dispose()
	{
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		
	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement)
	{
		if(parentElement instanceof Package)
		{
			Package data=(Package)parentElement;
			
			ArrayList<Object> result=new ArrayList<Object>();
			for(ModuleType module:data.getModules())
			{
				result.add(module);
			}
			
			for(Element element:data.getElements())
			{
				result.add(element);
			}
			
			return result.toArray(new Object[result.size()]);
		}
		else if(parentElement instanceof Project)
		{
			Project project=(Project)parentElement;
			
			return project.getPackages().toArray(new Package[project.getPackages().size()]);
		}
		return null;
	}

	@Override
	public Object getParent(Object element)
	{
		return null;
	}

	@Override
	public boolean hasChildren(Object element)
	{
		return element instanceof Package;
	}

}
