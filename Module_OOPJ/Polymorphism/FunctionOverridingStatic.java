/*
function overriding:
static methods can not be overridden(Method Overriding vs Method Hiding) : When you define a static method with same signature as a static 
method in base class, it is known as method hiding.



*/


class Base 
{
	static void BaseTest_1()					// Static method in base class which will be hidden in subclass 				       
	{
	  System.out.println("Base  : In  void BaseTest_1 ");
	}
	protected void BaseTest_2()				   
							   
	{
	   System.out.println("Base  : In  void BaseTest_2 ");
	}
}

class Derived extends Base
{
	static void BaseTest_1()							
	{
	  System.out.println("Derived : In  void BaseTest_1 ");
	}
	public void BaseTest_2()				
	{
	   System.out.println("Derived : In  void BaseTest_2 ");
	}		
	
}

class FunctionOverridingStatic
{
	public static void main(String[] args)
	{
	 
	 Base b1;
	 b1=new Derived();					//by rule of overriding : Base referece refers to Derived  obj - call of derived  method 
                     b1.BaseTest_1();					// this call Base method bcz static method is not override in Derived class
	
	System.out.println("================================");

	Derived.BaseTest_1();				//Derived : In  void BaseTest_1 

	Derived d;
	d= new Derived();
	d.BaseTest_2();					//Derived : In  void BaseTest_2

	}
}