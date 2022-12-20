import java.util.Scanner;
class WordCount{
		public static void main(String ...s){
			int count=0;
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==' ')
					count++;
			}
			
			
			System.out.println("Total number of words="+(count+1));
		}
}
