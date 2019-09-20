package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class average {
	public static void Main(String args[]) throws NumberFormatException, IOException {
	int n,i,sum=0,avg;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of students ");
	n=Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	System.out.println("Enter the marks of students ");
	for(i=0;i<n;i++)
	{
	arr[i]= Integer.parseInt(br.readLine());
		sum=sum+arr[i];
		}
	avg=(sum)/n;
	System.out.println("The average is "+avg);
	
	}

	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	int inp;
	int power,sum=0,rem,temp,count=0;
	inp = sc.nextInt();
	   temp=inp;
	   int len= inp;
	   while (len!=0)
	   {
	    len=len/10;
	    count++;
	
	   }
	   while(inp!=0)  
	   {  
	   rem=inp%10;  
	   inp=inp/10;
	   power= (int) Math.pow(rem,count);
	   sum=sum+power;
	   System.out.println(sum);
	   }  
	   if(temp==sum)  
	   System.out.println("The given number is amstrong");  
	   else  
	       System.out.println("The given number is not amstrong");  
	  }
	}

	



