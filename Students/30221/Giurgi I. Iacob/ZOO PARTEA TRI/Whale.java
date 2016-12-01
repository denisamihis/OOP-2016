package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic{
	public Whale(){
		super(1000,0,"Balena",5.0,0.4);
	    setWater(Water.Saltwater);
	       
	}
	//DUMINICA PANA LA 18
	@Override
	  public double getPredisposition(){
	  Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY && date.get(Calendar.HOUR_OF_DAY) <=18)
	    	  return 0.55;
	      return 0;
	  }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
   		super.encodeToXml(eventWriter);
   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Aquatics.Whale);	
   	}

}
