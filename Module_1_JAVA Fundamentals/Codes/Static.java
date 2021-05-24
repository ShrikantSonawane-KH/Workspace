// static Keyward


/* 
	Static can call with or without object and by class name
	static methods only access static variables and static methods
*/


class Static
{
	static int a = 10;					//will get memory only once and retain its value  
	Static()
	{
	 System.out.println("Outside the main:" + a);
	}					
	
	/*
	void display()							// to execute the S.o.p statement
	{
	 System.out.println("Outside the main:" + a);
	}
	*/				
	public static void main(String[] args)
	{
	
	 // display();
	  a=20;							// call directly
	  
	  System.out.println("before obj:" + a);
	  Static obj = new Static();				//call by object
	  
	  obj.a=30; 	  
	  System.out.println("after obj:" + a);

	  Static.a=40; 	  
	  System.out.println("by class name:" + a);
	}
}



