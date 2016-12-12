package javasmmr.zoowsome.repositories;

import java.io.File;


import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee>{

	private static final String XML_FILENAME="Employees.xml";
	
	public EmployeeRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	
	public ArrayList<Employee> load()
			throws ParserConfigurationException,SAXException, IOException{
		
		ArrayList<Employee> employees= new ArrayList<Employee>();
		File fXmlFile= new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
		org.w3c.dom.Document doc= dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize(); 
		NodeList nodeList= doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
		
		for (int i=0; i< nodeList.getLength(); i++){
			Node node= nodeList.item(i);
			if (node.getNodeType()== Node.ELEMENT_NODE){
				Element element= (Element) node;
				String discriminant =
						element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				if (discriminant== Constants.Employees.Caretaker){
				Employee caretaker= new Caretaker();
				caretaker.decodeFromXml(element);
				employees.add(caretaker);
				
			}
			
			}
		}
		return employees;
	}
	



	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant=
				element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant){
		case Constants.Employee.Caretaker:
			Employee caretaker= new Caretaker();
			caretaker.decodeFromXml(element);
			return caretaker;
		default:
			break;
		}
		return null;
	}
	
	
}
