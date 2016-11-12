package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Spider extends Insect {
	private boolean beautiful;
	public Spider (String name, boolean beautiful){
		super(name, 8, false ,true,3.05,0.75);
		this.beautiful=beautiful;
	}
	public Spider (){
		super( "Unknown", 8, false ,true,3.05,0.75);
		this.beautiful=false;
	}
	public boolean getBeautiful()
	{
		return beautiful;
	}
	public void setBeautiful(boolean beautiful)
	{
		this.beautiful=beautiful;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Insects.Spider);
	}
	public void decodeFromXml(Element element){
		setBeautiful(Boolean.valueOf(element.getElementsByTagName("beautiful").item(0).getTextContent()));
	}

}
