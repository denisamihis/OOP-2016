package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal{
	
	public Cow(){
		super(3.3,0); //this sets the maintenanceCost and dangerPerc final fields
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(40);
		setPercBodyHair(70);
		setCare(false);
	}
	
	public Cow(int nrOfLegs, String name, boolean takenCareOf, float normalBodyTemp, float percBodyHair,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc); //sets the two final fields using the constructor
		this.takenCareOf=takenCareOf;
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Cow);
	}

}
