/*
Array declaration : type
Anonymous array : array without name /  for intance use. 

*/
import java.util.*;

class ArrayBasic
{
	public static void main(String args[])
	{

	float[] a;
	a = new float[2];
	System.out.println("a:"+a); 			// give the adress of a arry a	--->a:[F@1db9742

	float [] b = {12.11f, 1.44f};

	//float [] d ;
	//d = {12.2f,15.5f}; 				//illegal start of expression

	float[] c = new float[2];

	System.out.println(new float[] {1.2f,2.3f});  // anonymous array // gives the address: [F@106d69c


}
}



