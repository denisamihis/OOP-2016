package animals;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import static repositories.AnimalRepository.createNode;

public abstract class Aquatic extends Animal {

	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Integer avgSwimDepth;

	public enum wType {
		Freshwater, Saltwater
	}

	private wType waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public wType getWaterType() {
		return waterType;
	}

	public void setWaterType(wType waterType) {
		this.waterType = waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth"). item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}
}
