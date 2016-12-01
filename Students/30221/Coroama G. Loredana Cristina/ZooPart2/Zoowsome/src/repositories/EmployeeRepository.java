package repositories;

import javax.swing.text.Element;

import models.employees.Employee;
import models.employees.Lisbon;
import models.employees.Roger;
import models.employees.Teresa;

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
		case Constants.Employee.Caretaker.LISBON:
			Employee ob1 = new Lisbon();
			ob1.decodeFromXml((org.w3c.dom.Element) element);
			return ob1;
			case Constants.Employee.Caretaker.TERESA:
				Employee ob2 = new Teresa();
				ob2.decodeFromXml((org.w3c.dom.Element) element);
				return ob2;
			case Constants.Employee.Caretaker.ROGER:
				Employee ob3 = new Roger();
				ob3.decodeFromXml((org.w3c.dom.Element) element);
				return ob3;
		default:
			break;
			}
			return null;
			
		}
		
	
	
	
	}


