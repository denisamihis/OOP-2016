package asigment1;

public class problema1 {
public static int sum()
{int s=0;
for(int i=3;i<=1000;i++)
	if((i%5==0)||(i%3==0))
		s=s+i;
return s;
}
public static void  main(String[] args)
{System.out.println(sum());
}
}
