import java.util.Scanner;

class Max1
{
	public static void main(String[] args)
	{
	
	
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter 1st num:");
	a = sc.nextInt();
	System.out.print("Enter 2st num:");
	b = sc.nextInt();
	System.out.print("Enter 3st num:");
	c = sc.nextInt();
	int d =  a > b ? ( a > c ? a : c) : (b > c ? b : c) ;

	System.out.println("max between " + a + " & " + b + " & " + c + ":" + d);
}
}