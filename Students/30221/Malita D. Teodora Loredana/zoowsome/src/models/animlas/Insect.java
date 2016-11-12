package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animlas.Aquatic.wT;
import repositories.AnimalRepository;

public abstract class Insect extends Animal {
	protected boolean fly;
	protected boolean isDangerous;
	public Insect ( String name, int nrOfLegs,boolean fly,boolean isDangerous,double maintenanceCost,double dangPerc){
		super(name,nrOfLegs, maintenanceCost, dangPerc);
		this.fly=fly;
		this.isDangerous=isDangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		try {
			super.encodeToXml(eventWriter);
		} catch (XMLStreamExceptionMLStreamException e) {
			e.printStackTrace();
		}
		AnimalRepository.createNode(eventWriter,"fly",String.valueOf(getCanFly()));
		AnimalRepository.createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}
	public void decodeFromXml(Element element){
		setCanFly(Boolean.valueOf(element.getElementsByTagName("fly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
	public boolean getCanFly()
	{
		return fly;
	}
	public void setCanFly(boolean fly)
	{
		this.fly=fly;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous=isDangerous;
	}
	

}
