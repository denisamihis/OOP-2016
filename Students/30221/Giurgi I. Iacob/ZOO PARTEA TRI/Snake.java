package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptiles{
   public Snake(){
	   super(true,0,"Sarpe",2.0,1);
   }
   
   // Trebe sa fie alimentat inainte si chiar dupa weekend 
   @Override
   public double getPredisposition(){
   Calendar date = Calendar.getInstance();
     if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
    	    return 0.66;
       return 0;
   }
   
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Reptiles.Snake);	
	   	}
}
