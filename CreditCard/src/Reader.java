import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;



public class Reader
	{
		static DecimalFormat cs = new DecimalFormat("###################");
		 static ArrayList <Cards>cardList = new ArrayList <Cards>();
		static Scanner reader = new Scanner(System.in);
		public static void main(String[] args) throws FileNotFoundException
			{
				readtxt();
			    calculate();
			    question();
				
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
			int rightCounter =0;
			int wrongCounter =0;
			for(int i = 0; i<cardList.size();i++)
				{	int everyother = 0;
					double number2 = cardList.get(i).getNumber();
					 String num = cs.format(number2);
					String [] num2 = num.split("");
					int calc = 0;
					int [] con = new int [16];
				
						 for(int x= 0; x<con.length;x++)
							 { 
								con[x]= Integer.parseInt(num2[x]);
								
								if(everyother%2==0)
									 {
										con[x]= con[x]*2;
										num2[x].equals(String.valueOf(con[x])); 
										 
									 }
								else if (everyother%2!=0)
								{
									
									
								}
								
							
								if(everyother%2==0 && con[x]>=10)
								{	int tempnum = con[x]/10;
								int tempnum2 = con[x]%10;
									
									con[x] = tempnum+tempnum2;
									
								}
								else {}
								
								
								 everyother++;
								 
							 }
						 System.out.println();
					for (int l = 0; l<con.length;l++)
					{
						calc += con[l];
					}
					if (calc%10==0)
					{
						rightCounter++;
					}
					else if(calc%10!=0)
					{
						wrongCounter++;
					}
					
				}
		System.out.println("There are "+ rightCounter + " valid numbers and "+ wrongCounter + " non valid numbers" );
			
		}
		
		public static void question()
		{	System.out.println("Please input 16 digits card code (no spaces)");
			String [] answer = reader.nextLine().split("");
			int [] num = new int [16];
			int everyother = 0;
			for(int i = 0; i<answer.length;i++)
			{	
				num[i] = Integer.parseInt(answer[i]);
				if(everyother%2==0)
				 {
					num[i] = num[i]*2;
				 }
				else if(everyother%2!=0)
				{}
				if(everyother%2==0 && num[i]>=10)
				{	int tempnum = num[i]/10;
				int tempnum2 = num[i]%10;
					
					num[i] = tempnum+tempnum2;
					
				}
				else {}
				everyother++;
			}
			int calc = 0;
			for (int l = 0; l<answer.length;l++)
			{
				calc += num[l];
			}
			if (calc%10==0)
			{
				System.out.println("This card is valid.");
			}
			else if (calc%10!=0)
			{
				System.out.println("This card is not valid.");
			}
		}
	
	}

		
	
