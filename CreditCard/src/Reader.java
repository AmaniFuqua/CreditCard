import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;



public class Reader
	{
		static DecimalFormat cs = new DecimalFormat("###################");
		 static ArrayList <Cards>cardList = new ArrayList <Cards>();
		public static void main(String[] args) throws FileNotFoundException
			{
				readtxt();
			    
				
			}
		public static void readtxt()
		{
			int i=0;
			try
				{
			 Scanner myFile = new Scanner(new File("CreditCardNumbers.txt"));
			 while(myFile.hasNext())
			 {
				
				cardList.add(new Cards(Double.parseDouble(myFile.next())));
			 }
				} catch (FileNotFoundException e)
			{
			
				e.printStackTrace();
			}
		}
		public static void calculate()
		{
			
			for(int i = 0; i<cardList.size();i++)
				{	int everyother = 0;
					double number2 = cardList.get(i).getNumber();
					 String num = cs.format(number2);
						 for(int x= 0; x<number2;x++)
							 {
								num.split("");
								 if(everyother%2==0)
									 {
										 
										 
										 
									 }
								 
								 
								 
							 }
					
					
					
					
				}
		//	
			
		}
	}

		
	
