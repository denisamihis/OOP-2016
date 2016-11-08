package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

//import org.w3c.dom.Element;

public class Owl extends Bird{



		public Owl( )
		{
			super(2,0.1);
			setNrOfLegs(4);
			setAvgFlightAltitude(33);
			setMigrates(false);
			
		}
		
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Bird.Owl);
			}
		public void decodeFromXml(org.w3c.dom.Element element) {
			// TODO Auto-generated method stub
			
		}
		
			@Override
			public boolean kill() {
				double d=Math.random();
				if(d<dangerPerc)
					return true;
				return false;
			}
		
	
}
