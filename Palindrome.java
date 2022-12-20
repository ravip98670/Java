import java.util.Scanner;
	class Palindrome{
		void check()
		{
			int n,sum,r;
			System.out.printf("Enter the number:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
			int num=n;
			sum=0;
			while(num>0)
			{
				r=num%10;
				sum=sum*10+r;
				num=num/10;
			}
			if(sum==n)
				System.out.print("Palindrome");
			else
				System.out.print("Not Palindrome");
		}
		
		public static void main(String ...s){
			 
				Palindrome p1=new Palindrome();
				p1.check();
		}
	}
	
				
			
		