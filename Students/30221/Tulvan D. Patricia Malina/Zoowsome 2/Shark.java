package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Shark extends Aquatic{

	public Shark(){
		super(5.2,0.75);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Shark(Integer nrOfLegs,String name,Integer avgSwimDepth, WaterType waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		Date date= new Date();
		if(date.getHours()>=22 && date.getHours()<=8)
			return 0.2;
		return 0.0;
	}
}
