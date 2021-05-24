class Pattern8
{

public static void main(String args[])

{
int c = 0;
for(int i=1; i<=5 ;i++)
{
	for(int j=1; j<=i ;j++)				
	{
	 c = c + j;
	 System.out.print(j);
	}
	 System.out.print(" "+ c);
	c = 0;
	System.out.println();
}

}

}
