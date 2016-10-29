package models.employees;

import java.util.Random;

public class Id {
	private static long[] ids;
	private static int counter;
	public static long getId()
	{
		long[] aux = ids;
		long newId;
		Random rand = new Random();
		do
		{
			newId = rand.nextLong();
		}while (newId < Long.parseLong("1000000000000") || newId > Long.parseLong("9999999999999") || !isUnique(newId));
		ids = new long[++counter];
		for (int i = 0; i < counter - 1; i++)
			ids[i] = aux[i];
		ids[counter - 1] = newId;
		return newId;
	}
	private static boolean isUnique(long id)
	{
		for (int i = 0; i < counter; i++)
			if (ids[i] == id)
				return false;
		return true;
	}
}
