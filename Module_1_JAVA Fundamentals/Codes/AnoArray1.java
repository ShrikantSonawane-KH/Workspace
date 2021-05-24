/*
	Array passing
*/


import java.util.*;

class AnoArray1
{

	static void display(float[] a)
	{
	 System.out.println("Addr of a:"+a); 			// addresses are same here unlike anonymous
	 for(float x:a)
		{	
		  System.out.println(x);	
		}
	}

	public static void main(String args[])
	{
		
		float[] arr = new float[5];
		AnoArray obj = new AnoArray();
		obj.display(arr);
		System.out.println("Addr of arr:"+arr);
	}
}



