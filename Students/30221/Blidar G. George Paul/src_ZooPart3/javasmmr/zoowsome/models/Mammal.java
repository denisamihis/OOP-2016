package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Mammal extends Animal {
	
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Mammal( Double theValue, double percValue)
	{
		super(theValue, percValue);
	}
	
	public float getNormalBodyTemp()
	{
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float degree)
	{
		normalBodyTemp = degree;
	}
	
	public float getPercBodyHair()
	{
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percentage)
	{
		percBodyHair = percentage;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}
	
	public void decodeFromXml(Element element)
	{
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}

}