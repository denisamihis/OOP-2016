package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dodo extends Birds {

	 public Dodo(String name, int legs,int avgFlightAltitude,boolean migrates,double cost,double perc){
		 this.setName(name);
		 this.setNrOfLegs(legs);
		 this.setMigrates(migrates);
		 this.setAvgFlightAltitude(avgFlightAltitude);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Dodo(){
		 this.setName("Dodo");
		 this.setNrOfLegs(2);
		 this.setMigrates(false);
		 this.setAvgFlightAltitude(1);
		 this.setMaitenanceCost(7.0);
		 this.setDangerPerc(0.5);
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
	 Constants.Animals.Birds.Dodo);
	 }
}