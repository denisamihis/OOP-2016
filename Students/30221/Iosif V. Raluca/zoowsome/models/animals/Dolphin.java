package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType;
import javasmmr.zoowsome.services.factories.Constants;


public class Dolphin extends Aquatic {
	
	public Dolphin (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	WaterType water;
	public Dolphin(){
		this.setName("Dolphin");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(200);
		this.setMaintenanceCost(5.2);
		this.setWaterType(WaterType.SALTWATER);
		this.setDangerPerc(0);

	}
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Dolphin);
		
	}
}
