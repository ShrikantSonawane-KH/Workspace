// Access Modifiers basics


/* only one public class in java file 
   outer class can not be private and protected , it may be public and default
   inner class may be private/public/protected and default
   if we want 2 classes public - go for 2 java file in same package 
*/


class C1
{

	public int a=10;		// anywhere
	private int b =20;		// only in class
	int c=15;
	public void display()		// anywhere
	{
	 System.out.println("=====");
	}
	 
	private void show()		// only in class
	{
	 System.out.println("*****");
	}
	
	protected void show1()		// only in class
	{
	 System.out.println("++++");
	}
	
}

class C2
{
	public static void main(String[] args)
	{
	C1 obj1 = new C1();

	System.out.println(obj1.a);

	// System.out.println(obj1.b);		//error: b has private access in C1
	
	obj1.display();
	//obj1.show();
	System.out.println(obj1.c);
	obj1.show1();

	}
}




