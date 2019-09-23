package Update3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RegisterNBook {

	public static String  name[]= new String[25];
	public static int  status[]= new int[25];
	 public static int i=1,a=1;                                                                              
                                                                                                        
                                                                                                        
	public static void main(String[] args)throws IOException                                             
	{                                                                                                    
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		String ac,bc,date,date1; 
		do {
		ViewCustomers();
		 System.out.println("Do you want booking ?(yes/no)");                               
		 bc=br.readLine();
		 if(bc.contentEquals("yes")) {
		 room();}
		 System.out.println("Do you want to continue registration ?(yes/no)");                               
		 ac=br.readLine();     }                                                                    
		while(ac.contentEquals("yes")) ;                                                                  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start date date");
	    date=sc.nextLine();
	    System.out.println("Enter the start date date");
	    date1=sc.nextLine();
	    System.out.println("The bookings made from "+date+" to "+ date1+" are");                                                          
		System.out.println("Customers list"); 
		System.out.println("The registered customers are\nCustomer ID\tCustomer name");
		for(int j=1;j<i;j++) {
		System.out.println(+j+"        "+name[j]);}
		
	}
		 public static void ViewCustomers() throws IOException   {               
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		 
		System.out.println(" REGISTRATION ");                                                            
		System.out.println(" ENTER  NAME");                                                              
		 name[i]=br.readLine();                                                                       
		System.out.println("ENTER ADDRESS");                                                             
		String address=br.readLine();                                                                    
		System.out.println(" CONTACT NUMBER");                                                           
		String contactNumber=br.readLine();                                                              
		System.out.println("E MAIL ID");                                                                 
		String email=br.readLine();                                                                      
		System.out.println("ENTER TYPE OF PROOF");                                                       
		String prooftype=br.readLine();                                                                  
		System.out.println("ENTER PROOF NUMBER");                                                        
		String proofno=br.readLine();                                                                    
		System.out.println("Thank you for registering. Your id is "+i++);                                  
		 }                                                                                                 
		
		 
		 public static void room() throws IOException
			{
			BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
			System.out.println(" Please choose the services required. ");
			System.out.println(" AC/nAC ");
			String ac=br.readLine();
			System.out.println("Cot(Single/Double)");
			String cot=br.readLine();
			System.out.println("enter date");	
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
			    {status[a]=1;
			    System.out.println("Thank you for booking. Your room number is "+i++);
			    
			    }
		                                                                                                 
		                                                                                                 
			                                                                                             
			}}


		                                                                                                 
                                
