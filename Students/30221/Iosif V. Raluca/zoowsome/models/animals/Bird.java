package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public Integer getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates=migrates;
	}
	
	public void setAvgFlightAltitude(int altitude){
		avgFlightAltitude=altitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"migrates", String.valueOf(getMigrates()));
		createNode(eventWriter,"avgFlightAltitude",String.valueOf(getAvgFlightAltitude()));
		
	}
	
	public void decodeFromXml(Element element){
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));

	}
		
	}

