package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Ostrich extends Bird{
   public Ostrich(){
	   super(false,0,2,"Strutz",5.0,0.74);
   }
   // Te calca in picioare de il scoli pre dimineata
   @Override
   public double getPredisposition(){
	   Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.HOUR_OF_DAY)>=06 && date.get(Calendar.HOUR_OF_DAY) <=10)
	    	  return 0.3;
	      return 0;

   }
   
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Birds.Ostrich);	
	  }
   
}
