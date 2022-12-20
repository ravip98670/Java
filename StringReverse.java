class StringReverse{
	String reverse(String str)
		{
			String rev="";
			for(int i=0;i<str.length();i++)
			{
				rev=str.charAt(i)+rev;
			}
			return rev;
		}
	public static void main(String ...s){
		
	/*	String n="Ravi Pandey ";
		System.out.print(n.substring(4));
		System.out.println(n.substring(0,4));*/
		
			
		
		String s1="Ravi Pandey";
		StringReverse n=new StringReverse();
		String s2=n.reverse(s1);
		System.out.println(s2);
		}
}