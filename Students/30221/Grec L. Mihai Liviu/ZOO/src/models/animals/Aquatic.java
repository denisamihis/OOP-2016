package models.animals;
import static repositories.AnimalRepository.createNode;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal{
	private Integer avgSwimDepth;
	private WaterType waterType;
	protected Aquatic(Double maintenanceCost , Double dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public WaterType getWaterType(){
		return waterType;
	}
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public void setWaterType(WaterType waterType){
		this.waterType = waterType;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth" , String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType" , String.valueOf(getWaterType()));
	}
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepyh").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("avgSwimDepyh").item(0).getTextContent()));
	}
}
