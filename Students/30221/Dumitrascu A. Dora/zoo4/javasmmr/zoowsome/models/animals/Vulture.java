package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Vulture extends Bird{
	public Vulture(){
		super(1,0.1);
		setNrOfLegs(2);
		setName("Vulture");
		setMigrates(false);
		setFlightAltitude(11000);
	}
	
	public Vulture(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude, double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Vulture);
	}
}
