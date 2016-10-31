package models.animals;

public class Viper extends Reptile{
	private int nrOfLegs;
	private String name;
	public boolean laysEggs;
	public Viper(int nr, String n, boolean egg){
		nrOfLegs=nr;
		name=n;
		laysEggs=egg;
	}
	public Viper(){
		Viper viperobject= new Viper();}
	public void caracteristicipropri(){
		System.out.println("The viper  " + ((laysEggs==true) ? " it lays eggs":"it doesn't  lay eggs"));

	}
	public void saying(){
		System.out.println("The viper has "  + nrOfLegs + " legs");
		System.out.println("The viper name is " + name );
	}

}
