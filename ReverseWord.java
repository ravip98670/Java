class ReverseWord{
	public static void main(String ...s)
	{
		StringBuffer str=new StringBuffer("Hello I Am Ravi ");
        int start=0;
		StringBuffer rev=new StringBuffer("");
        for(int i=0;i<str.length();i++)
		{		
			if(str.charAt(i)==' '){
				String str1=str.substring(start,i+1);
				start=i;
				rev.insert(0, str1);
			}
		}
			
			
		
		System.out.println(rev);
	}
	
	
}
		
