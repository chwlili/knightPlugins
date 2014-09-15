package org.chw.game.builder;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CfgOutputStream extends DataOutputStream
{
	public CfgOutputStream(OutputStream arg0)
	{
		super(arg0);
	}

	public void writeVarInt(int value) throws IOException
	{
		while (true)
		{
			if ((value & ~0x7F) == 0)
			{
				writeByte(value);
				return;
			}
			else
			{
				writeByte((value & 0x7F) | 0x80);
				value >>>= 7;
			}
		}
	}
}
