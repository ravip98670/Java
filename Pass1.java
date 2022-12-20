import java.io.*;
class pass1
{
	public static void main(String arg[]){
	Console c=System.console();
	System.out.print("Enter the password");
	char ch[]=c.readPassword();
	String s1=new String(ch);
	System.out.println(s1);
	if(s1.equals("ab"))
	{
		System.out.println("Welcome");
	}
	else {
		System.out.println("wrong password");
	}
	}
}