package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal{
	 public Tiger(){
		    super(40,90,4,"tigru",7,0.85);
	      }
	 
	 @Override
	  public double getPredisposition(){
	  Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.HOUR_OF_DAY)>=12 && date.get(Calendar.HOUR_OF_DAY) <=18 &&(date.get(Calendar.DAY_OF_WEEK) >= Calendar.MONDAY && date.get(Calendar.DAY_OF_WEEK) <= Calendar.FRIDAY))
	    	  return 0.77;
	      return 0;
	  }
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	  		super.encodeToXml(eventWriter);
	  		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Mammals.Tiger);	
	  	} 
}
