package basicmodule_java;
	import java.util.Scanner;
	public class IO {	 
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String name=sc.nextLine();
	int age=sc.nextInt();
	sc.next();
	String degree=sc.nextLine();
	String  batch=sc.nextLine();
	int contactNo=sc.nextInt();
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println("degree : "+degree);
	System.out.println("batch : "+batch);
	System.out.println("contact number : "+contactNo);
	
	}
	}



