package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;



import services.factories.Constants;

public class Dolphin extends Aquatic {
	  public  WaterType type;
	 public  Dolphin( WaterType type)
		{
		 super(7,0.1);
		 this.type=type;
		}
	 
		
	

	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Aquatic.Dolphin);
			}


			@Override
			public boolean kill() {
				double d=Math.random();
				if(d<dangerPerc)
					return true;
				return false;
			}



			public void decodeFromXml(org.w3c.dom.Element element) {
				// TODO Auto-generated method stub
				
			}
			




	
}
