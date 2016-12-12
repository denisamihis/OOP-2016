package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract class Aquatic extends Animal{
	protected int avgSwimDepth;
	protected enum waterType{
		SALTWATER,FRESHWATER;
	}
	
	protected waterType type;
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}
	
	public void decodeFromXml(Element element) {
		setCare(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setCare(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}
	
	public Aquatic(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	public int getSwimDepth(){
		return avgSwimDepth;
	}
	
	public waterType getWaterType(){
		return type;
	}
	
	public void setSwimDepth(int avgSwimDepth){
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public void setWaterType(waterType type){
		this.type=type;
	}
	
}
