import java.util.*;

class Great
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num1:");
	int num1 = sc.nextInt();
	System.out.print("Enter num2:");
	int num2 = sc.nextInt(); 
	System.out.print("Enter num3:");
	int num3 = sc.nextInt(); 	
	int gr = (num1<num2) ? ( (num2>num3) ?  num2 : num3 ) : ( (num1>num3) ? num1 : num3 );

	System.out.println("Great is :"+ gr);
} 
}

