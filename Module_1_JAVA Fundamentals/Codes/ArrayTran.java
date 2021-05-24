// Basics of Array

import java.util.*;

class ArrayTran
{
	public static void main(String args[])
	{
	int[][] a = new int[3][3];

	System.out.println("Enter Array elements:");
	Scanner sc = new Scanner(System.in);

	for (int i =0; i<a.length; i++)			//no. of Rows defines the length of 2D array 
	{
 	for (int j =0; j<a[i].length; j++)		//a[i].length : length of 1D array in 2D array
	{
 	  a[i][j]=sc.nextInt(); 	  
	}
	//System.out.println();
	}
	System.out.println("=====================================================");

	for (int i =0; i<a.length; i++)
	{
 	for (int j =0; j<a[i].length; j++)
	{
 	 System.out.print(a[i][j]+" "); 
	}
	System.out.println();
	}
	System.out.println("==========================Transver==========================");

	for (int i =0; i<b.length ; i++)
	{
 	for (int j =0; j<b[i].length ; j++)
	{
 	  System.out.print(a[j][i]+" "); 
	}
	System.out.println(); 
	}

}
}



