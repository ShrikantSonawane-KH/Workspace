import java.util.*;

class Swap
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 1st Num:");
	int a = sc.nextInt();
	System.out.print("Enter the 2nd Num:");
	
	int b = sc.nextInt();
	System.out.println("befor Swap  a:"+ a +" & b:"+b);
	System.out.println("============================");
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swap  a:"+ a +" & b:"+b);
	
} 


}