package models.animlas;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;

public abstract class Aquatic extends Animal{
	protected int avgSwimDepth;
	enum wT{saltWater, freshWater};
	protected wT waterType;
	public Aquatic(int avgSwimDepth,wT waterType, String name, int nrOfLegs,double maintenanceCost,double dangPerc)
	{
		super( name, nrOfLegs,maintenanceCost, dangPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,"avgSwimDepth",String.valueOf(getDepth()));
		AnimalRepository.createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}
	public void decodeFromXml(Element element){
		setDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(wT.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
	public int getDepth (){
		return avgSwimDepth;
	}
	public void setDepth( int avgSwimDepth){
		this.avgSwimDepth= avgSwimDepth;
	}
	public wT getWaterType()
	{
		return waterType;
	}
	public void setWaterType(wT waterType){
		this.waterType=waterType;
	}

}
