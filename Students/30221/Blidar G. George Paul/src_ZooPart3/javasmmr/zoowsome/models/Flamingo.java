package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javasmmr.zoowsome.services.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Flamingo extends Bird {
	
	public Flamingo()
	{
		this("FLAMINGO",false,0,6.0,0.0);
	}
	
	public Flamingo(String name,boolean answer, int altitude, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsMigrating(answer);
		this.setAvgFlightAltitude(altitude);
	}
	
	public boolean kill()
	{
		double randomNumber = Math.random();
		double thePredispositionOfAnimal = this.getPredisposition();
		if(randomNumber < thePredispositionOfAnimal)
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
			thePredisposition = 0.0; // flamingos are harmless...
		}
		return thePredisposition;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Flamingo);
	}
	
	public void decodeFromXml(Element theElement)
	{
		
	}
}