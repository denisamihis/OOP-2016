package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Insect extends Animal {
	
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect(Double theValue, double dangerPerc)
	{
		super(theValue,dangerPerc);
	}
	
	public boolean isFlying()
	{
		return canFly;
	}
	
	public void setIsFlying(boolean answer)
	{
		canFly = answer;
	}
	
	public boolean itIsDangerous()
	{
		return isDangerous;
	}
	
	public void setItIsDangerous(boolean answer)
	{
		isDangerous = answer;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	
	public void decodeFromXml(Element element)
	{
		setIsFlying(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setItIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
	
}
