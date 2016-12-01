package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Vulture extends Bird{
    public Vulture(){
    	super(true,555,2,"Vultur",3,0.75);
    }
    
    @Override
    public double getPredisposition(){
    Calendar date = Calendar.getInstance();
        if (date.get(Calendar.HOUR_OF_DAY)>=23 && date.get(Calendar.HOUR_OF_DAY) <=07)
      	  return 0.40;
        return 0;
    }
    
    
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
   		super.encodeToXml(eventWriter);
   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Birds.Vulture);	
  }
}

