package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.repositories.AnimalRepository;
public abstract class Reptiles extends Animal {
	private boolean laysEggs;
	public boolean getLaysEggs (){
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs ){
		laysEggs=this.laysEggs;
	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
		}
}
