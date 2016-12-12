package services;

import java.util.Random;

public final class NameGenerator {
	private static final String[] names = {
		"Gheorghe", "Ioana", "Teodora", "Razvan", "ABCescu", "Grigore", "Semaforela", "Mercedesa", "Eduard", "Dan", "Alin",
		"Aurel", "Ion", "Betmen", "Gentutica", "Airanmen", "Umbrelusa", "Mingiuta", "Bulina", "Iepurasul", "Inimioara", "Unghiuta",
		"Pisoias", "Morcovel", "Cactusel", "Cactutelutisorulet", "Paiut", "Tobisoare", "Ursulet-Pufos-Roz", "Pernuta", "Bibibobubiba"
	};
	public static String GetRandomName()
	{
		Random rand = new Random();
		return names[rand.nextInt(names.length-1)];
	}
}
