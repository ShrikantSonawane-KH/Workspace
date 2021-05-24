/*
	Anonymous array : array access.
	Array always passed with addr.
*/


import java.util.*;

class AnoArray
{

	static void display(float[] a)
	{
	System.out.println("Addr of a:"+a);
	 for(float x:a)
		{	
		  System.out.println(x);	
		}

	}

	public static void main(String args[])
	{

          System.out.println("Addr of Anonimous:"+ new float[] {1.2f,2.3f});
	  display(new float[] {1.2f,2.3f});  						//passing the address only :  addresses are diff here
	  
	}
}



