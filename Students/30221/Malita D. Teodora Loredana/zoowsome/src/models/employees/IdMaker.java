package models.employees;

import java.util.Random;

public class IdMaker {
	static long[] ids;
	static int counter=0;
	public static long createId()
	{
		long id;
		int i;
		Random key = new Random();
		do{
			id=Long.parseLong("1000000000000") +key.nextLong();
		} while(!isUnique(id) || id<Long.parseLong("1000000000000") || id>Long.parseLong("9999999999999"));
		long [] aux=ids;
		ids=new long[++counter];
		for(i=0;i<counter-1;i++)
			ids[i]=aux[i];
		ids[counter-1]=id;
		return id;
	}
	public static boolean isUnique(long id)
	{
		int i;
		for(i=0;i<counter;i++)
			if(id==ids[i])
				return false;
		return true;
	}
	

}
