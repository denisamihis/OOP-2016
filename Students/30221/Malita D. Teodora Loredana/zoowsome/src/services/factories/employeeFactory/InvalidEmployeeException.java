package services.factories.employeeFactory;

public class InvalidEmployeeException extends Exception{
	private String type;
	public InvalidEmployeeException (String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}


}
