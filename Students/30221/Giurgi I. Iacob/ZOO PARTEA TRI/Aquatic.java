package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
//import org.w3c.dom.Element;
import javax.xml.stream.*;

import org.w3c.dom.Element;
public abstract class Aquatic extends Animal {
	protected int avgSwimDepth;
	enum Water{
		Saltwater, Freshwater;
	}
	protected Water watertype;
	public Aquatic(int avg,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.avgSwimDepth=avg;
	
	}
	public void setWater(Water watertype){
		this.watertype=watertype;
	}
	public void setAvgSwimDepth(int avg){
	   this.avgSwimDepth=avg;
	}
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}

	
	public Water getWaterType(){
		return watertype;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		 		super.encodeToXml(eventWriter);
		 		createNode(eventWriter, "avgSwimDepth" , String.valueOf(getAvgSwimDepth()));
		 		createNode(eventWriter, "waterType" , String.valueOf(getWaterType()));
		 	}
	
	public void decodeFromXml(Element element){
		 		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepyh").item(0).getTextContent()));
		 		setWater(Water.valueOf(element.getElementsByTagName("avgSwimDepyh").item(0).getTextContent()));
		 	}
		  }		  

