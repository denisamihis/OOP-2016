package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Aquatic extends Animal{

	public Aquatic(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
	private int avgSwimDepth;
	private WaterType waterType;
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth)
	{
		this.avgSwimDepth=avgSwimDepth;
	}
	public WaterType getWaterType()
	{
		return waterType;
	}
	public void setWaterType(WaterType waterType)
	{
		this.waterType=waterType;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		AnimalRepository.createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
