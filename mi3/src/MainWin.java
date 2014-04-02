import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class MainWin extends ApplicationWindow
{
	private Browser browser;
	private Text text;

	/**
	 * Create the application window.
	 */
	public MainWin()
	{
		super(null);
		addToolBar(SWT.FLAT | SWT.WRAP);
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		try
		{
			MainWin window = new MainWin();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * 
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText("小米! 小米!");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(1024, 600);
	}

	/**
	 * Create contents of the application window.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		SashForm sashForm = new SashForm(container, SWT.NONE);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		browser = new Browser(sashForm, SWT.NONE);
		browser.setUrl("https://account.xiaomi.com/pass/serviceLogin");

		text = new Text(sashForm, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL | SWT.MULTI);
		
		sashForm.setWeights(new int[] {7, 3});
		
		browser.addProgressListener(new ProgressListener()
		{
			@Override
			public void completed(ProgressEvent event)
			{
				executeCmds();
			}

			@Override
			public void changed(ProgressEvent event)
			{
			}
		});

		return container;
	}
	
	/**
	 * 附加Log
	 * @param log
	 */
	private void appendLog(String log)
	{
		text.append(log+"\n");
	}
	
	/**
	 * 获取JQuery内容
	 * @return
	 */
	private String getJQueryText()
	{
		InputStream input = MainWin.class.getResourceAsStream("jquery.txt");

		try
		{
			StringBuilder stream = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			while (true)
			{
				String line = reader.readLine();
				if (line != null)
				{
					stream.append(line + "\n");
				}
				else
				{
					break;
				}
			}

			return stream.toString().trim();
		}
		catch (IOException e)
		{
		}
		return "";
	}
	
	private boolean looping=false;
	
	/**
	 * 执行命令
	 */
	private void executeCmds()
	{
		appendLog(">>"+browser.getUrl());
		
		String url = browser.getUrl();
		if(looping)
		{
			appendLog("  [换页面了!]");
			return;
		}
		
		if (url.startsWith("https://account.xiaomi.com/pass/serviceLogin"))
		{
			appendLog("  [登录页面]");

			appendLog(">初始化JQuery");
			if(!browser.execute(getJQueryText()))
			{
				appendLog(">初始化JQuery失败!");
				return;
			}

			appendLog(">插入登录信息");
			if(!browser.execute("$('#user').attr('value','chw-chengwei@foxmail.com');$('#pwd').attr('value','yiyoaf533');"))
			{
				appendLog(">插入登录信息失败!");
				return;
			}

			appendLog(">请求登录");
			if(!browser.execute("$(':submit').click()"))
			{
				appendLog(">请求登录失败!");
				return;
			}
		}
		else if (url.startsWith("https://account.xiaomi.com/pass/userInfo"))
		{
			appendLog("  [个人信息页面]");

			appendLog(">初始化JQuery");
			if(!browser.execute(getJQueryText()))
			{
				appendLog(">初始化JQuery失败!");
				return;
			}
			
			appendLog(">禁止弹出窗口");
			if(!browser.execute("$('a').attr('target','_top');"))
			{
				appendLog(">禁止弹出窗口失败!");
				return;
			}
			
			appendLog(">进入抢购页面");
			if(!browser.setUrl("http://p.www.xiaomi.com/open"))
			{
				appendLog(">进入抢购页面失败!");
				return;
			}
			/*
			appendLog(">查找首页链接");
			if(!browser.execute("$(\"a:contains('小米手机')\")[0].click()"))
			{
				appendLog(">查找首页链接失败!");
				return;
			}*/
		}
		else if(url.startsWith("http://p.www.xiaomi.com/open"))
		{
			appendLog("  [抢购页面]");

			appendLog(">初始化JQuery");
			if(!browser.execute(getJQueryText()))
			{
				appendLog(">初始化JQuery失败!");
				return;
			}
			
			appendLog(">禁止弹出窗口");
			if(!browser.execute("$('a').attr('target','_top');"))
			{
				appendLog(">禁止弹出窗口失败!");
				return;
			}

			appendLog(">开启自动点击");
			StringBuilder sb=new StringBuilder();
			sb.append("setInterval(function(){");
			sb.append("  var item=$(\"#hdBtns a:contains('预约手机')\");");
			sb.append("  if(item.length>0){");
			sb.append("    item[0].click();");
			//sb.append("    $(\"#hdMsg\").text('等待中...'+(new Date()).getSeconds());");
			sb.append("  }else{");
			sb.append("    $(\"#hdMsg\").text('等待中');");
			sb.append("  }");
			sb.append("},100);");
			
			if(!browser.execute(sb.toString()))
			{
				appendLog(">开启自动点击失败!");
				return;
			}
			
			//$(\"#hdBtns a:contains('购买手机')\")
			
			looping=true;
		}
		else if (url.startsWith("http://www.xiaomi.com"))
		{
			appendLog("  [首页]");
			appendLog(">初始化JQuery");
			if(!browser.execute(getJQueryText()))
			{
				appendLog(">初始化JQuery失败!");
				return;
			}
			
			appendLog(">禁止弹出窗口");
			if(!browser.execute("$('a').attr('target','_top');"))
			{
				appendLog(">禁止弹出窗口失败!");
				return;
			}

			appendLog("查找购买地址");
			if(browser.execute("$('#kaifanggm')[0].click()"))
			{
				appendLog(">查找购买地址!");
				return;
			}
		}
	}
}
