import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{

	 System.out.print("Enter the num up to which even/odd is required:");
	 Scanner sc = new Scanner(System.in);

	 int num = sc.nextInt();

	 for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
		 System.out.println(i + " is Even");
		}
		else
		{
		 System.out.println(i + " is a prime num");
		}
	}
	
		
		

}
}