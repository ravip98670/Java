import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String ...s)
	{
		int n;
		System.out.println("Enter the decimal number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int r,bin=0,i=1;
		while(n!=0)
		{
		r=n%2;
		n=n/2;
		bin=bin+r*i;
		i=i*10;
		
		}
		System.out.println(bin);

		
	}
}
