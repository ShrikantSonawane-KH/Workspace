// static Method/variables


/* 
	Static can call with or without object and by class name
	static methods only access static variables and static methods
*/


class Static1
{
	static int a = 10;					//will get memory only once and retain its value  
	int b=0;
	/*
	static int show()
	{
	 return b;				//error
	}					
	*/
	static int show()
	{
	 return a;
	}

	void display()							// to execute the S.o.p statement
	{
	 System.out.println("Outside the main:non static");
	}
					
	public static void main(String[] args)
	{
	  Static1 obj = new Static1();		
	  obj.display();
		 
	
	  int c = show();							
	  System.out.println("before Var: " + c);
	  a = 20;
	  int d = show();							
	  System.out.println("static Var: " + d);
	}
}



