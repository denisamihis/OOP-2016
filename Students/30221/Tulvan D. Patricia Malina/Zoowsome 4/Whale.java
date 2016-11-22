package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Whale extends Aquatic{
	public Whale(){
		super(5.5,0.1);
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(2500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(Integer nrOfLegs,String name,Integer avgSwimDepth, WaterType waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Whale);
	}
}
