import java.util.Scanner;

class Armstrong
{

	public static void main(String[] args)    
	{
	 System.out.print("Enter the num:");
	 Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	int count=0,mul=1,result=0,rem;   
	int n=num,cnt=0;

	while(num!=0)				
	{
 	 num=num/10;				 
 	 count++;
  	 //System.out.print("count" + count);
	}
	cnt = count;
	num=n;

	while(num!=0)
	{
	rem=num%10;				
		while(cnt!=0)
		{
		mul=mul*rem;			
		cnt--;
		}
	num=num/10;				
	result=result+mul;			
	cnt=count;
	mul=1;
	}
	if (result==n){
	System.out.print(result +" is an Armstrong num");
	}
	else{
	System.out.print(result +" is not an Armstrong num");
	}
}
}