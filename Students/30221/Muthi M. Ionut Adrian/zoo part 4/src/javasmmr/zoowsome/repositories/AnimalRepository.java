package javasmmr.zoowsome.repositories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;;

public class AnimalRepository extends EntityRepository<Animal> {
	
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		super(XML_FILENAME,Constants.XML_TAGS.ANIMAL);
	}
	
	
	


	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant =element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
				switch (discriminant) {
				
				
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					return butterfly;
					
				
				case Constants.Animals.Insects.Bee:
					Animal bee=new Bee();
					bee.decodeFromXml(element);
					return bee;
				
					
				  case Constants.Animals.Insects.Bug:
					   Animal bug=new Bug();
					   bug.decodeFromXml(element);
					   return bug;
				
					   
				   case  Constants.Animals.Aquatics.Dolphin:
					   Animal dolphin=new Dolphin();
					   dolphin.decodeFromXml(element);
					   return dolphin;
					
					   
				   case Constants.Animals.Aquatics.Octopus:
					   Animal octopus=new Octopus();
					   octopus.decodeFromXml(element);
					   return octopus;
					 
					   
				   case Constants.Animals.Aquatics.Shark:
					   Animal shark=new Shark();
					   shark.decodeFromXml(element);
					   return shark;
					 
					   
				   case Constants.Animals.Birds.Eagle:
					   Animal eagle=new Eagle();
					   eagle.decodeFromXml(element);
					   return eagle;
					 
					 
				   case Constants.Animals.Birds.Parrot:
					   Animal parrot=new Parrot();
					   parrot.decodeFromXml(element);
					   return parrot;
					   
					   
				   case Constants.Animals.Birds.Tucan:
					   Animal tucan=new Tucan();
					   tucan.decodeFromXml(element);
					   return tucan;
					  
				   case Constants.Animals.Mammals.Lion :
					   Animal lion=new Lion();
					   lion.decodeFromXml(element);
					   return lion;
					
					   
				   case Constants.Animals.Mammals.Panther:
					   Animal panther=new Panther();
					   panther.decodeFromXml(element);
					   return panther;
					  
					   
				   case Constants.Animals.Mammals.Tiger:
					   Animal tiger=new Tiger();
					   tiger.decodeFromXml(element);
					   return tiger;
					 
					   
				   case Constants.Animals.Reptiles.Chameleon:
					   Animal chameleon=new Chameleon();
					   chameleon.decodeFromXml(element);
					   return chameleon;
					 
					   
				   case Constants.Animals.Reptiles.Lizard:
					   Animal lizard=new Lizard();
					   lizard.decodeFromXml(element);
					   return lizard;
					   
				   case Constants.Animals.Reptiles.Snake:
					   Animal snake=new Snake();
					   snake.decodeFromXml(element);
					   return snake;
					  
						
				
				default:break;
				}
				return null;
	}
	
	
	
	
	
}


