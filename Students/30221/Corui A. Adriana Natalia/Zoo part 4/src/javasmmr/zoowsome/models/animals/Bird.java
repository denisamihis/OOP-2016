package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Bird extends Animal{

	public Bird(double maintCosts,double precDanger) {
		super(maintCosts,precDanger);
		// TODO Auto-generated constructor stub
	}
	private boolean migrates;
	private int avgFlyAltitude;
	public int getAvgFlyAltitude()
	{
		return avgFlyAltitude;
	}
	public void setAvgFlyAltitude(int avgFlyAltitude)
	{
		this.avgFlyAltitude=avgFlyAltitude;
	}
	public boolean getMigration()
	{
		return migrates;
	}
	public void setMigration(boolean migrates)
	{
		this.migrates=migrates;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "avgFlyAltitude", String.valueOf(getAvgFlyAltitude()));
		AnimalRepository.createNode(eventWriter, "migrates", String.valueOf(getMigration()));
		
	}
	@Override
	public void decodeFromXml(Element element) {
		setAvgFlyAltitude(Integer.valueOf(element.getElementsByTagName("avgFlyAltitude").item(0).getTextContent()));
		setMigration(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		
	}
}
