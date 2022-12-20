class StudentData{
	int id;
     String name;
	 static String clg="Ucer";
	 
	StudentData(int id,String name){
    this.id = id;
    this.name = name;
    }
	
	
	
    void display()
	{
		System.out.println(id+" "+name+" "+clg);
	}
    public static void main(String ...s){
    StudentData s1 = new StudentData(111,"Ravi");
    StudentData s2 = new StudentData(222,"Neel");
    s1.display();
    s2.display();
}
}