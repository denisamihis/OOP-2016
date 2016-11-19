package repositories;

import java.io.File;
import animals.*;
import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import factories.Constants;
import interfaces.XML_Parsable;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);

	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Beetle:
			Animal beetle = new Beetle();
			beetle.decodeFromXml(element);
			return beetle;
		case Constants.Animals.Insects.RedAnt:
			Animal redAnt = new RedAnt();
			redAnt.decodeFromXml(element);
			return redAnt;
		case Constants.Animals.Insects.StingBee:
			Animal stingBee = new StingBee();
			stingBee.decodeFromXml(element);
			return stingBee;
		case Constants.Animals.Aquatics.JellyFish:
			Animal jellyFish = new JellyFish();
			jellyFish.decodeFromXml(element);
			return jellyFish;
		case Constants.Animals.Aquatics.KoiFish:
			Animal koiFish = new KoiFish();
			koiFish.decodeFromXml(element);
			return koiFish;
		case Constants.Animals.Aquatics.SeaTurtle:
			Animal seaturtle = new SeaTurtle();
			seaturtle.decodeFromXml(element);
			return seaturtle;
		case Constants.Animals.Birds.BlackSparrow:
			Animal blackSparrow = new BlackSparrow();
			blackSparrow.decodeFromXml(element);
			return blackSparrow;
		case Constants.Animals.Birds.Falcon:
			Animal falcon = new Falcon();
			falcon.decodeFromXml(element);
			return falcon;
		case Constants.Animals.Birds.Pelican:
			Animal pelican = new Pelican();
			pelican.decodeFromXml(element);
			return pelican;
		case Constants.Animals.Mammals.Lion:
			Animal lion = new Lion();
			lion.decodeFromXml(element);
			return lion;
		case Constants.Animals.Mammals.PolarBear:
			Animal polarBear = new PolarBear();
			polarBear.decodeFromXml(element);
			return polarBear;
		case Constants.Animals.Mammals.Racoon:
			Animal racoon = new Racoon();
			racoon.decodeFromXml(element);
			return racoon;
		case Constants.Animals.Reptiles.BlackMamba:
			Animal blackMamba = new BlackMamba();
			blackMamba.decodeFromXml(element);
			return blackMamba;
		case Constants.Animals.Reptiles.Cameleon:
			Animal cameleon = new Cameleon();
			cameleon.decodeFromXml(element);
			return cameleon;
		case Constants.Animals.Reptiles.Lizzard:
			Animal lizzard = new Lizzard();
			lizzard.decodeFromXml(element);
			return lizzard;

		default:
			break;
		}
		return null;

	}

	
}