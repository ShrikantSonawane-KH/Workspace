/*
Interface:(pure abstraction)IS-A relationship.
*It has static constants and abstract methods.
*by default methods in it are public abstract.
*attributes present in it are public static final.
*interface  extend interface 
*use public while implementing abstract methods of inteface in derived class.
*only one abstract method / empty interface aslo allowed.
*basically used to achive abstraction and multiple inheritance.
*It can be used to achieve loose coupling.
*We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
*A class can implement more than one interface.
*An interface can extends another interface or interfaces (more than one interface) .
*A class that implements interface must implements all the methods in interface.
* interfaces are slow than abstract classes.
* interfaces can contain following also
    Static methods
    Private methods
    Private Static methods

*methods of interface are by default ..public abstract.

*variables of interface are by default ...public static final
* implementing of interfec method should me make public.(bcz implementing public abstarct methiod should be same accesed or less restricted.)

*default method & public static methods came after java 8. after that we can have the method body in interface.

remaining : default method and static methods in interface

javap = used to check or see the compiled code. eq to check the default attachment i.e public abstract .,...of methods and all

Default Methods and Multiple Inheritance
In case both the implemented interfaces contain default methods with same method signature, the implementing class should explicitly specify which default method is to be used or it should override the default method.

1.    Interfaces can have default methods with implementation in Java 8 on later.
2.    Interfaces can have static methods as well, similar to static methods in classes.
3.    Default methods were introduced to provide backward compatibility for old interfaces so that they can have new methods without affecting existing code.


*/


interface it1
{
        default void show()
    {
        System.out.println("Default it1");
    }
}
  
interface it2
{
    default void show()
    {
        System.out.println("Default it2");
    }
}
  

public class Interface implements it1, it2
{
    
    public void show()
    {
            it1.super.show();
            it2.super.show();
    }
  
    public static void main(String args[])
    {
        Interface i = new Interface();
        i.show();
    }
}




/*
// static method 
interface it1
{

public abstract void m1();

static void show()
    {
      System.out.println("static Method Executed");
    }

}


class Impl1 implements it1
{
	public void m1(){System.out.println("IN m1()");};

}

class Interface 
{
	public static void main(String[] args)
	{
		it1 obj =  new Impl1();
		obj.m1();
		it1.show();
	}
}


IN m1()
static Method Executed
*/





/*
// default method 

interface it1
{

public abstract void m1();

default void show()
    {
      System.out.println("Default Method Executed");
    }

}


class Impl1 implements it1
{
	public void m1(){System.out.println("IN m1()");};

}


class Interface 
{
	public static void main(String[] args)
	{
		it1 obj =  new Impl1();
		obj.m1();
		obj.show();
	}
}
IN m1()
Default Method Executed
*/



/*

interface it1							// it1 can be extended 
{
	int x=10 ;							// by default :  public static final			
	void m1();							// by default : public abstract
	void m2();
	void m3(int a , int b);
	static void fun(){}
}

abstract class Impl1 implements it1					// abstractb bcz we are not implementing all of the abstract methos here
{
	// x=25;							// x is final 
	public void m1()						// public is must	
	{	
		System.out.println("m1(): implementation: in Impl1");
	}

}

class Impl2 extends Impl1						// normal class all implementation  done 
{
	public void m2()
	{
		System.out.println("m2(): implementation: in Impl2");
	}
	public void m3(int x, int y)
	{
		int z =x+y;
		System.out.println("m3() AddFun: implementation: in Impl2  "+ z);		
	}
}

class Impl3 implements it1					
{
	public void m1()
	{		
		System.out.println("m1(): implementation: in Impl3");	
	}
	public void m2()
	{
		System.out.println("m2(): implementation: in Impl3");
	}
	public void m3(int x, int y)
	{
		int z =x+y;
		System.out.println("m3() AddFun: implementation: in Impl3  "+ z);		
	}
}
	
class Interface 
{
	public static void main(String[] args)
	{
		it1 obj =  new Impl2();
		obj.m1();
		obj.m2();
		obj.m3(2,3);
		System.out.println("============================================");

		it1 obj1 =  new Impl3();
		obj1.m1();
		obj1.m2();
		obj1.m3(2,10);

		System.out.println("============================================");

		Impl3 a =  (Impl3)obj1;
		System.out.println("DOWNCAST  "+ a.x);
	}
}

*/  