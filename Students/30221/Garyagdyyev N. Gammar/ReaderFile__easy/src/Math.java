import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Math {
	
	
	public static String str;
	public static int numArray[] = new int[1000];
	public static int numArray1[] = new int[1000];
	
	
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		reader r = new reader();
		
		
		
		r.openFile();
		r.readFile(str,numArray,numArray1);
		r.closeFile();
		
	}

}
