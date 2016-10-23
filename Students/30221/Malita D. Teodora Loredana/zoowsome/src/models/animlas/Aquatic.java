package models.animlas;

public abstract class Aquatic extends Animal{
	protected int avgSwimDepth;
	enum wT{saltWater, freshWater};
	protected wT waterType;
	public Aquatic(int avgSwimDepth,wT waterType,String scientificName, String name, int age)
	{
		super(scientificName, name, age);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;	
	}
	public int getDepth (){
		return avgSwimDepth;
	}
	public void setDepth( int avgSwimDepth){
		this.avgSwimDepth= avgSwimDepth;
	}
	public wT getWaterType()
	{
		return waterType;
	}
	public void setWaterType(wT waterType){
		this.waterType=waterType;
	}

}
