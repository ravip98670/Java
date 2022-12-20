import java.util.Scanner;
class Smallest{
	
	
	void smaller(){
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
	
		
		int c,d;
		c=n1<n2?n1:n2;
		d=c<n3?c:n3;
		System.out.println("Smallest Number="+d);
		
	}
	public static void main(String ...s){
		
		Smallest s1=new Smallest();
		
		
		s1.smaller();
		
		
		
		
		
	}
}