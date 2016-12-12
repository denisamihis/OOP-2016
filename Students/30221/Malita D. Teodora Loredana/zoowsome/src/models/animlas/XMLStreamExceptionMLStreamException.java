package models.animlas;

public class XMLStreamExceptionMLStreamException extends Exception { 
	String type;
	public XMLStreamExceptionMLStreamException(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}

}
