package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Bear extends Mammals {

	 public Bear(String name, int legs,float normalBodyTemp,float percBodyHair, double cost,double perc){
		 this.setName(name);
		 this.setNrOfLegs(legs);
		 this.setNormalBodyTemp(normalBodyTemp);
		 this.setPercBodyHair(percBodyHair);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Bear(){
		 this.setName("Bear");
		 this.setNrOfLegs(4);
		 this.setNormalBodyTemp(40);
		 this.setPercBodyHair(95);
		 this.setMaitenanceCost(2.0);
		 this.setDangerPerc(0.7);
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
	 Constants.Animals.Mammals.Bear);
	 }
}