/*
derived(child) class can acces the data of Base(parent) class  
but base(parent) class not allowed acces the data of derived (child)class  

protected, default, public are allowed - same package
protected, default, public are allowed -  same package diff file

*/

//  testing within same package


class DeriveClassTest extends BaseClass
{
	
	void testDerived_2()
	{
		System.out.println("IN testDerived_2");
	}
	
}
