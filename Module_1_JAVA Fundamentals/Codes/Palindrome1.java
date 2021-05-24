import java.util.Scanner;

class Palindrome1
{
	public static void main(String[] args)
	{
	 System.out.print("Enter the String: ");
	 Scanner sc = new Scanner(System.in);
	 String s1 = sc.nextLine();			//ABC CBA
	int j=s1.length()-1;
	int flag=0;

	 for(int i=0;i<j;i++,j--)
	{
	if(s1.charAt(i)==s1.charAt(j))
		continue;
	flag=1;
	break;
	}
	if(flag==0)
		System.out.println(s1 + " is Palindrome");
	else 
		System.out.println(s1 + " is not Palindrome");
}
}