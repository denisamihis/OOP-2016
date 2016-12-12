package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Cow extends Mammal {
	
	
	
	public Cow(){
		super(3,0.0);
		setNrOfLegs(4);
		setPercBodyHair(78);
		setNormalBodyTemp(37);
		setName("vaca");
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Mammal.Cow);
		}
	
	@Override
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}

}
