// Basics of Array

import java.util.*;

class ArrayMax
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

int max = a[0];
int min = a[0];

System.out.println("==================================");

for (int i =0; i<=4;i++)
{
  max= max < a[i] ? a[i] : max;
  min= min > a[i] ? a[i] : min;
}
System.out.println("Max is : " + max );
System.out.print("Min is : " + min );

/*
for (int b : a)
{
 System.out.print(b + " ");
}
*/

}
}