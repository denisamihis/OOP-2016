package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Salamander extends Reptiles {

	 public Salamander(String name, int legs,boolean laysEggs,double cost,double perc){
		 this.setName(name);
		 this.setNrOfLegs(legs);
		 this.setLaysEggs(laysEggs);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Salamander(){
		 this.setName("Salamander");
		 this.setNrOfLegs(4);
		 this.setLaysEggs(true);
		 this.setMaitenanceCost(1.0);
		 this.setDangerPerc(0.2);
	 }
	 @Override
		public boolean kill() {
		double killeru;
		Random aiurea=new Random();
		killeru=aiurea.nextDouble();
		if(killeru>= this.getDangerPerc())
			return false;
		return true;
		}
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	 {
	 super.encodeToXml(eventWriter);
	 createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	 Constants.Animals.Reptiles.Salamander);
	 }
}