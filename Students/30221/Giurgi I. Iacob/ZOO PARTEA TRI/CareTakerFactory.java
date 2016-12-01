package javasmmr.zoowsome.services.factories;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.math.*;
import javasmmr.zoowsome.models.employees.*;
public class CareTakerFactory extends EmployeeFactory {
   public Employee getEmployee(){
	   String name; 
	   String [] lastName = {"Giurgi" , "Blidar" , "Popa" , "Dodo" , "Sova" , "Muresan" , "Moldovan" ,"Cozma" , "Crisan",
	    "Dumitrascu" , "Grad" , "Gorun" , "VISOVAN" , "Seras" , "Haralambie" , "Gavrea" 		
	    };
	   String [] firstName = {"Gica" , "George" , "Hanz" , "Justin" , "Dora" ,"Andreea","Diana","Cristina" , "Andrei",
        "Catalin" , "Calin" , "Mihai" ,"Francisc"			   
	   };
	    Random rand = new Random();
	    name = lastName[rand.nextInt(lastName.length)] + " " + firstName[rand.nextInt(firstName.length)];
	    double workingHours = ThreadLocalRandom.current().nextInt(35,50);
        return new Caretaker(name,BigDecimal.valueOf(1500 + workingHours*10),workingHours); // salariu mediu + 10 dols pe ora bonus :))))	   
   }
}
