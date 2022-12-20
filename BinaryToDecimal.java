import java.util.Scanner;
import java.lang.Math;
class BinaryToDecimal{
	
	public static void main(String ...s)
	{

		int n;
		System.out.println("Enter the binary number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int rem,p=0;
		double dec=0.0d;
		
		while(n!=0)
		{
			rem=n%10;
			dec = dec + rem*Math.pow(2,p);
			n=n/10;
			p++;
		}
		
		System.out.println(dec);	
	
	}
}

	
	