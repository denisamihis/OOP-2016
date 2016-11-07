package javasmmr.zoowsome.models.employees;
import java.math.*;
import static javasmmr.zoowsome.repositories.EmployeeRepository. createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable{
          protected String name;
          protected Long id;
          protected BigDecimal Salary;
          protected boolean isDead;
          
          public Employee(String name,Long id,BigDecimal Salary){
        	  this.name=name;
        	  this.id=id;
        	  this.Salary=Salary;
        	  isDead=false;
          }
          
          public void setId(long i){
        	  this.id=i;
          }
          public void setSalary(BigDecimal salary){
        		this.Salary = salary;		 
          }
          public void setIsDead(boolean dead){
        	  this.isDead=dead;
          }
          
          public String getName(){
        	  return name;
          }
          public void setName(String nume){
        	  this.name=nume;
          }
          public Long getId(){
        	  return id;
          }
          
          public BigDecimal getSalary(){
        	  return Salary;
          }
          
          public boolean getIsDead(){
        	  return isDead;
          }
          
          public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
        	  		createNode(eventWriter, "name", String.valueOf(this.name));
        	  		createNode(eventWriter, "ID", String.valueOf(this.id));
        	  		createNode(eventWriter, "salary", String.valueOf(this.Salary));
        	  		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
        	  		
        	  	}
        	  	public void decodeFromXml(Element element){
        	  		setName(element.getElementsByTagName("name").item(0).getTextContent());
        	  		setId(Long.valueOf(element.getElementsByTagName("Id").item(0).getTextContent()));
        	  		setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
        	  		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
        	  	}
        	   }		  
