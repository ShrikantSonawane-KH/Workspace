// Basics of Array

import java.util.*;

class ArrayRep
{

public static void main(String args[])
{

int[] a = new int[5];

System.out.println("Enter 5 Array elements:");
Scanner sc = new Scanner(System.in);
for (int i =0; i<=4;i++)
{
 a[i]= sc.nextInt();	
}

System.out.println("==================================");

for (int i=0; i<=4;i++)
{
 for(int j=i+1; j<=4;j++)
{ 
	if(a[i]==a[j])
	{
	 System.out.println(a[i] + " is repeated");
	}	
}
}
/*
for (int b : a)
{
 System.out.print(b + " ");
}
*/

}
}