package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Lion extends Mammal{
	
	public Lion(String name, int legs, float temp,float hair,double cost,double danger){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}

	public Lion(){	
		
		this.setName("Lion");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 38.33);
		this.setPrecBodyHair((float) 100);
		this.setdangerPerc(0.9);
		this.setMaintenanceCost(2.2);
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
		Constants.Animals.Mammals.Lion);
		}
}
