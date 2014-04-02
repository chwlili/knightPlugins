package org.chw.game.packer.world;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;

import org.chw.game.packer.GamePacker;
import org.chw.game.packer.base.AbsExporter;
import org.chw.game.packer.world.attire.Attire;
import org.chw.game.packer.world.attire.AttireAction;
import org.chw.game.packer.world.attire.AttireAnim;
import org.chw.game.packer.world.attire.AttireAudio;
import org.chw.game.packer.world.attire.AttireFile;
import org.chw.game.packer.world.scene.Scene;
import org.chw.game.packer.world.scene.SceneAnim;
import org.chw.game.packer.world.scene.SceneBackLayer;
import org.chw.game.packer.world.scene.SceneDoor;
import org.chw.game.packer.world.scene.SceneForeLayer;
import org.chw.game.packer.world.scene.SceneHot;
import org.chw.game.packer.world.scene.SceneHotLink;
import org.chw.game.packer.world.scene.SceneLink;
import org.chw.game.packer.world.scene.SceneMonster;
import org.chw.game.packer.world.scene.SceneMonsterBatch;
import org.chw.game.packer.world.scene.SceneMonsterTimer;
import org.chw.game.packer.world.scene.SceneNpc;
import org.chw.game.packer.world.scene.ScenePart;
import org.chw.game.packer.world.scene.SceneSection;
import org.chw.game.packer.world.scene.SceneTrap;
import org.chw.game.packer.world.scene.WorldCity;
import org.chw.game.packer.world.scene.WorldFile;
import org.chw.game.packer.world.scene.WorldMapFile;
import org.chw.game.packer.world.scene.WorldScene;
import org.chw.util.FileUtil;
import org.chw.util.MD5Util;
import org.chw.util.TextUtil;
import org.chw.util.ZlibUtil;

public class WorldExporter extends AbsExporter
{
	private boolean zip;
	private boolean mobile;

	/**
	 * ���캯��
	 * 
	 * @param src
	 * @param dst
	 */
	public WorldExporter(File src, File dst, boolean zip,boolean isMobile)
	{
		super("��������", src, dst);

		this.zip = zip;
		this.mobile = isMobile;
	}

	// -----------------------------------------------------------------
	//
	// �ļ���
	//
	// -----------------------------------------------------------------

	private Hashtable<String, File> files = new Hashtable<String, File>();
	private Hashtable<String, ImgFile> imgs = new Hashtable<String, ImgFile>();
	private Hashtable<String, Mp3File> mp3s = new Hashtable<String, Mp3File>();
	private Hashtable<String, AttireFile> attires = new Hashtable<String, AttireFile>();
	private Hashtable<String, Scene> scenes = new Hashtable<String, Scene>();
	private WorldFile link;
	private WorldMapFile map;

	private WorldAttires attireManager;

	/**
	 * ��ȡ�ļ�
	 * 
	 * @param path
	 * @return
	 */
	public File getFile(String path)
	{
		return files.get(path);
	}

	/**
	 * ��ȡͼ���ļ�
	 * 
	 * @param path
	 * @return
	 */
	public ImgFile getImgFile(String path)
	{
		return imgs.get(path);
	}

	/**
	 * ��ȡ��Ч�ļ�
	 * 
	 * @param path
	 * @return
	 */
	public Mp3File getMp3File(String path)
	{
		return mp3s.get(path);
	}

	/**
	 * ��ȡװ���ļ�
	 * 
	 * @param url
	 * @return
	 */
	public AttireFile getAttireFile(String url)
	{
		return attires.get(url);
	}

	/**
	 * ��ȡ�����ļ�
	 * 
	 * @param url
	 * @return
	 */
	public Scene getSceneFile(String url)
	{
		return scenes.get(url);
	}

	/**
	 * ��ȡ�����ļ�
	 * 
	 * @return
	 */
	public WorldFile getWorldFile()
	{
		return link;
	}

	// -------------------------------------------------------------------------------
	//
	// �汾��Ϣ
	//
	// -------------------------------------------------------------------------------

	private GridImgTable clipTable;
	private TextureSetTable textureSetTable;

	@Override
	protected void openVers()
	{
		super.openVers();

		clipTable = new GridImgTable();
		clipTable.open(new File(getDestDir().getPath() + "/.ver/imgclip"));

		textureSetTable = new TextureSetTable(this);
		textureSetTable.open(new File(getDestDir().getPath() + "/.ver/textures"));
	}

	@Override
	protected void saveVers()
	{
		super.saveVers();

		clipTable.save();

		textureSetTable.save();
	}

	/**
	 * ͼ�������Ϣ��
	 * 
	 * @return
	 */
	public GridImgTable getGridImgTable()
	{
		return clipTable;
	}

	/**
	 * ��ͼ�ϲ���Ϣ��
	 * 
	 * @return
	 */
	public TextureSetTable getTextureSetTable()
	{
		return textureSetTable;
	}

	// -------------------------------------------------------------------------------
	//
	// ����
	//
	// -------------------------------------------------------------------------------

	@Override
	protected void exportContent() throws Exception
	{
		if (GamePacker.isCancel())
		{
			return;
		}

		// ��ȡ�����ļ�
		GamePacker.beginLogSet("��ȡ�ļ�");
		readDir(getSourceDir());
		GamePacker.endLogSet();

		if (GamePacker.isCancel())
		{
			return;
		}

		// ͬ������װ��
		syncAttires();

		if (GamePacker.isCancel())
		{
			return;
		}

		GamePacker.beginLogSet("��ȡ����");
		link.open(this);
		GamePacker.endLogSet();

		if (GamePacker.isCancel())
		{
			return;
		}

		// ͬ�����г���
		syncScenes();

		if (GamePacker.isCancel())
		{
			return;
		}

		// ͬ������
		syncWorld();
	}

	/**
	 * ��ȡ�����ļ�
	 * 
	 * @param dir
	 */
	private void readDir(File dir)
	{
		File[] files = dir.listFiles();

		if (files == null)
		{
			return;
		}

		for (int i = 0; i < files.length; i++)
		{
			File file = files[i];

			if (file.isHidden())
			{
				continue;
			}

			if (file.isDirectory())
			{
				readDir(file);
			}
			else
			{
				String innerPath = file.getPath().substring(getSourceDir().getPath().length()).replaceAll("\\\\", "/");
				String innerDirPath = file.getParentFile().getPath().substring(getSourceDir().getPath().length()).replaceAll("\\\\", "/");
				String fileID = getChecksumTable().getChecksumID(innerPath);

				// writeLog("��ȡ�ļ�:"+innerPath);

				String path = innerPath.toLowerCase();
				if (path.endsWith(".png") || path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".gif"))
				{
					imgs.put(innerPath, new ImgFile(file, innerPath, innerDirPath));
				}
				else if (path.endsWith(".mp3"))
				{
					mp3s.put(innerPath, new Mp3File(file, innerPath, innerDirPath));
				}
				else if (path.endsWith(".res") || path.endsWith(".attire"))
				{
					attires.put(innerPath, new AttireFile(fileID, file, innerPath, innerDirPath));
				}
				else if (path.endsWith(".scene"))
				{
					scenes.put(innerPath, new Scene(file, innerPath, innerDirPath));
				}
				else if (path.endsWith(".link"))
				{
					link = new WorldFile(file, innerPath, innerDirPath);
				}
				else if (path.endsWith(".map"))
				{
					map = new WorldMapFile();
				}

				this.files.put(innerPath, file);
				GamePacker.progress("��ȡ�ļ�", innerPath);
			}
		}
	}

	private String attireFileKey;
	private Hashtable<Scene, String> sceneFileKeys;

	/**
	 * ͬ������װ��
	 * 
	 * @throws Exception
	 */
	private void syncAttires() throws Exception
	{
		// ������װ���ļ�
		GamePacker.beginLogSet("��ȡװ��");
		for (AttireFile attireFile : attires.values())
		{
			GamePacker.progress("��ȡװ��", attireFile.getInnerPath());
			attireFile.open(this);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		GamePacker.endLogSet();

		// װ����ͼ������
		attireManager = new WorldAttires(getDestDir().getParentFile().getPath(), getChecksumTable(), clipTable, textureSetTable);
		attireManager.build(attires);

		// ���ȡ��
		if (GamePacker.isCancel())
		{
			return;
		}

		// ����װ������
		GamePacker.beginLogSet("���װ������");
		GamePacker.log("����װ������");
		StringBuilder attireText = new StringBuilder();
		attireText.append("<attires>\n");
		attireText.append("\t<textures>\n");
		for (Texture texture : attireManager.getTextures())
		{
			int id = attireManager.getTextureID(texture);
			if(id!=0)
			{
				int size = attireManager.getTextureSize(texture);
				String path = attireManager.getTexturePath(texture);
	
				attireText.append(String.format("\t\t<texture id=\"%s\" path=\"%s\" size=\"%s\" />\n", id, path, size));
			}
		}
		attireText.append("\t</textures>\n");

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

				attireText.append(String.format("\t<attire id=\"%s.%s\" name=\"%s\" width=\"%s\" height=\"%s\">\n", attire.getFileID(), attire.getKey(), attire.getRefKey(), attire.getHitRect().getWidth(), attire.getHitRect().getHeight()));
				for (AttireAction action : attire.getActions())
				{
					attireText.append(String.format("\t\t<action id=\"%s\" nameX=\"%s\" nameY=\"%s\" textures=\"%s\" >\n", action.getID(), action.getNameX(), action.getNameY(), attireManager.getActionTextureIDs(action)));
					for (AttireAnim anim : action.getAnims())
					{
						String ownerChecksumID = getChecksumTable().getChecksumID(anim.getImg().getInnerpath());

						attireText.append("\t\t\t<anim x=\"" + anim.getX() + "\" y=\"" + anim.getY() + "\" scaleX=\"" + anim.getScaleX() + "\" scaleY=\""+anim.getScaleY()+"\" flip=\"" + anim.getFlip() + "\" actionID=\"" + action.getID() + "\" groupID=\"" + anim.getGroupID() + "\" layerID=\"" + anim.getLayerID() + "\">\n");

						int regionCount = anim.getRow() * anim.getCol();
						for (int i = 0; i < regionCount; i++)
						{
							int delay = anim.getTimes()[i];
							if (delay > 0)
							{
								Region region = attireManager.getActionTextureRegion(action, ownerChecksumID, i);
								if (region != null)
								{
									attireText.append("\t\t\t\t<frame texture=\"" + region.getTexturePath() + "\" frameID=\"" + region.getOwnerChecksum() + "_" + i + "\" frameW=\"" + region.getW() + "\" frameH=\"" + region.getH() + "\" delay=\"" + delay + "\"/>\n");
								}
							}
						}

						attireText.append("\t\t\t</anim>\n");
					}
					for (AttireAudio audio : action.getAudios())
					{
						String audioURL = exportFile(getChecksumTable().getChecksumID(audio.getMp3().getInnerpath()), audio.getMp3().getFile());
						attireText.append(String.format("\t\t\t<audio path=\"%s\" loop=\"%s\" volume=\"%s\"/>\n", audioURL, audio.getLoop(), audio.getVolume()));
					}
					attireText.append("\t\t</action>\n");
				}
				attireText.append("\t</attire>\n");
			}
		}
		attireText.append("</attires>");

		// �洢�ļ�
		GamePacker.log("����װ������");
		byte[] attireBytes = attireText.toString().getBytes("UTF-8");
		if (zip)
		{
			attireBytes = ZlibUtil.compress(attireBytes);
		}
		String attireBytesKey = (zip ? "z" : "") + MD5Util.md5Bytes(attireBytes);

		exportFile(attireBytesKey, attireBytes, "cfg");

		attireFileKey = attireBytesKey;

		GamePacker.endLogSet();
	}

	/**
	 * ͬ�����г���
	 * 
	 * @throws Exception
	 */
	private void syncScenes() throws Exception
	{
		sceneFileKeys = new Hashtable<Scene, String>();

		// �򿪳���
		GamePacker.beginLogSet("��ȡ����");
		for (Scene scene : scenes.values())
		{
			GamePacker.progress("��ȡ����", scene.getInnerPath());
			scene.open(this);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		GamePacker.endLogSet();

		if (GamePacker.isCancel())
		{
			return;
		}

		// ������Դ
		GamePacker.beginLogSet("�ϲ�������Դ");
		for (Scene scene : scenes.values())
		{
			GamePacker.progress("����װ��");
			HashSet<Attire> attires = new HashSet<Attire>();
			for (SceneAnim anim : scene.getBackAnims())
			{
				if (anim.getAttire() != null)
				{
					attires.add(anim.getAttire());
				}
			}
			for (SceneAnim anim : scene.getAnims())
			{
				if (anim.getAttire() != null)
				{
					attires.add(anim.getAttire());
				}
			}
			for (SceneDoor door : scene.getDoors())
			{
				if (door.getAttire() != null)
				{
					attires.add(door.getAttire());
				}
			}

			Attire[] attireArray = new Attire[attires.size()];
			attireArray = attires.toArray(attireArray);
			Arrays.sort(attireArray, new Comparator<Attire>()
			{
				@Override
				public int compare(Attire o1, Attire o2)
				{
					return o1.getKey().compareTo(o2.getKey());
				}
			});
			scene.setAttires(attireArray);

//			GamePacker.progress("������ͼ");

			// �ϲ�����ͼ����ͼ
//			ArrayList<GridImgKey> gridImgKeyList = new ArrayList<GridImgKey>();
//			for (SceneBackLayer layer : scene.getBackLayers())
//			{
//				GridImgKey gridImgKey = new GridImgKey(getChecksumTable().getChecksumID(layer.getImage().getInnerpath()), 1, 1, layer.getImage(), new int[] { 1 });
//				getGridImgTable().add(gridImgKey);
//				gridImgKeyList.add(gridImgKey);
//			}
			// �ϲ������Զ�ͼ����ͼ
//			for (SceneForeLayer layer : scene.getForeLayers())
//			{
//				GridImgKey gridImgKey = new GridImgKey(getChecksumTable().getChecksumID(layer.getImage().getInnerpath()), 1, 1, layer.getImage(), new int[] { 1 });
//				getGridImgTable().add(gridImgKey);
//				gridImgKeyList.add(gridImgKey);
//			}
			// �ϲ�����װ����ͼ
//			for (Attire attire : attireArray)
//			{
//				for (AttireAction action : attire.getActions())
//				{
//					for (AttireAnim anim : action.getAnims())
//					{
//						String checksum = getChecksumTable().getChecksumID(anim.getImg().getInnerpath());
//						int rowCount = anim.getRow();
//						int colCount = anim.getCol();
//						int[] times = normalTimeArray(anim.getTimes());
//						ImgFile img = anim.getImg();
//
//						GridImgKey gridImgKey = new GridImgKey(checksum, rowCount, colCount, img, times);
//
//						getGridImgTable().add(gridImgKey);
//						gridImgKeyList.add(gridImgKey);
//					}
//				}
//			}

//			if (GamePacker.isCancel())
//			{
//				return;
//			}
//
//			GridImgKey[] keys = new GridImgKey[gridImgKeyList.size()];
//			keys = gridImgKeyList.toArray(keys);
//
//			TextureSetKey attireTextureSetKey = new TextureSetKey(XmlUtil.parseString(scene.getAtfParams(), "-n 0:0 -r -q 30 -s"), keys);
//			scene.setTextureKey(attireTextureSetKey);
//			textureSetTable.add(attireTextureSetKey);
//
//			if (GamePacker.isCancel())
//			{
//				return;
//			}
		}
		GamePacker.endLogSet();

		if (GamePacker.isCancel())
		{
			return;
		}

		// ��������
		GamePacker.beginLogSet("�����������");
		for (Scene scene : scenes.values())
		{
			GamePacker.progress("�������", scene.getInnerPath());

			String bgsPath = "";
			if (scene.getBackSound() != null)
			{
				bgsPath = exportFile(getChecksumTable().getChecksumID(scene.getBackSound().getInnerpath()), scene.getBackSound().getFile());
			}

			int[] sectionArr = new int[scene.getSections().size()];
			for (int i = 0; i < scene.getSections().size(); i++)
			{
				sectionArr[i] = scene.getSections().get(i).getPosition();
			}

			StringBuilder sb = new StringBuilder();
			sb.append("<scene id=\"" + scene.getSceneID() + "\" type=\"" + scene.getSceneType() + "\" name=\"" + scene.getSceneName() + "\" group=\"" + scene.getSceneGroup() + "\" bgs=\"" + bgsPath + "\" defaultX=\"" + scene.getDefaultX() + "\" defaultY=\"" + scene.getDefaultY() + "\" sceneWidth=\"" + scene.getSceneWidth() + "\" sceneHeight=\"" + scene.getSceneHeight() + "\" viewOffsetX=\"" + scene.getSceneViewXOffset() + "\" viewOffsetY=\"" + scene.getSceneViewYOffset() + "\" beginX=\"" + scene.getSceneBeginX() + "\" timeLimit=\"" + Math.abs(scene.getTimeLimit()) + "\" timeLimitType=\"" + (scene.getTimeLimit() > 0 ? 1 : (scene.getTimeLimit() < 0 ? 2 : 0)) + "\" sections=\"" + TextUtil.formatIntArray(sectionArr) + "\" >\n");
			
			if(mobile)
			{
				sb.append("\t<grid><![CDATA["+scene.getSceneGridArray()+"]]></grid>\n");
			}
			else
			{
				sb.append("\t<grid><![CDATA[" + scene.getSceneGrid() + "]]></grid>\n");
			}

			sb.append("\t<sections>\n");
			for (SceneSection section : scene.getSections())
			{
				sb.append("\t\t<section x=\"" + section.getPosition() + "\" type=\"" + section.getType() + "\" />\n");
			}
			sb.append("\t</sections>\n");

			sb.append("\t<attires>\n");
			for (Attire attire : scene.getAttires())
			{
				sb.append("\t\t<attire name=\"" + attire.getKey() + "\" x=\"" + attire.getHitRect().getX() + "\" y=\"" + attire.getHitRect().getY() + "\" width=\"" + attire.getHitRect().getWidth() + "\" height=\"" + attire.getHitRect().getHeight() + "\" nameX=\"" + attire.getNameX() + "\" nameY=\"" + attire.getNameY() + "\">\n");
				for (AttireAction action : attire.getActions())
				{
					sb.append("\t\t\t<action id=\"" + action.getID() + "\" x=\"" + action.getHitRect().getX() + "\" y=\"" + action.getHitRect().getY() + "\" width=\"" + action.getHitRect().getWidth() + "\" height=\"" + action.getHitRect().getHeight() + "\" nameX=\"" + action.getNameX() + "\" nameY=\"" + action.getNameY() + "\">\n");
					for (AttireAnim anim : action.getAnims())
					{
						sb.append("\t\t\t\t<anim x=\"" + anim.getX() + "\" y=\"" + anim.getY() + "\" scaleX=\"" + anim.getScaleX() + "\" scaleY=\""+anim.getScaleY()+"\" flip=\"" + anim.getFlip() + "\" actionID=\"" + action.getID() + "\" groupID=\"" + anim.getGroupID() + "\" layerID=\"" + anim.getLayerID() + "\">\n");
						
						String ownerChecksumID = getChecksumTable().getChecksumID(anim.getImg().getInnerpath());
						int regionCount = anim.getRow() * anim.getCol();
						for (int i = 0; i < regionCount; i++)
						{
							int delay = anim.getTimes()[i];
							if (delay > 0)
							{
								Region region = attireManager.getActionTextureRegion(action, ownerChecksumID, i);
								if(region!=null)
								{
									sb.append("\t\t\t\t\t<frame texture=\"" + region.getTexturePath() + "\" frameID=\"" + region.getOwnerChecksum() + "_" + i + "\" frameW=\"" + region.getW() + "\" frameH=\"" + region.getH() + "\" delay=\"" + delay + "\"/>\n");
								}
								else
								{
									System.err.println("��������ͼ������δ������ "+scene.getInnerPath()+"     attireName="+attire.getKey()+"  action="+action.getID()+"  anim="+anim.getGroupID()+","+anim.getLayerID());
									//throw new Error("��������ͼ������δ������ "+scene.getInnerPath());
								}
							}
						}
						sb.append("\t\t\t\t</anim>\n");
					}
					for (AttireAudio audio : action.getAudios())
					{
						String audioURL = exportFile(getChecksumTable().getChecksumID(audio.getMp3().getInnerpath()), audio.getMp3().getFile());
						sb.append(String.format("\t\t\t<audio path=\"%s\" loop=\"%s\" volume=\"%s\"/>\n", audioURL, audio.getLoop(), audio.getVolume()));
					}
					sb.append("\t\t\t</action>\n");
				}
				sb.append("\t\t</attire>\n");
			}
			sb.append("\t</attires>\n");

			sb.append("\t<layers>\n");
			for (SceneBackLayer layer : scene.getBackLayers())
			{
				if (layer.getImage().getFile() != null && layer.getImage().getFile().exists())
				{
					Region region = attireManager.getImgRegion(layer.getImage(), getChecksumTable().getChecksumID(layer.getImage().getInnerpath()), 0);
					if (region != null)
					{
						sb.append("\t\t<layer x=\"" + layer.getX() + "\" y=\"" + layer.getY() + "\" speed=\"" + layer.getSpeed() + "\" texture=\"" + region.getTexturePath() + "\" textureName=\"" + region.getOwnerChecksum() + "_0\" />\n");
					}
					else
					{
						//throw new Error("����ͼ��ͼ������δ������ "+scene.getInnerPath());
						System.err.println("����ͼ��ͼ������δ������ "+scene.getInnerPath()+"     layerName="+layer.getName()+"  img="+layer.getImage().getInnerpath());
					}
				}
			}
			sb.append("\t</layers>\n");

			sb.append("\t<foreLayers>\n");
			for (SceneForeLayer layer : scene.getForeLayers())
			{
				if (layer.getImage().getFile() != null && layer.getImage().getFile().exists())
				{
					Region region = attireManager.getImgRegion(layer.getImage(), getChecksumTable().getChecksumID(layer.getImage().getInnerpath()), 0);
					if (region != null)
					{
						sb.append("\t\t<layer x=\"" + layer.getX() + "\" y=\"" + layer.getY() + "\" width=\"" + layer.getW() + "\" speed=\"" + layer.getSpeed() + "\" texture=\"" + region.getTexturePath() + "\" textureName=\"" + region.getOwnerChecksum() + "_0\" />\n");
					}
					else
					{
						//throw new Error("�Զ�ͼ��ͼ������δ������ "+scene.getInnerPath());
						System.err.println("�Զ�ͼ��ͼ������δ������ "+scene.getInnerPath()+"     layerName="+layer.getName()+"  img="+layer.getImage().getInnerpath());
					}
				}
			}
			sb.append("\t</foreLayers>\n");

			sb.append("\t<backAnims>\n");
			for (SceneAnim anim : scene.getBackAnims())
			{
				sb.append("\t\t<anim x=\"" + anim.getX() + "\" y=\"" + anim.getY() + "\" offsetX=\"" + anim.getOffsetX() + "\" offsetY=\"" + anim.getOffsetY() + "\" attire=\"" + (anim.getAttire() != null ? anim.getAttire().getRefKey() : "") + "\"/>\n");
			}
			sb.append("\t</backAnims>\n");

			sb.append("\t<anims>\n");
			for (SceneAnim anim : scene.getAnims())
			{
				sb.append("\t\t<anim x=\"" + anim.getX() + "\" y=\"" + anim.getY() + "\" offsetX=\"" + anim.getOffsetX() + "\" offsetY=\"" + anim.getOffsetY() + "\" attire=\"" + (anim.getAttire() != null ? anim.getAttire().getRefKey() : "") + "\"/>\n");
			}
			sb.append("\t</anims>\n");

			sb.append("\t<npcs>\n");
			for (SceneNpc npc : scene.getNpcs())
			{
				sb.append("\t\t<npc id=\"" + npc.getID() + "\" x=\"" + npc.getX() + "\" y=\"" + npc.getY() + "\" attire=\"" + (npc.getAttire() != null ? npc.getAttire().getRefKey() : "") + "\"/>\n");
			}
			sb.append("\t</npcs>\n");

			sb.append("\t<doors>\n");
			for (SceneDoor door : scene.getDoors())
			{
				sb.append("\t\t<door id=\"\" x=\"" + door.getX() + "\" y=\"" + door.getY() + "\" offsetX=\"0\" offsetY=\"0\" attire=\"" + (door.getAttire() != null ? door.getAttire().getRefKey() : "") + "\"/>\n");
			}
			sb.append("\t</doors>\n");

			sb.append("\t<hots>\n");
			for (SceneHot hot : scene.getHots())
			{
				String filePath = "";

				ImgFile desc = hot.getImgFile();
				if (desc != null)
				{
					filePath = exportFile(getChecksumTable().getChecksumID(desc.getInnerpath()), desc.getFile());
				}

				sb.append(String.format("\t\t<hot x=\"%s\" y=\"%s\" width=\"%s\" height=\"%s\" door=\"%s\" desc=\"%s\">\n", hot.getX(), hot.getY(), hot.getWidth(), hot.getHeight(), hot.getDoorIndex(), filePath));
				for (SceneHotLink line : hot.getLinks())
				{
					sb.append(String.format("\t\t\t<link toID=\"%s\" toName=\"%s\" toX=\"%s\" toY=\"%s\" />\n", line.getToID(), line.getToName(), line.getToX(), line.getToY()));
				}
				sb.append("\t\t</hot>\n");
			}
			sb.append("\t</hots>\n");

			int trapID = 1;
			sb.append("\t<traps>\n");
			for (SceneTrap trap : scene.getTraps())
			{
				sb.append(String.format("\t\t<trap id=\"%s\" type=\"%s\" x=\"%s\" y=\"%s\" width=\"%s\" height=\"%s\" quest=\"%s\"><![CDATA[%s]]></trap>\n", trapID, trap.getType(), trap.getX(), trap.getY(), trap.getWidth(), trap.getHeight(), trap.getQuest(), trap.getContent()));
				trapID++;
			}
			sb.append("\t</traps>\n");

			sb.append("\t<monsters>\n");
			HashSet<Integer> monsterIDs = new HashSet<Integer>();
			for (ScenePart part : scene.getParts())
			{
				for (SceneMonsterTimer timer : part.getTimers())
				{
					for (SceneMonsterBatch batch : timer.getBatchList())
					{
						for (SceneMonster monster : batch.getMonsters())
						{
							if (!monsterIDs.contains(monster.getMonsterID()))
							{
								sb.append("\t\t<monster id=\"" + monster.getMonsterID() + "\" x=\"" + monster.getX() + "\" y=\"" + monster.getY() + "\" dir=\"" + monster.getDir() + "\" attire=\"" + (monster.getAttire() != null ? monster.getAttire().getFileID() + "." + monster.getAttire().getKey() : "") + "\" />\n");
								monsterIDs.add(monster.getMonsterID());
							}
						}
					}
				}
			}
			sb.append("\t</monsters>\n");

			sb.append("</scene>");

			// ��������
			byte[] sceneBytes = sb.toString().getBytes("UTF-8");
			if (zip)
			{
				sceneBytes = ZlibUtil.compress(sceneBytes);
			}
			String sceneBytesKey = (zip ? "z" : "") + MD5Util.md5Bytes(sceneBytes);
			exportFile(sceneBytesKey, sceneBytes, "xml");
			sceneFileKeys.put(scene, sceneBytesKey);

			if (GamePacker.isCancel())
			{
				return;
			}
		}
		GamePacker.endLogSet();
	}

	/**
	 * ͬ������
	 * 
	 * @throws Exception
	 */
	private void syncWorld() throws Exception
	{
		if (link == null)
		{
			return;
		}

		Hashtable<Scene, Integer> scene_size = new Hashtable<Scene, Integer>();
		Hashtable<Scene, String> scene_path = new Hashtable<Scene, String>();

		GamePacker.beginLogSet("�����������");
		GamePacker.log("������������");
		StringBuilder sb = new StringBuilder();
		sb.append("<worldDB>\n");
		sb.append("\t<citys>\n");
		for (WorldCity city : link.getCitys())
		{
			sb.append(String.format("\t\t<city id=\"%s\" name=\"%s\">\n", city.getID(), city.getName()));
			for (WorldScene worldScene : city.getScenes())
			{
				Scene scene=worldScene.getData();
				
				int sceneSize = 0;
				StringBuilder files = new StringBuilder();

				HashSet<String> outterPaths = new HashSet<String>();

				sceneSize += getExportedFileSize(sceneFileKeys.get(scene));
				files.append(getExportedFileUrl(sceneFileKeys.get(scene)));
				
				HashSet<Texture> textureHash = new HashSet<Texture>();
				HashSet<Attire> attires = new HashSet<Attire>();
				for(SceneAnim anim : scene.getAnims())
				{
					if(anim.getAttire()!=null)
					{
						attires.add(anim.getAttire());
					}
				}
				for(SceneAnim anim :scene.getBackAnims())
				{
					if(anim.getAttire()!=null)
					{
						attires.add(anim.getAttire());
					}
				}
				for (SceneNpc npc : scene.getNpcs())
				{
					if (npc.getAttire() != null)
					{
						attires.add(npc.getAttire());
					}
				}
				for (ScenePart part : scene.getParts())
				{
					for (SceneMonsterTimer timer : part.getTimers())
					{
						for (SceneMonsterBatch batch : timer.getBatchList())
						{
							for (SceneMonster monster : batch.getMonsters())
							{
								if (monster.getAttire() != null)
								{
									attires.add(monster.getAttire());
								}
							}
						}
					}
				}
				for (Attire attire : attires)
				{
					for (AttireAction action : attire.getActions())
					{
						Texture[] textures = attireManager.getActionTextures(action);
						for (Texture texture : textures)
						{
							textureHash.add(texture);
						}
					}
				}
				for(SceneBackLayer layer : scene.getBackLayers())
				{
					if (layer.getImage().getFile() != null && layer.getImage().getFile().exists())
					{
						ImgFile img=layer.getImage();
						Texture[] textures=attireManager.getImgTextures(img);
						for (Texture texture : textures)
						{
							textureHash.add(texture);
						}
					}
				}
				for(SceneForeLayer layer:scene.getForeLayers())
				{
					if (layer.getImage().getFile() != null && layer.getImage().getFile().exists())
					{
						ImgFile img=layer.getImage();
						Texture[] textures=attireManager.getImgTextures(img);
						for (Texture texture : textures)
						{
							textureHash.add(texture);
						}
					}
				}

				ArrayList<String> fileURLs = new ArrayList<String>();
				for (Texture texture : textureHash)
				{
					String url = texture.getAtfFilePath();
					String atfPath = getDestDir().getParentFile().getPath() + url.replace(".atf", ".atf");
					String xmlPath = getDestDir().getParentFile().getPath() + url.replace(".atf", ".xml");

					if (!outterPaths.contains(atfPath))
					{
						outterPaths.add(atfPath);

						File atfFile = new File(atfPath);

						sceneSize += atfFile.length();
						fileURLs.add(url.replace(".atf", ".atf"));
					}
					if (!outterPaths.contains(xmlPath))
					{
						outterPaths.add(xmlPath);

						File xmlFile = new File(xmlPath);

						sceneSize += xmlFile.length();
						fileURLs.add(url.replace(".atf", ".xml"));
					}
				}

				String[] fileURL_Array = fileURLs.toArray(new String[fileURLs.size()]);
				Arrays.sort(fileURL_Array);
				for (String url : fileURL_Array)
				{
					files.append("," + url);
				}

				scene.restHotArea(this);

				scene_size.put(scene, sceneSize);
				scene_path.put(scene, files.toString());

				sb.append(String.format("\t\t\t<scene id=\"%s\" name=\"%s\" type=\"%s\" group=\"%s\" level=\"%s\" achieve=\"%s\" finishQuest=\"%s\" acceptQuest=\"%s\" files=\"%s\" size=\"%s\"/>\n", worldScene.getSceneID(), worldScene.getSceneName(), worldScene.getSceneType(), worldScene.getSceneGroup(), 0, "-", "-", "-", files.toString(), sceneSize));
			}
			sb.append("\t\t</city>\n");
		}
		sb.append("\t</citys>\n");
		sb.append("\t<links>\n");
		for (SceneLink line : link.getLinks())
		{
			if (line.getFrom() != null && line.getDest() != null)
			{
				sb.append(String.format("\t\t<link fromScene=\"%s\" fromX=\"%s\" fromY=\"%s\" toScene=\"%s\" />\n", line.getFrom().getScene().getSceneID(), line.getFrom().getX() + line.getFrom().getWidth() / 2, line.getFrom().getY() + line.getFrom().getHeight() / 2, line.getDest().getScene().getSceneID()));
			}
		}
		sb.append("\t</links>\n");
		sb.append("\t<map width=\"1024\" height=\"768\" />\n");
		sb.append("</worldDB>");
		GamePacker.log("������������");
		byte[] worldBytes = sb.toString().getBytes("UTF-8");
		if (zip)
		{
			worldBytes = ZlibUtil.compress(worldBytes);
		}
		String worldBytesKey = (zip ? "z" : "") + MD5Util.md5Bytes(worldBytes);
		exportFile(worldBytesKey, worldBytes, "cfg");
		GamePacker.endLogSet();

		if (GamePacker.isCancel())
		{
			return;
		}

		GamePacker.beginLogSet("���������Ϣ");
		GamePacker.log("���ɻ�����Ϣ");
		StringBuilder txt = new StringBuilder();
		txt.append("<project>\n");
		txt.append("\t<configs>\n");
		txt.append(String.format("\t\t<config name=\"%s\" path=\"%s\" size=\"%s\"/>\n", "attire", getExportedFileUrl(attireFileKey), getExportedFileSize(attireFileKey)));
		txt.append(String.format("\t\t<config name=\"%s\" path=\"%s\" size=\"%s\"/>\n", "world", getExportedFileUrl(worldBytesKey), getExportedFileSize(worldBytesKey)));
		txt.append("\t</configs>\n");

		txt.append("\t<attires>\n");
		StringBuilder roles = new StringBuilder();
		StringBuilder equips = new StringBuilder();
		StringBuilder effects = new StringBuilder();
		StringBuilder labels = new StringBuilder();
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

				Integer[] params = attire.getParams();
				if (params.length == 0)
				{
					continue;
				}

				if (params[0] == 1)
				{
					// װ��
					roles.append(String.format("\t\t<role faction=\"%s\" sectLv=\"%s\" name=\"%s\">\n", params[1], params[2], attire.getRefKey()));
					for (AttireAction action : attire.getActions())
					{
						roles.append(String.format("\t\t\t<action id=\"%s\" size=\"%s\" files=\"%s\"/>\n", action.getID(), attireManager.getActionSize(action), attireManager.getActionPaths(action)));
					}
					roles.append(String.format("\t\t</role>\n"));
				}
				else if (params[0] == 2)
				{
					// װ��
					equips.append(String.format("\t\t<equip fromID=\"%s\" toID=\"%s\" faction=\"%s\" name=\"%s\">\n", params[1], params[2], params[3], attire.getRefKey()));
					for (AttireAction action : attire.getActions())
					{
						equips.append(String.format("\t\t\t<action id=\"%s\" size=\"%s\" files=\"%s\"/>\n", action.getID(), attireManager.getActionSize(action), attireManager.getActionPaths(action)));
					}
					equips.append(String.format("\t\t</equip>\n"));
				}
				else if (params[0] == 3)
				{
					// Ч��
					effects.append(String.format("\t\t<effect effectID=\"%s\">\n", attire.getRefKey()));
					for (AttireAction action : attire.getActions())
					{
						effects.append(String.format("\t\t\t<action id=\"0\" size=\"%s\" files=\"%s\"/>\n", attireManager.getActionSize(action), attireManager.getActionPaths(action)));
					}
					effects.append(String.format("\t\t</effect>\n"));
				}
				else if (params[0] == 4)
				{
					// ����
				}
				else if (params[0] == 5)
				{
					// ��ǩ
					// TextureSet
					// textureSet=textureSetTable.getTextureSet(attire.getTextureSetKey());
					// labels.append(String.format("\t\t<label labelID=\"%s\" size=\"%s\" files=\"%s\"/>\n",attire.getRefKey(),getTextureSetSize(textureSet),getTextureSetURLs(textureSet)));
				}
				else if (params[0] == 6)
				{
					// ����
					roles.append(String.format("\t\t<roleEffect faction=\"%s\" name=\"%s\">\n", params[1], attire.getRefKey()));
					for (AttireAction action : attire.getActions())
					{
						roles.append(String.format("\t\t\t<action id=\"%s\" size=\"%s\" files=\"%s\"/>\n", action.getID(), attireManager.getActionSize(action), attireManager.getActionPaths(action)));
					}
					roles.append(String.format("\t\t</roleEffect>\n"));
				}
			}
		}
		txt.append(roles);
		txt.append(equips);
		txt.append(effects);
		txt.append(labels);
		txt.append("\t</attires>\n");

		txt.append("\t<scenes>\n");
		for (WorldCity city : link.getCitys())
		{
			for (WorldScene worldScene : city.getScenes())
			{
				Scene scene=worldScene.getData();
				txt.append(String.format("\t\t<scene id=\"%s\" type=\"%s\" size=\"%s\" files=\"%s\" />\n", worldScene.getSceneID(), worldScene.getSceneType(), scene_size.get(scene), scene_path.get(scene)));
			}
		}
		txt.append("\t</scenes>\n");
		txt.append("</project>");
		GamePacker.log("���������Ϣ");
		FileUtil.writeFile(new File(getDestDir().getPath() + "/db.xml"), txt.toString().getBytes("UTF-8"));
		GamePacker.endLogSet();

		// �����ļ��б�
		String[] fileUrls = getExportedFileUrls();
		String[] textureUrls = getTextureSetTable().getTextureFileURLs();

		String[] urlList = new String[fileUrls.length + textureUrls.length];
		for (int i = 0; i < fileUrls.length; i++)
		{
			urlList[i] = fileUrls[i];
		}
		for (int i = 0; i < textureUrls.length; i++)
		{
			urlList[i + fileUrls.length] = textureUrls[i];
		}
		Arrays.sort(urlList);

		GamePacker.beginLogSet("����ļ�����");
		GamePacker.log("�����ļ�����");
		StringBuilder filesSB = new StringBuilder();
		for (String url : urlList)
		{
			filesSB.append(url + "\n");
		}
		GamePacker.log("�����ļ�����");
		FileUtil.writeFile(new File(getDestDir().getPath() + "/db.ver"), filesSB.toString().getBytes("UTF-8"));
		GamePacker.endLogSet();
	}

}
