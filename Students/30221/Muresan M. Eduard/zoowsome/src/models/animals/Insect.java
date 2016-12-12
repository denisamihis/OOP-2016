package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal{
	protected boolean canFly;
	protected boolean isDangerous;
	public Insect(boolean canFly, boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	public boolean getCanFly()
	{
		return canFly;
	}
	public void setCanFly(boolean canFly)
	{
		this.canFly = canFly;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"canFly", String.valueOf(this.canFly));
		createNode(eventWriter,"isDangerous", String.valueOf(this.isDangerous));
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		setCanFly (Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
	}
}
