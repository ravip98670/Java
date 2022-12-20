
class Student2{
     int rollno;
     String name;
     static String college = "ITS";
     
     static void change(){
     college = "BBDIT";
     }

     Student2(int r, String n){
     rollno = r;
     name = n;
     }

     void display ()
	 {
		 System.out.println(rollno+" "+name+" "+college);
	 }

    public static void main(String args[]){
    Student2.change();

    Student2 s1 = new Student2 (111,"Karan");
    Student2 s2 = new Student2 (222,"Aryan");
    Student2 s3 = new Student2 (333,"Sonoo");

    s1.display();
    s2.display();
    s3.display();
    }
}


