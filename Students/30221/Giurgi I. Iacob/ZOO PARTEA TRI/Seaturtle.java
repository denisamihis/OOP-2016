package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Seaturtle extends Reptiles{
    public Seaturtle(){
    	super(true,2,"Testoasa",8.0,0.0);
    }
    
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
   		super.encodeToXml(eventWriter);
   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Reptiles.Seaturtle);	
   	}
}
