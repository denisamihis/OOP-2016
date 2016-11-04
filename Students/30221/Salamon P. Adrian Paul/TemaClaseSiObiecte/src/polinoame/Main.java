
package polinoame;

import java.io.*;

public class Main {

    public static void main(String[] args){
        String string = "";
        String file = "polinom.txt";

        // Reading
        try{
            InputStream ips = new FileInputStream(file);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                string += line + "\n";
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        // Writing
        try {
            FileWriter fw = new FileWriter (file);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter fileOut = new PrintWriter (bw);
                fileOut.println (string+"\n test of read and write !!");
            fileOut.close();
            System.out.println("the file " + file + " is created!");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

