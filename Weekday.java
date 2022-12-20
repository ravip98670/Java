import java.util.Scanner;
public class Weekday {
    public static void main(String ...s){
       /* int Weekday=3;
        if(Weekday==1)
        System.out.println("Monday");
        else if(Weekday==2)
        System.out.println("Tuesday");
        else if(Weekday==3)
        System.out.println("Wednesday");
        else if(Weekday==4)
        System.out.println("Thursday");
        else if(Weekday==5)
        System.out.println("Friday");
        else if(Weekday==6)
        System.out.println("Saturday");
        else if(Weekday==7)
        System.out.println("Sunday"); */
		
		int week;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the week day.:");
		week=sc.nextInt();
		
		switch(week){
			case 1:
					System.out.println("Monday");
					break;
			case 2:
					System.out.println("Tuesday");
					break;
			case 3:
					System.out.println("Wednesday");
					break;
			case 4:
					System.out.println("Thursday");
					break;
			case 5:
					System.out.println("Friday");
					break;
			case 6:
					System.out.println("Saturday");
					break;
			case 7:
					System.out.println("Sunday");
					break;
			default:
					System.out.println("Invalid input");
		}
		
    }
    
}
