import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Reader
	{
		static ArrayList <CardArrayList>cardList = new ArrayList<CardArrayList>();
		public static void main(String[] args) throws FileNotFoundException
			{
				// TODO Auto-generated method stub

				
			}
		public static void readtxt()
		{
			 Scanner myFile = new Scanner(new File("CreditCardNumbers.txt"));
			cardList.add(new CardArrayList.Card(Integer.parseInt(myFile.next())));
		}
	}
