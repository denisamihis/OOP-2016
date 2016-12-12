package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Reptile extends Animal{

	public Reptile(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
	private boolean layEggs;
	public boolean getEgg()
	{
		return layEggs;
	}
	public void setEgg(boolean layEggs)
	{
		this.layEggs=layEggs;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "layEggs", String.valueOf(getEgg()));
		
	}
	@Override
	public void decodeFromXml(Element element) {
		setEgg(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));
		
	}
}
