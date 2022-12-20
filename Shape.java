class Shape{
	
	int area(int x,int y)
	{
		return x*y;
	}
	int area(int s)
	{
		return s*s;
	}
	double area(double a,double b)
	{
		return 1.0/2.0*(a*b);
	}
	
		
	public static void main(String ...s){
		
		Shape Ss=new Shape();	
		System.out.println("Area of Rectangle="+Ss.area(1,2));
		System.out.println("Area of Square="+Ss.area(4));
		System.out.println("Area of Triangle="+Ss.area(4.0,6.0));
		
	}
}

	