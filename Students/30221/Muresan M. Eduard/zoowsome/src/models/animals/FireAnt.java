package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class FireAnt extends Insect{
	enum Role{queen, drone, other};
	private Role role; 
	public FireAnt()
	{
		super(false, true, "Unknown", 8, 0.1, 0.2);
		this.role = null;
	}
	public FireAnt(String name)
	{
		super(false, true, name, 8, 0.1, 0.2);
		setRandomRole();
	}
	//FireAnts hate Mondays, not big surprise
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
			return 0.5;
		return 0;
	}
	public Role getRole()
	{
		return role;
	}
	public void setRole(Role role)
	{
		this.role = role;
	}
	private void setRandomRole()
	{
		Random rand = new Random();
		switch(rand.nextInt(2))
		{
		case 0:
		{
			role = Role.queen;
			break;
		}
		case 1:
		{
			role = Role.drone;
			break;
		}
		default:
			role = Role.other;
		}
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"role", String.valueOf(this.role));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.FireAnt);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setRole(Role.valueOf(element.getElementsByTagName("role").item(0).getTextContent()));
	}
}
