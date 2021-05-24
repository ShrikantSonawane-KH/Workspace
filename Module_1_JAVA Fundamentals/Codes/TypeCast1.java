//Narrowing datatype / explicit / downCasting  

class TypeCast1
{

public static void main(String args[])
{

	long i = 6545654894651546466L;
	short s = (short)i;
	char c = (char)i;			
	int in = c;			// no need to typeCast --> it will take char's integer value 
	int a = (int)i;						
	byte l =(byte) i;
	//float f=i;			// here no need to typeCast bcz it give us value as f :6.5456549E12				
	float f = 5.55555f;		
	long j = (long)f;		// float to long is not possible directly as (long j = f;)--> o/p:5
	
	double d1 =5.465464616144d;			
	long k =(long) d1;		// --> 5	
	float f1 = (float)d1;
	double d = i;			// d :6.545654894651E12
	System.out.println("i :"+i);
	System.out.println("s :"+s);
	System.out.println("c :"+c);
	System.out.println("in :"+in);
	System.out.println("a :"+a);
	System.out.println("l :"+l);
	System.out.println("f :"+f);
	System.out.println("d1 :"+d1);
	System.out.println("f1 :"+f1);
	System.out.println("d :"+d);
	System.out.println("j :"+j);
	System.out.println("k :"+k);
	
}
}