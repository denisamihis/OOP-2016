package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Snake extends Reptile {
	public Snake (int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Snake (){
		super(4.6, 0.8);
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition(){
		Date currentDate = new Date();
		if (currentDate.getMonth() >= 5 && currentDate.getMonth() <=8) {
			return 0.1;
		}
		return 0.0;
	}
	

}
