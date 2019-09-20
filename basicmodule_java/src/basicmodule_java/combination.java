package basicmodule_java;

import java.util.Scanner;

public class combination {
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	int inp;
	int comb=1,i;
	inp = sc.nextInt();
	   
    for(i=1;i<=inp;i++) {
    	comb=comb*i;
    }System.out.println("The number of combination  is "+comb);
	
    }
}
