package org.chw.game.packer.world.scene;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

import org.chw.game.packer.GamePacker;
import org.chw.game.packer.world.ImgFile;
import org.chw.game.packer.world.Mp3File;
import org.chw.game.packer.world.TextureSetKey;
import org.chw.game.packer.world.WorldExporter;
import org.chw.game.packer.world.attire.Attire;
import org.chw.game.packer.world.attire.AttireFile;
import org.chw.util.Base64;
import org.chw.util.PathUtil;
import org.chw.util.XmlUtil;
import org.chw.util.ZlibUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Scene
{
	private File file;
	private String innerPath;
	private String innerDirPath;

	private Document document = null;

	private int cityID;
	private String cityName;

	private int sceneID;
	private int timeLimit;
	private int sceneType;
	private int sceneGroup;
	private String sceneName;
	private int sceneW;
	private int sceneH;
	private int defaultX;
	private int defaultY;
	private int viewX;
	private int viewY;
	private int beginX;
	private String atfParams;
	private String grid;
	private String gridTxt;

	private Mp3File bgs;

	private ArrayList<SceneSection> sections=new ArrayList<SceneSection>();
	private ArrayList<SceneBackLayer> backLayers = new ArrayList<SceneBackLayer>();
	private ArrayList<SceneForeLayer> foreLayers = new ArrayList<SceneForeLayer>();
	private ArrayList<SceneAnim> backAnims = new ArrayList<SceneAnim>();
	private ArrayList<SceneAnim> anims = new ArrayList<SceneAnim>();
	private ArrayList<SceneNpc> npcs = new ArrayList<SceneNpc>();
	private ArrayList<SceneDoor> doors = new ArrayList<SceneDoor>();
	private ArrayList<ScenePart> parts = new ArrayList<ScenePart>();
	private ArrayList<SceneHot> hots = new ArrayList<SceneHot>();
	private ArrayList<SceneTrap> traps = new ArrayList<SceneTrap>();
	private ArrayList<SceneLinkFrom> froms = new ArrayList<SceneLinkFrom>();
	private ArrayList<SceneLinkTarget> targets = new ArrayList<SceneLinkTarget>();

	private TextureSetKey textureKey;
	private Attire[] attires;

	/**
	 * 构造函数
	 * 
	 * @param root
	 * @param file
	 */
	public Scene(File file, String innerPath, String innerDirPath)
	{
		this.file = file;
		this.innerPath = innerPath;
		this.innerDirPath = innerDirPath;
	}

	/**
	 * 获取内部路径
	 * 
	 * @return
	 */
	public String getInnerPath()
	{
		return innerPath;
	}

	/**
	 * 获取内部目录路径
	 * 
	 * @return
	 */
	public String getInnerDirPath()
	{
		return innerDirPath;
	}

	public TextureSetKey getTextureKey()
	{
		return textureKey;
	}

	public void setTextureKey(TextureSetKey key)
	{
		textureKey = key;
	}

	public Attire[] getAttires()
	{
		return attires;
	}

	public void setAttires(Attire[] attires)
	{
		this.attires = attires;
	}

	/**
	 * 获取城市ID
	 * 
	 * @return
	 */
	public int getCityID()
	{
		return cityID;
	}

	/**
	 * 设置城市ID
	 * 
	 * @param id
	 */
	public void setCityID(int id)
	{
		cityID = id;
	}

	/**
	 * 获取城市名称
	 * 
	 * @return
	 */
	public String getCityName()
	{
		return cityName;
	}

	/**
	 * 设置城市名称
	 * 
	 * @param name
	 */
	public void setCityName(String name)
	{
		cityName = name;
	}

	/**
	 * 获取场景ID
	 * 
	 * @return
	 */
	public int getSceneID()
	{
		return sceneID;
	}

	/**
	 * 设置场景ID
	 * 
	 * @param id
	 */
	public void setSceneID(int id)
	{
		this.sceneID = id;
	}

	/**
	 * 获取时间限制
	 * 
	 * @return
	 */
	public int getTimeLimit()
	{
		return this.timeLimit;
	}

	/**
	 * 设置时间限制
	 * 
	 * @param time
	 */
	public void setTimeLimit(int time)
	{
		this.timeLimit = time;
	}

	/**
	 * 获取场景名称
	 * 
	 * @return
	 */
	public String getSceneName()
	{
		return sceneName;
	}

	/**
	 * 设置场景名称
	 * 
	 * @param name
	 */
	public void setSceneName(String name)
	{
		sceneName = name;
	}

	/**
	 * 获取场景类型
	 * 
	 * @return
	 */
	public int getSceneType()
	{
		return sceneType;
	}

	/**
	 * 设置场景类型
	 * 
	 * @param type
	 */
	public void setSceneType(int type)
	{
		this.sceneType = type;
	}

	/**
	 * 获取场景分组
	 * 
	 * @return
	 */
	public int getSceneGroup()
	{
		return sceneGroup;
	}

	/**
	 * 设置场景分组
	 * 
	 * @param group
	 */
	public void setSceneGroup(int group)
	{
		sceneGroup = group;
	}

	/**
	 * 背景音乐
	 * 
	 * @return
	 */
	public Mp3File getBackSound()
	{
		return bgs;
	}

	/**
	 * 设置背景音乐
	 * 
	 * @param mp3
	 */
	public void setBackSound(Mp3File mp3)
	{
		bgs = mp3;
	}

	/**
	 * 默认X坐档
	 * 
	 * @return
	 */
	public int getDefaultX()
	{
		return defaultX;
	}

	/**
	 * 默认Y坐标
	 * 
	 * @return
	 */
	public int getDefaultY()
	{
		return defaultY;
	}

	/**
	 * 获取场景宽度
	 * 
	 * @return
	 */
	public int getSceneWidth()
	{
		return sceneW;
	}

	/**
	 * 获取场景高度
	 * 
	 * @return
	 */
	public int getSceneHeight()
	{
		return sceneH;
	}

	/**
	 * 获取场景视口X偏移
	 * 
	 * @return
	 */
	public int getSceneViewXOffset()
	{
		return viewX;
	}

	/**
	 * 获取场景视口Y偏移
	 * 
	 * @return
	 */
	public int getSceneViewYOffset()
	{
		return viewY;
	}

	/**
	 * 获取场景开始线坐标
	 * 
	 * @return
	 */
	public int getSceneBeginX()
	{
		return beginX;
	}

	/**
	 * 获取分段
	 * 
	 * @return
	 */
	public ArrayList<SceneSection> getSections()
	{
		return sections;
	}

	/**
	 * 获取场景网格
	 * 
	 * @return
	 */
	public String getSceneGrid()
	{
		return grid;
	}
	
	/**
	 * 获取场景网格数组
	 * @return
	 */
	public String getSceneGridArray()
	{
		if(gridTxt==null && grid!=null && grid.length()>0)
		{
			byte[] bytes = Base64.decode(grid);
			bytes = ZlibUtil.decompress(bytes);
			
			DataInputStream datas=new DataInputStream(new ByteArrayInputStream(bytes));
			try
			{
				int w=datas.readInt();
				int h=datas.readInt();
				
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<h;i++)
				{
					for(int j=0;j<w;j++)
					{
						sb.append(j>0 ? ",":"");
						sb.append(datas.readInt()==0 ? 0:1);
					}
					sb.append("\n");
				}
				gridTxt=sb.toString();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return gridTxt;
	}
	
	/**
	 * 获取ATF参数
	 * @return
	 */
	public String getAtfParams()
	{
		return atfParams;
	}

	public ArrayList<SceneBackLayer> getBackLayers()
	{
		return backLayers;
	}

	public ArrayList<SceneForeLayer> getForeLayers()
	{
		return foreLayers;
	}

	public ArrayList<SceneAnim> getBackAnims()
	{
		return backAnims;
	}

	public ArrayList<SceneAnim> getAnims()
	{
		return anims;
	}

	public ArrayList<SceneNpc> getNpcs()
	{
		return npcs;
	}

	public ArrayList<SceneDoor> getDoors()
	{
		return doors;
	}

	public ArrayList<ScenePart> getParts()
	{
		return parts;
	}

	public ArrayList<SceneHot> getHots()
	{
		return hots;
	}

	public ArrayList<SceneTrap> getTraps()
	{
		return traps;
	}

	public ArrayList<SceneLinkFrom> getFroms()
	{
		return froms;
	}

	public ArrayList<SceneLinkTarget> getTargets()
	{
		return targets;
	}

	/**
	 * 打开
	 * 
	 * @param exporter
	 */
	public void open(WorldExporter exporter)
	{
		try
		{
			SAXReader reader = new SAXReader();
			document = reader.read(file);
		}
		catch (DocumentException e)
		{
			GamePacker.error(e);
		}

		if (document != null)
		{
			buildSceneBags(exporter);
			buildSceneInfo(exporter);
		}
	}

	// --------------------------------------------------------------------------------------------------------
	//
	// 构建文档
	//
	// --------------------------------------------------------------------------------------------------------

	private Hashtable<String, AttireFile> attireRefs = new Hashtable<String, AttireFile>();

	/**
	 * 获取图像资源
	 * 
	 * @param ref
	 * @return
	 */
	private ImgFile getImgRes(String ref)
	{
		if (ref != null)
		{
			String absRef = PathUtil.rebuildPath(ref);
			String[] parts = absRef.split("/");

			String path = parts[0];
			// String type = parts[1];
			String name = parts[2];

			if (attireRefs.containsKey(path))
			{
				return attireRefs.get(path).getImg(name);
			}
		}
		return null;
	}

	/**
	 * 获取装扮资源
	 * 
	 * @param ref
	 * @return
	 */
	private Attire getAttireRes(String ref)
	{
		if (ref != null)
		{
			String absRef = PathUtil.rebuildPath(ref);
			String[] parts = absRef.split("/");

			if (parts.length >= 3)
			{
				String path = parts[0];
				// String type = parts[1];
				String name = parts[2];

				if (attireRefs.containsKey(path))
				{
					return attireRefs.get(path).getAttire(name);
				}
			}
		}
		return null;
	}

	/**
	 * 生成场景资源表
	 * 
	 * @param document
	 */
	private void buildSceneBags(WorldExporter exporter)
	{
		@SuppressWarnings({ "rawtypes" })
		List list = document.selectNodes("sceneData/resources/resource");

		for (int i = 0; i < list.size(); i++)
		{
			Element node = (Element) list.get(i);

			String key = node.attributeValue("key");
			String path = PathUtil.rebuildPath(node.attributeValue("path"));

			AttireFile attire = exporter.getAttireFile(path);
			if (attire != null)
			{
				attireRefs.put(key, attire);
			}
		}
	}

	/**
	 * 生成场景信息
	 * 
	 * @param document
	 * @param root
	 */
	private void buildSceneInfo(WorldExporter exporter)
	{
		Element node = (Element) document.selectSingleNode("sceneData/sceneInfo");

		sceneW = XmlUtil.parseInt(node.attributeValue("sceneWidth"),0);
		sceneH = XmlUtil.parseInt(node.attributeValue("sceneHeight"),0);
		viewX = XmlUtil.parseInt(node.attributeValue("viewOffsetX"),0);
		viewY = XmlUtil.parseInt(node.attributeValue("viewOffsetY"),0);
		defaultX = XmlUtil.parseInt(node.attributeValue("defaultX"),0);
		defaultY = XmlUtil.parseInt(node.attributeValue("defaultY"),0);
		beginX = XmlUtil.parseInt(node.attributeValue("readyX"),Integer.MIN_VALUE);
		
		if(sceneW==0 || sceneH==0)
		{
			GamePacker.error("场景大小不能为空!("+sceneW+","+sceneH+")", getInnerPath());
		}
		if(defaultX==0 || defaultY==0)
		{
			GamePacker.error("场景默认点不合法!("+defaultX+","+defaultY+")", getInnerPath());
		}
		if(beginX==Integer.MIN_VALUE && document.selectNodes("sceneData/timers/timer").size()>0)
		{
			GamePacker.error("有怪的场景没有设置开始线！", getInnerPath());
		}
		
		grid = node.getText();
		atfParams=XmlUtil.parseString(node.attributeValue("params"), "-q 20 -f -n 0,0");
		sections.clear();

		@SuppressWarnings({ "rawtypes" })
		List list;

		// 分屏信息
		list = document.selectNodes("sceneData/splits/split");
		if (/* sceneType == 3 && */list.size() > 0)
		{
			for (int i = 0; i < list.size(); i++)
			{
				node = (Element) list.get(i);
				String pos=node.attributeValue("position");
				String type=node.attributeValue("type");
				
				if(pos!=null && !pos.isEmpty()/* && type!=null && !type.isEmpty()*/)
				{
					sections.add(new SceneSection(XmlUtil.parseInt(pos,0),XmlUtil.parseInt(type, 0)));
				}
				else
				{
					GamePacker.error("错误的分屏线设定！(index="+i+" , x="+pos+")", getInnerPath());
				}
			}
			sections.add(new SceneSection(sceneW,0));
		}
		else
		{
			sections.add(new SceneSection(sceneW,0));
		}
		Collections.sort(sections, new Comparator<SceneSection>()
		{
			@Override
			public int compare(SceneSection o1, SceneSection o2)
			{
				if(o1.getPosition()<o2.getPosition())
				{
					return -1;
				}
				else if(o1.getPosition()>o2.getPosition())
				{
					return 1;
				}
				return 0;
			}
		});

		// 背景图层
		list = document.selectNodes("sceneData/layers/layer");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String path = node.attributeValue("imagePath");
			String name = node.attributeValue("label");
			int x = XmlUtil.parseInt(node.attributeValue("offsetX"),0);
			int y = XmlUtil.parseInt(node.attributeValue("offsetY"),0);
			float speed = ((float) XmlUtil.parseInt(node.attributeValue("scrollSpeed"),0) / 1000);

			ImgFile img = getImgRes(path);
			if (img != null)
			{
				backLayers.add(new SceneBackLayer(name, x, y, speed, img));
			}
			else
			{
				GamePacker.warning("背景图层图像未找到！", getInnerPath() + "  名称:" + name + "   引用:" + path);
			}
		}

		// 前景图层
		list = document.selectNodes("sceneData/autoLayers/layer");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String path = node.attributeValue("imagePath");
			String name = node.attributeValue("label");
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			int w = XmlUtil.parseInt(node.attributeValue("width"),0);
			int speed = XmlUtil.parseInt(node.attributeValue("speed"),0);

			ImgFile img = getImgRes(path);
			if (img != null)
			{
				foreLayers.add(new SceneForeLayer(name, x, y, w, speed, img));
			}
			else
			{
				GamePacker.warning("前景图层图像未找到！", getInnerPath() + "  名称:" + name + "   引用:" + path);
			}
		}

		// 背景动画
		list = document.selectNodes("sceneData/stills/still");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String path = node.attributeValue("imagePath");
			String name = node.attributeValue("label");
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			int offsetX = 0;
			int offsetY = 0;

			Attire attire = getAttireRes(path);
			if (attire != null)
			{
				backAnims.add(new SceneAnim(name, x, y, offsetX, offsetY, attire));
			}
			else
			{
				GamePacker.warning("背景动画装扮未找到！", getInnerPath() + "  名称:" + name + "   引用:" + path);
			}
		}

		// 前景动画
		list = document.selectNodes("sceneData/anims/anim");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String path = node.attributeValue("imagePath");
			String name = node.attributeValue("label");
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			int offsetX = XmlUtil.parseInt(node.attributeValue("offsetX"),0);
			int offsetY = XmlUtil.parseInt(node.attributeValue("offsetY"),0);

			Attire attire = getAttireRes(path);
			if (attire != null)
			{
				anims.add(new SceneAnim(name, x, y, offsetX, offsetY, attire));
			}
			else
			{
				GamePacker.warning("前景动画装扮未找到！", getInnerPath() + "  名称:" + name + "   引用:" + path);
			}
		}

		// NPC , 传送门 , 动画
		int doorID = 1;
		list = document.selectNodes("sceneData/npcs/npc");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String path = node.attributeValue("attire");
			String name = node.attributeValue("label").trim();
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			int npcID = XmlUtil.parseInt(node.attributeValue("configID"),0);

			Attire attire = getAttireRes(path);
			if (attire != null)
			{
				if (npcID != 0)
				{
					npcs.add(new SceneNpc(name, npcID, x, y, attire));
				}
				else if (name.equals("跳转点"))
				{
					doors.add(new SceneDoor(doorID, x, y, attire));
				}
				else
				{
					anims.add(new SceneAnim(name, x, y, 0, 0, attire));
				}
			}
			else
			{
				GamePacker.warning("NPC装扮未找到！", getInnerPath() + "  名称:" + name + "   引用:" + path);
			}
		}

		// 怪物列表
		Hashtable<Integer, ScenePart> monsterParts = new Hashtable<Integer, ScenePart>();

		list = document.selectNodes("sceneData/timers/timer");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String timerName = node.attributeValue("label");
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			boolean loop = node.attributeValue("loop").equals("true");

			SceneMonsterTimer timer = new SceneMonsterTimer(timerName, x, y, loop);

			for (int z = 0; z < sections.size(); z++)
			{
				if (timer.getX() < sections.get(z).getPosition())
				{
					int index = z;

					ScenePart monsterPart = monsterParts.get(index);
					if (monsterPart == null)
					{
						int left = 0;
						int right = sections.get(index).getPosition();
						if (index > 0)
						{
							left = sections.get(index-1).getPosition();
						}
						monsterPart = new ScenePart(left, right);
						monsterParts.put(index, monsterPart);
					}

					monsterPart.addTimer(timer);
					break;
				}
			}

			@SuppressWarnings({ "rawtypes" })
			List groups = node.selectNodes("group");
			for (int j = 0; j < groups.size(); j++)
			{
				Element group = (Element) groups.get(j);

				String groupName = group.attributeValue("label");
				int delay = XmlUtil.parseInt(group.attributeValue("delay"),0);
				boolean obstruct = group.attributeValue("obstruct").equals("true");
				int loopCount = XmlUtil.parseInt(group.attributeValue("loop"),0);
				boolean ignoreFirstDelay = group.attributeValue("ignoreable").equals("true");

				SceneMonsterBatch batch = new SceneMonsterBatch(delay, obstruct, loopCount, ignoreFirstDelay);
				timer.addSceneMonsterBatch(batch);

				@SuppressWarnings({ "rawtypes" })
				List monsters = group.selectNodes("monster");
				for (int k = 0; k < monsters.size(); k++)
				{
					Element monster = (Element) monsters.get(k);

					String monsterName = monster.attributeValue("label");
					Attire attire = getAttireRes(monster.attributeValue("attireID"));
					int monsterID = XmlUtil.parseInt(monster.attributeValue("id"),0);
					int monsterX = XmlUtil.parseInt(monster.attributeValue("x"),0);
					int monsterY = XmlUtil.parseInt(monster.attributeValue("y"),0);
					int monsterDir = XmlUtil.parseInt(monster.attributeValue("direction"),0);

					batch.addMonster(new SceneMonster(monsterID, attire, monsterX, monsterY, monsterDir));

					if (attire == null)
					{
						GamePacker.warning("怪物装扮未找到！", getInnerPath() + "  计时器:" + timerName + " 批次:" + groupName + " 怪物:" + monsterName);
					}
				}
			}
		}
		for (ScenePart scenePart : monsterParts.values())
		{
			parts.add(scenePart);
		}
		Collections.sort(parts, new Comparator<ScenePart>()
		{
			@Override
			public int compare(ScenePart o1, ScenePart o2)
			{
				if (o1.getLeft() < o2.getLeft())
				{
					return -1;
				}
				else if (o1.getLeft() > o2.getLeft())
				{
					return 1;
				}
				return 0;
			}
		});

		// 热区
		list = document.selectNodes("sceneData/hots/hot");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			String key = node.attributeValue("hash");
			boolean isFrom = node.attributeValue("type").equals("0");
			boolean isDest = node.attributeValue("type").equals("1");

			String name = node.attributeValue("label");
			String descPath = node.attributeValue("description");
			int width = XmlUtil.parseInt(node.attributeValue("width"),0);
			int height = XmlUtil.parseInt(node.attributeValue("height"),0);
			int x = XmlUtil.parseInt(node.attributeValue("x"),0) - width / 2;
			int y = XmlUtil.parseInt(node.attributeValue("y"),0) - height / 2;
			ImgFile descImg = null;

			if (isFrom)
			{
				SceneLinkFrom from = new SceneLinkFrom(key, this, x, y, width, height);
				froms.add(from);

				// 关联连接线
				ArrayList<SceneLink> lines = exporter.getWorldFile().getLinksByFrom(key);
				if (lines != null)
				{
					for (SceneLink line : lines)
					{
						line.setLinkFrom(from);
						from.addLink(line);
					}
				}

				// 建立热区描述
				if (descPath != null && descPath.isEmpty() == false)
				{
					descImg = this.getImgRes(descPath);
					if (descImg == null)
					{
						GamePacker.warning("热区描述图像未找到！", getInnerPath() + "  热区:" + name + " 引用:" + descPath);
					}
				}

				// 查找对应传送门
				int doorIndex = 0;
				for (SceneDoor door : doors)
				{
					if (door.getX() >= x && door.getY() >= y && door.getX() <= x + width && door.getY() <= y + height)
					{
						from.setDoorIndex(doorIndex);
						break;
					}
					doorIndex++;
				}

				// 建立热区数据
				hots.add(new SceneHot(x, y, width, height, from.getDoorIndex(), descImg, lines));
			}
			else if (isDest)
			{
				SceneLinkTarget dest = new SceneLinkTarget(key, this, x, y, width, height);
				targets.add(dest);

				// 关联连接线
				ArrayList<SceneLink> lines = exporter.getWorldFile().getLinksByDest(key);
				if (lines != null)
				{
					for (SceneLink line : lines)
					{
						line.setLinkDest(dest);
						dest.addLink(line);
					}
				}
			}
		}

		// 陷阱
		list = document.selectNodes("sceneData/traps/trap");
		for (int i = 0; i < list.size(); i++)
		{
			node = (Element) list.get(i);

			int type = XmlUtil.parseInt(node.attributeValue("type"),0);
			int x = XmlUtil.parseInt(node.attributeValue("x"),0);
			int y = XmlUtil.parseInt(node.attributeValue("y"),0);
			int width = XmlUtil.parseInt(node.attributeValue("width"),0);
			int height = XmlUtil.parseInt(node.attributeValue("height"),0);

			@SuppressWarnings({ "rawtypes" })
			List params = node.selectNodes("param");

			//if (type == 1)
			//{
				int quest = 0;
				String content = "";

				if (params.size() > 0)
				{
					String param1 = ((Element) params.get(0)).getText();
					if (param1 != null && !param1.isEmpty())
					{
						quest = XmlUtil.parseInt(param1,0);
					}
				}
				if (params.size() > 1)
				{
					String param2 = ((Element) params.get(1)).getText();
					if (param2 != null && !param2.isEmpty())
					{
						content = param2;
					}
				}

				traps.add(new SceneTrap(type,x, y, width, height, quest, content));
			//}
		}
	}

	/**
	 * 重设热区
	 * 
	 * @param exporter
	 */
	public void restHotArea(WorldExporter exporter)
	{
		for (SceneLinkFrom from : froms)
		{
			ArrayList<SceneLink> lines = exporter.getWorldFile().getLinksByFrom(from.getKey());
			if (lines != null)
			{
				for (SceneLink line : lines)
				{
					if (sceneID != 0)
					{
						line.setLinkFrom(from);
					}
				}
			}
		}

		for (SceneLinkTarget dest : targets)
		{
			// 关联连接线
			ArrayList<SceneLink> lines = exporter.getWorldFile().getLinksByDest(dest.getKey());
			if (lines != null)
			{
				for (SceneLink line : lines)
				{
					if (sceneID != 0)
					{
						line.setLinkDest(dest);
					}
				}
			}
		}
	}
}