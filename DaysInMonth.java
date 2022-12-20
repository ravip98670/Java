 class DaysInMonth {
	public static void main(String[] args) 
	{
		int month=2;
		
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			System.out.println("\n 31 Days in this Month");  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			System.out.println("\n 30 Days in this Month");  	
		}  
		else if ( month == 2 )
		{
			System.out.println("\n Either 28 or 29 Days in this Month");  	
		} 
		
	}
}