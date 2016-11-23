package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.repositories.AnimalRepository;

public abstract class Birds extends Animal{
boolean migrates;
int avgFlightAltitude;
public boolean getMigrates(){
	return migrates;
}
public void setMigrates(boolean migrates){
	migrates=this.migrates;
}
public int getAvgFlightAltitude(){
	return avgFlightAltitude;
}
public void setAvgFlightAltitude(int avgFlightAltitude){
	avgFlightAltitude=this.avgFlightAltitude;
}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	super.encodeToXml(eventWriter);
	AnimalRepository.createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
	AnimalRepository.createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}
}

