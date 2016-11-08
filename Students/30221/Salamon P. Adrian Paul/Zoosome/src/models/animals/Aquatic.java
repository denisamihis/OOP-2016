package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private WaterType waterType;

	public Aquatic(Double maintaneanceCost, double percKill) {
		super(maintaneanceCost, percKill);

	}
	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgSwimDepth",String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter,"waterType",String.valueOf(getWaterType()));
		
	}
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		
	}
	

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
}
