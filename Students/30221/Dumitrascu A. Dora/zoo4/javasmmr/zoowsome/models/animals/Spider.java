package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect{
	public Spider(){
		super(0.3,0.3);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Spider);
	}

}

