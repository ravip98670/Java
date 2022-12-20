import java.util.Scanner;
	class Fibbonacci{
		
		  public static void main(String ...s){
			  int n1;
			  int a=0,b=1,temp=0;
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the length of fibbonacci series:");
			   n1=sc.nextInt();
			  
			  System.out.print(a);
			  System.out.print("\t"+b);
			   
			   for(int i=1;i<n1;i++)
			   {
				   temp=a;
				   a=b;
				   b=temp+a;
				 
				   System.out.print("\t"+b);
			   }
		  }
	}
	
				   
			   
		