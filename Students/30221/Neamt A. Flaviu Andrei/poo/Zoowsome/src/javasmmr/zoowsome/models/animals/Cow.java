package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammals {

	 public Cow(String name, int legs,float normalBodyTemp,float percBodyHair,double cost,double perc){
		 this.setName(name);
		 this.setNrOfLegs(legs);
		 this.setNormalBodyTemp(normalBodyTemp);
		 this.setPercBodyHair(percBodyHair);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Cow(){
		 this.setName("Cow");
		 this.setNrOfLegs(4);
		 this.setNormalBodyTemp(25);
		 this.setPercBodyHair(60);
		 this.setMaitenanceCost(5.0);
		 this.setDangerPerc(0.4);
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
	 Constants.Animals.Mammals.Cow);
	 }
}