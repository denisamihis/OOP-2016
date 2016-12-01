package models.animals;

import static repositories.AnimalRepository.createNode;


import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;





public class Butterfly extends Insect {
	
	
	public  Butterfly()
		{
		super(1,0.1);
		setCanFly(true);
		setDangerous(false);
		}
	
	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Insect.Butterfly);
	}
		
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
