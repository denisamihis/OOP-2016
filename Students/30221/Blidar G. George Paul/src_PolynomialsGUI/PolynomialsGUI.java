import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * This is the headline class of this program. It's a class which plays around with every single operation created in the other classes
 * It's a GUI class that opens up a window in which the user can select certain operations and see the result.
 * As always, I used it as a subclass of JPanel and it acts like a drawing surface ( as it is strongly recommanded to use JPanels
 * as drawing surfaces)
 */
public class PolynomialsGUI extends JPanel {
	
	/*
	 * The main class of this program simply opens up a JFrame window in which all JPanels will be put that will act as drawing surfaces
	 * or as containers for buttons and JTextFields
	 */
	public static void main(String[] args)
	{	
		JFrame window = new JFrame("Polynomials");
		PolynomialsGUI content = new PolynomialsGUI();
		window.setContentPane(content);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	/*
	 * These are the fields for the four operations below. In these fields the user cand input a number and then press the near button
	 * to do the selected operation
	 */
	private JTextField scalarMultiplyFirst; 
	private JTextField scalarMultiplySecond;
	private JTextField evaluateFirst;
	private JTextField evaluateSecond;
	
	/*
	 * The constructor of PolynomialsGUI class just puts the panels, the buttons and the JTextFields into the JFrame window
	 * using multiple Layouts
	 */
	public PolynomialsGUI()
	{
		this.setBackground(new Color(130,50,40));
		this.setLayout(new BorderLayout(3,3));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground( new Color(220,200,180) );
		this.add(buttonPanel, BorderLayout.NORTH);
		
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setBackground( new Color(220,200,180) );
		this.add(textFieldPanel, BorderLayout.SOUTH);
		
		PolynomialBoard board = new PolynomialBoard();
		board.setLayout(new GridLayout(8,1));
		this.add(board, BorderLayout.CENTER);

		JButton addButton = new JButton("Add");
		buttonPanel.add(addButton);
		addButton.addActionListener(board);
		
		JButton subButton = new JButton("Substract");
		buttonPanel.add(subButton);
		subButton.addActionListener(board);
		
		JButton multiplyButton = new JButton("Multiply");
		buttonPanel.add(multiplyButton);
		multiplyButton.addActionListener(board);
		
		JButton diferentiateFirstButton = new JButton("Diferentiate1");
		buttonPanel.add(diferentiateFirstButton);
		diferentiateFirstButton.addActionListener(board);
		
		JButton diferentiateSecondButton = new JButton("Diferentiate2");
		buttonPanel.add(diferentiateSecondButton);
		diferentiateSecondButton.addActionListener(board);
		
		JButton integrateFirstButton = new JButton("Integrate1");
		buttonPanel.add(integrateFirstButton);
		integrateFirstButton.addActionListener(board);
		
		JButton integrateSecondButton = new JButton("Integrate2");
		buttonPanel.add(integrateSecondButton);
		integrateSecondButton.addActionListener(board);
		
		JButton clearButton = new JButton("Clear");
		buttonPanel.add(clearButton);
		clearButton.addActionListener(board);
		
		////////////////////////////////////////////
		
		scalarMultiplyFirst = new JTextField("Input Here");
		textFieldPanel.add(scalarMultiplyFirst);
		scalarMultiplyFirst.addActionListener(board);
		
		JButton scalarMultiplyFirstButton = new JButton("ScalarMultiply1");
		textFieldPanel.add(scalarMultiplyFirstButton);
		scalarMultiplyFirstButton.addActionListener(board);
		
		scalarMultiplySecond = new JTextField("Input Here");
		textFieldPanel.add(scalarMultiplySecond);
		scalarMultiplySecond.addActionListener(board);
		
		JButton scalarMultiplySecondButton = new JButton("ScalarMultiply2");
		textFieldPanel.add(scalarMultiplySecondButton);
		scalarMultiplySecondButton.addActionListener(board);
		
		evaluateFirst = new JTextField("Input Here");
		textFieldPanel.add(evaluateFirst);
		evaluateFirst.addActionListener(board);
		
		JButton evaluateFirstButton = new JButton("Evaluate1");
		textFieldPanel.add(evaluateFirstButton);
		evaluateFirstButton.addActionListener(board);
		
		evaluateSecond = new JTextField("Input Here");
		textFieldPanel.add(evaluateSecond);
		evaluateSecond.addActionListener(board);
		
		JButton evaluateSecondButton = new JButton("Evaluate2");
		textFieldPanel.add(evaluateSecondButton);
		evaluateSecondButton.addActionListener(board);
		
	}
	
	/*
	 * This is a nested class which does all the work in this program as it acts as an action listener because it implements the
	 * ActionListener interface and it listens for events ( pushing buttons and entering numbers intro the JTextFields )
	 * I used JLabels instead of a paintComponent(Graphics g) method which could have drawn the same things using the special function
	 * g.drawString(String, x coordinate, y coordinate);
	 */
	private class PolynomialBoard extends JPanel implements ActionListener{
		
		String polynom1Display; // these two strings represents the string forms of the two polynomials
		String polynom2Display;
		JLabel firstPolynomDisplay; // these 4 labels are the messages that show that below them must be the resulted polynoms
		JLabel secondPolynomDisplay; // after doing some operations
		JLabel resultedPolynom;
		JLabel integratedPolynom;
		Functions function;
		Font font;
		Polynomial p1;
		Polynomial2 p2;
		OutcomePolynomial p3;
		IntegralPolynomial integralp4;
		
		/*
		 * The constructor sets the labels on the center panel ( the green one ) and also creates a font and a function class
		 */
		public PolynomialBoard()
		{
			font = new Font("Serif",Font.PLAIN,30);
			setBackground( new Color(0,120,0) );
			function = new Functions();
			
			JLabel firstPolynom = new JLabel();
			firstPolynom.setFont(font);
			firstPolynom.setText("The first polynomial is:");
			firstPolynom.setHorizontalAlignment(JLabel.CENTER);
			this.add(firstPolynom);
			
			p1 = new Polynomial();
			polynom1Display = p1.toString();
			
			firstPolynomDisplay = new JLabel();
			firstPolynomDisplay.setFont(font);
			firstPolynomDisplay.setText(polynom1Display);
			firstPolynomDisplay.setHorizontalAlignment(JLabel.CENTER);
			this.add(firstPolynomDisplay);
			
			JLabel secondPolynom = new JLabel();
			secondPolynom.setFont(font);
			secondPolynom.setText("The second polynomial is:");
			secondPolynom.setHorizontalAlignment(JLabel.CENTER);
			this.add(secondPolynom);
			
			p2 = new Polynomial2();
			polynom2Display = p2.toString();
			
			secondPolynomDisplay = new JLabel();
			secondPolynomDisplay.setFont(font);
			secondPolynomDisplay.setText(polynom2Display);
			secondPolynomDisplay.setHorizontalAlignment(JLabel.CENTER);
			this.add(secondPolynomDisplay);
			
			JLabel resultedMessage = new JLabel();
			resultedMessage.setFont(font);
			resultedMessage.setText("The resulted polynomial is:");
			resultedMessage.setHorizontalAlignment(JLabel.CENTER);
			this.add(resultedMessage);
			
			p3 = new OutcomePolynomial();
			
			resultedPolynom = new JLabel();
			resultedPolynom.setFont(font);
			resultedPolynom.setText("Please make an operation!");
			resultedPolynom.setHorizontalAlignment(JLabel.CENTER);
			this.add(resultedPolynom);
		
			JLabel integrationMessage = new JLabel();
			integrationMessage.setFont(font);
			integrationMessage.setText("The integrated polynomial is:");
			integrationMessage.setHorizontalAlignment(JLabel.CENTER);
			this.add(integrationMessage);
			
			integratedPolynom = new JLabel();
			integratedPolynom.setFont(font);
			integratedPolynom.setText("Please integrate one of the polynomials!");
			integratedPolynom.setHorizontalAlignment(JLabel.CENTER);
			this.add(integratedPolynom);
			
			integralp4 = new IntegralPolynomial();
		
	}
		
	/*
	 * These method respods everytime when the user clicks a button
	 * It gets the "string command" using the subroutine evt.getActionCommand() and then, depending on which button the user clicked
	 * it acts and does that operation
	 */
	public void actionPerformed(ActionEvent evt)
	{
		String command = evt.getActionCommand();
		
		if (command.equals("Add"))
		{
			p3 = function.add(p1, p2);
			resultedPolynom.setText(p3.toString());
		}
		else if (command.equals("Substract"))
		{
			p3 = function.substract(p1, p2);
			resultedPolynom.setText(p3.toString());
		}
		else if (command.equals("Multiply"))
		{
			p3 = function.multiply(p1, p2);
			resultedPolynom.setText(p3.toString());
		}
		else if (command.equals("Diferentiate1"))
		{
			p3 = function.diferentiate(p1);
			resultedPolynom.setText(p3.toString());
		}
		else if (command.equals("Diferentiate2"))
		{
			p3 = function.diferentiate2(p2);
			resultedPolynom.setText(p3.toString());
		}
		else if (command.equals("Integrate1"))
		{
			integralp4 = function.integration(p1);
			integratedPolynom.setText(integralp4.toString()+"+C");
		}
		else if (command.equals("Integrate2"))
		{
			integralp4 = function.integration2(p2);
			integratedPolynom.setText(integralp4.toString()+"+C");
		}
		else if (command.equals("ScalarMultiply1"))
		{
			try
			{
				int scalar1 = Integer.parseInt(scalarMultiplyFirst.getText());
				p3 = function.scalarMultiply(p1, scalar1);
				resultedPolynom.setText(p3.toString());
			}
			catch(NumberFormatException e)
			{
				resultedPolynom.setText("The scalar is not an integer number!");
			}
		}
		else if (command.equals("ScalarMultiply2"))
		{
			try
			{
				int scalar2 = Integer.parseInt(scalarMultiplySecond.getText());
				p3 = function.scalarMultiply(p1, scalar2);
				resultedPolynom.setText(p3.toString());
			}
			catch(NumberFormatException e)
			{
				resultedPolynom.setText("The scalar is not an integer number!");
			}
		}
		else if (command.equals("Evaluate1"))
		{
			try
			{
				long theResult;
				String theResultString;
				int scalar3 = Integer.parseInt(evaluateFirst.getText());
				theResult = function.evaluatePolynom1(p1, scalar3);
				theResultString = Long.toString(theResult);
				resultedPolynom.setText(theResultString);
			}
			catch(NumberFormatException e)
			{
				resultedPolynom.setText("The value is not an integer number!");
			}
		}
		else if (command.equals("Evaluate2"))
		{
			try
			{
				long theResult;
				String theResultString;
				int scalar4 = Integer.parseInt(evaluateSecond.getText());
				theResult = function.evaluatePolynom2(p2, scalar4);
				theResultString = Long.toString(theResult);
				resultedPolynom.setText(theResultString);
			}
			catch(NumberFormatException e)
			{
				resultedPolynom.setText("The value is not an integer number!");
			}
		}
		else if (command.equals("Clear"))
		{
			resultedPolynom.setText("Please make an operation!");
			integratedPolynom.setText("Please integrate one of the polynoms!");
		}
	}	
	}
}