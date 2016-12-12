package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;
public class FishFresh extends Aquatic {
   public FishFresh(){
	   super(880,2,"Peste",8.0,0);
	   setWater(Water.Freshwater);
	   
   }
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Aquatics.FishFresh);	
	   	}
   
}
