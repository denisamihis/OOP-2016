package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.repositories.AnimalRepository;
public abstract class Aquaties extends Animal{
	
	int avgSwimDepth;
	WaterType waterType;
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth){
		avgSwimDepth=this.avgSwimDepth;
	}
	public WaterType getWaterType(){
		return waterType;
	}
	public void setWaterType(WaterType waterType){
		waterType=this.waterType;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		AnimalRepository.createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		}
}
