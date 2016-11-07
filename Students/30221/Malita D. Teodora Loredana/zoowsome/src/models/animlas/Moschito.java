package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Moschito extends Insect {
	private boolean bites;
	public Moschito (String name, boolean bites){
		super( name, 4, true ,false,1.0,0.5);
		this.bites=bites;
	}
	public Moschito (){
		super( "Unknown", 4, true ,false,1.0,0.5);
		this.bites=false;
	}
	public boolean getBites()
	{
		return bites;
	}
	public void setBites(boolean bites)
	{
		this.bites=bites;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Insects.Moschito);
	}
	public void decodeFromXml(Element element){
		setBites(Boolean.valueOf(element.getElementsByTagName("bites").item(0).getTextContent()));
	}
}
