import java.util.*;

class Fact
{
public static void main(String[] args)
{
	System.out.println("Enter num:");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt(); 
	int i=1;
	int fact=1;
	while(i<=num)
	{
	  fact = fact*i;
	   i++;
	}
	System.out.print("fact is :"+ fact);
} 


}