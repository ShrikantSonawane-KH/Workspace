import java.util.*;

class Prime
{

public static void main(String[] args)
{
	System.out.print("enter num: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int flag=0;
	int flag1=0;

	if( num==0 || num==1 )
	{
	 System.out.print("Enter num other than 0 & 1");
	}


	for(int i=2; i<=num/2;i++)
	{
	  if(num%i==0)
		{
	        System.out.print( num+ " is not prime ");
		flag=1;
		flag1=1;
		break;
		}
	}
	
	if(flag==0 && flag1==1) 
	{
	  	System.out.println( num+ " is a prime");
	}
	
} 
}



