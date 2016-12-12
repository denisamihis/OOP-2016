package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Monkey extends Mammal {
	
	
	public Monkey(){
		super(3,0.2);
		setNormalBodyTemp(39);
		setPercBodyHair(99);
		setNrOfLegs(4);
		setName("Orlando");
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Mammal.Monkey);
		}
	
	@Override
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
}
