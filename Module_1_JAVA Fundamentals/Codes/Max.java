import java.util.Scanner;

class Max
{
	public static void main(String[] args)
	{
	
	
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.print("Enter 1st num:");
	a = sc.nextInt();
	System.out.print("Enter 2st num:");
	b = sc.nextInt();
	int c = (a>b) ? a:b;

	System.out.println("max between " + a + " & " + b + " : " + c);
}
}