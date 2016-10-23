
//import java.util.Scanner;
import java.util.StringTokenizer;

public class Convertor {
	private static int count;
	private static String cht;

	public int convertStrToInt(String str, int Array[]) { // convert
															// from
															// string
															// to
		count = 0; // integer

		StringTokenizer token = new StringTokenizer(str, " ");
		while (token.hasMoreTokens()) {
			cht = token.nextToken();
			Array[count] = Integer.parseInt(cht);
			// System.out.printf("\n\n%d \n\n", count++);
			count++;

		}
		return count;

	}

}
