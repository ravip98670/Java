import java.util.Scanner;
import java.io.*;
class IoStream{
	public static void main(String ...s) throws IOException{
		System.out.println("Enter the file name :");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		sc.nextLine();
		FileOutputStream f1=new FileOutputStream((name+".txt"));
		System.out.println("Enter the text you want to insert into the file:");
		String s1=sc.nextLine();
		byte b[]=s1.getBytes();
		f1.write(b);
		System.out.println("Message Inserted:"+s1);
		System.out.println("enter some new message to update:");
		String s2=sc.nextLine();
		byte b1[]=s2.getBytes();
		f1.write(b1);
		f1.close();
		sc.close();
		System.out.println("Message Updated");
	}
}

		