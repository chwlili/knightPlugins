package org.chw.game.editor;

public abstract class Node
{
	public boolean select;
	
	public Node(boolean select)
	{
		this.select=select;
	}
	
	public abstract Node createClone();
}
