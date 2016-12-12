package controllers;

import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JScrollPane;

import models.animlas.*;
import views.ZooFrame;

public class ListFrame extends ZooFrame {
	public ListFrame (String title, ArrayList<Animal> zoo) {
		super(title);
		JList<Animal> list1 = new JList<>(zoo.toArray(new Animal[0]));
		JScrollPane scrollPane = new JScrollPane( list1 );
		getContentPane().add(scrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true); 
		
	}

}
