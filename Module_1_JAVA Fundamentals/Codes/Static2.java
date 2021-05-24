// static Method/variables
// on access modifire

class C2
{
	protected static int a = 10;					//will get memory only once and retain its value  
	int b=0;
	
	public  static int show()
	{
	 return a;
	}
					
}
class Static2
{

 	public static void main(String[] args)
	{
	  C2 obj = new C2();		
	   obj.a = 20;						//a-->20 if a in C2 is private : it is not accessible
	  System.out.println("static Var: " + obj.a);

	  int d =obj.show();							
	  System.out.println("static Var: " + d);		//20
	}
}


