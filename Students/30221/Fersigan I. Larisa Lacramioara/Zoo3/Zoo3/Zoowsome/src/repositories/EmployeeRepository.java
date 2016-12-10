package repositories;

import javax.swing.text.Element;

import models.employees.Employee;
import models.employees.Luca;
import models.employees.Larisa;
import models.employees.Ionut;

import services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee>{
	private static final String XML_FILENAME = "Employee.xml";
	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}
	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		// TODO Auto-generated method stub
		String discriminant =((org.w3c.dom.Element) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employee.Caretaker.Luca:
			Employee ob1 = new Luca();
			ob1.decodeFromXml((org.w3c.dom.Element) element);
			return ob1;
			case Constants.Employee.Caretaker.Larisa:
				Employee ob2 = new Larisa();
				ob2.decodeFromXml((org.w3c.dom.Element) element);
				return ob2;
			case Constants.Employee.Caretaker.Ionut:
				Employee ob3 = new Ionut();
				ob3.decodeFromXml((org.w3c.dom.Element) element);
				return ob3;
		default:
			break;
			}
			return null;
			
		}
		
	
	
	
	}