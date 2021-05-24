import java.util.Scanner;

class fibonacci
{

public static void main(String[] args)
{
System.out.print("Enter thhe num up to which Fibonaccin series req:");
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
int n1=0,n2=1,result=0;

for(int i=1;i<=num;i++)
{
System.out.print(n1 + " ");
result = n1+n2;
n1=n2;
n2=result;
}

}

}

