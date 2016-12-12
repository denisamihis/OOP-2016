package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;;

public abstract class ZooFrame extends JFrame implements ZooFrama_I {
	protected JPanel contentPanel ;
	Clock clock = new Clock();
	public static final int HEIGHT = 500;
	public static final int WIDTH = 700;
	
	@Override
	public void goBack()
	{
		
	}
	
	public ZooFrame( String title ) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize( WIDTH, HEIGHT);
		setLayout( new BorderLayout() );
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		contentPanel = new JPanel();
		contentPanel.setBorder( new EmptyBorder( 5, 5, 5, 5 ));
		contentPanel.setBackground(Color.red);
		JFrame frame = new JFrame();
		frame.add(clock.time);
		frame.pack();
        frame.setVisible( true );
        frame.setBackground(Color.blue);
        clock.start();
		add( contentPanel , BorderLayout.CENTER);
		
	}
	
	public void setBackButtonActionListener ( ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout( new FlowLayout( FlowLayout.LEFT ));
		JButton backButton = new JButton( " Back ");
		buttonPanel.add( backButton );
		this.add( buttonPanel , BorderLayout.NORTH );
		backButton.addActionListener(a);
	}
}
