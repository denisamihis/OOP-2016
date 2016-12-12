package models.animals;

import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

abstract public class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	public void getAnimal(String name){
		this.getAnimal("animal");
		}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(int legsNr){
		nrOfLegs=legsNr;
	}
	public String getName(){
		return name;
	}
	public void setName(String nume){
		name=nume;
	}
	public final double maintenanceCost;
	public final double dangerPerc;
	public Animal(double mc,double dp ){
		maintenanceCost=mc;
		dangerPerc=dp;
	}
	private boolean takeCareOf=false;
	
	public boolean isTakeCareOf() {
		return takeCareOf;
	}
	public void setTakeCareOf(boolean takeCareOf) {
		this.takeCareOf = takeCareOf;
	}
	
	public static void main(String[] args) throws Exception {
	/*	Tiger tigerObject = new Tiger(4,"pisi",0,0);
		tigerObject.saying();
		tigerObject.caracteristicipropri();
		Monkey monkeyObject = new Monkey(4,"Orlando",0,0);
		monkeyObject.saying();
		monkeyObject.caracteristicipropri();
		Cow cowObject = new Cow(4,"Joiana",0,0);
		cowObject.saying();
		cowObject.caracteristicipropri();
		Butterfly butterflyobject= new Butterfly(8,"butterfly",true,false);
		butterflyobject.saying();
		butterflyobject.caracteristicipropri();
		Spider spiderobject= new Spider(8,"spider",false,true);
		spiderobject.saying();
		spiderobject.caracteristicipropri();
		Cockroach cockroachobject = new Cockroach(6,"gandac",false,true);
		cockroachobject.saying();
		cockroachobject.caracteristicipropri();
		Parrots parrotobject= new Parrots(2,"Paco",true,10);
		parrotobject.saying();
		parrotobject.caracteristicipropri();
		Pinguin pinguinobject= new Pinguin(2,"Pingu",false,0);
		pinguinobject.saying();
		pinguinobject.caracteristicipropri();
		Stork storkobject= new Stork(2,"barza",true,30);
		storkobject.saying();
		storkobject.caracteristicipropri();
		Dolphin dolphinobject= new Dolphin(0,"Joey",500);
		dolphinobject.saying();
		dolphinobject.caracteristicipropri();
		
		
		
		
		
	
		
		Chameleon chameleonobject= new Chameleon(2,"cameleon",false);
		chameleonobject.saying();
		chameleonobject.caracteristicipropri();
		Frog frogobject= new Frog(4,"Oacky",true);
		frogobject.saying();
		frogobject.caracteristicipropri();
		Viper viperobject= new Viper(0,"vipera",true);
		viperobject.saying();
		viperobject.caracteristicipropri();
		
	}}
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Cow);
		System.out.printf("We have an animal with %d legs!\n", + a1.getNrOfLegs());
		}}*/
	}
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	}
		
		
		