package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal{
	public Bird(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public boolean migrates;		//Does it migrate or not?
	public int avgFlightAltitude;		//Average flight altitude
	public boolean isMigrates() {
		return migrates;
	}
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter); 
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));  
		createNode(eventWriter, "migrates", String.valueOf(isMigrates()));  
		}
	public void decodeFromXml(Element element) { 
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent())); 
	setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
	}  
}
