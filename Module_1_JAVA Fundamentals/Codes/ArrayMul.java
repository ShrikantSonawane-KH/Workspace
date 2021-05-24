// Basics of Array

import java.util.*;

class ArrayMul
{
	public static void main(String args[])
	{
	float[][] a = new float[2][2];
	float[][] b = new float[2][2];
	float[][] c = new float[2][2];

	System.out.println("Enter Array elements:");
	Scanner sc = new Scanner(System.in);

	for (int i =0; i<a.length; i++)
	{
 	for (int j =0; j<a[i].length; j++)
	{
 	  a[i][j]=sc.nextFloat(); 	  
	}
	
	}

	for (int i =0; i<b.length ; i++)
	{
 	for (int j =0; j<b[i].length ; j++)
	{
 	  b[i][j]=sc.nextFloat();
	}
	}

	for (int i =0; i<c.length ; i++)
	{
 	for (int j =0; j<c[i].length ; j++)
	{
 	  c[i][j]=a[i][j] * a[i][j];
	}	
	}

	for (float x[] :a )		
	{
 	for (float y : x)
	{
 	  System.out.print(y+" ");	  
	}
	System.out.println();
	}
	System.out.println("=====================================================");
	for (float x[] : b)
	{
 	for (float y : x)
	{
 	  System.out.print(y+" "); 
	}
	System.out.println();
	}
	System.out.println("=====================================================");
	for (float x[] : c)
	{
 	for (float y : x)
	{
 	  System.out.print(y+" ");	  
	}
	System.out.println();
	}

}
}



