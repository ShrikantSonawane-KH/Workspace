// Basics of Array

import java.util.*;

class ArrayAvg
{
public static void main(String args[])
{

float[] a = new float[5];

System.out.println("Enter 5 Array elements:");
Scanner sc = new Scanner(System.in);

for (int i =0; i<a.length ; i++)
{
 a[i]= sc.nextFloat();
	
}

System.out.println("==================================");
float sum=0;
for (float b : a)
{
 System.out.print(b + " ");
 sum=sum+b;
}
System.out.print("Avg is : " + sum/a.length);

}
}