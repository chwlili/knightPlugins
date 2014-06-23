/*
 * generated by Xtext
 */
package org.chw.game.ui;

import org.chw.game.ui.folder.CfgFolder;
import org.chw.game.ui.highlight.CfgHighlight;
import org.chw.game.ui.highlight.CfgHighlightCalculator;
import org.chw.game.ui.hyperlink.CfgHyperLinkHelper;
import org.chw.game.ui.hyperlink.CfgLoationInFileProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CfgUiModule extends org.chw.game.ui.AbstractCfgUiModule
{
	public CfgUiModule(AbstractUIPlugin plugin)
	{
		super(plugin);
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration()
	{
		return CfgHighlight.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator()
	{
		return CfgHighlightCalculator.class;
	}

	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper> bindIHyperlinkHelper()
	{
		return CfgHyperLinkHelper.class;
	}

	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider()
	{
		return CfgLoationInFileProvider.class;
	}
	
	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider()
	{
		return CfgFolder.class;
	}
}