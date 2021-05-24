import java.util.*;

class Fabo
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter num1:");
	int num1 = sc.nextInt();
	System.out.print("Enter num2:");
	int num2 = sc.nextInt();
	System.out.print(num1+" ");
	System.out.print(num2+" ");
	int i=0;
	while(i<=7) 
	{
	  
	  int res=num1+num2;
	  num1=num2;
	  num2=res;	   
	  System.out.print(res+" ");
	i++;
	}
		
	

	
} 
}

