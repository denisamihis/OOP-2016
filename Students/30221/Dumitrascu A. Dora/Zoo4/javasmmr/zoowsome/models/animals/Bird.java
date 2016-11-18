package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract class Bird extends Animal{
	protected boolean migrates;
	protected int avgFlightAltitude;
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getFlightAltitude()));
	}
	
	public void decodeFromXml(Element element) {
		setCare(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setCare(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		}
	
	public Bird(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates=migrates;
	}
	
	public int getFlightAltitude(){
		return avgFlightAltitude;
	}
	
	public void setFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
