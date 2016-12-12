package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;



import services.factories.Constants;

public class Monkey extends Mammal {
	public	Monkey() {
		super(3,0.2);
	
		setNormalBodyTemp(55);
		setPercBodyHair(57);
	}


	
		
	
	
	


	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}









	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Mammal.Monkey);
		}
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}


