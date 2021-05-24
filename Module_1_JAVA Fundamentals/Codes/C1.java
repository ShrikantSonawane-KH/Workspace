// Access Modifiers basics


/* A Java source file can have only one class declared as public, 
   we cannot put two or more public classes together in a . java file. 
   This is because of the restriction that the file name should be same as the name of the public class.
 
*/


class C2
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

public class C1
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




