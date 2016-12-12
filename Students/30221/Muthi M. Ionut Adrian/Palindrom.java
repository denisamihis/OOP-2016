
public class Palindrom {

	public static void main(String[] args) {
	   // pt 4 cifre este  99000099 
		int nr1,nr2,produs,numar,invers,palindrom=0,max=0;
		
		for(nr1=100;nr1<=999;nr1++)
		{
			for(nr2=100;nr2<=999;nr2++)
			{
				produs=nr1*nr2;
				numar=produs;
		
				invers=0;
				while(numar!=0)
				{
					invers=invers*10+numar%10;
					numar=numar/10;
				}
				
		
				
				if(produs==invers)
					palindrom=produs;
				if(palindrom>max)
					max=palindrom;
			
					
				
			}
		}
		System.out.println("Cel mai mare palindrom rezulat din produsul a 2 nr de 3 cifre este : " + max);
	}

}
