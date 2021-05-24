import java.util.Scanner;
import java.lang.String;

class Vowel
{
	public static void main(String[] args)
	{
	 System.out.print("Enter the ward: ");
	 Scanner sc = new Scanner(System.in);
	 String s1 = sc.nextLine();				
			
	 for(int i=0;i<=s1.length();i++)
	{
	 char c = s1.charAt(i);

	if(c==' ')					// To Manage white space
	{
	 continue;
	}

	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		  System.out.println(c + " is vowel");
	 
	 else
		System.out.println(c + " is consonent");

	 

	}

}
}