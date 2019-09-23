package Update2;                                                                                          
                                                                                                         
import java.io.BufferedReader;                                                                           
import java.io.IOException;                                                                              
import java.io.InputStreamReader;                                                                        
                                                                                                         
public class Updatemodule {                                                                                  
	public static String  name[]= new String[25];                                                            
	 public static int i=1;                                                                              
                                                                                                         
                                                                                                         
	public static void main(String[] args)throws IOException                                             
	{                                                                                                    
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		String ac;
		do {
		ViewCustomers();
		System.out.println("Do you want to continue registration ?(yes/no)");                               
		 ac=br.readLine();     }                                                                    
		while(ac.contentEquals("yes")) ;                                                                  
				                                                                                        
		                                 
					
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
		                                                                                                 
		                                                                                      
		                                                                                                 
		                                                                                                 
			                                                                                             
		}}                                                                                               
		                                                                                                 
                                                                                                         
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
			                                                                                             
//}                                                                                                      
                                                                                                         