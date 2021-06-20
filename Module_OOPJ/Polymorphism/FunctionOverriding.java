/*
function overriding :
Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. 
When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, 
then the method in the subclass is said to override the method in the super-class.

The version of a method that is executed will be determined by the object that is used to invoke it. 
If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, 
but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. 
In other words, it is the type of the object being referred to (not the type of the reference variable) that determines 
which version of an overridden method will be executed.

*A protected instance method in the super-class can be made public, but not private, in the subclass. Doing so, will generate compile-time error.
* final methods can not be overridden : If we don’t want a method to be overridden, we declare it as final.
* Static methods can not be overridden(Method Overriding vs Method Hiding) : When you define a static method with same signature as a static method in base class, it is   known as method hiding.
*Private methods can not be overridden.
*The overriding method must have same return type (or subtype) : From Java 5.0 onwards it is possible to have different return type for a overriding method in child class, 
but child’s return type should be sub-type of parent’s return type. This phenomena is known as covariant return type.
*Invoking overridden method from sub-class
*We can not override constructor as parent and child class can never have constructor with same name(Constructor name must always be same as Class name).
*
*note :
*which method presence will be checked by compiler on the reference type and called by object type at run time.
*the variables always resolve on the reference type only.



*/

class Base 
{
	private void BaseTest_1()				       // private methods are not overridden
	{
	  System.out.println("Base  : In  void BaseTest_1 ");
	}
	protected void BaseTest_2()				    // if we take it protected  ; we have to make method of derived class as public
							   // ( with default BaseTest_2() no issue) 
	{
	   System.out.println("Base  : In  void BaseTest_2 ");
	}
}

class Derived extends Base
{
	private void BaseTest_1()				//this is new for Derived 
	{
	  System.out.println("Derived : In  void BaseTest_1 ");
	}
	public void BaseTest_2()				//if we not make it public then : error\attempting to assign weaker access privileges; was protected
	{
	   System.out.println("Derived : In  void BaseTest_2 ");
	}		
	
}

class FunctionOverriding
{
	public static void main(String[] args)
	{
	  Base b;
	  b= new Base();					//Base referece to Base obj - call of Base method 		
	  b.BaseTest_2();	 

	 Base b1;
	 b1=new Derived();					//Base referece to Derived  obj - call of derived  method 
                     b1.BaseTest_2();	
	
	System.out.println("================================");

	Derived d;
	d= new Derived();
	d.BaseTest_2();
/*
	Derived d1;
	d1 = new Base();					//Not allowed \Error: Base cannot be converted to Derived 
	d1.BaseTest_2();
*/
	}


}