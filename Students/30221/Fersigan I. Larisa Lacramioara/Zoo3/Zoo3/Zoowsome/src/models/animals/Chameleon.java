package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;
import static repositories.AnimalRepository.createNode;

public class Chameleon extends Reptile{

	
	public Chameleon(){
		super(3,0.2);
		setNrOfLegs(2);
		setName("cami");
		setLaysEggs(true);
	}
	@Override
	public boolean kill() {
		// TODO Auto-generated method stub
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		// TODO Auto-generated method stub
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Reptile.Chameleon);
		}
	
	@Override
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}

}
