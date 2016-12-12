public class palindrom {
public static void main(String[] args){
	double Big=0,P=0;
	double M=0;
	double C;
	for(int i=999;i>=100;i--){
		for(int j=999;j>=100;j--){
			P=i*j;
			C=P;
			while(C>0){
				M=M*10+C%10;
				C=C/10;
			}
			if(M==P){
				Big=M;
				break;
			}
			
		}
		if(M==P){
			Big=M;
			break;
		}
		
}
	System.out.println("cel mai mare palindrom este: "+Big);
}
}
