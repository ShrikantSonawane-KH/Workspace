import java.util.*;

class Pali
{

public static void main(String[] args)
{
	System.out.print("enter num: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	String s1="";
	int a=num;
	while(num!=0)
	{
	  int rem = num%10;
	  s1=s1+rem;  
	  num=num/10;
	  
	}
	int b=Integer.parseInt(s1);
	if(a==b)
		System.out.println(b+ " is Palindrome");
	else 
		System.out.println(b+ " is not a Palindrome");
	
} 
}



