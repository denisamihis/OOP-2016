package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Mammal extends Animal {

	public Mammal(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
	private float normalBodyTemp;
	private float precBodyHair;
	public float getBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setBodyTemp(float normalBodyTemp)
	{
		this.normalBodyTemp=normalBodyTemp;
	}
	public float getPrecBodyHair()
	{
		return precBodyHair; 
	}
	public void setPrecBodyHair(float precBodyHair)
	{
		this.precBodyHair=precBodyHair;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "normalBodyTemp", String.valueOf(getBodyTemp()));
		AnimalRepository.createNode(eventWriter, "precBodyHair", String.valueOf(getPrecBodyHair()));
		
	}
	@Override
	public void decodeFromXml(Element element) {
		setPrecBodyHair(Integer.valueOf(element.getElementsByTagName("precBodyHair").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
