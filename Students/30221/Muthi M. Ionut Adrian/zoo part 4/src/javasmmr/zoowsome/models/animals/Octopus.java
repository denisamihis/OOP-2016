package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic {

	 public Octopus(String name, int depth, WaterType waterType,double cost,double danger){
		 this.setName(name);
		 this.setAvgSwimDepth(depth);
		 this.setWaterType(waterType);
		 this.setdangerPerc(danger);
			this.setMaintenanceCost(cost);
	 }
	 
	 public Octopus(){
		 this.setName("Octopus");
		 this.setAvgSwimDepth(200);
		 this.setWaterType(WaterType.saltWater);
		 this.setdangerPerc(0.050);
			this.setMaintenanceCost(1.3);
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
			Constants.Animals.Aquatics.Octopus);
			}
	
}
