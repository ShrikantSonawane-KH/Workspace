class Rectangle
{
	 int length;
	 int breadth;
	 int area;
	 void GetValue(int x, int y)
	{
	 length = x;
	 breadth = y;
	}
	void GetArea()
	{
	 area=  length * breadth;
	}
	void Display()
	{
	 System.out.println("Area is : "+ area);
	}

	public static void main(String[] args)
	{
	 Rectangle obj = new Rectangle();	
/*	 int x=10;
	 int y=20;
	 obj.GetValue(x,y);
	 obj.GetArea();
	 obj.Display();
*/
	obj.length = 11;
	obj.breadth = 20;
	
	int area;
	 System.out.println("Area is : "+ obj.length*obj.breadth);

	}
}