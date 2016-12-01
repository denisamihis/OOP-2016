package javasmmr.zoowsome.repositories;

import org.w3c.dom.*;

import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.animals.Constants;
 
public class EmployeeRepository extends EntityRepository<Employees>{
	
	private static final String XML_FILENAME = "Employees.xml";
 
 	public EmployeeRepository() {
 		super(XML_FILENAME,Constants.XML_TAGS.EMPLOYEE);
 	}

 	@Override
 	protected Employees getEntityFromXmlElement(Element element) {
 		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
 	 		
 		switch (discriminant) {
 	 		case Constants.Employees.Caretaker:
 	 			Employees caretaker = new Caretaker();
 	 			caretaker.decodeFromXml(element);
 	 			return caretaker;
 	 		default:
 	 			break;
 	 		}
 	 		
 	 	return null;
 	}
 
 }