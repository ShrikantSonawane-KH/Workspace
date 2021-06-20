/*
Abstraction: achived by 
1. Abstract class
2. Interface 

*A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.
*Points to Remember
    An abstract class must be declared with an abstract keyword.
    It can have abstract and non-abstract methods.
    It cannot be instantiated.
    It can have constructors and static methods also.
    It can have final methods which will force the subclass not to change the body of the method.
*an abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of an inherited class is created. For example, the following is a valid Java program. 
*we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated but can only be inherited.
*Abstract classes can also have final methods (methods that cannot be overridden). 
*For any abstract java class we are not allowed to create an object i.e., for abstract class instantiation is not possible. 
*Similar to the interface we can define static methods in an abstract class that can be called independently without an object. 
*/

abstract class bankAcc
{
	int AccNo;
	String Name;
	int bal;
	public void credit(int amount)
	{
	bal+=amount;
	System.out.println("Creadited  "+amount+" balance is : "+bal);
	}
	public void debit(int amount)
	{
	bal-=amount;
	System.out.println("Debited  "+amount+" balance is : "+bal);
	}
	public abstract double checkIntest();			//no body
} 

class BOM extends bankAcc
{
	public double checkIntest()				//abstract method should be public
	{
	 	int p = this.bal;
		double r = 0.84;
		double t = 0.25;	
		double intrest = p*r*t;
		return intrest;		
	}		
}

public class AbstractClass 
{
	public static void main(String[] args)
	{
		BOM b=new BOM();
		b.AccNo=111;
		b.Name="Shrikant";
		b.bal=5000;
		b.credit(1000);
		b.debit(500);
		double A=b.checkIntest();
		System.out.println("Intrest is :"+A);
	}
	

}














