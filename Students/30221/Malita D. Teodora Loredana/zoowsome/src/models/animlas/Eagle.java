package models.animlas;

public class Eagle extends Bird {
	public Eagle( String name, int age){
		super(false,(float)1800 ,"Haliaeetus", name, age);
	}
	public Eagle ( ){
		super(false,(float)1800 ," Haliaeetus", "Unknown", 0);
	}
}
