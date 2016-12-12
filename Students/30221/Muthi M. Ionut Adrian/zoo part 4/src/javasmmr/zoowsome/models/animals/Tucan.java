package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tucan extends Bird {
	
	public Tucan(String name,boolean migrate,int legs, int altitude,double cost,double danger){
		
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setNrOfLegs(legs);
		this.setMigrtaes(migrate);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Tucan(){
		this.setName("Tucan");
		this.setAvgFligthAltitude(300);
		this.setNrOfLegs(2);
		this.setMigrtaes(false);
		this.setdangerPerc(0.2);
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
		Constants.Animals.Birds.Tucan);
		}

}
