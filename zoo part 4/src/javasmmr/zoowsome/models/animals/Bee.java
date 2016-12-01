package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;



import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Bee extends Insect {
	
	public Bee(String name, boolean fly,boolean dangerous,double cost,double danger){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
		
	}
	
	public Bee(){
		this.setName("Bee");
		this.setCanFly(true);
		this.setIsDangerous(true);
		this.setdangerPerc(0.5);
		this.setMaintenanceCost(0.4);
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
		Constants.Animals.Insects.Bee);
		}




	
	 
}
