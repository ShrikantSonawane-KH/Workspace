/*
derived(child) class can acces the data of Base(parent) class  
but base(parent) class not allowed acces the data of derived (child)class  

protected, default, public are allowed - same package.

*if methods are protected in base class then if you overriding them then they should be public.

*/

class BaseClass
{	
	 void testBase()
	{
		System.out.println("IN testBase");
	}
}

class DeriveClass extends BaseClass				//from baseClass
{
	void testDerived()
	{
		System.out.println("IN testDerived");
	}
}

class DeriveClass_1 extends BaseClass				//from baseClass
{
	void testDerived_1()
	{
		System.out.println("IN testDerived_1");
	}
}


public  class InheritanceDemo
{
	public static void main(String[] args)
	{
	DeriveClass obj = new DeriveClass();		// by child class object
	obj.testDerived();
	obj.testBase();

	System.out.println("===================");

	DeriveClass_1 obj1 = new DeriveClass_1();		
	obj1.testDerived_1();
	obj1.testBase();

	System.out.println("===================");

	 DeriveClassTest obj2 = new  DeriveClassTest();		
	obj2.testDerived_2();
	obj2.testBase();
	
	}
/*
	public static void main(String[] args)
	{
	 BaseClass obj = new  BaseClass();		// by parent class object
	 obj.testBase();
	  obj.testDerived(); 				//error
	}
*/
}
