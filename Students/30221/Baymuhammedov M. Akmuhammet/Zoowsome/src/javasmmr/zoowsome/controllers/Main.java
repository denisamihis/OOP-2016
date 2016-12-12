package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;
import javasmmr.zoowsome.views.*;
import java.util.Scanner;
public class Main {
	
            public static void main(String[] arg) throws Throwable{
            Scanner in = new Scanner(System.in);
            System.out.println("Welcome to Zoowsome!");
            System.out.println("type:\n1: Mammals\n2: Reptiles\n3: Aquatics\n4: Birds\n5: Insects");
			int key = in.nextInt();
			do{
				if(key==1){
				Mammalsview m = new Mammalsview();
				m.Mammalsview();
				}
				else
					if(key==2){
						Reptilesview r = new Reptilesview();
						r.Reptilesview();
					}
					else
						if(key==3){
							Aquaticsview a = new Aquaticsview();
							a.Aquaticsview();
						}
						else
							if(key==4){
								Birdsview a = new Birdsview();
								a.Birdsview();
							}
							else
								if(key==5){
									Insectsview a = new Insectsview();
									a.Insectsview();
								}
								else{
									throw new Exception("Exit");
								}
				key=0;
			}while(key!=6 || key!=0);
		}

	}
