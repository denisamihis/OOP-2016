import java.io.*;
public class InputOut {
	
	public  static int [] coefM=new int[20];
	public  static int [] coefN=new int[20];
	public  static int [] coefS=new int[20];
	public  static int [] arrS= new int[50];
	public  static int [] arrE= new int[50];
	public static int add=0,subs=0,mul=0; 
	
	
	public static void readFile()  throws IOException{
	        File f = new File("C:/Users/User/Desktop/polinom.txt");
	       	BufferedReader br = new BufferedReader(new FileReader(f));
	        String line;
	        int l=0,le=0;
	        line = br.readLine();
	        String[] parts = line.split(" ");
            for(int i=0;i<parts.length;i++)
            {	coefM[i]=Integer.parseInt(parts[i]);
                System.out.printf("%d ",coefM[i]);
	        }
            System.out.print("\n");
            line = br.readLine();
            String[] parts2 = line.split(" ");
            for(int i=0;i<parts2.length;i++)
            {	coefN[i]=Integer.parseInt(parts2[i]);
                System.out.printf("%d ",coefN[i]);
	        }
            System.out.printf("\n");
	        while ((line = br.readLine()) != null){
	              System.out.println(line);
	              if(line.equals("ADD"))
	            	  add=1;
	              else if (line.equals("SUBTRACT"))
	            	  subs=1;
	              else if(line.equals("MULTIPLY"))
	            	  mul=1;
	            else 
	              {
	            	String[] splitStr = line.split("\\s+");
	            	 if(splitStr[0].equals("MUL_SCAL"))
	            	 {
	            		 arrS[l]=Integer.parseInt(splitStr[1]);
	            		 l++;
	            	 }
	            	  if(splitStr[0].equals("EVAL"))
	            	  {   arrE[le]=Integer.parseInt(splitStr[1]);
	            	      le++;
	            	  }
	              }
	            	  
	        }
	        
            br.close();
	  }
	
	
      
	
    public static void main (String[] args) throws IOException
	{   int a=coefM.length; int ca=a;
	    int b=coefN.length; int cb=b;
	    Polinom m= new Polinom(0,0);
	    Polinom n= new Polinom(0,0);
	    Polinom sum= new Polinom(0,Math.max(a, b));
	    Polinom sub= new Polinom(0,Math.max(a,b));
	    Polinom mult= new Polinom(0,a+b);
		readFile();
		for(int i=0;i<coefM.length;i++)
		{
			Polinom m1 = new Polinom(coefM[i],ca);
			ca--;
			m=m.plus(m1);
		}
		m.afisare(coefM,a-1);
		for(int i=0;i<coefM.length;i++)
		{
			Polinom n1 = new Polinom(coefM[i],cb);
			cb--;
			n=n.plus(n1);
		}
		n.afisare(coefN,b-1);
		if(add==1) 
			{sum=m.plus(n);
			for(int i=0;i<sum.deg;i++)
				coefS[i]=sum.coef[i];
			}
		if(subs==1)
		    sub=m.minus(n);
		
	    if(mul==1)
		{
		mult=m.aB(n);	
		}
		for(int i=0;i<arrE.length;i++){
			m.evaluate(arrE[i],coefM);
			n.evaluate(arrE[i],coefN);
		}
		for(int i=0;i<arrS.length;i++){
			m.scalarM(arrS[i]);
			n.scalarM(arrS[i]);
		}
      sum.afisare(coefS,sum.deg);		
	}
}

