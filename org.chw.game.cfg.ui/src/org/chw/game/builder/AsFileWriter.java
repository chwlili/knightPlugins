package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

public class AsFileWriter
{
	private Instance root;

	public AsFileWriter(Instance instance)
	{
		this.root = instance;
	}

	public void go()
	{
		HashSet<TypeDef> typeHash = new HashSet<TypeDef>();

		ArrayList<Instance> typeList = new ArrayList<Instance>();

		typeList.add(root);
		typeHash.add(root.getType());

		while (typeList.size() > 0)
		{
			Instance instance = typeList.remove(0);
			TypeDef instanceType = instance.getType();

			if (!typeHash.contains(instanceType))
			{
				typeHash.add(instanceType);

				for (InstanceField field : instance.getFields())
				{
					if (field.getDef().isExtendType())
					{
						//field.get
					}
				}
			}
		}
	}

	public static void writeTypeClass(IProject project, IFolder xmlFolder, IFolder cfgFolder, TypeDef type)
	{
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("public class %s\n",type.getName()));
		sb.append(String.format("{\n"));
		
		sb.append(String.format("\tpublic function %s()",type.getName());
		sb.append(String.format("\t{\n"));
		
		sb.append(String.format("\t}\n"));
		
		
		
		sb.append(String.format("}\n"));
	}

	private void test()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("public class " + root.getType().getName() + "\n");
		sb.append("{");
		sb.append("    ");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
		sb.append("");
	}
}
