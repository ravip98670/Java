class Student1
{	
	int id,phone;
	String name;
	String address;
		Student1(int i,int ph,String n,String ad)
		{
			id=i;
			name=n;
			phone=ph;
			address=ad;
		}
		void display(){
			System.out.println(id+" "+name+" "+phone+"  "+address);
			
			
		}
					
	public static void main(String ...s)
	{
		
		    Student1 s1=new Student1(101,932438,"Ravi","Prayagraj");
            s1.display();
	}
}
