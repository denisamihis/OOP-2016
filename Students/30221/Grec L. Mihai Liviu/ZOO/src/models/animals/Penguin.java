package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Penguin extends Aquatic{
	public Penguin(){
		super(6.8 , 0.03);
		setNrOfLegs(2);
		setName("Penguin");
		setAvgSwimDepth(35);
		setWaterType(WaterType.FRESHWATER);
	}
	public Penguin(Integer nrOfLegs , String name , Integer avgSwimDepth , WaterType waterType){
		super(7.4 , 0.03);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.JUNE && date.get(Calendar.MONTH)<=Calendar.AUGUST)
			return 0.12;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Aquatics.Penguin);	
	}
}
