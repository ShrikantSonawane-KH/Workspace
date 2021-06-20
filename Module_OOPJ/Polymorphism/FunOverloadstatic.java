/*
static Function overloading:
*We can have two ore more static methods with same name, but differences in input parameters.
*but , We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same) 
*/

class operation 
{

static int sum(int i, int j)
{
 return i+j;
}

/*
int sum(int i, int j)		// differ by static key ward - not be overload
{
 return i+j;
}
*/
static int sum(int i, int j)
{
 return i+j;
}

}

class FunOverloadstatic
{

public static void main(String[] args)
{
	System.out.println(operation.sum(10,20));
//	System.out.println(operation.sum(10,20,30));
	System.out.println(operation.sum(10,10));
}

}