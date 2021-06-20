/*

Upcasting & Down casting:

*/

class Base
{
	int a=10;
	void Test()
	{
		System.out.println("BASE : void Test() ");
	}
	void onlyBase()						// not overridden
	{
		System.out.println("BASE : void onlyBase() ");
	}

}

class Derived extends Base
{
	int a=50;
	void Test()
	{
		System.out.println("Derived : void Test() ");
	}

	void onlyDerived()
	{
		System.out.println("BASE : void onlyDerived()");
	}
	
}


class Derived1 extends Derived 
{
	int a=100;
	void Test()
	{
		System.out.println("Derived1 : void Test() ");
	}
}


class UpDounCast
{

	public static void main(String[] args)
	{

	System.out.println("================UPCAST===================");
	
	Base obj = new Derived();	
	obj.onlyBase();				// posible - obj is of Base type
//	 obj.onlyDerived();				// Error \ can't access the onlyDerived();	with Base class obj bcz it is not overriden
	
	System.out.println(obj.a);			//10 - call goes to Base class
	obj.Test();					//Derived : void Test() 
	
	System.out.println("===================================");
	
	Derived d1 = new Derived1();			//Posible : Base  obj1 = new Derived1();
	
	d1.onlyDerived();				// posible - bcz d1 is a Derived type reference
	
	d1.onlyBase();				// by rule of inheritance

	System.out.println(d1.a);			// 50
	d1.Test();					//Derived1 : void Test()
	
	System.out.println("================DOWNCAST===================");
     	
	//Derived obj2 = new Base();			//Error\Base cannot be converted to Derived

	Base obj2 = new Derived();			//must			
	
	Derived d = (Derived)obj2;

	System.out.println(d.a);			//50
	d.Test();					//Derived : void Test()
	
	System.out.println("===================================");
	
	Base obj3 = new Derived1();			//must		
	
	Derived1 d2=(Derived1)obj3;
	System.out.println(d2.a);			//100
	d2.Test();					//Derived1 : void Test()
	

	
	}
}