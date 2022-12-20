import java.util.Scanner;

class Factorial_Using_Recursion{

    static int factorial(int n){
        if(n==0 || n==1)
            return (1);
        else
            return (n*factorial(n-1));
    }
    public static void main(String ...s){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        System.out.println("The factorial of " +n+ " is " +factorial(n));
    }
}