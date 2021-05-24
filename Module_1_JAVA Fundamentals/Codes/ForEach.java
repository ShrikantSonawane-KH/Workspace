// Basics of Array

import java.util.*;

class ForEach
{

public static void main(String args[])
{

int[] a = {1,2,3,4,5,6,7,8,9,10};
System.out.println("==================================");

for (int x : a)
{
 x = x*2;			
 System.out.print(x + " ");	//2 4 6 8 10 12 14 16 18 20  : the only change in x var , not in the array element
}
 System.out.println();

System.out.println("==================================");
for (int x : a)
{
 System.out.print(x + " ");	//1 2 3 4 5 6 7 8 9 10  : the above x=x*2 did not affect on array value
}

}
}