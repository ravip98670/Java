import java.util.Scanner;
	class Armstrong{
		public static void main(String ...s){
			
		int num,n,check=0,arm=0,r,n1,fact=1;
    System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
    n=num;
    while(n!=0)
	{
		n=n/10;
		check++;
	}
    n1=num;
    while(n1>0)
    {
        r=n1%10;
        n1=n1/10;
		fact=1;
		for(int j=1;j<=check;j++)
		 fact=fact*r;	
        arm=arm+fact;
    }
	 if(num==arm)
     System.out.println("Armstrong");
    else
     System.out.println("Not Armstrong");
	}
}
	
	