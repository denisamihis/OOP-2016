package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;



public class Butterfly extends Insect {
	
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
	
	public Butterfly(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Butterfly(){
		this.setName("Butterfly");
		this.setNrOfLegs(6);
		this.setIsDangerous(false);
		this.setMaintenanceCost(1.0);
		this.setDangerPerc(0);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
		
	}


	

}
