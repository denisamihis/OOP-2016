package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


import models.animals.WaterType;
import services.factories.Constants;
public class ReggaeShark extends Aquatic {
	
	
 public  WaterType type;
	
	 
	 public  ReggaeShark( WaterType type)
		{
		 super(2,0.9);
			
			this.type=type;
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animal.Aquatic.ReggaeShark);
		}
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
