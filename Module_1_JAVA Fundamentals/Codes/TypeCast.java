//Widening datatype / implicite/ Upcasting  

class TypeCast
{

public static void main(String args[])
{

	byte i = 65;
	short s = i;
	char c = (char)s;			//char c = s; not incompatible types
	int in = c;
	int a = i;				//ok ,but int i=65; char c= i , not incompatible types		
	long l = i;				//but char c ='a'; ---> int i = c -->ASCII of char 'a';
	float f = i;	
	double d = i;
	System.out.println("i :"+i);
	System.out.println("s :"+s);
	System.out.println("c :"+c);
	System.out.println("in :"+in);
	System.out.println("a :"+a);
	System.out.println("l :"+l);
	System.out.println("f :"+f);
	System.out.println("d :"+d);
	
}
}