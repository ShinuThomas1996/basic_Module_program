package basimodule2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	public static int  status[]= new int[25];
	public static int i=1;


	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int choice;
		do {
		System.out.println("				MENU  ");
		System.out.println("1 BOOKING  ");
		System.out.println("2 Check Status	  ");
		System.out.println("3 EXIT	  "); 
		 choice=Integer.parseInt(br.readLine());


		switch(choice)
		{
		case 1:
			room();
			break;
		case 2:
			check();
			break;
		case 3:
			break;
		}
}while(choice!=3);
			
		}
			
			public static void room() throws IOException
			{
			BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
			System.out.println(" Please choose the services required. ");
			System.out.println(" AC/nAC ");
			String ac=br.readLine();
			System.out.println("Cot(Single/Double)");
			String cot=br.readLine();
			System.out.println("With cable connection/without cable connection(C/nC))");
			String cable=br.readLine();
			System.out.println("Wi-Fi needed or not(W/nW))");
			String wifi=br.readLine();
			System.out.println("Laundry service needed or not(L/nL))");
			String laundary=br.readLine();
			int sum=0;
			String b,c,d;
				if(ac.contentEquals("AC"))
				{ sum=850;}
				else {sum=500;}
				if(cot.contentEquals("Single"))
				{sum+=100;}
				else{sum+=200;}
				if(cable.contentEquals("C"))
				{sum+=100;
				c="enabled";}
				else {c="disabled";}
			    if(wifi.contentEquals("W"))
			    {sum+=100;
			    d="enabled";}
			    else
			    	{d="disabled";}
			    if(laundary.contentEquals("L"))
			    {sum+=100;
			     b="with";}
			    else
			    	{b="with out";}
			    System.out.println("The total charge is Rs. "+sum);
			    System.out.println("The services chosen are");
			    System.out.println(cot+" cot "+ac+" room");
			    System.out.println("cable connection "+c);
			    System.out.println("wifi "+d);
			    System.out.println(b+"Laundryservice");
			    
			    System.out.println("Do you want to proceed?(yes/no)");
			    String prcd=br.readLine();
			    if(prcd.contentEquals("yes"))
			    {status[i]=1;
			    System.out.println("Thank you for booking. Your room number is "+i++);
			    
			    }
			    
			}
			    
						
			public static int check() throws  IOException 
			{
				BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
				System.out.println("enter the room number ");
				int n=Integer.parseInt(br.readLine());
				if (status[n]==0) {
				System.out.println("room is available ");
				;}
				else
				{System.out.println("room is not available ");

				}
				
				return 0;
			}

}
		
