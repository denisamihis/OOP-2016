package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal{
	protected int avgSwimDepth;
	enum water{freshWater, saltWater};
	protected water waterType;
	Aquatic (int avgSwimDepth, water waterType, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.waterType = waterType;
		this.avgSwimDepth = avgSwimDepth;
	}
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth)
	{
		this.avgSwimDepth = avgSwimDepth;
	}
	public water getWaterType()
	{
		return waterType;
	}
	public void setWaterType(water waterType)
	{
		this.waterType = waterType;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter,"waterType", String.valueOf(this.waterType));
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType (water.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
