package services.factories.animalFactory;

public class InvalidSpeciesException extends Exception{
	private String type;
	public InvalidSpeciesException(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}
}
