package basicmodule_java;

import java.util.Scanner;

public class fibonacii {public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
int inp;
int num1=0,num2=1,i,sum=0;
inp = sc.nextInt();
System.out.println("The fibonacci numbers are " );
System.out.println("0");
System.out.println("1");
System.out.println("1");
for(i=0;i<inp;i++) {
	sum=sum+num2;
	
	System.out.println(+num2+sum);
	num1=sum;
	sum=num2;
	num2=num1;
	
}}}