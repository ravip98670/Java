import java.util.Scanner;

	class Prime
	{
		public static void main(String ...s)
		{
			int flag=0;
			int i=1;
			System.out.println("Enter The Number To Check Or Not:");
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			
			
			for( i=1;i<=N;i++)
			{
				if(N%i==0)
				{
					flag++;
				}
			}
			if(flag==2)
				System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
		}
	}
		

				
					