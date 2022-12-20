import java.util.Scanner;

class Strongnumber{
    void strong()
    {
        int n,fact,sum=0,num,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        
        num=n;
         while(num>0)
         {
            r=num%10;
            fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;

         }
         if(n==sum)
         System.out.println("Strong Number");
         else
         System.out.println("Not Strong Number");

    }

    public static void main(String ...s){
        Strongnumber s1=new Strongnumber();
        s1.strong();
    }
}






