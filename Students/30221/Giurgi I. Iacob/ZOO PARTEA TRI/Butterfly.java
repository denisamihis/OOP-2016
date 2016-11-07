package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.*;



import javasmmr.zoowsome.services.factories.Constants;
public class Butterfly extends Insects{
   public Butterfly(){        
	   super(true,false,6,"Fluturas",2.5,0.0);
   }
   
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Insects.Butterfly);	
	   	}


   
}
