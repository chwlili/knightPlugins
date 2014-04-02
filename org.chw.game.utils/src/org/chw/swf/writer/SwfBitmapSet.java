package org.chw.swf.writer;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;

import org.chw.util.ZlibUtil;


public class SwfBitmapSet
{
	private File file;
	private float quality;
	private int row;
	private int col;
	private String packName;
	private String className;
	
	private int count;
	private boolean readed;
	
	private ArrayList<SwfBitmap> bitmaps=new ArrayList<SwfBitmap>();
	
	/**
	 * 构造函数
	 * @param file
	 * @param quality
	 * @param row
	 * @param col
	 * @param packName
	 * @param className
	 */
	public SwfBitmapSet(File file,float quality,int row,int col,String packName,String className)
	{
		this.file=file;
		this.quality = quality;		
		this.row=row;
		this.col=col;
		this.packName=packName;
		this.className=className;
		
		count=row*col;
	}
	
	/**
	 * 图像的个数
	 * @return
	 */
	public int getCount()
	{
		return count;
	}
	
	/**
	 * 获取图像
	 * @param index
	 * @return
	 */
	public SwfBitmap getBitmapAt(int index)
	{
		return bitmaps.get(index);
	}
	
	private int frameW;
	private int frameH;
	
	public int getFrameW()
	{
		return frameW;
	}
	
	public int getFrameH()
	{
		return frameH;
	}
	
	/**
	 * 读取
	 */
	public void read() throws IOException
	{
//		if (!readed)
//		{
//			boolean isPng=file.getAbsolutePath().toLowerCase().endsWith(".png");
//			
//			BufferedImage img = ImageIO.read(file);
//			
//			int imageW=img.getData().getBounds().width;
//			int imageH=img.getData().getBounds().height;
//			
//			frameW=imageW/col;
//			frameH=imageH/row;
//			
//			for(int i=0;i<count;i++)
//			{
//				int frameX=i%col*frameW;
//				int frameY=i/col*frameH;
//				
//				int[] pixels=new int[frameW*frameH];
//				pixels=img.getRGB(frameX, frameY, frameW, frameH, pixels, 0,frameW);
//				
//				int minX=frameW;
//				int minY=frameH;
//				int maxX=0;
//				int maxY=0;
//				int prevX=-1;
//				int prevY=-1;
//				
//				if(isPng && false)
//				{
//					for(int j=0;j<pixels.length;j++)
//					{
//						int x=j%frameW;
//						int y=j/frameW;
//						
//						byte a=(byte)((pixels[j]>>24) & 0xFF);
//						if(a!=0)
//						{
//							prevX=x;
//							prevY=y;
//							minX=Math.min(minX, x);
//							minY=Math.min(minY, y);
//						}
//						
//						if(a==0 && prevX!=-1 && prevY!=-1)
//						{
//							maxX=Math.max(maxX, prevX+1);
//							maxY=Math.max(maxY, prevY+1);
//							prevX=-1;
//							prevY=-1;
//						}
//					}
//					
//					if(minX>=maxX || minY>=maxY)
//					{
//						minX=0;
//						minY=0;
//						maxX=1;
//						maxY=1;
//					}
//				}
//				else
//				{
//					minX=0;
//					minY=0;
//					maxX=frameW;
//					maxY=frameH;
//				}
//				
//				int lastX=minX+frameX;
//				int lastY=minY+frameY;
//				int lastW=maxX-minX;
//				int lastH=maxY-minY;
//				int[] lastPixels=new int[lastW*lastH];
//				lastPixels=img.getRGB(lastX, lastY, lastW, lastH, lastPixels, 0,lastW);
//				
//				StringBuilder sbb=new StringBuilder();
//				sbb.append("[");
//				byte[] alphas=new byte[lastW*lastH];
//				for(int j=0;j<lastPixels.length;j++)
//				{
//					byte aAlpha=(byte)((lastPixels[j]>>24) & 0xFF);
//					alphas[j]=aAlpha;
//					if(aAlpha>0)
//					{
//						sbb.append(aAlpha+",");
//					}
//				}
//				sbb.append("]");
//				System.out.println(sbb.toString());
//				
//				alphas=ZlibUtil.compress(alphas);
//				
//				
//				int[] frameBytes=new int[lastW*lastH];
//				
//				frameBytes=img.getRGB(lastX, lastY, lastW, lastH, frameBytes, 0, lastW);
//				
//				BufferedImage imgB = new BufferedImage(lastW, lastH, BufferedImage.TYPE_INT_RGB);
//				Graphics2D graphics=(Graphics2D) imgB.getGraphics();
//				//graphics.clearRect(0, 0, lastW, lastH);
//				graphics.drawImage(img, 0, 0, lastW, lastH, lastX, lastY, lastX+lastW, lastY+lastH, null);
//				graphics.dispose();
//				//imgB.setRGB(0, 0, lastW, lastH, frameBytes, 0, lastW);
//				
//				
//				Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
//				ImageWriter writer = writers.next();
//				if (writer != null)
//				{
//					ImageWriteParam param = writer.getDefaultWriteParam();
//					param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
//					param.setCompressionQuality(quality);
//					
//					//ColorModel color = ColorModel.getRGBdefault();
//					//param.setDestinationType(new ImageTypeSpecifier(color, color.createCompatibleSampleModel(1, 1)));
//
//					ColorModel color = new DirectColorModel(32, 0xff0000, 0x00ff00, 0x0000ff);
//					param.setDestinationType(new ImageTypeSpecifier(color, color.createCompatibleSampleModel(1, 1)));
//					
//					ByteArrayOutputStream byteOutput=new ByteArrayOutputStream();
//					
//					writer.setOutput(new MemoryCacheImageOutputStream(byteOutput));
//					writer.write(null, new IIOImage(imgB, null, null), param);
//					
//					bitmaps.add(new SwfBitmap(byteOutput.toByteArray(), alphas, lastW, lastH, minX, minY,frameW,frameH, packName, className+bitmaps.size()));
//				}
//				
//			}
//			
//			readed = true;
//		}
	}
	
	
}
