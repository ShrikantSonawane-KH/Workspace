/*
static Function overloading:
*We can have two ore more static methods with same name, but differences in input parameters.
*We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same) 
*We cannot overload by return type only. keeping parameter order and type same.
*/

class operation 
{

int sum(int i, int j)
{
 return i+j;
}

double sum(int i, int j)				// differ by return type ward - not be overload
{
  return i+j;
}
}

class FunOverloadReturntype
{
public static void main(String[] args)
{
	operation op = new operation();
	
	System.out.println(op.sum(1,2.4f));

	System.out.println(op.sum(1,2.4f));
}
}