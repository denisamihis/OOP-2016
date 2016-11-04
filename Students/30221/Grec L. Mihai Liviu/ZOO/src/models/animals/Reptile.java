package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;
	protected Reptile(Double maintenanceCost , Double dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public void setLaysEggs(Boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	public Boolean getLaysEggs(){
		return laysEggs;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs" , String.valueOf(getLaysEggs()));
		
	}
	public void decodeFromXml(Element element){
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
		
	}
}
