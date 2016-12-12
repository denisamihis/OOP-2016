package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal{
	
	public Tiger(){
		super(6,0.9);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(30);
		setPercBodyHair(99);
	}
	
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Tiger);
	}

}
