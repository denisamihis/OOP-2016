package javasmmr.zoowsome.models.animals;
import java.util.*;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
public class Cockroach extends Insects {
   public Cockroach(){
	   super(false,true,6,"Cockroach",5.2,0.8);
   }
   
   // astia is periculosi iarna cand ii frigutz afara
   @Override
   public double getPredisposition(){
	   Calendar date= Calendar.getInstance();
	   if(date.get(Calendar.MONTH)>=Calendar.DECEMBER && date.get(Calendar.MONTH)<=Calendar.FEBRUARY)
		   return 0.15;
	   return 0;
				   
   }
   
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Insects.Cockroach);	
	   	}
}
