package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.views.utilities.FrameStack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {
	
	protected JPanel contentPanel;

	public ZooFrame(String title)
	{
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(500,700);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel.setBackground(Color.red);
		add(contentPanel,BorderLayout.CENTER);
	}
	
	public void setBackButtonActionListener(ActionListener a)
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
		buttonPanel.add(backButton);
		this.add(buttonPanel,BorderLayout.NORTH);
		backButton.addActionListener(a);
	}
	
	
	@Override
	public void goBack()
	{
	
	}

}
