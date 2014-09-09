package org.chw.game.builder.output;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;

public class IntOutput
{
	private int partSize;
	public Hashtable<Integer, IntValue> int_count;
	
	public IntOutput(int partSize)
	{
		this.partSize=partSize;
		this.int_count=new Hashtable<Integer, IntValue>();
	}
	
	/**
	 * Ìí¼ÓInt
	 * @param value
	 */
	public void add(int value)
	{
		if(value==0)
		{
			return;
		}
		
		if(!int_count.containsKey(value))
		{
			int_count.put(value, new IntValue(value));
		}
		
		int_count.get(value).count++;
	}
	
	public void build()
	{
		IntValue[] values=int_count.values().toArray(new IntValue[int_count.size()]);
		Arrays.sort(values,new Comparator<IntValue>()
		{
			@Override
			public int compare(IntValue o1, IntValue o2)
			{
				if(o1.count>o2.count)
				{
					return -1;
				}
				else if(o1.count<o2.count)
				{
					return 1;
				}
				
				return 0;
			}
		});
		
		int index=1;
		for(IntValue value:values)
		{
			value.index=index;
		}
	}
	
	private static class IntValue
	{
		public final int value;
		public int count;
		public int index;
		public int position;
		
		public IntValue(int value)
		{
			this.value=value;
		}
	}
}
