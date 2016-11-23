package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile {
	
	public Snake(String name, boolean egg,double cost,double danger){
		
		this.setName(name);
		this.setLayEggs(egg);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Snake(){
		
		this.setName("Snake");
		this.setLayEggs(true);
		this.setdangerPerc(0.78);
		this.setMaintenanceCost(0.5);
	}
	
	
	@Override
	public boolean kill() {
		double chanceToKill;
		Random rand=new Random();
		chanceToKill=rand.nextDouble() ;
		
		if(chanceToKill >= this.getdangerPerc())
			return false;
		
		return true;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.Snake);
		}

}
