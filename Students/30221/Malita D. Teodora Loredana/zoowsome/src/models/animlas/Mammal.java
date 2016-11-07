package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animlas.Aquatic.wT;
import repositories.AnimalRepository;

public abstract class Mammal extends Animal{
	protected float bodyTemp;
	protected boolean isDangerous;
	public Mammal (float bodyTemp, boolean isDangerous, String name, int nrOfLegs,double maintenanceCost,double dangPerc){
		super(name,nrOfLegs,maintenanceCost, dangPerc);
		this.bodyTemp=bodyTemp;
		this.isDangerous=isDangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		try {
			super.encodeToXml(eventWriter);
		} catch (XMLStreamExceptionMLStreamException e) {
			e.printStackTrace();
		}
		AnimalRepository.createNode(eventWriter,"bodyTemp",String.valueOf(getBodyTemp()));
		AnimalRepository.createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}
	public void decodeFromXml(Element element){
		setBodyTemp(Float.valueOf(element.getElementsByTagName("bodyTemp").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	public float getBodyTemp ()
	{
		return bodyTemp;
	}
	public void setBodyTemp (float bodyTemp)
	{
		this.bodyTemp=bodyTemp;
	}

}
