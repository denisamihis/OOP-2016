package javasmmr.zoowsome.models.animals;
import javax.xml.stream.XMLEventWriter;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.repositories.AnimalRepository;
public abstract class Mammals extends Animal {
private float normalBodyTemp;
private float percBodyHair;
public float getBodyTemp(){
	return normalBodyTemp;
}
public void setNormalBodyTemp(float normalBodyTemp){
	normalBodyTemp=this.normalBodyTemp;
}
public float getPercBodyHair (){
	return percBodyHair;
}
public void setPercBodyHair(float percBodyHair){
	percBodyHair=this.percBodyHair;
}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	super.encodeToXml(eventWriter);
	AnimalRepository.createNode(eventWriter, "normalBodyTemp", String.valueOf(getBodyTemp()));
	AnimalRepository.createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}
}
