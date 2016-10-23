package models.animlas;

public class Dove extends Bird{
	
	public Dove( String name, int age){
		super(false,(float)1800 ," Columbidae", name, age);
	}
	public Dove ( ){
		super(false,(float)1800 ," Columbidae", "Unknown", 0);
	}
}
