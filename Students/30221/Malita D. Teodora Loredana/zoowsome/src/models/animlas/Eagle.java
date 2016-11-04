package models.animlas;

public class Eagle extends Bird {
	public Eagle( String name){
		super(false,(float)1800, name, 2,5.6,0.4);
	}
	public Eagle ( ){
		super(false,(float)1800 , "Unknown", 2,5.6,0.4);
	}
}
