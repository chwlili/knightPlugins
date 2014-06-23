package org.chw.game.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CfgHighlight implements IHighlightingConfiguration
{
	public static final String DEFAULT_ID = "default"; //$NON-NLS-1$
	public static final String KEYWORD_ID = "keyword"; //$NON-NLS-1$
	public static final String STRING_ID = "string"; //$NON-NLS-1$
	public static final String COMMENT_ID = "comment"; //$NON-NLS-1$

	public static final String Type_Name = "type_name"; //$NON-NLS-1$

	public static final String Field_Type = "field_type"; //$NON-NLS-1$
	public static final String Field_Name = "field_name"; //$NON-NLS-1$
	public static final String Field_Path = "field_index"; //$NON-NLS-1$
	public static final String Field_Param = "field_param";// $NON_NLS-1$
	
	public void configure(IHighlightingConfigurationAcceptor acceptor)
	{
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Ĭ��", createTextStyle(0, 0, 0));
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "�ؼ���", createTextStyle(128, 0, 0));
		acceptor.acceptDefaultHighlighting(STRING_ID, "�ַ���", createTextStyle(0, 0, 255));
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "ע��", createTextStyle(110, 110, 110));

		acceptor.acceptDefaultHighlighting(Type_Name, "��������", createTextStyle(0, 0, 0, true));

		acceptor.acceptDefaultHighlighting(Field_Type, "�ֶ�����", createTextStyle(52, 87, 101));
		acceptor.acceptDefaultHighlighting(Field_Name, "�ֶ�����", createTextStyle(0, 0, 0));
		acceptor.acceptDefaultHighlighting(Field_Path, "�ֶ�·��", createTextStyle(0, 0, 255));
		acceptor.acceptDefaultHighlighting(Field_Param, "�ֶβ���", createTextStyle(52, 87, 101));
	}

	private TextStyle createTextStyle(int r, int g, int b)
	{
		return createTextStyle(r, g, b, false, false, false);
	}

	private TextStyle createTextStyle(int r, int g, int b, boolean bold)
	{
		return createTextStyle(r, g, b, bold, false, false);
	}

	private TextStyle createTextStyle(int r, int g, int b, boolean bold, boolean italic, boolean underline)
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(r, g, b));
		if (bold)
		{
			textStyle.setStyle(SWT.BOLD);
		}
		if (italic)
		{
			textStyle.setStyle(SWT.ITALIC);
		}
		if (underline)
		{
			textStyle.setStyle(SWT.UNDERLINE_SINGLE);
		}
		return textStyle;
	}
}
