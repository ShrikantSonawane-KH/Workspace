/*

Function overloading:

Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism.

*If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. 
*There are two ways to overload the method in java
    By changing number of arguments
    By changing the data type of arguments
* we can overload main() 
*we can overload static method but not override (mothod hiding comes in picture). 
*We cannot overload two methods in Java if they differ only by static keyword(number of parameters and types of parameters is same).	
*note : only for overloading
*which method will be invoked is decided at compile time (i.e ,by reference time.)
*Variable can call by reference only(in both overloading and overriding). 
*
*/


class operation
{
	int x=100;
	int y = 200;

	void method(int x)
	{
		System.out.println("operation: method()");
	}

}

class FunOverload extends operation
{
	int x = 300;
	int y = 400;

	void method(int x, double y)
	{
		System.out.println("FunOverload : method()");
	}

	public static void main(String[] args)
	{

		//which variable  will be invoke is based on the reference type.
	
		/*
		FunOverload obj1 =  new FunOverload();
		System.out.println(obj1.x +" "+ obj1.y);				//300 400
		*/


		/*
		operation obj1 = new FunOverload();
		System.out.println(obj1.x +" "+ obj1.y);				//100 200				
		*/

	
		/*

		operation obj1 = new operation();

		System.out.println(obj1.x +" "+ obj1.y);				//100 200   - operation

		*/
		


		//which method will be invoke is based on the reference type.
		
		/*
		FunOverload obj1 =  new FunOverload();
		obj1.method(5);						//compiler check in 	FunOverload class first.. if not contain then it will check in operation class.			
		obj1.method(20, 45.45);					//bcz FunOverload  has that method
		*/


		/*
		operation obj1 = new FunOverload();
		obj1.method(5);						//operation: method()					
		//obj1.method(20, 45.45);					// error bcz reference type is operation and it does not have such method , aslo compiler check it parent call ie Object class - it also not have this method			
		*/		


		/*		
		operation obj1 = new operation();
		obj1.method(5);						//operation: method()
		//obj1.method(20, 45.45);					//error
		*/


	}

}



/*

class operation 
{

static int sum(int i, int j)
{
 return i+j;
}

static float sum(float i, int j)
{
 return i+j;
}

static void show (int res)
{
 System.out.println(res);
}

 static void show(float res)
{
 System.out.println(res);
}

}

class FunOverload
{

public static void main(String[] args)
{


int r=operation.sum(11,12);
operation.show(r);

float r=operation.sum(11.12f,12);
operation.show(r);

float r=operation.sum(11,12.21f);	//no suitable method found for sum(int,float)
operation.show(r);			// mismatch is not allowed

}

}

*/