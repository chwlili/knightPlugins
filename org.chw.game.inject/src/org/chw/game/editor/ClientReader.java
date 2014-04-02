package org.chw.game.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ClientReader
{
	private IFile file;
	
	public String version = "";
	public boolean debugMode = false;
	public String debugAuthURL = "";
	public String testName = "";

	public ArrayList<VerNode> verList = new ArrayList<VerNode>();
	public ArrayList<LogNode> logList = new ArrayList<LogNode>();
	public ArrayList<NameNode> nameList = new ArrayList<NameNode>();

	private String source = "";
	
	/**
	 * 是否已经改变
	 * @return
	 */
	public boolean isChanged()
	{
		return !getContentString().equals(source);
	}
	
	/**
	 * 获取文件内容
	 * @return
	 */
	private String getContentString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("<config>\r\n");
		sb.append(String.format("\t<client ver=\"%s\" stand=\"%s\" authURL=\"%s\">\r\n", version, debugMode, debugAuthURL));
		for (VerNode node : verList)
		{
			sb.append(String.format("\t\t<%s name=\"%s\" path=\"%s\" policy=\"%s\"/>\r\n", node.select ? "url" : "urlBack", node.name, node.path, node.policy));
		}
		for (LogNode node : logList)
		{
			sb.append(String.format("\t\t<%s name=\"%s\" path=\"%s\" />\r\n", node.select ? "log" : "logBack", node.name, node.path));
		}
		sb.append(String.format("\t\t<tester name=\"%s\"/>\r\n", testName));
		for (NameNode node : nameList)
		{
			sb.append(String.format("\t\t<%s name=\"%s\"/>\r\n", node.select ? "developer" : "developerBack", node.name));
		}
		sb.append("\t</client>\r\n");
		sb.append("</config>");

		return sb.toString();
	}
	
	public void save() throws UnsupportedEncodingException, CoreException
	{
		String content=getContentString();
		byte[] bytes=content.getBytes(file.getCharset());
		ByteArrayInputStream input=new ByteArrayInputStream(bytes);
		
		file.refreshLocal(0, null);
		if(file.exists())
		{
			file.setContents(input, 0, null);
		}
		else
		{
			file.create(input, false, null);
		}
		
		source=content;
	}
	
	/**
	 * 打开文件
	 * @param stream
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * @throws CoreException 
	 */
	public void open(IFile file) throws ParserConfigurationException, SAXException, IOException, CoreException
	{
		this.file=file;
		
		if(file.getLocation().toFile().exists() && file.getLocation().toFile().length()>0)
		{
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
	
			parser.parse(file.getContents(), new DefaultHandler()
			{
				private boolean clienting = false;
	
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
				{
					if (clienting)
					{
						if (qName.equals("url") || qName.equals("urlBack"))
						{
							String versionName = "";
							String versionURL = "";
							String versionPolicy = "";
	
							String nameValue = attributes.getValue("name");
							if (nameValue != null && nameValue.isEmpty() == false)
							{
								versionName = nameValue;
							}
	
							String urlValue = attributes.getValue("path");
							if (urlValue != null && urlValue.isEmpty() == false)
							{
								versionURL = urlValue;
							}
	
							String policyValue = attributes.getValue("policy");
							if (policyValue != null && policyValue.isEmpty() == false)
							{
								versionPolicy = policyValue;
							}
	
							verList.add(new VerNode(qName.equals("url"), versionName, versionURL, versionPolicy));
						}
						else if (qName.equals("log") || qName.equals("logBack"))
						{
							String logName = "";
							String logPath = "";
	
							String nameValue = attributes.getValue("name");
							if (nameValue != null && nameValue.isEmpty() == false)
							{
								logName = nameValue;
							}
	
							String pathValue = attributes.getValue("path");
							if (pathValue != null && pathValue.isEmpty() == false)
							{
								logPath = pathValue;
							}
	
							logList.add(new LogNode(qName.equals("log"), logName, logPath));
						}
						else if (qName.equals("developer") || qName.equals("developerBack"))
						{
							String userName = "";
	
							String nameValue = attributes.getValue("name");
							if (nameValue != null && nameValue.isEmpty() == false)
							{
								userName = nameValue;
							}
	
							nameList.add(new NameNode(qName.equals("developer"), userName));
						}
						else if (qName.equals("tester"))
						{
							testName = attributes.getValue("name");
						}
					}
					else
					{
						if (qName.equals("client"))
						{
							clienting = true;
	
							version = "final";
							debugMode = true;
							debugAuthURL = "";
	
							String verValue = attributes.getValue("ver");
							if (verValue != null && verValue.isEmpty() == false)
							{
								version = verValue;
							}
	
							String debugValue = attributes.getValue("stand");
							if (debugValue != null && debugValue.isEmpty() == false)
							{
								debugMode = debugValue.equals("false") ? false : true;
							}
	
							String authValue = attributes.getValue("authURL");
							if (authValue != null && authValue.isEmpty() == false)
							{
								debugAuthURL = authValue;
							}
						}
					}
				}
	
				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException
				{
					if (qName.equals("client"))
					{
						clienting = false;
					}
				}
			});
		}

		source = getContentString();
	}
}
