package org.chw.game.ide.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ProtoHighlight implements IHighlightingConfiguration
{
	// public static final String DEFAULT_ID = "default";
	// public static final String KEYWORD_ID = "keyword";
	public static final String PUNCTUATION_ID = "punctuation"; //$NON-NLS-1$
	// public static final String COMMENT_ID = "comment";
	// public static final String STRING_ID = "string";
	public static final String NUMBER_ID = "number"; //$NON-NLS-1$
	public static final String INVALID_TOKEN_ID = "error"; //$NON-NLS-1$

	public static final String DEFAULT_ID = "default"; //$NON-NLS-1$
	public static final String KEYWORD_ID = "keyword"; //$NON-NLS-1$
	public static final String STRING_ID = "string"; //$NON-NLS-1$
	public static final String COMMENT_ID = "comment"; //$NON-NLS-1$

	public static final String Message_Name = "message_name"; //$NON-NLS-1$
	public static final String Message_Field_Attribute = "message_field_attribute"; //$NON-NLS-1$
	public static final String Message_Field_Type = "message_field_type"; //$NON-NLS-1$
	public static final String Message_Field_Type_Ext = "message_field_type_ref"; //$NON-NLS-1$
	public static final String Message_Field_Name = "message_field_name"; //$NON-NLS-1$
	public static final String Message_Field_Index = "message_field_index"; //$NON-NLS-1$

	public static final String Enum_Name = "enum_name"; //$NON-NLS-1$
	public static final String Enum_Field_Name = "enum_field_name"; //$NON-NLS-1$
	public static final String Enum_field_Index = "enum_field_index"; //$NON-NLS-1$

	public void configure(IHighlightingConfigurationAcceptor acceptor)
	{
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, Messages.ProtoHighlight_16, createTextStyle(0, 0, 0));
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, Messages.ProtoHighlight_17, createTextStyle(128, 0, 0));
		acceptor.acceptDefaultHighlighting(STRING_ID, Messages.ProtoHighlight_18, createTextStyle(0, 0, 255));
		acceptor.acceptDefaultHighlighting(COMMENT_ID, Messages.ProtoHighlight_19, createTextStyle(110, 110, 110));

		acceptor.acceptDefaultHighlighting(Message_Name, Messages.ProtoHighlight_20, createTextStyle(0, 0, 0, true));
		acceptor.acceptDefaultHighlighting(Message_Field_Attribute, Messages.ProtoHighlight_21, createTextStyle(19, 24, 125));
		acceptor.acceptDefaultHighlighting(Message_Field_Type, Messages.ProtoHighlight_22, createTextStyle(52, 87, 101));
		acceptor.acceptDefaultHighlighting(Message_Field_Type_Ext, Messages.ProtoHighlight_23, createTextStyle(52, 87, 101, true));
		acceptor.acceptDefaultHighlighting(Message_Field_Name, Messages.ProtoHighlight_24, createTextStyle(0, 0, 0));
		acceptor.acceptDefaultHighlighting(Message_Field_Index, Messages.ProtoHighlight_25, createTextStyle(0, 0, 0));

		acceptor.acceptDefaultHighlighting(Enum_Name, Messages.ProtoHighlight_26, createTextStyle(0, 0, 0, true));
		acceptor.acceptDefaultHighlighting(Enum_Field_Name, Messages.ProtoHighlight_27, createTextStyle(0, 0, 0));
		acceptor.acceptDefaultHighlighting(Enum_field_Index, Messages.ProtoHighlight_28, createTextStyle(0, 0, 0));
	}

	private TextStyle createTextStyle(int r, int g, int b)
	{
		return createTextStyle(r, g, b, false, false, false);
	}

	private TextStyle createTextStyle(int r, int g, int b, boolean bold)
	{
		return createTextStyle(r, g, b, bold, false, false);
	}

	// private TextStyle createTextStyle(int r,int g,int b,boolean bold,boolean
	// italic)
	// {
	// return createTextStyle(r, g, b, bold, italic, false);
	// }

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
