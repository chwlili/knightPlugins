package org.chw.swf.writer;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class SwfDoAbcWriter extends DataOutputStream
{

	private ByteArrayOutputStream bytes;

	public SwfDoAbcWriter(ByteArrayOutputStream arg0)
	{
		super(arg0);
		bytes = arg0;
	}

	public byte[] getBytes()
	{
		return bytes.toByteArray();
	}

	/*
	public void writeU30(int val) throws IOException
	{
		while (true)
		{
			if ((val & ~0x7F) == 0)
			{
				writeByte(val);
				return;
			}
			else
			{
				writeByte((val & 0x7F) | 0x80);
				val >>= 7;
			}
		}
	}
	*/

	public void writeU30(int v) throws IOException
	{
		if(v==6224)
		{
			System.out.println("..");
		}
		if ((v < 128) && (v >= 0))
		{
			bytes.write(v);
		}
		else if ((v < 16384) && (v >= 0))
		{
			bytes.write(v & 0x7F | 0x80);
			bytes.write(v >> 7);
		}
		else if ((v < 2097152) && (v >= 0))
		{
			bytes.write(v & 0x7F | 0x80);
			bytes.write(v >> 7 | 0x80);
			bytes.write(v >> 14);
		}
		else if ((v < 268435456) && (v >= 0))
		{
			bytes.write(v & 0x7F | 0x80);
			bytes.write(v >> 7 | 0x80);
			bytes.write(v >> 14 | 0x80);
			bytes.write(v >> 21);
		}
		else
		{
			bytes.write(v & 0x7F | 0x80);
			bytes.write(v >> 7 | 0x80);
			bytes.write(v >> 14 | 0x80);
			bytes.write(v >> 21 | 0x80);
			bytes.write(v >>> 28);
		}
	}

	public void writeU32(int val) throws IOException
	{
		while (true)
		{
			writeByte((val & 0x7F) | 0x80);

			val = val >> 7;

			if (val == 0)
			{
				break;
			}
		}
	}

	public void writeS32(int val) throws IOException
	{
		while (true)
		{
			writeByte((val & 0x7F) | 0x80);

			val = val >> 7;

			if (val == 0)
			{
				break;
			}
		}
	}
}
