package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shrimp extends Aquaties {

	 public Shrimp(String name, int depth, WaterType waterType,double cost,double perc){
		 this.setName(name);
		 this.setAvgSwimDepth(depth);
		 this.setWaterType(waterType);
		 this.setDangerPerc(perc);
		 this.setMaitenanceCost(cost);
	 }
	 
	 public Shrimp(){
		 this.setName("Shrimp");
		 this.setAvgSwimDepth(50);
		 this.setWaterType(WaterType.saltWater);
		 this.setMaitenanceCost(7.0);
		 this.setDangerPerc(0.3);
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
	 Constants.Animals.Aquaties.Shrimp);
	 }
}