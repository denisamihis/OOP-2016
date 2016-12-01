package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;



import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	
	public Butterfly(String name, boolean fly,boolean dangerous,double cost,double danger){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Butterfly(){
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setdangerPerc(1.0);// I could'n not do that is way to funny 
		this.setMaintenanceCost(1.0);
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
		Constants.Animals.Insects.Butterfly);
		}

}
