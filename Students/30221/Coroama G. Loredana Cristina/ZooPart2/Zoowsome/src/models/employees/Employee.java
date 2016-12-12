package models.employees;

import static repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;


abstract public class Employee implements Caretaker_I, XML_Parsable{
private String name;
private static long id=(long) (Math.random() * 100000000000000L);


private BigDecimal  salary;
private boolean isDead=false;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static long getId() {
	return id;
}
public static void setId(long id) {
	Employee.id = id;
}
public BigDecimal getSalary() {
	return salary;
}
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}
public boolean isDead() {
	return isDead;
}

public void setDead(boolean isDead) {
	this.isDead = isDead;
}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {

	createNode(eventWriter, "name", String.valueOf(this.name));
	createNode(eventWriter, "id", String.valueOf(this.id));
	createNode(eventWriter, "salary", String.valueOf(this.salary));
	createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

public void decodeFromXml(Element element) {
	
	setName(element.getElementsByTagName("name").item(0).getTextContent());
	setId(Long.valueOf(element.getElementsByTagName( "id").item(0).getTextContent()));
	
	setDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
	}









}