import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Reader
	{
		 static ArrayList <Cards>cardList = new ArrayList <Cards>();
		public static void main(String[] args) throws FileNotFoundException
			{
				readtxt();
			    
				
			}
		public static void readtxt()
		{
			
			try
				{
			 Scanner myFile = new Scanner(new File("CreditCardNumbers.txt"));
			 while(myFile.hasNext())
			 {
				cardList.add(new Cards(Integer.parseInt(myFile.next())));
			 }
				} catch (FileNotFoundException e)
			{
			
				e.printStackTrace();
			}
		}

		
	}
