package basicmodule_java;

import java.util.Scanner;

public class leapyear {
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	int inp;
	inp = sc.nextInt();
	if(inp%4==0 &&inp % 400==0 &&inp%100==0) {
		System.out.println("it is a leap year");
	}
	else {
		System.out.println("it is not a leap year");
	}
		

}}
