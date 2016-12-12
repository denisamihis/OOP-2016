package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile{
	public Turtle(){
		super(6.2,0.1);
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	
	public Turtle(int nrOfLegs, String name, boolean laysEggs,double maintenanceCost,double dangerPerc){
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
