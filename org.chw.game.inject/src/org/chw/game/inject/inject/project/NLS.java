package org.chw.game.inject.inject.project;

import java.util.ArrayList;

public class NLS
{
	public final String text;
	public final ArrayList<Position> positions;

	public NLS(String text)
	{
		this.text = text;
		this.positions = new ArrayList<NLS.Position>();
	}

	public static class Position
	{
		public final String url;
		public final int row;
		public final int col;

		public Position(String url, int row, int col)
		{
			this.url = url;
			this.row = row;
			this.col = col;
		}

		public String getString()
		{
			return url + "#" + row + ":" + col;
		}
	}
}
