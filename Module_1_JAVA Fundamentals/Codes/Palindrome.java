import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
	 System.out.print("Enter the num: ");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();				
	
	 int temp=num,rem,sum=0;
	 while(num>0)		//1221
	{
	rem=num%10;		//1,   2,  2,   1
	sum=sum*10+rem;		//1,   12, 122, 1221
	num=num/10;		//122, 12, 1,   0
	}
	if(temp==sum)
	{
	System.out.println(sum + " Palindrome");
	}
	else
	{
	System.out.println(sum + " Palindrome");
	}
}
}