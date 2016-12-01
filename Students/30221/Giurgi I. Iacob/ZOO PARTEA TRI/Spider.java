package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insects {
    public Spider(){
    	super(false,true,8,"Paianjen",5,0.75);
    }
    // ca in cerinta 
    @Override
    public double getPredisposition(){
    Calendar date = Calendar.getInstance();
        if (date.get(Calendar.HOUR_OF_DAY)>=22 && date.get(Calendar.HOUR_OF_DAY) <=06)
      	  return 0.25;
        return 0;
    }
    
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
   		super.encodeToXml(eventWriter);
   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Insects.Spider);	
   	}
}
