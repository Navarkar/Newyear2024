package Inheritance;

public class student extends teacher
{
	private static int marks;
	private static int rno;
	private static String nm
	
	public student(int marks,int rno,String nm) 
	{
		this.marks=marks;
		this.rno=rno;
		this.nm=nm;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		student s1=new student(90, 10, "Priya");
		System.out.println(marks+ " " +rno+ " " +nm+ " " +name+ " " +subject);
		// TODO Auto-generated method stub

	}

}
