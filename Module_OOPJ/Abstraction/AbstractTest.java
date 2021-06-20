/*
abstract class: 0 to 100 Abstraction.

Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    An abstract class must be declared with an abstract keyword.
    It can have abstract and non-abstract methods.
    It cannot be instantiated.
    It can have constructors and static methods also.
    It can have final methods which will force the subclass not to change the body of the method.
*The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.

* abstract methods can't be private, static ,final.
*in the subclass we can make inherited abstract methos as protected , private,public

*/


/*
abstract class Base
{  	
	abstract void m1();
	abstract void m2(int x);
	final void m3()
	{
		System.out.println("FINAL METHOD");
	}
}  
class AbstractTest extends Base
{  
	void m1()
	{
	System.out.println("IN: m1()");  
	}
	void m2(int x)
	{
	System.out.println("x:"+x);  
	}

	final void m3()			//Error: overridden method is final
	{
	}

	public static void main(String args[])
	{  
 	Base obj = new AbstractTest();  
 	obj.m1(); 
	obj.m2(2); 
	obj.m3();
	}  
}
*/


/*
making an obj of derived  class call  contructor present in it then it immidiate go for---> Base class constructor (the first one constructor which call)
an s---> come back to derived class constructor and execute 

*/

/*
// default constructos in abstract

abstract class Base
{  	
	int a;
	void nonabstract(){}					//possible
	abstract void m1();  
	abstract void m2(int x);
}  
class Derived1 extends Base
{  
							
	void m1()
	{
	System.out.println("IN Derived1: m1()");  
	}
	void m2(int x)
	{
	System.out.println("x:"+x);  
	}
}
class Derived2 extends Base
{  
	void m1()
	{
	System.out.println("IN Derived2: m1()");  
	}
	void m2(int x)
	{
	System.out.println("x:"+x);  
	}
}
class AbstractTest 
{
	public static void main(String args[])
	{  
 	Base obj = new Derived2();  
 	obj.m1(); 
	obj.m2(2) ;
	System.out.println("a"+obj.a);					// by default : a=0 bcz there is a default constructor present in abstract class, 
	System.out.println("==================================");
	Base obj1 = new Derived1();  
 	obj1.m1(); 
	obj1.m2(4); 

	}  
}

*/


/*
abstract class Base
{  	
	int a;
	Base(){System.out.println("IN : Base default constructor");  }
	void nonabstract(){}					
	abstract void m1();  
	abstract void m2(int x);
}  
class Derived extends Base
{  
	Derived (){System.out.println("IN : Derived  default constructor");  }						
	void m1()
	{
	System.out.println("IN Derived: m1()");  
	}
	void m2(int x)
	{
	System.out.println("x:"+x);  
	}
}

class AbstractTest 
{
	public static void main(String args[])
	{  
	System.out.println("==================================");
 	Base obj = new Derived();  
 	obj.m1(); 
	obj.m2(2) ;
	System.out.println("a = "+obj.a);					
	System.out.println("==================================");
	}  
}
*/


//Parameterised constructor in abstracts
/*
	we can use super() keyward to call the declared constructor of base.
	otherwise it shows error
*/

/*
abstract class Base
{  	
	int a;
	Base(int b){System.out.println("IN : Base default constructor "+b);  }
	void nonabstract(){}					
	abstract void m1();  
	abstract void m2(int x);
}  
class Derived extends Base
{  
	Derived (int a)
	{
	super(50);				// it must be at first in derived constructor
	System.out.println("IN : Derived  default constructor "+ a);  
	
	}						
	void m1()
	{
	System.out.println("IN Derived: m1()");  
	}
	void m2(int x)
	{
	System.out.println("x:"+x);  
	}
}

class AbstractTest 
{
	public static void main(String args[])
	{  
	
 	//Base obj = new Derived(); 				// error that asking for give the parameter to Derived() constructor
 						
	System.out.println("==================================");
	Base obj = new Derived(14);  
	obj.m1(); 
	obj.m2(2) ;
	System.out.println("==================================");
	}  
}

*/
abstract class Base
{  	
	 abstract void m1(); 
}  
class Derived extends Base
{  
	Derived ()
	{	
	System.out.println("IN : Derived  default constructor ");  
	}	
	public void m1()
	{
	System.out.println("IN Derived: m1()");  
	}					
}

class AbstractTest 
{		
	public static void main(String[] argd)
	{			
	System.out.println("==================================");
	Base obj = new Derived();  
	obj.m1();
	System.out.println("==================================");
	}  
}





