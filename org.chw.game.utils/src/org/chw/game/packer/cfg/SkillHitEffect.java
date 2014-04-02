package org.chw.game.packer.cfg;

public class SkillHitEffect extends AbsXmlNode
{
	public int delay;
	public String attireId;
	public int offsetX;
	public int offsetY;
	public int duration;

	@Override
	protected String buildString()
	{
		return String.format("<effect delay=\"%s\" duration=\"%s\" attireID=\"%s\" x=\"%s\" y=\"%s\" />", delay,duration,attireId,offsetX,offsetY);
	}
}
