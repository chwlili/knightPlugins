package org.chw.game.packer.world;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;

import org.chw.game.packer.GamePacker;
import org.chw.game.packer.base.ChecksumTable;
import org.chw.game.packer.world.attire.Attire;
import org.chw.game.packer.world.attire.AttireAction;
import org.chw.game.packer.world.attire.AttireAnim;
import org.chw.game.packer.world.attire.AttireFile;

public class WorldAttires
{
	private static String SceneDefParam="-q 20 -f -n 0,0";
	private static String AttireDefParam="-n 0:0 -r -q 30 -s";
	
	private String outputPath;
	private ChecksumTable shaTable;
	private GridImgTable clipTable;
	private TextureSetTable textureSetTable;

	private ArrayList<Texture> textures = new ArrayList<Texture>();
	private Hashtable<Texture, Integer> texture_id = new Hashtable<Texture, Integer>();
	private Hashtable<Texture, String> texture_path = new Hashtable<Texture, String>();
	private Hashtable<Texture, Integer> texture_size = new Hashtable<Texture, Integer>();

	private Hashtable<AttireAction, Texture[]> action_textures = new Hashtable<AttireAction, Texture[]>();
	private Hashtable<AttireAction, Integer> action_sizes = new Hashtable<AttireAction, Integer>();
	private Hashtable<AttireAction, String> action_texturePaths = new Hashtable<AttireAction, String>();
	private Hashtable<AttireAction, TextureSetKey[]> action_textureSetKeys = new Hashtable<AttireAction, TextureSetKey[]>();
	private Hashtable<AttireAction, String> action_textureIDs = new Hashtable<AttireAction, String>();

	/**
	 * 构造函数
	 * 
	 * @param shaTable
	 * @param clipTable
	 * @param textureSetTable
	 */
	public WorldAttires(String outputPath, ChecksumTable shaTable, GridImgTable clipTable, TextureSetTable textureSetTable)
	{
		this.outputPath = outputPath;
		this.shaTable = shaTable;
		this.clipTable = clipTable;
		this.textureSetTable = textureSetTable;
	}

	/**
	 * 获取贴图集
	 * 
	 * @return
	 */
	public Texture[] getTextures()
	{
		return textures.toArray(new Texture[textures.size()]);
	}

	/**
	 * 获取贴图ID
	 * 
	 * @param texture
	 * @return
	 */
	public int getTextureID(Texture texture)
	{
		if(texture_id.containsKey(texture))
		{
			return texture_id.get(texture);
		}
		return 0;
	}

	/**
	 * 获取贴图大小
	 * 
	 * @param texture
	 * @return
	 */
	public int getTextureSize(Texture texture)
	{
		return texture_size.get(texture);
	}

	/**
	 * 获取贴图路径
	 * 
	 * @param texture
	 * @return
	 */
	public String getTexturePath(Texture texture)
	{
		return texture_path.get(texture);
	}

	/**
	 * 获取动作贴图ID列表
	 * 
	 * @param action
	 * @return
	 */
	public String getActionTextureIDs(AttireAction action)
	{
		return action_textureIDs.get(action);
	}

	/**
	 * 获取动作的贴图区域信息
	 * 
	 * @param action
	 * @param sha1
	 * @param index
	 * @return
	 */
	public Region getActionTextureRegion(AttireAction action, String sha1, int index)
	{
		TextureSetKey[] keys = action_textureSetKeys.get(action);
		for (TextureSetKey key : keys)
		{
			TextureSet set = textureSetTable.getTextureSet(key);
			Region region = set.getRegion(sha1, index);
			if (region != null)
			{
				return region;
			}
		}

		return null;
	}

	/**
	 * 按动作获取贴图集
	 * 
	 * @param action
	 * @return
	 */
	public Texture[] getActionTextures(AttireAction action)
	{
		return action_textures.get(action);
	}

	/**
	 * 获取动作的文件路径集
	 * 
	 * @param action
	 * @return
	 */
	public String getActionPaths(AttireAction action)
	{
		return action_texturePaths.get(action);
	}

	/**
	 * 获取动作的文件大小
	 * 
	 * @param action
	 * @return
	 */
	public int getActionSize(AttireAction action)
	{
		return action_sizes.get(action);
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------
	//
	// 装扮资源
	//
	// ---------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 构建
	 * 
	 * @param attires
	 */
	public void build(Hashtable<String, AttireFile> attires)
	{
		buildAttireResource(attires);
		buildSceneResource(attires);

		// 计算动作大小、合并动作地址、合并动作ID
		for (AttireAction action : action_textures.keySet())
		{
			HashSet<Integer> ids = new HashSet<Integer>();
			HashSet<String> paths = new HashSet<String>();
			int size = 0;

			Texture[] textures = action_textures.get(action);
			for (Texture texture : textures)
			{
				ids.add(getTextureID(texture));

				String atfURL = texture.getAtfFilePath();
				if (!paths.contains(atfURL))
				{
					File atfFile = new File(outputPath + atfURL);
					int atfSize = (int) atfFile.length();

					paths.add(atfURL);
					size += atfSize;
				}
				String xmlURL = texture.getXmlFilePath();
				if (!paths.contains(xmlURL))
				{
					File xmlFile = new File(outputPath + xmlURL);
					int xmlSize = (int) xmlFile.length();

					paths.add(xmlURL);
					size += xmlSize;
				}
			}

			String[] URLs = paths.toArray(new String[paths.size()]);
			Arrays.sort(URLs);

			StringBuilder urlString = new StringBuilder();
			for (String url : URLs)
			{
				if (urlString.length() > 0)
				{
					urlString.append(",");
				}
				urlString.append(url);
			}
			action_sizes.put(action, size);
			action_texturePaths.put(action, urlString.toString());

			Integer[] idArray = ids.toArray(new Integer[ids.size()]);
			Arrays.sort(idArray);

			StringBuilder idString = new StringBuilder();
			for (int id : idArray)
			{
				if (idString.length() > 0)
				{
					idString.append(",");
				}
				idString.append(id);
			}

			action_textureIDs.put(action, idString.toString());
		}
	}

	/**
	 * 生成装扮资源
	 * 
	 * @param attires
	 */
	private void buildAttireResource(Hashtable<String, AttireFile> attires)
	{
		GamePacker.beginLogSet("确定图像裁切矩形");

		ArrayList<TextureSetKey> outputKeys = new ArrayList<TextureSetKey>();
		ArrayList<TextureSetKey> textureKeys = new ArrayList<TextureSetKey>();

		Hashtable<Attire, Hashtable<String, TextureSetKey>> attireTextureTable = new Hashtable<Attire, Hashtable<String, TextureSetKey>>();
		for (AttireFile attireFile : attires.values())
		{
			for (Attire attire : attireFile.getAllAttires())
			{
				if (attire.isAnimAttire())
				{
					continue;
				}
				if (attire.getKey().startsWith("0_"))
				{
					continue;
				}

				Hashtable<String, Hashtable<GridImgKey, GridImgKey>> groupToGifKeys = new Hashtable<String, Hashtable<GridImgKey, GridImgKey>>();
				for (AttireAction action : attire.getActions())
				{
					for (AttireAnim anim : action.getAnims())
					{
						String atfGroup = anim.getBagID();

						if (!attire.getAtfParams().containsKey(atfGroup))
						{
							atfGroup = "";
						}

						ImgFile img = anim.getImg();
						String imgPath = anim.getImg().getInnerpath();
						String imgSHA1 = shaTable.getChecksumID(imgPath);
						int imgRowCount = anim.getRow();
						int imgColCount = anim.getCol();
						int[] imgTimes = normalTimeArray(anim.getTimes());

						GridImgKey gifKey = new GridImgKey(imgSHA1, imgRowCount, imgColCount, img, imgTimes);

						GamePacker.progress("计算裁切矩形:" + img.getInnerpath());
						clipTable.add(gifKey);

						if (GamePacker.isCancel())
						{
							return;
						}

						if (!groupToGifKeys.containsKey(atfGroup))
						{
							groupToGifKeys.put(atfGroup, new Hashtable<GridImgKey, GridImgKey>());
						}
						Hashtable<GridImgKey, GridImgKey> gifKeyTable = groupToGifKeys.get(atfGroup);
						if (gifKeyTable.containsKey(gifKey))
						{
							GridImgKey oldKey = gifKeyTable.get(gifKey);
							oldKey.setTime(mergerTimeArray(imgTimes, oldKey.getTimes()));
						}
						else
						{
							gifKeyTable.put(gifKey, gifKey);
						}
					}
				}

				Hashtable<String, TextureSetKey> groupToTextureSetKeys = new Hashtable<String, TextureSetKey>();
				for (String groupID : groupToGifKeys.keySet())
				{
					String param = attire.getAtfParams().containsKey(groupID) ? attire.getAtfParams().get(groupID) : AttireDefParam;
					Hashtable<GridImgKey, GridImgKey> gifKeys = groupToGifKeys.get(groupID);

					TextureSetKey textureKey = new TextureSetKey(param, gifKeys.values().toArray(new GridImgKey[gifKeys.size()]));
					groupToTextureSetKeys.put(groupID, textureKey);
					textureKeys.add(textureKey);
					if (!textureSetTable.contains(textureKey))
					{
						outputKeys.add(textureKey);
					}
				}

				attireTextureTable.put(attire, groupToTextureSetKeys);
			}
		}
		GamePacker.endLogSet();

		// 检测取消
		if (GamePacker.isCancel())
		{
			return;
		}

		// 输出贴图集
		GamePacker.beginLogSet("输出装扮贴图集:" + outputKeys.size());
		for (TextureSetKey key : outputKeys)
		{
			textureSetTable.add(key);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		for (TextureSetKey key : textureKeys)
		{
			textureSetTable.add(key);
		}
		GamePacker.endLogSet();

		// 检测取消
		if (GamePacker.isCancel())
		{
			return;
		}

		// 分配TextureSetKey到动作
		Hashtable<AttireAction, HashSet<TextureSetKey>> actionToTextureSetKeys = new Hashtable<AttireAction, HashSet<TextureSetKey>>();
		for (AttireFile attireFile : attires.values())
		{
			for (Attire attire : attireFile.getAllAttires())
			{
				if (attire.isAnimAttire())
				{
					continue;
				}
				if (attire.getKey().startsWith("0_"))
				{
					continue;
				}

				Hashtable<String, TextureSetKey> groupToTextureKeys = attireTextureTable.get(attire);

				for (AttireAction action : attire.getActions())
				{
					HashSet<TextureSetKey> actionTextures = new HashSet<TextureSetKey>();
					for (AttireAnim anim : action.getAnims())
					{
						String atfGroup = anim.getBagID();
						if (!attire.getAtfParams().containsKey(atfGroup))
						{
							atfGroup = "";
						}

						actionTextures.add(groupToTextureKeys.get(atfGroup));
					}

					actionToTextureSetKeys.put(action, actionTextures);
				}
			}
		}

		// 构建贴图数据表
		HashSet<Texture> textureHash = new HashSet<Texture>();
		for (AttireAction action : actionToTextureSetKeys.keySet())
		{
			HashSet<Texture> textureList = new HashSet<Texture>();

			HashSet<TextureSetKey> textureSetKeys = actionToTextureSetKeys.get(action);
			for (TextureSetKey key : textureSetKeys)
			{
				TextureSet textureSet = textureSetTable.getTextureSet(key);
				for (Texture texture : textureSet.getTextures())
				{
					textureList.add(texture);

					if (!textureHash.contains(texture))
					{
						textures.add(texture);
						textureHash.add(texture);
					}
				}
			}

			action_textures.put(action, textureList.toArray(new Texture[textureList.size()]));
			action_textureSetKeys.put(action, textureSetKeys.toArray(new TextureSetKey[textureSetKeys.size()]));
		}
		Collections.sort(textures, new Comparator<Texture>()
		{
			@Override
			public int compare(Texture o1, Texture o2)
			{
				return o1.getAtfFilePath().compareTo(o2.getAtfFilePath());
			}
		});
		for (int i = 0; i < textures.size(); i++)
		{
			Texture texture = textures.get(i);
			String url = texture.getAtfFilePath();
			File atfFile = new File(outputPath + url.replace(".atf", ".atf"));
			File xmlFile = new File(outputPath + url.replace(".atf", ".xml"));

			texture_id.put(texture, i + 1);
			texture_size.put(texture, (int) (atfFile.length() + xmlFile.length()));
			texture_path.put(texture, url);
		}
	}

	/**
	 * 合并时间数组
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int[] mergerTimeArray(int[] a, int[] b)
	{
		int[] list = new int[Math.max(a.length, b.length)];
		for (int i = 0; i < list.length; i++)
		{
			int aVal = 0;
			int bVal = 0;
			if (i < a.length)
			{
				aVal = a[i];
			}
			if (i < b.length)
			{
				bVal = b[i];
			}
			list[i] = aVal <= 0 && bVal <= 0 ? 0 : 1;
		}
		return list;
	}

	/**
	 * 规格化时间数组
	 * 
	 * @param a
	 * @return
	 */
	private int[] normalTimeArray(int[] a)
	{
		int[] list = new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			list[i] = a[i] > 0 ? 1 : 0;
		}
		return list;
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------
	//
	// 场景资源
	//
	// ---------------------------------------------------------------------------------------------------------------------------------------
	
	private Hashtable<ImgFile, Texture[]> img_textures = new Hashtable<ImgFile, Texture[]>();
	
	/**
	 * 获取图像相关的贴图
	 * @param img
	 * @return
	 */
	public Texture[] getImgTextures(ImgFile img)
	{
		return img_textures.get(img);
	}
	
	/**
	 * 获取图像区域
	 * @param img
	 * @param sha1
	 * @param index
	 * @return
	 */
	public Region getImgRegion(ImgFile img,String sha1,int index)
	{
		Texture[] textures=getImgTextures(img);
		for(int i=0;i<textures.length;i++)
		{
			
		}
		
		for(Texture texture : textures)
		{
			for(Region region : texture.getRegions())
			{
				if(region.getOwnerChecksum().equals(sha1) && region.getIndex()==index)
				{
					region.setTexturePath(texture.getAtfFilePath());
					return region;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * 构建场景资源
	 * 
	 * @param attires
	 */
	public void buildSceneResource(Hashtable<String, AttireFile> attires)
	{
		img_textures=new Hashtable<ImgFile, Texture[]>();
		
		GamePacker.beginLogSet("确定场景图像裁切矩形");

		ArrayList<TextureSetKey> outputKeys = new ArrayList<TextureSetKey>();
		ArrayList<TextureSetKey> textureKeys = new ArrayList<TextureSetKey>();
		Hashtable<ImgFile, TextureSetKey> img_textureSetKey = new Hashtable<ImgFile, TextureSetKey>();
		
		Hashtable<Attire, Hashtable<String, TextureSetKey>> attireTextureTable = new Hashtable<Attire, Hashtable<String, TextureSetKey>>();
		for (AttireFile attireFile : attires.values())
		{
			Hashtable<String, Hashtable<GridImgKey, GridImgKey>> groupToGifKeys = new Hashtable<String, Hashtable<GridImgKey, GridImgKey>>();

			for (ImgFile img : attireFile.getAllImgs())
			{
				String atfGroup = attireFile.getImgGroupID(img);

				if (!attireFile.getAtfParams().containsKey(atfGroup))
				{
					atfGroup = "";
				}

				String imgPath = img.getInnerpath();
				String imgSHA1 = shaTable.getChecksumID(imgPath);
				int imgRowCount = 1;
				int imgColCount = 1;
				int[] imgTimes = new int[] { 1 };
				
				GridImgKey gifKey = new GridImgKey(imgSHA1, imgRowCount, imgColCount, img, imgTimes);

				GamePacker.progress("计算场景图像裁切矩形:" + img.getInnerpath());
				clipTable.add(gifKey);

				if (GamePacker.isCancel())
				{
					return;
				}

				if (!groupToGifKeys.containsKey(atfGroup))
				{
					groupToGifKeys.put(atfGroup, new Hashtable<GridImgKey, GridImgKey>());
				}
				Hashtable<GridImgKey, GridImgKey> gifKeyTable = groupToGifKeys.get(atfGroup);
				if (gifKeyTable.containsKey(gifKey))
				{
					GridImgKey oldKey = gifKeyTable.get(gifKey);
					oldKey.setTime(mergerTimeArray(imgTimes, oldKey.getTimes()));
				}
				else
				{
					gifKeyTable.put(gifKey, gifKey);
				}
			}
			
			for (Attire attire : attireFile.getAllAttires())
			{
				if (!attire.isAnimAttire())
				{
					continue;
				}

				for (AttireAction action : attire.getActions())
				{
					for (AttireAnim anim : action.getAnims())
					{
						String atfGroup = anim.getBagID();

						if (!attire.getAtfParams().containsKey(atfGroup))
						{
							atfGroup = "";
						}

						ImgFile img = anim.getImg();
						String imgPath = anim.getImg().getInnerpath();
						String imgSHA1 = shaTable.getChecksumID(imgPath);
						int imgRowCount = anim.getRow();
						int imgColCount = anim.getCol();
						int[] imgTimes = normalTimeArray(anim.getTimes());

						GridImgKey gifKey = new GridImgKey(imgSHA1, imgRowCount, imgColCount, img, imgTimes);

						GamePacker.progress("计算场景图像裁切矩形:" + img.getInnerpath());
						clipTable.add(gifKey);

						if (GamePacker.isCancel())
						{
							return;
						}

						if (!groupToGifKeys.containsKey(atfGroup))
						{
							groupToGifKeys.put(atfGroup, new Hashtable<GridImgKey, GridImgKey>());
						}
						Hashtable<GridImgKey, GridImgKey> gifKeyTable = groupToGifKeys.get(atfGroup);
						if (gifKeyTable.containsKey(gifKey))
						{
							GridImgKey oldKey = gifKeyTable.get(gifKey);
							oldKey.setTime(mergerTimeArray(imgTimes, oldKey.getTimes()));
						}
						else
						{
							gifKeyTable.put(gifKey, gifKey);
						}
					}
				}
			}

			Hashtable<String, TextureSetKey> groupToTextureSetKeys = new Hashtable<String, TextureSetKey>();
			for (String groupID : groupToGifKeys.keySet())
			{
				String param = attireFile.getAtfParams().containsKey(groupID) ? attireFile.getAtfParams().get(groupID) : SceneDefParam;
				Hashtable<GridImgKey, GridImgKey> gifKeys = groupToGifKeys.get(groupID);

				TextureSetKey textureKey = new TextureSetKey(param, gifKeys.values().toArray(new GridImgKey[gifKeys.size()]));
				groupToTextureSetKeys.put(groupID, textureKey);
				textureKeys.add(textureKey);
				if (!textureSetTable.contains(textureKey))
				{
					outputKeys.add(textureKey);
				}
			}

			for (ImgFile img : attireFile.getAllImgs())
			{
				String atfGroup = attireFile.getImgGroupID(img);
				if (!attireFile.getAtfParams().containsKey(atfGroup))
				{
					atfGroup = "";
				}

				img_textureSetKey.put(img, groupToTextureSetKeys.get(atfGroup));
			}

			for (Attire attire : attireFile.getAllAttires())
			{
				if (!attire.isAnimAttire())
				{
					continue;
				}

				attireTextureTable.put(attire, groupToTextureSetKeys);
			}
		}
		GamePacker.endLogSet();

		// 检测取消
		if (GamePacker.isCancel())
		{
			return;
		}

		// 输出贴图集
		GamePacker.beginLogSet("输出场景贴图集:" + outputKeys.size());
		for (TextureSetKey key : outputKeys)
		{
			textureSetTable.add(key);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		for (TextureSetKey key : textureKeys)
		{
			textureSetTable.add(key);
		}
		GamePacker.endLogSet();

		// 检测取消
		if (GamePacker.isCancel())
		{
			return;
		}

		// 分配TextureSetKey到动作
		Hashtable<AttireAction, HashSet<TextureSetKey>> actionToTextureSetKeys = new Hashtable<AttireAction, HashSet<TextureSetKey>>();
		for (AttireFile attireFile : attires.values())
		{
			for (Attire attire : attireFile.getAllAttires())
			{
				if (!attire.isAnimAttire())
				{
					continue;
				}
				if (attire.getKey().startsWith("0_"))
				{
					continue;
				}

				Hashtable<String, TextureSetKey> groupToTextureKeys = attireTextureTable.get(attire);

				for (AttireAction action : attire.getActions())
				{
					HashSet<TextureSetKey> actionTextures = new HashSet<TextureSetKey>();
					for (AttireAnim anim : action.getAnims())
					{
						String atfGroup = anim.getBagID();
						if (!attire.getAtfParams().containsKey(atfGroup))
						{
							atfGroup = "";
						}

						actionTextures.add(groupToTextureKeys.get(atfGroup));
					}

					actionToTextureSetKeys.put(action, actionTextures);
				}
			}
		}

		// 构建贴图数据表
		HashSet<Texture> textureHash = new HashSet<Texture>();
		for (AttireAction action : actionToTextureSetKeys.keySet())
		{
			HashSet<Texture> textureList = new HashSet<Texture>();

			HashSet<TextureSetKey> textureSetKeys = actionToTextureSetKeys.get(action);
			for (TextureSetKey key : textureSetKeys)
			{
				TextureSet textureSet = textureSetTable.getTextureSet(key);
				for (Texture texture : textureSet.getTextures())
				{
					textureList.add(texture);
					textureHash.add(texture);
				}
			}

			action_textures.put(action, textureList.toArray(new Texture[textureList.size()]));
			action_textureSetKeys.put(action, textureSetKeys.toArray(new TextureSetKey[textureSetKeys.size()]));
		}
		for (Texture texture : textureHash)
		{
			String url = texture.getAtfFilePath();
			File atfFile = new File(outputPath + url.replace(".atf", ".atf"));
			File xmlFile = new File(outputPath + url.replace(".atf", ".xml"));

			texture_size.put(texture, (int) (atfFile.length() + xmlFile.length()));
			texture_path.put(texture, url);
		}

		// 确定图像分组的贴图文件集
		for (ImgFile img : img_textureSetKey.keySet())
		{
			TextureSetKey key = img_textureSetKey.get(img);

			TextureSet textureSet = textureSetTable.getTextureSet(key);

			Texture[] textures = textureSet.getTextures();

			img_textures.put(img, textures);
		}
	}
}
