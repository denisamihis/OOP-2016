package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	
	public Cockroach (boolean canFly, boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Cockroach (){
		super(1.2,0.0);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Insects.Cockroach);
		}
}
