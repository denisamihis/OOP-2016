package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;


import javax.swing.*;
import javax.swing.Timer;

public class Clock {
	final JLabel time = new JLabel();
	private final SimpleDateFormat hms = new SimpleDateFormat("hh:mm:ss");
	private int currentSecond;
	private Calendar calendar;
	public Clock(){
		
	}
	
	private void reset(){
		calendar = Calendar.getInstance();
		currentSecond = calendar.get(Calendar.SECOND);
	}
	
	public void start() {
		  reset();
	      Timer timer = new Timer(1000, new ActionListener(){
	        public void actionPerformed( ActionEvent e ) {
	                if( currentSecond == 60 ) {
	                    reset();
	                }
	                time.setText( String.format("%s:%02d", hms.format(calendar.getTime()), currentSecond ));
	                currentSecond++;
	            }
	        });
	        timer.start();
	    }
}
