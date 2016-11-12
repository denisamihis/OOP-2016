package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Phoenix extends Bird {

	public Phoenix (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Phoenix(){
		this.setName("phoenix");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(50);
		this.setMaintenanceCost(5.3);
		this.setMigrates(false);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Phoenix);
		
	}
}
