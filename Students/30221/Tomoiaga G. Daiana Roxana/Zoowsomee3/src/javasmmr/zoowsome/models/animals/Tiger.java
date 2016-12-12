package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Date;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	public Tiger (int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Tiger(){
		super(5.7, 0.5);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(38.1f);
		setPercBodyHair(90.5f);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition(){
		Date currentDate = new Date();
		if (currentDate.getHours() >= 10 && currentDate.getHours() <18) {
			return 0.1;
		}
		return 0.0;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.Tiger);
		}
	

}
