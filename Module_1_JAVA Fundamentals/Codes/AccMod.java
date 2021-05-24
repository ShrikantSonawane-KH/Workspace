// Access Modifiers basics


/* only one public class in java file 
   outer class can not be private and protected , it may be public and default
   inner class may be private/public/protected and default
   if we want 2 classes public - go for 2 java file in same package 
*/


class C1
{

	public int a=1;			// anywhere
	private int b =20;			// only in class
	
	public void display()			// anywhere
	{
	 System.out.println("=====");
	}
/*	 
	private void display()		// only in class
	{
	 System.out.println("=====");
	}
*/	
}

public class AccMod
{
	public static void main(String[] args)
	{
	C1 obj1 = new C1();
	System.out.println(obj1.a);
	System.out.println("==============");
	
	C3 obj2 = new C3();
	System.out.println(obj2.a);
	//System.out.println(obj2.b);		// error

	}

}