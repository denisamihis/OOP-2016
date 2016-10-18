
public class Functions {

	public static void add( Integer pol1[],Integer pol2[],Integer gradPol1,Integer gradPol2){
		Integer i,gradRez=0;
		if(gradPol1>gradPol2)
			gradRez=gradPol1;
		else
			gradRez=gradPol2;
		Integer polRez[]= new Integer[gradRez];
		for (i=gradRez;i>=0;i--)
			polRez[i]=pol1[i]+pol2[i];
		for (i=gradRez;i>=0;i--)
			System.out.printf(" %dx^%d ",polRez[i],i);
	}
	public static void substract(Integer pol1[],Integer pol2[],Integer gradPol1,Integer gradPol2){
		Integer i,gradRez=0;
		if(gradPol1>gradPol2)
			gradRez=gradPol1;
		else
			gradRez=gradPol2;
		Integer polRez[]= new Integer[gradRez];
		for (i=gradRez;i>=0;i--)
			polRez[i]=pol1[i]-pol2[i];
		for (i=gradRez;i>=0;i--)
			System.out.printf(" %dx^%d ",polRez[i],i);
	}
	public static void multiply(Integer pol1[],Integer pol2[],Integer gradPol1,Integer gradPol2){
		Integer i,j,gradRez;
		gradRez=gradPol1+gradPol2;
		Integer polRez[]=new Integer[gradRez];
		for(i=gradPol1;i>=0;i--)
			for(j=gradPol2;i>=0;i--)
				polRez[i+j]=pol1[i]*pol2[j];
		for (i=gradRez;i>=0;i--)
			System.out.printf(" %dx^%d ",polRez[i],i);
	}
	public static void mul_scal(Integer pol1[],Integer pol2[],Integer gradPol1,Integer gradPol2,Integer scalar){
		Integer i;
		Integer polRez1[] = new Integer [gradPol1];
		Integer polRez2[] = new Integer [gradPol2];
		for(i=gradPol1;i>=0;i--)
			polRez1[i]=pol1[i]*scalar;
		for(i=gradPol2;i>=0;i--)
			polRez2[i]=pol2[i]*scalar;
		for (i=gradPol1;i>=0;i--)
			System.out.printf(" %dx^%d ",polRez1[i],i);
		for (i=gradPol2;i>=0;i--)
			System.out.printf(" %dx^%d ",polRez2[i],i);
		
	}
	public static void eval(Integer pol1[],Integer pol2[],Integer gradPol1,Integer gradPol2,Integer n){
		Integer i,valueInN1=0,valueInN2=0;
		for(i=gradPol1;i>=0;i--)
			valueInN1+=(int)(pol1[i]*Math.pow(n,i));
		for(i=gradPol2;i>=0;i--)
			valueInN2+=(int)(pol2[i]*Math.pow(n,i));
		System.out.printf("The value of the first polynomial in %d is %d\n",n,valueInN1);
		System.out.printf("The value of the second polynomial in %d is %d\n",n,valueInN2);
	}
	

}
