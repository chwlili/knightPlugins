import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.variableresolvers.PathVariableResolver;


public class KnightProtoLocation extends PathVariableResolver
{
	public static String NAME = "KNIGHT_PROTO_LOC"; //$NON-NLS-1$

	public KnightProtoLocation()
	{
	}

	@Override
	public String[] getVariableNames(String variable, IResource resource)
	{
		return new String[]{NAME};
	}
	
	@Override
	public String getValue(String variable, IResource resource)
	{
		if (resource.getProject().getLocation() != null)
		{
			File file=resource.getProject().getLocation().toFile();
			return file.getParentFile().getAbsolutePath();
		}
		return null;
	}

}
