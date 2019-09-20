package basicmodule_java;

import java.io.*;
public class retest
{
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n,i,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students ");
		n=Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the marks of students ");
		for(i=0;i<n;i++)
		{
		arr[i]= Integer.parseInt(br.readLine());
		if(arr[i]<50) {count++;}
			
		}
		System.out.println("The average is "+count);
		
	}}