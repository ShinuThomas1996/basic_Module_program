package basicmodule_java;

import java.util.Scanner;
import java.io.*;

public class height {
public static void main(String[]arg) throws IOException
{
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
int count,temp;
System.out.println("enter the total number of students");
count=Integer.parseInt(br.readLine());
int array[]=new int[count];
System.out.println("Enter the heights");
for(int i=0;i<count;i++)
{
array[i]=Integer.parseInt(br.readLine());
}

for(int i=0;i<count;i++)
{
for(int j=0;j<count;j++)
{
if (array[i]<array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}

  for(int i=0;i<count;i++)
    {
System.out.println(array[i]);
    }
}
}



