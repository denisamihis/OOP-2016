package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.repositories.AnimalRepository;

public abstract class Insect extends Animal{
	boolean canFly,isDangerous;
	public boolean getCanFly(){
		return canFly;
	}
	public void setCanFly(boolean canFly){
		canFly=this.canFly;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous){
		isDangerous=this.isDangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		AnimalRepository.createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
		}
}
