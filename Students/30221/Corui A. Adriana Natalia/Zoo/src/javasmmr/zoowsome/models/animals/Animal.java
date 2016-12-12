package javasmmr.zoowsome.models.animals;

//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowesome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.models.animals.Interface.Killer;
import javasmmr.zoowesome.repositories.AnimalRepository;
abstract public class Animal implements Killer,XML_Parsable {
	
	private String name;
	private int nrOfLegs;
	private double maintCosts;
	private double precDanger;
	private boolean takenCareOf=false;
	public Animal(double maintCosts,double precDanger)
	{
		this.maintCosts=maintCosts;
		this.precDanger=precDanger;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf=takenCareOf;
	}
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs=nrOfLegs;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getMaintCosts()
	{
		return maintCosts;
	}
	public void setMaintCosts(double maintCosts)
	{
		this.maintCosts=maintCosts;
	}
	public void setPrecDanger(double precDanger)
	{
		this.precDanger=precDanger;
	}
	@Override
	public boolean kill()
	{
		/*Random rand=new Random();
		double randNr=rand.nextDouble();*/
		double randNr = ThreadLocalRandom.current().nextDouble(0,1);
		if(randNr < precDanger)
			return true;
		return false;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		AnimalRepository.createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		AnimalRepository.createNode(eventWriter, "name", String.valueOf(this.name));
		AnimalRepository.createNode(eventWriter, "maitCosts", String.valueOf(this.maintCosts));
		AnimalRepository.createNode(eventWriter, "precDanger", String.valueOf(this.precDanger));
		AnimalRepository.createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	public void decodeFromXml(Element element)
	{
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintCosts(Double.valueOf(element.getElementsByTagName("maintCosts").item(0).getTextContent()));
		setPrecDanger(Double.valueOf(element.getElementsByTagName("precDanger").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));

	}
}
