package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	WaterType waterType;
	
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int depth){
		avgSwimDepth=depth;
	}
	
	public WaterType getWaterType(){
		return waterType;
	}
	
	public void setWaterType(WaterType waterType){
		this.waterType=waterType;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgSwinDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter,"waterType",String.valueOf(getWaterType()));
		
	}
	
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));

	}
}
