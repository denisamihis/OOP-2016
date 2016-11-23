package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Butterfly extends Insect {
	private boolean beautiful;
	public Butterfly (String name,  boolean beautiful){
		super(name, 8, true ,false,2.0,0.2);
		this.beautiful=beautiful;
	}
	public Butterfly (){
		super( "Unknown", 8, true ,false,2.0,0.2);
		this.beautiful=true;
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
		AnimalRepository.createNode(eventWriter,"beautiful",String.valueOf(getBeautiful()));
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Insects.Butterfly);
	}
	public void decodeFromXml(Element element){
		setBeautiful(Boolean.valueOf(element.getElementsByTagName("beautiful").item(0).getTextContent()));
	}
	
	


}
