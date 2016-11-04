package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Seal extends Aquatic{
	public Seal(){
		super(7.1 , 0.07);
		setNrOfLegs(0);
		setName("Seal");
		setAvgSwimDepth(40);
		setWaterType(WaterType.FRESHWATER);
	}
	public Seal(Integer nrOfLegs , String name , Integer avgSwimDepth , WaterType waterType){
		super(7.6 , 0.07);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.MAY && date.get(Calendar.MONTH)<=Calendar.SEPTEMBER)
			return 0.12;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Aquatics.Seal);	
	}
}
