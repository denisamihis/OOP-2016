package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract class Reptile extends Animal{
	protected boolean laysEggs;
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}
	
	public void decodeFromXml(Element element) {
		setCare(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
		}
	
	public Reptile(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs=laysEggs;
	}
}
