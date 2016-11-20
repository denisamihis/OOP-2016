package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javasmmr.zoowsome.services.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Dinosaur extends Reptile {
	
	public Dinosaur()
	{
		this("DINOSAUR",true,8.0,0.8);
	}
	
	public Dinosaur(String name, boolean answer, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(4);
		this.setName(name);
		this.setLayingEggs(answer);
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
		if(theTime.compareTo("09:00")>0 && theTime.compareTo("18:30")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Dinosaur);
	}
	
	public void decodeFromXml(Element theElement)
	{
		
	}
}