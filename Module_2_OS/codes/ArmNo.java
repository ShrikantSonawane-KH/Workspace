

import java.util.*;

class ArmNo
{

public static void main(String[] args)
{
	System.out.print("enter num: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int count=0,cnt=0,mul=1,rem;
	int a=num,sum=0;

	while(num!=0)			
	{
	 num=num/10;
	 count++;
	}
	cnt=count;
	num=a;
	while(num!=0)
	{
	  rem=num%10;
		while(cnt!=0)
		{
		 mul = mul *rem;
		 cnt--;
		}
	    num=num/10;
	   sum = sum+mul;
	   cnt=count;
	   mul=1;
	}
	if (a==sum){
	System.out.print(sum +" is an Armstrong num");
	}
	else{
	System.out.print(sum +" is not an Armstrong num");
	}

	
} 
}






