package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic{
	public Dolphin (int nrOfLegs, String name, int avgSwimDepth,WaterType waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Dolphin(){
		super(3.5, 0.1);
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(200);
		setWaterType(WaterType.SALTWATER);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.Dolphin);
		}


}
