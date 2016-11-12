package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Snake extends Reptile {
	public Snake(){
		super(2.3,0.77);
		setNrOfLegs(0);
		setName("Snake");
		setLayEggs(Boolean.FALSE);
	}
	
	public Snake(Integer nrOfLegs,String name,Boolean layEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		Date date= new Date();
		if(date.getMonth()>=6 && date.getMonth()<=9)
			return 0.10;
		return 0.0;
	}
}
