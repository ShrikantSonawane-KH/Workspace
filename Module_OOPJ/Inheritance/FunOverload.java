/*
	Function overloading 
	1.no. of parameter
	2.
*/

class operation 
{

static int sum(int i, int j)
{
 return i+j;

}
static float sum(float i, int j)

{
 return i+j;
}
static void show (int res)
{
 System.out.println(res);
}
 static void show(float res)
{
 System.out.println(res);
}
}

class FunOverload
{

public static void main(String[] args)
{

/*
int r=operation.sum(11,12);
operation.show(r);

float r=operation.sum(11.12f,12);
operation.show(r);


float r=operation.sum(11,12.21f);	//no suitable method found for sum(int,float)
operation.show(r);			// mismatch is not allowed
*/
}

}