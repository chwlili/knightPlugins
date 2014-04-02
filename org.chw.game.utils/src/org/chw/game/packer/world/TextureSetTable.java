package org.chw.game.packer.world;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import org.chw.game.packer.GamePacker;
import org.chw.game.packer.GamePackerConst;
import org.chw.util.FileUtil;
import org.chw.util.ZlibUtil;

public class TextureSetTable
{
	private WorldExporter world;

	private File file;
	private Hashtable<TextureSetKey, TextureSet> textureSetTable;
	private Hashtable<TextureSetKey, TextureSet> revisionTable;

	private TextureSetKey currentKey;

	/**
	 * ���캯��
	 * 
	 * @param checksumTable
	 * @param imgClipTable
	 */
	public TextureSetTable(WorldExporter world)
	{
		this.world = world;
	}

	/**
	 * ��ȡ��ͼ��
	 * 
	 * @param key
	 * @return
	 */
	public TextureSet getTextureSet(TextureSetKey key)
	{
		if (key == null)
		{
			return null;
		}
		return revisionTable.get(key);
	}

	/**
	 * ��ȡ��ͼ�ļ���ַ
	 * 
	 * @return
	 */
	public String[] getTextureFileURLs()
	{
		ArrayList<String> files = new ArrayList<String>();
		for (TextureSet set : revisionTable.values())
		{
			for (Texture texture : set.getTextures())
			{
				files.add(texture.getAtfFilePath());
				files.add(texture.getPngFilePath());
				files.add(texture.getXmlFilePath());
			}
		}

		String[] urls = new String[files.size()];
		urls = files.toArray(urls);
		Arrays.sort(urls);
		;

		return urls;
	}

	/**
	 * �Ƿ������ͼ��
	 * 
	 * @param key
	 */
	public boolean contains(TextureSetKey key)
	{
		if (revisionTable.containsKey(key))
		{
			return true;
		}

		if (textureSetTable.containsKey(key))
		{
			return true;
		}
		return false;
	}

	/**
	 * �����ͼ��
	 * 
	 * @param checksumSet
	 */
	public void add(TextureSetKey key)
	{
		if (revisionTable.containsKey(key))
		{
			return;
		}

		if (textureSetTable.containsKey(key))
		{
			revisionTable.put(key, textureSetTable.get(key));

			textureSetTable.remove(key);
		}
		else
		{
			currentKey = key;

			int regionCount = 0;

			// ͳ������ͼ����ܸ���
			GridImgKey[] gridImgs = key.getClips();
			for (int i = 0; i < gridImgs.length; i++)
			{
				GridImgKey gridImgKey = gridImgs[i];
				regionCount += gridImgKey.getRowCount() * gridImgKey.getColCount();
			}

			// ����ͼ�����е���������
			Region[] regions = new Region[regionCount];
			int index = 0;
			for (int i = 0; i < gridImgs.length; i++)
			{
				GridImgKey gridImgKey = gridImgs[i];

				GridImg[] clips = world.getGridImgTable().getClips(gridImgKey);
				for (int j = 0; j < clips.length; j++)
				{
					regions[index] = new Region(world.getChecksumTable().getChecksumID(gridImgKey.getFileInnerPath()), j, clips[j], gridImgKey.getFile(), gridImgKey.getTimes()[j]);
					index++;
				}
			}

			// ��¼��ͼ��
			revisionTable.put(key, new TextureSet(key, mergerTextures(regions, key.getType())));
		}
	}

	/**
	 * ����ͼ������
	 * 
	 * @param file
	 */
	public void open(File file)
	{
		this.file = file;

		this.textureSetTable = new Hashtable<TextureSetKey, TextureSet>();
		this.revisionTable = new Hashtable<TextureSetKey, TextureSet>();

		if (file == null || !file.exists() || !file.isFile())
		{
			return;
		}

		BufferedReader input = null;
		try
		{
			input = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while (true)
			{
				String line = input.readLine();
				if (line == null)
				{
					break;
				}

				line.trim();

				if (line.isEmpty())
				{
					continue;
				}

				String[] parts = line.split("=");
				String key = parts[0].trim();
				String val = parts[1].trim();

				if (key.isEmpty() || val.isEmpty())
				{
					continue;
				}

				// ��ԭ��ͼ��KEY
				String type = "DXT";
				int typeIndex = key.indexOf(">");
				if (typeIndex != -1)
				{
					type = key.substring(0, typeIndex);
					key = key.substring(typeIndex + 1);
				}
				String[] keys = key.split("\\+");
				GridImgKey[] clipKeys = new GridImgKey[keys.length];
				for (int i = 0; i < keys.length; i++)
				{
					String[] clipParams = keys[i].split("_");
					String[] timeParams = clipParams.length > 3 ? clipParams[3].split("\\.") : new String[] { "0" };

					int[] times = new int[timeParams.length];
					for (int j = 0; j < times.length; j++)
					{
						times[j] = Integer.parseInt(timeParams[j]);
						times[j] = times[j] > 0 ? 1 : 0;
					}

					clipKeys[i] = new GridImgKey(clipParams[0], Integer.parseInt(clipParams[1]), Integer.parseInt(clipParams[2]), times);
				}

				// ��ԭ��ͼ��Ϣ
				String[] vals = val.split("\\+");
				Texture[] textures = new Texture[vals.length];
				for (int i = 0; i < vals.length; i++)
				{
					String[] params = vals[i].split(":");
					String[] textureFiles = params[0].split(",");
					String[] textureRegions = params[1].split(";");

					String atfSavePath = textureFiles[0];
					String pngSavePath = textureFiles[1];
					String xmlSavePath = textureFiles[2];

					Region[] regions = new Region[textureRegions.length];
					for (int j = 0; j < textureRegions.length; j++)
					{
						String[] regionParams = textureRegions[j].split(",");
						String ownerChecksum = regionParams[0];
						int index = Integer.parseInt(regionParams[1]);
						int x = Integer.parseInt(regionParams[2]);
						int y = Integer.parseInt(regionParams[3]);
						int w = Integer.parseInt(regionParams[4]);
						int h = Integer.parseInt(regionParams[5]);
						int clipX = Integer.parseInt(regionParams[6]);
						int clipY = Integer.parseInt(regionParams[7]);
						int clipW = Integer.parseInt(regionParams[8]);
						int clipH = Integer.parseInt(regionParams[9]);
						int textureX = Integer.parseInt(regionParams[10]);
						int textureY = Integer.parseInt(regionParams[11]);
						int textureR = Integer.parseInt(regionParams[12]);

						regions[j] = new Region(ownerChecksum, index, x, y, w, h, clipX, clipY, clipW, clipH, textureX, textureY, textureR);
					}

					textures[i] = new Texture(atfSavePath, pngSavePath, xmlSavePath, regions);
				}

				TextureSetKey textureSetKey = new TextureSetKey(type, clipKeys);
				TextureSet textureSet = new TextureSet(textureSetKey, textures);
				
				textureSetTable.put(textureSetKey, textureSet);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (input != null)
			{
				try
				{
					input.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ������ͼ������
	 * 
	 * @param file
	 */
	public void save()
	{
		saveAs(file);
	}

	/**
	 * �����ͼ������
	 * 
	 * @param file
	 */
	public void saveAs(File file)
	{
		if (file == null || revisionTable == null)
		{
			return;
		}

		// ������ͼ��KEY
		TextureSetKey[] keys = new TextureSetKey[revisionTable.size()];
		keys = revisionTable.keySet().toArray(keys);
		Arrays.sort(keys, new Comparator<TextureSetKey>()
		{
			@Override
			public int compare(TextureSetKey o1, TextureSetKey o2)
			{
				return o1.toString().compareTo(o2.toString());
			}
		});

		// �ϲ���ͼ������
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < keys.length; i++)
		{
			TextureSetKey key = keys[i];
			TextureSet textureSet = revisionTable.get(key);

			sb.append(key.toString());
			sb.append(" = ");

			for (Texture texture : textureSet.getTextures())
			{
				sb.append(texture.getAtfFilePath() + "," + texture.getPngFilePath() + "," + texture.getXmlFilePath() + ":");

				for (Region region : texture.getRegions())
				{
					sb.append(region.getOwnerChecksum() + ",");
					sb.append(region.getIndex() + ",");
					sb.append(region.getX() + ",");
					sb.append(region.getY() + ",");
					sb.append(region.getW() + ",");
					sb.append(region.getH() + ",");
					sb.append(region.getClipX() + ",");
					sb.append(region.getClipY() + ",");
					sb.append(region.getClipW() + ",");
					sb.append(region.getClipH() + ",");
					sb.append(region.getTextureX() + ",");
					sb.append(region.getTextureY() + ",");
					sb.append(region.getTextureR() + ";");
				}

				if (texture != textureSet.getTextures()[textureSet.getTextures().length - 1])
				{
					sb.append("+");
				}
			}

			sb.append("\n");
		}

		// ������Ч��ͼ�ļ�
		for (TextureSet textureSet : textureSetTable.values())
		{
			for (Texture texture : textureSet.getTextures())
			{
				File atfFile = new File(world.getDestDir().getPath() + texture.getAtfFilePath());
				if (atfFile.exists() && atfFile.isFile())
				{
					// atfFile.delete();
				}

				File pngFile = new File(world.getDestDir().getPath() + texture.getPngFilePath());
				if (pngFile.exists() && pngFile.isFile())
				{
					// pngFile.delete();
				}

				File xmlFile = new File(world.getDestDir().getPath() + texture.getXmlFilePath());
				if (xmlFile.exists() && xmlFile.isFile())
				{
					// xmlFile.delete();
				}
			}
		}

		// ���浽�ļ�
		try
		{
			byte[] bytes = sb.toString().getBytes("UTF-8");
			FileUtil.writeFile(file, bytes);
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}

	private Comparator<Region> comparator = new Comparator<Region>()
	{
		@Override
		public int compare(Region o1, Region o2)
		{
			if (o1.getClipH() < o2.getClipH())
			{
				return -1;
			}
			else if (o1.getClipH() > o2.getClipH())
			{
				return 1;
			}
			else if (o1.getClipW() < o2.getClipW())
			{
				return -1;
			}
			else if (o1.getClipW() > o2.getClipW())
			{
				return 1;
			}
			return 0;
		}
	};

	private Integer[][] allSize;

	private void initAllSize()
	{
		int[] ints = new int[] { 2048, 1024, 512 };
		int[] counts = new int[] { 3, 3, 3 };

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		while (true)
		{
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < counts.length; j++)
			{
				for (int k = 0; k < counts[j]; k++)
				{
					array.add(ints[j]);
				}
			}

			if (array.size() > 0)
			{
				list.add(array);
				System.out.println(array);
			}

			for (int j = counts.length - 1; j >= 0; j--)
			{
				if (counts[j] > 0)
				{
					counts[j] = counts[j] - 1;

					for (int k = j + 1; k < counts.length; k++)
					{
						counts[k] = 3;
					}
					break;
				}
			}

			int len = 0;
			for (int j = 0; j < counts.length; j++)
			{
				len += counts[j];
			}

			if (len == 0)
			{
				break;
			}
		}

		allSize = new Integer[list.size()][];

		int index = 0;
		for (int i = list.size() - 1; i >= 0; i--)
		{
			allSize[index] = list.get(i).toArray(new Integer[list.get(i).size()]);
			index++;
		}

		// System.out.println(allSize);
	}

	private Texture[] mergerTextures1(Region[] regions, String type)
	{
		if (allSize == null)
		{
			initAllSize();
		}

		// ����ʱ��Ϊ0������
		ArrayList<Region> regionList = new ArrayList<Region>();
		for (int i = 0; i < regions.length; i++)
		{
			if (regions[i].getTime() > 0)
			{
				regionList.add(regions[i]);
			}
		}

		// �������������
		Collections.sort(regionList, new Comparator<Region>()
		{
			@Override
			public int compare(Region o1, Region o2)
			{
				return o2.getClipW() * o2.getClipH() - o1.getClipW() * o1.getClipH();
			}
		});

		// Ѱ���������
		ArrayList<Texture> textureList;
		for (int i = 0; i < allSize.length; i++)
		{
			textureList = new ArrayList<Texture>();

			ArrayList<Region> successList = new ArrayList<Region>();

			Integer[] sizeList = allSize[i];
			for (int j = 0; j < sizeList.length; j++)
			{
				int size = sizeList[j];

				ArrayList<Region> textureRegions = new ArrayList<Region>();

				RegionPacker packer = new RegionPacker(size, size);
				for (int k = 0; k < regionList.size(); k++)
				{
					Region region = regionList.get(k);
					if (!successList.contains(region))
					{
						if (packer.insertRegion(region, "region_" + k))
						{
							successList.add(region);
							textureRegions.add(region);

							if (successList.size() == regionList.size())
							{
								break;
							}
						}
					}
				}

				if (textureRegions.size() > 0)
				{
					textureList.add(new Texture(size, size, textureRegions.toArray(new Region[textureRegions.size()])));
				}
			}

			if (successList.size() == regionList.size())
			{
				for (Texture texture : textureList)
				{
					try
					{
						saveTexture(texture, type);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}

				return textureList.toArray(new Texture[textureList.size()]);
			}
		}

		return mergerTextures2(regions, type);
	}

	/**
	 * �ϲ���ͼ
	 * 
	 * @param regions
	 * @param type
	 * @return
	 */
	private Texture[] mergerTextures2(Region[] regions, String type)
	{
		ArrayList<Texture> textures = new ArrayList<Texture>();

		ArrayList<Region> regionList = new ArrayList<Region>();
		for (int i = 0; i < regions.length; i++)
		{
			if (regions[i].getTime() > 0)
			{
				regionList.add(regions[i]);
			}
		}
		Collections.sort(regionList, new Comparator<Region>()
		{
			@Override
			public int compare(Region o1, Region o2)
			{
				return o2.getClipW() * o2.getClipH() - o1.getClipW() * o1.getClipH();
			}
		});

		for (int i = 0; i < sizes.length; i++)
		{
			int size = sizes[i];

			ArrayList<Region> successList = new ArrayList<Region>();
			ArrayList<Region> failList = new ArrayList<Region>();

			RegionPacker packer = new RegionPacker(size, size);
			for (int j = 0; j < regionList.size(); j++)
			{
				Region region = regionList.get(j);
				if (packer.insertRegion(region, "region_" + i))
				{
					successList.add(region);
				}
				else
				{
					failList.add(region);
				}
			}

			if (successList.size() == 0)
			{
				// ��չ��ͼ������
				successList.clear();
				failList.clear();
				System.out.println("����:" + size + "      len=" + regionList.size());
				continue;
			}

			if (failList.size() > 0)
			{
				// �������ʧ��
				int area = 0;
				int maxLeng = 0;
				for (int j = 0; j < failList.size(); j++)
				{
					Region region = failList.get(j);
					area += region.getClipW() * region.getClipH();
					maxLeng = Math.max(maxLeng, Math.max(region.getClipW(), region.getClipH()));
				}

				if ((area / size * size > 2 && maxLeng + size < sizes[sizes.length - 1]))
				{
					// ��չ��ͼ������
					successList.clear();
					failList.clear();
					System.out.println("����:" + size + "      len=" + regionList.size());
				}
				else
				{
					// �л�����һ����ͼ
					textures.add(new Texture(size, size, successList.toArray(new Region[successList.size()])));

					regionList = failList;

					successList.clear();
					failList = null;

					System.out.println("�л�:" + size + "      len=" + regionList.size());

					i = -1;
				}
			}
			else
			{
				// ȫ���ϲ����
				textures.add(new Texture(size, size, successList.toArray(new Region[successList.size()])));

				successList.clear();
				failList.clear();
				System.out.println("���--------------------------:" + size);
				break;
			}
		}

		for (Texture texture : textures)
		{
			try
			{
				saveTexture(texture, type);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		return textures.toArray(new Texture[textures.size()]);
	}

	/**
	 * �ϲ���ͼ
	 * 
	 * @param regions
	 */
	private Texture[] mergerTextures(Region[] regions, String type)
	{
		Arrays.sort(regions, comparator);

		int maxW = 0;
		int maxH = 0;
		int totalW = 0;
		// int totalH=0;

		for (Region region : regions)
		{
			maxW = Math.max(maxW, region.getClipW());
			maxH = Math.max(maxH, region.getClipH());
			totalW += region.getClipW();
			// totalH+=region.getClipH();
		}

		if (regions.length > 10000)
		{
			throw new Error("??");
		}
		ArrayList<Texture> textures = new ArrayList<Texture>();

		int lastW = 0;
		int lastH = 0;

		// if (totalW <= sizes[sizes.length - 1])
		// {
		// // ����һ�и㶨
		// lastW = adjustSize(totalW);
		// lastH = adjustSize(maxH);
		//
		// textures.add(new Texture(lastW, lastH, regions));
		// }
		// else
		// {
		ArrayList<Region> tempTexture = new ArrayList<Region>();

		lastW = sizes[sizes.length - 1];

		int currX = 0;
		int currY = 0;
		int currW = 0;
		int currH = 0;
		int i = 0;
		for (i = 0; i < regions.length; i++)
		{
			Region region = regions[i];
			if (region.getTime() <= 0)
			{
				System.out.println("���Կհ�����" + region.getFile().getPath() + " frame(" + region.getX() + "," + region.getY() + "," + region.getW() + "," + region.getH() + ") clip(" + region.getClipX() + "," + region.getClipY() + "," + region.getClipW() + "," + region.getClipH() + ") texture(" + region.getTextureX() + "," + region.getTextureY() + ")");
				continue;
			}

			if (currX + region.getClipW() <= lastW || (currX == 0 && currX + region.getClipW() > lastW))
			{
				if (currY + region.getClipH() <= sizes[sizes.length - 1] || currY == 0)
				{
					region.setTextureX(currX);
					region.setTextureY(currY);

					currX += region.getClipW();
					currW = Math.max(currW, currX);
					currH = Math.max(currH, region.getClipH());

					tempTexture.add(region);
				}
				else
				{
					Region[] temp = new Region[tempTexture.size()];
					temp = tempTexture.toArray(temp);

					textures.add(new Texture(adjustSize(currW), adjustSize(currY + currH), temp));
					tempTexture.clear();
					// tempTexture = new ArrayList<Region>();

					currX = 0;
					currY = 0;
					currW = 0;
					currH = 0;
					i--;
				}
			}
			else
			{
				if (currY + currH + region.getClipH() <= sizes[sizes.length - 1] || currY == 0)
				{
					currX = 0;
					currY += currH;
					// currW = 0;
					currH = 0;

					region.setTextureX(currX);
					region.setTextureY(currY);

					currX += region.getClipW();
					currW = Math.max(currW, currX);
					currH = Math.max(currH, region.getClipH());

					tempTexture.add(region);
				}
				else
				{
					Region[] temp = new Region[tempTexture.size()];
					temp = tempTexture.toArray(temp);

					textures.add(new Texture(adjustSize(currW), adjustSize(currY + currH), temp));
					tempTexture.clear();
					// tempTexture = new ArrayList<Region>();

					currX = 0;
					currY = 0;
					currW = 0;
					currH = 0;
					i--;
				}
			}
		}

		if (tempTexture.size() > 0)
		{
			Region[] temp = new Region[tempTexture.size()];
			temp = tempTexture.toArray(temp);
			textures.add(new Texture(adjustSize(currW), adjustSize(currY + currH), temp));
			tempTexture.clear();
		}

		lastH = currY + currH;
		lastH = adjustSize(lastH);
		// }

		for (Texture texture : textures)
		{
			try
			{
				saveTexture(texture, type);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		Texture[] textureArray = new Texture[textures.size()];
		textureArray = textures.toArray(textureArray);
		textures.clear();

		return textureArray;
	}

	private int[] sizes = new int[] { 32, 64, 128, 256, 512, 1024, 2048 };

	/**
	 * ������С
	 * 
	 * @param size
	 * @return
	 */
	public int adjustSize(int size)
	{
		if (size > sizes[sizes.length - 1])
		{
			return sizes[sizes.length - 1];
		}

		int last = 0;
		for (int i = 0; i < sizes.length; i++)
		{
			last = sizes[i];
			if (size <= last)
			{
				break;
			}
		}

		return last;
	}

	/**
	 * ������ͼ
	 * 
	 * @param textureData
	 * @throws IOException
	 */
	private void saveTexture(Texture textureData, String type) throws IOException
	{
		// ȷ��png·��
		long pngFileID = world.getOptionTable().getNextFileID();
		long pngFolderID = (pngFileID - 1) / GamePackerConst.FILE_COUNT_EACH_DIR + 1;
		String pngFilePath = "/" + pngFolderID + "/" + pngFileID + ".png";
		textureData.setPngFilePath("/" + world.getDestDir().getName() + pngFilePath);

		// ȷ��xml·��
		// long xmlFileID=world.getOptionTable().getNextFileID();
		// long
		// xmlFolderID=(xmlFileID-1)/RootExporterConst.FILE_COUNT_EACH_DIR+1;
		world.getOptionTable().getNextFileID();
		String atfFilePath = "/" + pngFolderID + "/" + pngFileID + ".atf";
		textureData.setAtfFilePath("/" + world.getDestDir().getName() + atfFilePath);

		// ȷ��xml·��
		// long xmlFileID=world.getOptionTable().getNextFileID();
		// long
		// xmlFolderID=(xmlFileID-1)/RootExporterConst.FILE_COUNT_EACH_DIR+1;
		world.getOptionTable().getNextFileID();
		String xmlFilePath = "/" + pngFolderID + "/" + pngFileID + ".xml";
		textureData.setXmlFilePath("/" + world.getDestDir().getName() + xmlFilePath);

		/*
		File testFile = new File(world.getDestDir().getPath() + pngFilePath);
		if (testFile.exists())
		{
			return;
		}
		*/

		GamePacker.progress("�����ͼ", pngFilePath + " .xml .atf");

		// �ϲ���ͼpng�ļ�����ͼxml�ļ�
		int drawX = 0;
		int drawY = 0;
		int drawH = 0;

		long drawTime = 0;
		long pngWriteTime = 0;
		long atfWriteTime = 0;

		long time = new Date().getTime();

		BufferedImage texture = new BufferedImage(textureData.getWidth(), textureData.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = (Graphics2D) texture.getGraphics();

		StringBuilder atlas = new StringBuilder();
		atlas.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		atlas.append("<TextureAtlas imagePath=\"" + ("/" + world.getDestDir().getName() + pngFilePath) + "\">");

		for (Region region : textureData.getRegions())
		{
			drawX = region.getTextureX();
			drawY = region.getTextureY();

			atlas.append("<SubTexture name=\"" + region.getOwnerChecksum() + "_" + region.getIndex() + "\" x=\"" + drawX + "\" y=\"" + drawY + "\" width=\"" + region.getClipW() + "\" height=\"" + region.getClipH() + "\" frameX=\"" + (region.getClipX() > 0 ? -region.getClipX() : 0) + "\" frameY=\"" + (region.getClipY() > 0 ? -region.getClipY() : 0) + "\" frameWidth=\"" + region.getW() + "\" frameHeight=\"" + region.getH() + "\"/>");

			BufferedImage img = ImageIO.read(region.getFile());
			graphics.drawImage(img, drawX, drawY, drawX + region.getClipW(), drawY + region.getClipH(), region.getX() + region.getClipX(), region.getY() + region.getClipY(), region.getX() + region.getClipX() + region.getClipW(), region.getY() + region.getClipY() + region.getClipH(), null);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		atlas.append("</TextureAtlas>");

		graphics.dispose();
		drawTime = new Date().getTime() - time;

		if (GamePacker.isCancel())
		{
			return;
		}

		// ����png�ļ�
		File saveFile = new File(world.getDestDir().getPath() + pngFilePath);
		if (saveFile.getParentFile().exists() == false)
		{
			saveFile.mkdirs();
		}
		time = new Date().getTime();
		ImageIO.write(texture, "png", saveFile);
		pngWriteTime = new Date().getTime() - time;

		if (GamePacker.isCancel())
		{
			return;
		}

		// ����xml�ļ�
		File saveXml = new File(world.getDestDir().getPath() + xmlFilePath);
		FileUtil.writeFile(saveXml, atlas.toString().getBytes("utf8"));

		if (GamePacker.isCancel())
		{
			return;
		}

		// ����ATF�ļ�
		File saveAtf = new File(world.getDestDir().getPath() + atfFilePath);

		File atfExe = new File(GamePackerConst.getJarDir().getPath() + File.separatorChar + "png2atf.exe");

		boolean hasZ = false;

		// ����-z����
		if (type.indexOf(" -z") != -1)
		{
			int rIndex = type.indexOf(" -r");
			if (rIndex == 0)
			{
				type = type.substring(rIndex + 3);
			}
			else if (rIndex > 0)
			{
				type = type.substring(0, rIndex) + type.substring(rIndex + 3);
			}

			hasZ = true;
		}

		time = new Date().getTime();
		if (atfExe.exists())
		{
			writeATF(atfExe.getPath() + " -i " + saveFile.getPath() + " -o " + saveAtf.getPath() + " " + type);
			/*
			 * if (type.startsWith("DXT")) { writeATF(atfExe.getPath() +
			 * " -c d -n 0:0 -i " + saveFile.getPath() + " -o " +
			 * saveAtf.getPath() + " -r -q -s"); } else {
			 * writeATF(atfExe.getPath() + " -n 0:0 -i " + saveFile.getPath() +
			 * " -o " + saveAtf.getPath() + " -r -q 30 -s"); }
			 */
		}
		else
		{
			writeATF("png2atf -i " + saveFile.getPath() + " -o " + saveAtf.getPath() + " " + type);
			/*
			 * if (type.startsWith("DXT")) { writeATF("png2atf -c d -n 0:0 -i "
			 * + saveFile.getPath() + " -o " + saveAtf.getPath() + " -r -q -s");
			 * } else { writeATF("png2atf -n 0:0 -i " + saveFile.getPath() +
			 * " -o " + saveAtf.getPath() + " -r -q 30 -s"); }
			 */
		}
		atfWriteTime = new Date().getTime() - time;

		if (hasZ)
		{
			byte[] atfBytes = FileUtil.getFileBytes(saveAtf);
			atfBytes = ZlibUtil.compress(atfBytes);
			FileUtil.writeFile(saveAtf, atfBytes);
		}

		if (!saveAtf.exists())
		{
			GamePacker.log("���ATFʧ�ܣ�", pngFilePath + " .xml .atf");
		}

		// ���debug regions
		/*
		int regionIndex = 0;
		for (Region region : textureData.getRegions())
		{
			if (region.getClipW() > 0 && region.getClipH() > 0 && region.getTime()>0)
			{
				BufferedImage inputIMG = ImageIO.read(region.getFile());

				BufferedImage outputIMG = new BufferedImage(region.getClipW(), region.getClipH(), BufferedImage.TYPE_INT_ARGB);
				Graphics2D outputGraphics = (Graphics2D) outputIMG.getGraphics();
				outputGraphics.drawImage(inputIMG, 0, 0, region.getClipW(), region.getClipH(), region.getX() + region.getClipX(), region.getY() + region.getClipY(), region.getX() + region.getClipX() + region.getClipW(), region.getY() + region.getClipY() + region.getClipH(), null);
				outputGraphics.dispose();

				File outputFile = new File(world.getDestDir().getPath() + "/" + pngFolderID + "/" + pngFileID + "/" + regionIndex + ".png");
				if (outputFile.getParentFile().exists() == false)
				{
					outputFile.mkdirs();
				}
				ImageIO.write(outputIMG, "png", outputFile);
				
				regionIndex++;
			}
		}*/

		System.out.println("drawTime=" + drawTime + " , pngTime=" + pngWriteTime + " , atfTime=" + atfWriteTime);
	}

	private void writeATF(String cmd)
	{
		try
		{
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String msg = null;
			while ((msg = br.readLine()) != null)
			{
				if (msg.isEmpty())
				{
					continue;
				}
				System.out.println(msg);
			}

			BufferedReader errorOutput = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String error = null;
			while ((error = errorOutput.readLine()) != null)
			{
				System.out.println(error);
			}

			br.close();
			p.destroy();
		}
		catch (Exception e)
		{
			GamePacker.error(e);
		}
	}
}
