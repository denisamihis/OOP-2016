package zoowsome;

import java.math.BigDecimal;
import java.util.ArrayList;

import animals.*;
import employees.*;
import animals.*;
import factories.*;
import repositories.AnimalRepository;

public class MainController {

	public static void main(String[] args) throws Exception {
		Animal[] randomAnim = new Animal[50];
		RandomGenerator rand = new RandomGenerator();
		randomAnim = rand.generateRandom();
		
		AnimalRepository animRep=new AnimalRepository();
		ArrayList<Animal> animals=new ArrayList<Animal>();
		for (int i=0; i<50; i++)
			animals.add(randomAnim[i]);
		
		animRep.save(animals);
		animRep.load();
		
		/*
		 * for (int i = 0; i < 50; i++) {
		 * System.out.print(randomAnim[i].getName() + " "); }
		 */
		/*Caretaker[] caretakers = new Caretaker[10];
		my caretakers
		caretakers[0] = new Caretaker("John Knuth", BigDecimal.valueOf(2100), false, 8.0);
		caretakers[1] = new Caretaker("Millie Swain", BigDecimal.valueOf(2100), false, 8.0);
		caretakers[2] = new Caretaker("Kate Osling", BigDecimal.valueOf(2100), false, 8.0);
		caretakers[3] = new Caretaker("Peter Parker", BigDecimal.valueOf(2100), false, 12.0);
		caretakers[4] = new Caretaker("Jonathan Hill", BigDecimal.valueOf(2100), false, 10.0);
		caretakers[5] = new Caretaker("Mike Posner", BigDecimal.valueOf(2100), false, 12.0);
		caretakers[6] = new Caretaker("Emma Foster", BigDecimal.valueOf(2100), false, 12.0);
		caretakers[7] = new Caretaker("Ronald Regan", BigDecimal.valueOf(2100), false, 8.0);
		caretakers[8] = new Caretaker("Ian Arnold", BigDecimal.valueOf(2100), false, 8.0);
		caretakers[9] = new Caretaker("Bill Jobs", BigDecimal.valueOf(2100), false, 8.0);

		String result;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				if (caretakers[i].getIsDead() == false && randomAnim[j].getTakenCareOf() == false) {
					result = caretakers[i].takeCareOf(randomAnim[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretakers[i].setIsDead(true);
					} else
						randomAnim[j].setTakenCareOf(true);
					System.out.println(randomAnim[j].getName() + " taken care with " + result + " by " + caretakers[i].getName() + " "
							+ " who has " +caretakers[i].getWorkingHours() + " working hours left");
				}
			}
		}
	*/
		}
	
}
