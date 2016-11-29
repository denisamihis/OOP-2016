package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Alligator extends Reptile{
	public Alligator(){
		super(7,0.9);
		setNrOfLegs(4);
		setName("Alligator");
		setLaysEggs(true);
	}
	
	public Alligator(int nrOfLegs, String name, boolean laysEggs,double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Alligator);
	}
}
