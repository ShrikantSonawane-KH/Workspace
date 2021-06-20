/*
Mutilple interface with same method & with attributes .
 Default Method:
* This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions. Then the old codes will still work.
* we can now define static methods in interfaces which can be called independently without an object. call it by interfaceName.Method();

Nested Interface:


Marker Interface :
*/

interface It1
{  
	int x=10;
	void print();  
	default void msg()
	{	
	System.out.println("default method");
	}  

}  

interface It2
{  
	int x=20;
	void print();  
	static void display()
   	 {
        	System.out.println(" static display method");
    	}
}    
class BothImpl implements It1, It2
{  
	public void print()
	{
	System.out.println("Hello");

	}  
	public static void main(String args[])
	{  
	BothImpl obj = new BothImpl();  
	obj.print();	  
	//System.out.println("X"+obj.x);  			//Error : \reference to x is ambiguous both varible match
	obj.msg();

	It2.display();
	 }  
}  