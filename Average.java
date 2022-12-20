import java.util.Scanner;

class Average{
	public static void main(String ...s){
		int n1,n2,n3;
		
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		int average=(n1+n2+n3)/3;
		System.out.println("Average="+average);
	}
}

		
		
