package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	
	private int avgSwimDepth;
	private String waterType;
	
	public Aquatic(Double theValue, double percValue) //added this one
	{
		super(theValue,percValue);
	}
	
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int value)
	{
		avgSwimDepth = value;
	}
	
	public String getWaterType()
	{
		return waterType;
	}
	
	public void setWaterType(String newType)
	{
		waterType = newType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", this.waterType);
	}
	
	public void decodeFromXml(Element element)
	{
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(String.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}