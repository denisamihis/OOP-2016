package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Monkey extends Mammal{
	 public Monkey(){
		    super(26,88,2,"Maimultza",8.0,0.5);
	      }
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	  		super.encodeToXml(eventWriter);
	  		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Mammals.Monkey);	
	  	} 
}
