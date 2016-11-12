package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Eagle extends Bird {
	
	public Eagle(String name,boolean migrate,int legs, int altitude,double cost,double danger){
	
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setNrOfLegs(legs);
		this.setMigrtaes(migrate);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Eagle(){
		this.setName("Eagle");
		this.setAvgFligthAltitude(12000);
		this.setNrOfLegs(2);
		this.setMigrtaes(true);
		this.setdangerPerc(0.25);
		this.setMaintenanceCost(1.4);
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
		Constants.Animals.Birds.Eagle);
		}
	

}
