import java.util.Scanner;
class Student
{
	int cid;
	void setter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the college id");
		cid=sc.nextInt();
	}
	void getter()
	{
		System.out.println(cid);
	}
	public static void main(String ...s)
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setter();
		s2.setter();
		s1.getter();
		s2.getter();
	}
}