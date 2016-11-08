package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal{
	public Aquatic(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public int avgSwimDepth;	//Average swim depth
	public WaterType type;		
		
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter); 
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));  
		createNode(eventWriter, "WaterType", String.valueOf(type.toString()));  
		}
	public void decodeFromXml(Element element) { 
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent())); 
	setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("WaterType").item(0).getTextContent()));
	}  
	
	}
		
		


