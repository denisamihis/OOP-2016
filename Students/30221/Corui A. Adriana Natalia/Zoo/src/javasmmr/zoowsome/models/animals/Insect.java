package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Insect extends Animal {

	public Insect(double maintCosts,double precDanger) {
		super(maintCosts,precDanger);
		// TODO Auto-generated constructor stub
	}
	private boolean canFly;
	private boolean isDangerous;
	public boolean getFlyAbility()
	{
		return canFly;
	}
	public void setFlyAbility(boolean canFly)
	{
		this.canFly=canFly;
	}
	public boolean getDangerLvl()
	{
		return isDangerous;
	}
	public void setDangerLvl(boolean isDangerous)
	{
		this.isDangerous=isDangerous;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException 
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "canFly", String.valueOf(getFlyAbility()));
		AnimalRepository.createNode(eventWriter, "isDangerous", String.valueOf(getDangerLvl()));
	}
	@Override
	public void decodeFromXml(Element element) 
	{
		setFlyAbility(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setDangerLvl(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
