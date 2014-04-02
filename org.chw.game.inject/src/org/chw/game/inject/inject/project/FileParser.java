package org.chw.game.inject.inject.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import org.chw.game.inject.inject.data.EnumType;
import org.chw.game.inject.inject.data.InterfaceType;
import org.chw.game.inject.inject.data.ModuleType;
import org.chw.game.inject.inject.data.NoticeType;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import com.adobe.flash.compiler.definitions.metadata.IMetaTagAttribute;
import com.adobe.flash.compiler.tree.as.IASNode;
import com.adobe.flash.compiler.tree.as.IAccessorNode;
import com.adobe.flash.compiler.tree.as.IClassNode;
import com.adobe.flash.compiler.tree.as.IDefinitionNode;
import com.adobe.flash.compiler.tree.as.IFileNode;
import com.adobe.flash.compiler.tree.as.IFunctionNode;
import com.adobe.flash.compiler.tree.as.IGetterNode;
import com.adobe.flash.compiler.tree.as.IInterfaceNode;
import com.adobe.flash.compiler.tree.as.IPackageNode;
import com.adobe.flash.compiler.tree.as.IScopedNode;
import com.adobe.flash.compiler.tree.as.ISetterNode;
import com.adobe.flash.compiler.tree.as.IVariableNode;
import com.adobe.flash.compiler.tree.metadata.IMetaTagNode;
import com.adobe.flash.compiler.tree.metadata.IMetaTagsNode;

public class FileParser
{
	private static final String MODULE = "Module";
	private static final String NOTICE = "Notice";
	private static final String INTERFACE = "Interface";
	private static final String ENUM = "Enum";

	private static final String INJECT = "Inject";
	private static final String BIND = "Bind";

	private String path;
	private ModuleType moduleType;
	private NoticeType noticeType;
	private InterfaceType interfaceType;
	private EnumType enumType;

	private String[] injectVars;
	private String[] injectMethods;
	private String[] bindMethods;

	private ArrayList<IVariableNode> variables = new ArrayList<IVariableNode>();
	private ArrayList<IAccessorNode> accessors = new ArrayList<IAccessorNode>();
	private ArrayList<IFunctionNode> functions = new ArrayList<IFunctionNode>();

	private Hashtable<String, ArrayList<IMetaTagNode>> allAccessorInject = new Hashtable<String, ArrayList<IMetaTagNode>>();
	private Hashtable<String, ISetterNode> allSetterAccessor = new Hashtable<String, ISetterNode>();

	private Hashtable<IASNode, ArrayList<String>> invalidMetaNodes = new Hashtable<IASNode, ArrayList<String>>();

	/**
	 * 获取模块定义
	 * 
	 * @return
	 */
	public ModuleType getModule()
	{
		return moduleType;
	}

	/**
	 * 获取消息定义
	 * 
	 * @return
	 */
	public NoticeType getNotice()
	{
		return noticeType;
	}

	/**
	 * 获取接口定义
	 * 
	 * @return
	 */
	public InterfaceType getInterface()
	{
		return interfaceType;
	}

	/**
	 * 获取枚举定义
	 * 
	 * @return
	 */
	public EnumType getEnum()
	{
		return enumType;
	}

	/**
	 * 变量注入点
	 * 
	 * @return
	 */
	public String[] getInjectVars()
	{
		return injectVars;
	}

	/**
	 * 属性注入点
	 * 
	 * @return
	 */
	public String[] getMethods()
	{
		return injectMethods;
	}

	/**
	 * 函数绑定点
	 * 
	 * @return
	 */
	public String[] getBindMethods()
	{
		return bindMethods;
	}

	/**
	 * 接收文件节点
	 * 
	 * @param fileNode
	 */
	public void parser(IResource file, IFileNode fileNode)
	{
		path = file.getProjectRelativePath().toString();

		for (int i = 0; i < fileNode.getChildCount(); i++)
		{
			IASNode node = fileNode.getChild(i);
			if (node instanceof IPackageNode)
			{
				visit(node);
			}
			// else
			// {
			// accept(node, false);
			// }
		}

		mergeGetterAndSetter();

		rebuildInjectMarks(file);

		injectVars = new String[variables.size()];
		for (int i = 0; i < variables.size(); i++)
		{
			injectVars[i] = variables.get(i).getName();
		}

		injectMethods = new String[accessors.size()];
		for (int i = 0; i < accessors.size(); i++)
		{
			injectMethods[i] = accessors.get(i).getName();
		}

		bindMethods = new String[functions.size()];
		for (int i = 0; i < functions.size(); i++)
		{
			bindMethods[i] = functions.get(i).getName();
		}
	}

	/**
	 * 遍历节点
	 * 
	 * @param node
	 */
	private void visit(IASNode node)
	{
		if (visitNode(node))
		{
			for (int i = 0; i < node.getChildCount(); i++)
			{
				visit(node.getChild(i));
			}
		}
	}

	/**
	 * 访问节点
	 * 
	 * @param node
	 * @return
	 */
	private boolean visitNode(IASNode node)
	{
		if (node instanceof IFileNode || node instanceof IPackageNode || node instanceof IScopedNode)
		{
			return true;
		}
		if (node instanceof IClassNode)
		{
			visitClassNode((IClassNode) node);
			return true;
		}
		if (node instanceof IInterfaceNode)
		{
			visitClassNode((IInterfaceNode) node);
			return false;
		}
		if (node instanceof IGetterNode)
		{
			visitGetterNode((IGetterNode) node);
			return false;
		}
		if (node instanceof ISetterNode)
		{
			visitSetterNode((ISetterNode) node);
			return false;
		}
		if (node instanceof IFunctionNode)
		{
			visitFunctionNode((IFunctionNode) node);
			return false;
		}
		if (node instanceof IVariableNode)
		{
			visitVariableNode((IVariableNode) node);
			return false;
		}
		return false;
	}

	/**
	 * 查找无效标记
	 * 
	 * @param node
	 * @param isPackageInner
	 */
	private void findInvalidTag(IDefinitionNode node, String[] checkNames, String errorText)
	{
		if (node.getMetaTags() == null)
		{
			return;
		}

		IMetaTagNode[] metas = node.getMetaTags().getAllTags();
		for (IMetaTagNode meta : metas)
		{
			for (String checkName : checkNames)
			{
				if (meta.getTagName().equals(checkName))
				{
					putTagError(meta, errorText);
				}
			}
		}
	}

	/**
	 * 添加错误信息
	 * 
	 * @param node
	 * @param errorText
	 */
	private void putTagError(IASNode node, String errorText)
	{
		if (!invalidMetaNodes.containsKey(node))
		{
			invalidMetaNodes.put(node, new ArrayList<String>());
		}
		invalidMetaNodes.get(node).add(errorText);
	}

	/**
	 * 访问类节点
	 * 
	 * @param node
	 */
	private void visitClassNode(IDefinitionNode node)
	{
		findInvalidTag(node, new String[] { INJECT, BIND }, "此标记不能应用到类型！");

		IMetaTagsNode metasNode = node.getMetaTags();
		if (metasNode != null)
		{
			IMetaTagNode[] metas = metasNode.getAllTags();

			String moduleName = null;
			String noticeName = null;
			String interfaceName = null;
			String enumName = null;

			for (IMetaTagNode meta : metas)
			{
				int type = 0;
				String metaName = null;

				if (MODULE.equals(meta.getTagName()))
				{
					type = 1;
					metaName = moduleName;
				}
				else if (NOTICE.equals(meta.getTagName()))
				{
					type = 2;
					metaName = noticeName;
				}
				else if (INTERFACE.equals(meta.getTagName()))
				{
					type = 3;
					metaName = interfaceName;
				}
				else if (ENUM.equals(meta.getTagName()))
				{
					type = 4;
					metaName = enumName;
				}

				if (type != 0)
				{
					if (metaName == null)
					{
						metaName = "";
					}

					IMetaTagAttribute attribute = meta.getAttribute("name");
					if (attribute == null)
					{
						putTagError(meta, "需要name属性!");
					}
					else
					{
						String value = attribute.getValue();
						if (value == null || value.isEmpty())
						{
							putTagError(meta, "name属性值不能为空!");
						}
						else
						{
							metaName = value;
						}
					}

					if (type == 1)
					{
						moduleName = metaName;
					}
					else if (type == 2)
					{
						noticeName = metaName;
					}
					else if (type == 3)
					{
						interfaceName = metaName;
					}
					else if (type == 4)
					{
						enumName = metaName;
					}
				}

				int typeCount = 0;
				if (moduleName != null)
				{
					typeCount++;
				}
				if (noticeName != null)
				{
					typeCount++;
				}
				if (interfaceName != null)
				{
					typeCount++;
				}
				if (enumName != null)
				{
					typeCount++;
				}

				if (typeCount > 1)
				{
					putTagError(node, "Module Notice Interface Enum只能同时使用一个标记！");
				}
				else
				{
					if (moduleName != null)
					{
						moduleType = new ModuleType(moduleName, node.getPackageName(), node.getName(), node.getNamespace(), path);
					}
					if (noticeName != null)
					{
						noticeType = new NoticeType(noticeName, node.getPackageName(), node.getName(), path);
					}
					if (interfaceName != null)
					{
						interfaceType = new InterfaceType(interfaceName, node.getPackageName(), node.getName(), path);
					}
					if (enumName != null)
					{
						enumType = new EnumType(enumName, node.getPackageName(), node.getName(), path);
					}
				}
			}
		}
	}

	/**
	 * 访问Getter节点
	 * 
	 * @param node
	 */
	private void visitGetterNode(IGetterNode node)
	{
		if (node.getMetaTags() == null)
		{
			return;
		}

		findInvalidTag(node, new String[] { MODULE, BIND }, "此标记不能应用到Getter函数！");

		IMetaTagNode[] metas = node.getMetaTags().getTagsByName(INJECT);
		if (metas.length > 0)
		{
			String accessorName = node.getName();

			if (!allAccessorInject.containsKey(accessorName))
			{
				allAccessorInject.put(accessorName, new ArrayList<IMetaTagNode>());
			}

			allAccessorInject.get(accessorName).addAll(Arrays.asList(metas));
		}
	}

	/**
	 * 访问Setter节点
	 * 
	 * @param node
	 */
	private void visitSetterNode(ISetterNode node)
	{
		allSetterAccessor.put(node.getName(), node);

		if (node.getMetaTags() == null)
		{
			return;
		}

		findInvalidTag(node, new String[] { MODULE, BIND }, "此标记不能应用到Setter函数！");

		IMetaTagNode[] metas = node.getMetaTags().getTagsByName(INJECT);
		if (metas.length > 0)
		{
			String accessorName = node.getName();

			if (!allAccessorInject.containsKey(accessorName))
			{
				allAccessorInject.put(accessorName, new ArrayList<IMetaTagNode>());
			}

			allAccessorInject.get(accessorName).addAll(Arrays.asList(metas));
		}
	}

	/**
	 * 访问函数节点
	 * 
	 * @param node
	 */
	private void visitFunctionNode(IFunctionNode node)
	{
		if (node.getMetaTags() == null)
		{
			return;
		}

		findInvalidTag(node, new String[] { MODULE, INJECT }, "此标记不能应用到成员函数！");

		IMetaTagNode[] metas = node.getMetaTags().getTagsByName(BIND);
		if (metas.length > 0)
		{
			boolean hasError = false;

			IClassNode classNode = (IClassNode) node.getParent().getParent();
			if (node.getName().equals(classNode.getName()))
			{
				hasError = true;
				for (int i = 0; i < metas.length; i++)
				{
					putTagError(metas[i], "此标记不能应用到构造函数！");
				}
			}
			else
			{
				if (node.getParameterNodes().length > 1)
				{
					hasError = true;
					putTagError(node.getParametersContainerNode(), "[Bind]标记的函数只能有一个参数！");
				}
				else if (node.getParameterNodes().length == 0)
				{
					hasError = true;
					putTagError(node.getNameExpressionNode(), "[Bind]标记的函数必须有一个参数！");
				}

				if (node.getReturnTypeNode() == null)
				{
					hasError = true;
					putTagError(node.getNameExpressionNode(), "[Bind]标记的函数返回值必须为void！");
				}
				else if (!node.getReturnType().equals("void"))
				{
					hasError = true;
					putTagError(node.getReturnTypeNode(), "[Bind]标记的函数返回值必须为void！");
				}
			}

			if (!hasError)
			{
				functions.add(node);
			}
		}
	}

	/**
	 * 访问变量节点
	 * 
	 * @param node
	 */
	private void visitVariableNode(IVariableNode node)
	{
		if (node.getMetaTags() == null)
		{
			return;
		}

		findInvalidTag(node, new String[] { MODULE, BIND }, "此标记不能应用到成员变量！");

		IMetaTagNode[] metas = node.getMetaTags().getTagsByName(INJECT);
		if (metas.length > 0)
		{
			variables.add(node);
		}
	}

	/**
	 * 合并访问器注入
	 */
	private void mergeGetterAndSetter()
	{
		for (String accessorName : allAccessorInject.keySet())
		{
			if (allSetterAccessor.containsKey(accessorName))
			{
				accessors.add(allSetterAccessor.get(accessorName));
			}
			else
			{
				for (IMetaTagNode meta : allAccessorInject.get(accessorName))
				{
					putTagError(meta, "[Inject]无法应用到只读的属性！");
				}
			}
		}
	}

	/**
	 * 重建注入标记
	 */
	private void rebuildInjectMarks(final IResource file)
	{
		try
		{
			file.deleteMarkers(ProjectNature.MARKER_ID, false, IResource.DEPTH_ZERO);
		}
		catch (CoreException e1)
		{
			e1.printStackTrace();
		}

		for (IASNode node : invalidMetaNodes.keySet())
		{
			for (String errorText : invalidMetaNodes.get(node))
			{
				try
				{
					IMarker marker = file.createMarker(ProjectNature.MARKER_ID);
					marker.setAttribute(IMarker.MESSAGE, errorText);
					marker.setAttribute(IMarker.CHAR_START, node.getStart());
					marker.setAttribute(IMarker.CHAR_END, node.getEnd());
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				}
				catch (CoreException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
