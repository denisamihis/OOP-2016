package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Cow extends Mammal {
      public Cow(){
    	super(35,15,4,"Vacutza",6.8,0.1);
      }
      
      public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
    	  		super.encodeToXml(eventWriter);
    	  		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Mammals.Cow);	
    	  	}
}
