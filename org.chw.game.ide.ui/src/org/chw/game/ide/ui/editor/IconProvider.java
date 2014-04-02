package org.chw.game.ide.ui.editor;

import java.util.Hashtable;

import org.eclipse.swt.graphics.Image;

public class IconProvider
{
	private static Hashtable<String, Image> imgHash=new Hashtable<String, Image>();
	
	public static Image getIcon(String path)
	{
		Image img=imgHash.get(path);
		if(img==null)
		{
			img = new Image(null, IconProvider.class.getClassLoader().getResourceAsStream(path));
			imgHash.put(path, img);
		}
		return img;
	}
	
}
