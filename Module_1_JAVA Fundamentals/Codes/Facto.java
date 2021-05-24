import java.util.Scanner;

class Facto
{
	public static void main(String[] args)
	{
	 System.out.print("Enter the num: ");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();				
	 int fact=1;
	if(num==0 || num==1)
	{
	 System.out.println("Factorial is " + "1");
	}
		
	 for(int i=1;i<=num;i++)
	{
	 
	 fact=fact*i;
	}
	System.out.println("Factorial is " + fact );

}
}