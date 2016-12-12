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

import javasmmr.zoowsome.models.animals.*;



import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal>{

	private static final String XML_FILENAME="Animals.xml";
	public AnimalRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	public ArrayList<Animal> load()
	throws ParserConfigurationException,SAXException, IOException
	{
		ArrayList<Animal> animals= new ArrayList<Animal>();
		
		File fXmlFile= new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
		org.w3c.dom.Document doc= dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize(); 
		
		NodeList nodeList= doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		
		for (int i=0; i< nodeList.getLength(); i++){
			Node node= nodeList.item(i);
			if (node.getNodeType()== Node.ELEMENT_NODE){
				Element element= (Element) node;
				String discriminant =
						element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch (discriminant){
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly= new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach= new Cockroach();
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
				case Constants.Animals.Insects.Spider:
					Animal spider= new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
				case Constants.Animals.Aquatics.Dolphin:
					Animal dolphin= new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
				case Constants.Animals.Aquatics.Shark:
					Animal shark= new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
				case Constants.Animals.Aquatics.Tuna:
					Animal tuna= new Tuna();
					tuna.decodeFromXml(element);
					animals.add(tuna);
				case Constants.Animals.Birds.Eagle:
					Animal eagle= new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);
				case Constants.Animals.Birds.Ostrich:
					Animal ostrich= new Ostrich();
					ostrich.decodeFromXml(element);
					animals.add(ostrich);
				case Constants.Animals.Birds.Phoenix:
					Animal phoenix= new Phoenix();
					phoenix.decodeFromXml(element);
					animals.add(phoenix);
				case Constants.Animals.Mammals.Cow:
					Animal cow= new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
				case Constants.Animals.Mammals.Tiger:
					Animal tiger= new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
				case Constants.Animals.Mammals.Monkey:
					Animal monkey= new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
				case Constants.Animals.Reptiles.Chameleon:
					Animal chameleon= new Chameleon();
					chameleon.decodeFromXml(element);
					animals.add(chameleon);
				case Constants.Animals.Reptiles.Crocodile:
					Animal crocodile= new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
				case Constants.Animals.Reptiles.Lizard:
					Animal lizard= new Lizard();
					lizard.decodeFromXml(element);
					animals.add(lizard);
				default:
					break;
				}
			}
		}
		return animals;
	}
	


	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant=
				element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
			switch(discriminant){
			case Constants.Animals.Insects.Butterfly:
				Animal butterfly= new Butterfly();
				butterfly.decodeFromXml(element);
				return butterfly;
			case Constants.Animals.Insects.Cockroach:
				Animal cockroach= new Cockroach();
				cockroach.decodeFromXml(element);
				return cockroach;
			case Constants.Animals.Insects.Spider:
				Animal spider= new Spider();
				spider.decodeFromXml(element);
				return spider;
			case Constants.Animals.Aquatics.Dolphin:
				Animal dolphin= new Dolphin();
				dolphin.decodeFromXml(element);
				return dolphin;	
			case Constants.Animals.Aquatics.Shark:
				Animal shark= new Shark();
				shark.decodeFromXml(element);
				return shark;
			case Constants.Animals.Aquatics.Tuna:
				Animal tuna= new Tuna();
				tuna.decodeFromXml(element);
				return tuna;
			case Constants.Animals.Birds.Eagle:
				Animal eagle= new Eagle();
				eagle.decodeFromXml(element);
				return eagle;
			case Constants.Animals.Birds.Ostrich:
				Animal ostrich= new Ostrich();
				ostrich.decodeFromXml(element);
				return ostrich;
			case Constants.Animals.Birds.Phoenix:
				Animal phoenix= new Phoenix();
				phoenix.decodeFromXml(element);
				return phoenix;
			case Constants.Animals.Mammals.Cow:
				Animal cow= new Cow();
				cow.decodeFromXml(element);
				return  cow;
			case Constants.Animals.Mammals.Monkey:
				Animal monkey= new Monkey();
				monkey.decodeFromXml(element);
				return  monkey;
			case Constants.Animals.Mammals.Tiger:
				Animal tiger= new Tiger();
				tiger.decodeFromXml(element);
				return  tiger;
			case Constants.Animals.Reptiles.Chameleon:
				Animal chameleon= new Chameleon();
				chameleon.decodeFromXml(element);
				return  chameleon;
			case Constants.Animals.Reptiles.Crocodile:
				Animal crocodile= new Crocodile();
				crocodile.decodeFromXml(element);
				return  crocodile;
			case Constants.Animals.Reptiles.Lizard:
				Animal lizard= new Lizard();
				lizard.decodeFromXml(element);
				return  lizard;
				default:
					break;
			}
		return null;
	}
	
	
}
