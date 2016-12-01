package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Date;

import javasmmr.zoowsome.services.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Cow extends Mammal {
	
	public Cow()
	{
		this("COW",36,90,4.0,0.0);
	}
	
	public Cow(String name,float normallyTemp, float percentage, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
	
	public boolean kill()
	{
		double randomNumber = Math.random();
		double predispositionOfAnimal = this.getPredisposition();
		if(randomNumber < predispositionOfAnimal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getPredisposition()
	{
		String theTime = new SimpleDateFormat("HH:mm").format(new Date());
		double thePredisposition = this.dangerPercentage;
		if(theTime.compareTo("08:00")>0 && theTime.compareTo("13:00")<0)
		{
			thePredisposition = 0.0; // this remains the same...Cows cannot kill somebody...
		}
		return thePredisposition;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Cow);
	}
	
	public void decodeFromXml(Element theElement)
	{
		
	}
}