package org.chw.game.ide.ui;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class OutputConfig extends OutputConfigurationProvider
{
	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	public Set<OutputConfiguration> getOutputConfigurations()
	{
		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("src");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		return newHashSet(defaultOutput);
	}
}
