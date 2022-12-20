import java.util.Scanner;
import java.lang.Math;
class CompoundInterest{
	public static void main(String ...s){
		double amount=1000;
		double rate=10;
		double time=5;
		
		double total=0;
		System.out.println("Year\t\tValue");
		for(int i=1;i<=time;i++){
		total = amount * (Math.pow((1 + rate / 100), i));
		
		
		System.out.println(i+"\t\t"+total);
		
		}
	}
}
