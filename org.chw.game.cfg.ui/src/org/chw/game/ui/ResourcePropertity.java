package org.chw.game.ui;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class ResourcePropertity
{
	private HashMap<String, HashSet<String>> table = new HashMap<String, HashSet<String>>();

	public void add(String xml2URL, String asURL)
	{
		if (!table.containsKey(asURL))
		{
			table.put(asURL, new HashSet<String>());
		}
		table.get(asURL).add(xml2URL);
	}

	public void remove(String xml2URL)
	{
		for (HashSet<String> urls : table.values())
		{
			urls.remove(xml2URL);
		}
	}

	/**
	 * 获取所有AS文件地址
	 * 
	 * @return
	 */
	public String[] getAllURLs()
	{
		ArrayList<String> urls = new ArrayList<String>();

		for (String key : table.keySet())
		{
			urls.add(key);
		}

		return urls.toArray(new String[] {});
	}

	/**
	 * 查找所有无xml2引用的as文件
	 * 
	 * @return
	 */
	public String[] getBlankURLS()
	{
		ArrayList<String> urls = new ArrayList<String>();

		for (String key : table.keySet())
		{
			if (table.get(key).size() == 0)
			{
				urls.add(key);
			}
		}

		return urls.toArray(new String[] {});
	}

	/**
	 * 打开
	 * 
	 * @param file
	 * @throws CoreException
	 * @throws IOException
	 */
	public void open(IFile file) throws CoreException, IOException
	{
		file.refreshLocal(0, null);

		if (!file.exists())
		{
			return;
		}

		InputStream input = file.getContents();
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));

		try
		{
			String line = reader.readLine();
			while (line != null)
			{
				String[] pars = line.split(":");
				if (pars.length > 1)
				{
					String asURL = pars[0];
					String[] xml2URLs = pars[1].split(",");

					if (!table.containsKey(asURL))
					{
						table.put(asURL, new HashSet<String>());
					}

					for (String xml2URL : xml2URLs)
					{
						if (!xml2URL.isEmpty())
						{
							table.get(asURL).add(xml2URL);
						}
					}
				}
				line = reader.readLine();
			}
		}
		finally
		{
			reader.close();
			input.close();
		}
	}

	/**
	 * 关闭
	 * 
	 * @param file
	 * @throws CoreException
	 */
	public void save(IFile file) throws CoreException
	{
		String[] keys = table.keySet().toArray(new String[] {});

		Arrays.sort(keys);

		StringBuilder sb = new StringBuilder();
		for (String key : keys)
		{
			String[] froms = table.get(key).toArray(new String[] {});
			Arrays.sort(froms);
			
			StringBuilder value=new StringBuilder();
			for (String from : froms)
			{
				if(from.isEmpty())
				{
					continue;
				}
				
				if(value.length()>0)
				{
					value.append(",");
				}
				value.append(from);
			}
			
			if(value.length()>0)
			{
				sb.append(key+":"+value.toString()+"\n");
			}
		}

		try
		{
			if (file.exists())
			{
				file.setContents(new ByteArrayInputStream(sb.toString().getBytes("UTF8")), 0, null);
			}
			else
			{
				file.create(new ByteArrayInputStream(sb.toString().getBytes("UTF8")), true, null);
			}
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}
}
