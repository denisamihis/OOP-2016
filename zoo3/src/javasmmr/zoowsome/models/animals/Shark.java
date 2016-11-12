package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {

	public Shark (String name, int depth,WaterType waterType,double cost,double danger){
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(waterType);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Shark(){
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.saltWater);
		this.setdangerPerc(0.89);
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
		Constants.Animals.Aquatics.Shark);
		}
}
