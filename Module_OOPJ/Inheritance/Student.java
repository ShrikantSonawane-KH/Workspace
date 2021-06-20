
public class Student
{
	 int id;
	String name;
	String location;

	void SetVal(int id,String name, String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	String display()
	{
		return String.format("%d,%s,%s",id,location,name);	//format() method used in String class	
	}
	
	public static void main(String[] args)
	{
		Student student = new Student();		//() is must
		student.SetVal(1444,"Shrikant","Shirdi");
		String s1=student.display();
		System.out.println(s1);	
	}
}