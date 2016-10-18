	import java.io.*;
	import java.util.*;
	
public class InputOutput {
	
		private Formatter fileO;
		public void openOutFile()
		{
			try
			{
				fileO = new Formatter("fisierOut.txt");
				fileO.format("%s", "ma doare la basca");
				System.out.println("Ole!");
			}
			catch(Exception e)
			{
				System.out.println("Error to open the file");
			}
		}
		public void closeFile()
		{
			fileO.close();
		}
		private Scanner fileIn;
		public void openInFile()
		{
			try
			{
				fileIn= new Scanner(new File("ceva.txt")); 
				System.out.println("Fisier deschis cu succes");
			}
			catch (Exception e)
			{
				System.out.println("Error to open the file");
			}
		}
		
		public void readFile()
		{
			int  m=Integer.parseInt(fileIn.next());
			int n=Integer.parseInt(fileIn.next());
			int [] p1=new int[100];
			int [] p2=new int [100];
			String [] cmd=new String[100];
			int i;
			for(i=0;i<m;i++);
				p1[i]=Integer.parseInt(fileIn.next());
			for(i=0;i<n;i++);
				p2[i]=Integer.parseInt(fileIn.next());
			i=0;
			while(fileIn.hasNext())
			{
				cmd[i]=fileIn.next();
				i++;
			}
		/*	while(fileIn.hasNext())
			{
				String a=fileIn.next();
				System.out.println(a);*/
			System.out.println("Fuck yah!");
			}
	
		}



