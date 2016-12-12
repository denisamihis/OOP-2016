package palindrom3;

public class pal {
	public static void main(String[] args) {
	int i,j,P,max=0,salvi=0,salvj=0,salvP,ogl;
	for(i=999;i>99;i--)
	{
		for(j=i;j>99;j--)
		{
			P=i*j;
			salvP=P;
			ogl=0;
			while(P!=0)
			{
				ogl=ogl*10+P%10;
				P=P/10;
			}
			if(ogl==salvP)
				if(max<salvP)
				{
					max=salvP;
					salvi=i;
					salvj=j;
				}
		}
	}
	System.out.println(max);
	System.out.println(salvi);
	System.out.println(salvj);

}
}
