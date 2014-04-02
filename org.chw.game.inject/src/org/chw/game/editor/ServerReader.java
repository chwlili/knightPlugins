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

public class ServerReader
{
	private IFile file;

	public ArrayList<ServerNode> serverList = new ArrayList<ServerNode>();

	private String source = "";

	/**
	 * 是否已经改变
	 * 
	 * @return
	 */
	public boolean isChanged()
	{
		return !getContentString().equals(source);
	}

	/**
	 * 获取文件内容
	 * 
	 * @return
	 */
	private String getContentString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("<config>\r\n");
		for (ServerNode node : serverList)
		{
			sb.append(String.format("\t<%s name=\"%s\" host=\"%s\" port=\"%s\" world=\"%s\"/>\r\n", node.select ? "server" : "serverBack", node.name, node.path, node.port, node.world));
		}
		sb.append("</config>");

		return sb.toString();
	}

	public void save() throws UnsupportedEncodingException, CoreException
	{
		String content = getContentString();
		byte[] bytes = content.getBytes(file.getCharset());
		ByteArrayInputStream input = new ByteArrayInputStream(bytes);
		
		file.refreshLocal(0, null);
		if(file.exists())
		{
			file.setContents(input, 0, null);
		}
		else
		{
			file.create(input, false, null);
		}

		source = content;
	}

	/**
	 * 打开文件
	 * 
	 * @param stream
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * @throws CoreException
	 */
	public void open(IFile file) throws ParserConfigurationException, SAXException, IOException, CoreException
	{
		this.file = file;

		if (file.getLocation().toFile().exists() && file.getLocation().toFile().length() > 0)
		{
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			parser.parse(file.getContents(), new DefaultHandler()
			{
				private boolean configing = false;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
				{
					if (configing)
					{
						if (qName.equals("server") || qName.equals("serverBack"))
						{
							String serverName = "";
							String serverHost = "";
							String serverPort = "";
							String serverWorld = "";

							String nameValue = attributes.getValue("name");
							if (nameValue != null && nameValue.isEmpty() == false)
							{
								serverName = nameValue;
							}

							String hostValue = attributes.getValue("host");
							if (hostValue != null && hostValue.isEmpty() == false)
							{
								serverHost = hostValue;
							}

							String portValue = attributes.getValue("port");
							if (portValue != null && portValue.isEmpty() == false)
							{
								serverPort = portValue;
							}

							String worldValue = attributes.getValue("world");
							if (worldValue != null && worldValue.isEmpty() == false)
							{
								serverWorld = worldValue;
							}

							serverList.add(new ServerNode(qName.equals("server"), serverName, serverHost, serverPort, serverWorld));
						}
					}
					else
					{
						if (qName.equals("config"))
						{
							configing = true;
						}
					}
				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException
				{
					if (qName.equals("config"))
					{
						configing = false;
					}
				}
			});
		}

		source = getContentString();
	}
}
