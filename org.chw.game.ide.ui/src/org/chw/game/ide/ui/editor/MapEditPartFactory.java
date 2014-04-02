package org.chw.game.ide.ui.editor;

import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.ui.editor.parts.ElementPart;
import org.chw.game.ide.ui.editor.parts.EnumEditPart;
import org.chw.game.ide.ui.editor.parts.EnumFieldEditPart;
import org.chw.game.ide.ui.editor.parts.MapEditPart;
import org.chw.game.ide.ui.editor.parts.MapFieldEditPart;
import org.chw.game.ide.ui.editor.parts.MapLinkEditPart;
import org.chw.game.ide.ui.editor.parts.MessageEditPart;
import org.chw.game.ide.ui.editor.parts.MessageFieldEditPart;
import org.chw.game.ide.ui.editor.parts.RootEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class MapEditPartFactory implements EditPartFactory
{

	@Override
	public EditPart createEditPart(EditPart context, Object model)
	{
		if (model instanceof MessageField)
		{
			return new MessageFieldEditPart((MessageField) model);
		}
		else if (model instanceof MessageType)
		{
			return new MessageEditPart((MessageType) model);
		}
		else if (model instanceof EnumField)
		{
			return new EnumFieldEditPart((EnumField) model);
		}
		else if (model instanceof EnumType)
		{
			return new EnumEditPart((EnumType) model);
		}
		else if (model instanceof MapField)
		{
			return new MapFieldEditPart((MapField) model);
		}
		else if (model instanceof Map)
		{
			if(context instanceof MapLinkEditPart)
			{
				return new MapEditPart((Map) model);
			}
			else
			{
				return new MapLinkEditPart((Map)model);
			}
		}
		else if (model instanceof Element)
		{
			return new ElementPart((Element) model);
		}
		else if (model instanceof Model)
		{
			return new RootEditPart((Model) model);
		}
		
		return null;
	}
}
