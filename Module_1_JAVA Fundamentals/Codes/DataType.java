// Data Type / default values / valid / range

class DataType
{

public static void main(String args[])
{
/*	
	 byte b ;				// error: not initialized
	byte b = (byte)135;			 // if we take : byte b = 129;-->give compatible error(without typecast)			
	// Range : -128 to 127
	// 135-256
	System.out.println("Byte b :"+b);

	 byte b = (byte)true;			 // incompatible types: boolean cannot be converted to byte			

	byte b = 'a';				// ok --> all char up to 1 byte
	System.out.println("Byte b :"+b);

 	byte b =(byte) "Ria";			//incompatible types: String cannot be converted to byte	
	System.out.println("Byte b :"+b);


	byte b = a;				//cannot find symbol				
	System.out.println("Byte b :"+b);

//===========================================================================================================
	 
	// short b;			       	// error: not initialized
	// short b = 32768;			// incompatible types: possible lossy conversion from int to short(without typecast)			
	// Range : -32768 to 32767
	 short b =(short) 32780;
   	//2^16 = 0 - 65535 = 65536
	// 32780 - 65536 = ans :-32756
	System.out.println("Short b :"+b);

	 short b =  true;			 // incompatible types: boolean cannot be converted to short
	 System.out.println("Short b :"+b);

	 short b = (short) true;		// boolean cannot be converted to short
	 System.out.println("Short b :"+b);  



	short b =  'r';			 	//ok up to 2 byte --> 114
	System.out.println("Short b :"+b);

 	short b =(byte) "Ria";			//incompatible types: String cannot be converted to byte
	System.out.println("Short b :"+b);


	short b = 'a';				//97
	System.out.println("Byte b :"+b);

//===========================================================================================================
	

	// int  b;			       		// error: not initialized
	// int  b = 2147483650;				// incompatible types
	// Range : -2147483648 to 2147483647
	 int b = (int) 2147483650;  			// error? integer number too large:
	
   	//2^32 = 0 - 4,294,967,295 = 4,294,967,296
	// 2147483650 - 4294967296 = ans : -2147483646
	System.out.println("int b :"+b);



	 int b =  true;			     		// boolean cannot be converted to int
	 System.out.println("int b :"+b);


	 int b = (short) true;				//boolean cannot be converted to int
	System.out.println("int b :"+b);

	int b =  'r';			 		//ok up to 4 byte --> 114
	System.out.println("Short b :"+b);

 	int b =(byte) "Ria";				// String cannot be converted to byte
	System.out.println("Short b :"+b);



	int b = 'a';					//97
	System.out.println("Byte b :"+b);
	



//===========================================================================================================


	// float  b;			       		// error: not initialized			
	// Range : 3.4e−038 to 3.4e+038
	   float  b= 5.56564658489f;  			// 
	
	System.out.println("float b :"+b);		//b :5.5656466



	 float b =  true;			     	// boolean cannot be converted to float
	 System.out.println("float b :"+b);


	  float b= (float) true;				//boolean cannot be converted to float
	System.out.println("int b :"+b);


	float b =  'r';			 		//ok up to 4 byte --> 114.0
	System.out.println("float b :"+b);


 	float b= (float) "Ria";				// String cannot be converted to float
	System.out.println("Short b :"+b);




	float b = 'a';					//97.0
	System.out.println("float b :"+b);	
}
}



//===========================================================================================================
// char	

	// char	b;			       		// error: not initialized			
	// Range : 0 to 65536
	   char	b= 97;					// 'a'or 97 both same-->a	
	System.out.println("char b :"+b);		//



	 char	b =  true;			     	// boolean cannot be converted to char
	 System.out.println("char b :"+b);


	  char b= (char) true;				//boolean cannot be converted to char
	System.out.println("char b :"+b);

	char b =  65.5f;				//incompatible types: possible lossy conversion from float to char		 		
	System.out.println("char b :"+b);


 	char b="Ria";					//  incompatible types: String cannot be converted to char
	System.out.println("char b :"+b);

 	char b=Ria;					//  incompatible types: String cannot be converted to char
	System.out.println("char b :"+b);
	
	char b="R,i,a";					//  incompatible types: String cannot be converted to char
	System.out.println("char b :"+b);

	char b='R,i,a';					//  incompatible types: String cannot be converted to char
	System.out.println("char b :"+b);


	char b='\u0004';					
	System.out.println("char b :"+b);
	
	char b='\c';					//  illegal escape character		
	System.out.println("char b :"+b);

	char b='\'';					// -->'			
	System.out.println("char b :"+b);
*/

	char b = '97';					//error :unclosed character literal
	System.out.println("char b :"+b);

}
}