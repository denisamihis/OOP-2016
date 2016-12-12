package polynomials;

public class Functions {
	public static Polynomials add(Polynomials pa, Polynomials pb)
	{
		int x;
		int sum[]=new int[pa.cfs.length > pb.cfs.length ? pa.cfs.length : pb.cfs.length ];
		for( x=0;x<pa.cfs.length && x<pb.cfs.length;x++)
			sum[x]=pa.cfs[x]+pb.cfs[x];
		while(x<pa.cfs.length)
		{
			sum[x]=pa.cfs[x];
			x++;
		}
		while(x<pb.cfs.length)
		{
			sum[x]=pb.cfs[x];
			x++;
		}
		return new Polynomials(sum);
		
	}
	public static Polynomials substract(Polynomials pa, Polynomials pb)
	{
		int x;
		int dif[]=new int[pa.cfs.length > pb.cfs.length ? pa.cfs.length : pb.cfs.length ];
		for( x=0;x<pa.cfs.length && x<pb.cfs.length;x++)
			dif[x]=pa.cfs[x]-pb.cfs[x];
		while(x<pa.cfs.length)
		{
			dif[x]=pa.cfs[x];
			x++;
		}
		while(x<pb.cfs.length)
		{
			dif[x]=pb.cfs[x];
			x++;
		}
		return new Polynomials(dif);
	}
	public static Polynomials multiplyScalar(Polynomials pa,int s)
	{
		int mul[]=new int[pa.cfs.length];
		for(int x=0;x<pa.cfs.length;x++)
			mul[x]=pa.cfs[x]*s;
		return new Polynomials(mul);
	}
	public static Polynomials multiply(Polynomials pa,Polynomials pb)
	{
		int mul[]=new int[pa.cfs.length+pb.cfs.length];
		for(int x=0;x<pa.cfs.length;x++)
			for(int y=0;y<pb.cfs.length;y++)
				mul[x+y]+=pa.cfs[x]*pb.cfs[y];
		return new Polynomials(mul);
	}
}
