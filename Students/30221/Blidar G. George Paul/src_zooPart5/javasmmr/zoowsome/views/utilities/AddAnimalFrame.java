package javasmmr.zoowsome.views.utilities;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.Aligator;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Dinosaur;
import javasmmr.zoowsome.models.Dolphin;
import javasmmr.zoowsome.models.Eagle;
import javasmmr.zoowsome.models.Flamingo;
import javasmmr.zoowsome.models.Jellyfish;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Pelican;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Snake;
import javasmmr.zoowsome.models.Spider;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Wasp;
import javasmmr.zoowsome.views.AnimalList;
import javasmmr.zoowsome.views.ZooFrame;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AddAnimalFrame extends ZooFrame implements ActionListener {
	
	
	JButton addCow = new JButton("Add Cow");
	JButton addAligator = new JButton("Add Aligator");
	JButton addDinosaur = new JButton("Add Dinosaur");
	JButton addTiger = new JButton("Add Tiger");
	JButton addMonkey = new JButton("Add Monkey");
	JButton addButterfly = new JButton("Add Butterfly");
	JButton addDolphin = new JButton("Add Dolphin");
	JButton addEagle = new JButton("Add Eagle");
	JButton addFlamingo = new JButton("Add Flamingo");
	JButton addJellyfish = new JButton("Add Jellyfish");
	JButton addPelican = new JButton("Add Pelican");
	JButton addShark = new JButton("Add Shark");
	JButton addSnake = new JButton("Add Snake");
	JButton addSpider = new JButton("Add Spider");
	JButton addWasp = new JButton("Add Wasp");
	JLabel theLabel = new JLabel("Select a button!");
	AnimalList animalList = new AnimalList();
	
	public AddAnimalFrame(String title)
	{
		super(title);
		this.setLayout(new GridLayout(4,5,0,0));
		
		this.add(addCow);
		addCow.addActionListener(this);
		
		this.add(addAligator);
		addAligator.addActionListener(this);
		
		this.add(addDinosaur);
		addDinosaur.addActionListener(this);
		
		this.add(addTiger);
		addTiger.addActionListener(this);
		
		this.add(addMonkey);
		addMonkey.addActionListener(this);
		
		this.add(addButterfly);
		addButterfly.addActionListener(this);
		
		this.add(addDolphin);
		addDolphin.addActionListener(this);
		
		this.add(addEagle);
		addEagle.addActionListener(this);
		
		this.add(addFlamingo);
		addFlamingo.addActionListener(this);
		
		this.add(addPelican);
		addPelican.addActionListener(this);
		
		this.add(addJellyfish);
		addJellyfish.addActionListener(this);
		
		this.add(addShark);
		addShark.addActionListener(this);
		
		this.add(addSnake);
		addSnake.addActionListener(this);
		
		this.add(addSpider);
		addSpider.addActionListener(this);
		
		this.add(addWasp);
		addWasp.addActionListener(this);
		
		this.add(theLabel);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String command = evt.getActionCommand();
		if(command.equals("Add Aligator"))
		{
			Aligator aligator = new Aligator();
			animalList.animalsFromButton.add(aligator);
			theLabel.setText("You've just added an aligator to the array list!");
		}
		else if(command.equals("Add Cow"))
		{
			Cow cow = new Cow();
			animalList.animalsFromButton.add(cow);
			theLabel.setText("You've just added a cow to the array list!");
		}
		else if(command.equals("Add Dinosaur"))
		{
			Dinosaur dinosaur = new Dinosaur();
			animalList.animalsFromButton.add(dinosaur);
			theLabel.setText("You've just added a dinosaur to the array list!");
		}
		else if(command.equals("Add Tiger"))
		{
			Tiger tiger = new Tiger();
			animalList.animalsFromButton.add(tiger);
			theLabel.setText("You've just added a tiger to the array list!");
		}
		else if(command.equals("Add Monkey"))
		{
			Monkey monkey = new Monkey();
			animalList.animalsFromButton.add(monkey);
			theLabel.setText("You've just added a monkey to the array list!");
		}
		else if(command.equals("Add Butterfly"))
		{
			Butterfly butterfly = new Butterfly();
			animalList.animalsFromButton.add(butterfly);
			theLabel.setText("You've just added a butterfly to the array list!");
		}
		else if(command.equals("Add Dolphin"))
		{
			Dolphin dolphin = new Dolphin();
			animalList.animalsFromButton.add(dolphin);
			theLabel.setText("You've just added a dolphin to the array list!");
		}
		else if(command.equals("Add Eagle"))
		{
			Eagle eagle = new Eagle();
			animalList.animalsFromButton.add(eagle);
			theLabel.setText("You've just added an eagle to the array list!");
		}
		else if(command.equals("Add Flamingo"))
		{
			Flamingo flamingo = new Flamingo();
			animalList.animalsFromButton.add(flamingo);
			theLabel.setText("You've just added a flamingo to the array list!");
		}
		else if(command.equals("Add Pelican"))
		{
			Pelican pelican = new Pelican();
			animalList.animalsFromButton.add(pelican);
			theLabel.setText("You've just added a pelican to the array list!");
		}
		else if(command.equals("Add Jellyfish"))
		{
			Jellyfish jellyfish = new Jellyfish();
			animalList.animalsFromButton.add(jellyfish);
			theLabel.setText("You've just added a jellyfish to the array list!");
		}
		else if(command.equals("Add Shark"))
		{
			Shark shark = new Shark();
			animalList.animalsFromButton.add(shark);
			theLabel.setText("You've just added a shark to the array list!");
		}
		else if(command.equals("Add Snake"))
		{
			Snake snake = new Snake();
			animalList.animalsFromButton.add(snake);
			theLabel.setText("You've jsut added a snake to the array list!");
		}
		else if(command.equals("Add Spider"))
		{
			Spider spider = new Spider();
			animalList.animalsFromButton.add(spider);
			theLabel.setText("You've just added a spider to the array list!");
		}
		else if(command.equals("Add Wasp"))
		{
			Wasp wasp = new Wasp();
			animalList.animalsFromButton.add(wasp);
			theLabel.setText("You've just added a wasp to the array list!");
		}
	}

}
