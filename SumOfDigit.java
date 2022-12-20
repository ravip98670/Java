import java.util.Scanner;
	class SumOfDigit{
		public static void main(String ...s){
			int n1,sum=0,r;
			
			System.out.println("Enter the number:");
			Scanner sc=new Scanner(System.in);
			n1=sc.nextInt();
			
			while(n1!=0)
			{
			r=n1%10;
			sum=sum+r;
			n1=n1/10;
			}
			System.out.println(sum);
			
		}
	}
	
			