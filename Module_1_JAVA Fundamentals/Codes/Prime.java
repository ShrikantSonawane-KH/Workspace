import java.util.Scanner;

class Prime
{
	public static void main(String[] args)
	{
	 int flag=0;
	 System.out.print("Enter the num:");
	 Scanner sc = new Scanner(System.in);

	 int num = sc.nextInt();
	if(num==0 || num==1)
	{
	 System.out.print(num + " is not a prime num");
	}
	 for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
		 System.out.println(num + " is not a prime num");
		 flag =1;
		 break;
		}
	}
	if(flag==0)
		System.out.println(num + " is a prime num");
		

}
}