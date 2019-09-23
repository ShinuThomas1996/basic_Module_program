package Update;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Updation {
	public static int  status[]= new int[25];
	 public static int i=1;


	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		
		
		System.out.println(" REGISTRATION ");
		System.out.println(" ENTER  NAME");
		String name=br.readLine();
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
		
		System.out.println("Do you want to update the email id?(yes/no)");
		String ac=br.readLine();
		if(ac.contentEquals("yes"))
				{
			 System.out.println("Update email ");
			
			    System.out.println("Enter new email");
			    email=br.readLine();
			    System.out.println("Your details are as follows");
			    System.out.println("name :"+name);
			    System.out.println("address : "+address);
			    System.out.println("contactnumber:"+contactNumber);
			    
			    System.out.println("email ID:"+email);
			    System.out.println("proof type:"+prooftype);
			    System.out.println("proof number:"+proofno);
			    
				}
		
		
			
		}}
		

			
			
			
			
			
			
			
			
			
//}
