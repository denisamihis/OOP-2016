package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animlas.Aquatic.wT;
import repositories.AnimalRepository;

public abstract class Reptile extends Animal {
	protected boolean isUgly;
	protected boolean laysEggs;
	public Reptile(boolean isUgly, String name, int nrOfLegs,boolean laysEggs,double maintenanceCost,double dangPerc)
	{
		super(name,nrOfLegs, maintenanceCost, dangPerc);
		this.isUgly = isUgly;
		this.laysEggs=laysEggs;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		try {
			super.encodeToXml(eventWriter);
		} catch (XMLStreamExceptionMLStreamException e) {
			e.printStackTrace();
		}
		AnimalRepository.createNode(eventWriter,"laysEggs",String.valueOf(getLaysEggs()));
		AnimalRepository.createNode(eventWriter, "isUgly", String.valueOf(getisUgly()));
	}
	public void decodeFromXml(Element element){
		setisUgly(Boolean.valueOf(element.getElementsByTagName("isUgly").item(0).getTextContent()));
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
	public boolean getisUgly()
	{
		return isUgly;
	}
	public void setisUgly( boolean isUgly)
	{
		this.isUgly=isUgly;
	}
	public boolean getLaysEggs()
	{
		return laysEggs;
	}
	public void setLaysEggs( boolean laysEggs)
	{
		this.laysEggs=laysEggs;
	}
	

}
