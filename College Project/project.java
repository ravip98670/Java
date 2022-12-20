import java.sql.*;
import java.util.Scanner;
import java.io.Console;

class project {

    public void menu1() {
        while (true) {

            try {
                System.out.println("");
                System.out.println("\t\t\t\t\t\t\t\t\t****************************************");
                System.out.println("\t\t\t\t\t\t\t\t\t*        (1)New Admission              *");
                System.out.println("\t\t\t\t\t\t\t\t\t*        (2)Existing Student Details   *");
                System.out.println("\t\t\t\t\t\t\t\t\t*        (3)Avaliable Seat             *");
                System.out.println("\t\t\t\t\t\t\t\t\t*        (4)Exit From Admission Portal *");
                System.out.println("\t\t\t\t\t\t\t\t\t****************************************");
                System.out.print("\t\t\t\t\t\t\t\t\t<<<<Enter Your Choice:>>>>  ");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                switch (n) {
                    case 1:

                        Class.forName("oracle.jdbc.driver.OracleDriver");// step1:register or loading driver
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM",
                                "Ravi@2002");// step2:Creating Connection
                        System.out.print("\t\t\t\t\t\t\t\t\tEnter Student Id:");
                        int Id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Student Name:");
                        String stu = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Student DOB:");
                        String dob = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter College Name:");
                        String clg = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Date Of Admission:");
                        String date = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Course:");
                        String cus = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Student Address:");
                        String ads = sc.nextLine();
                        System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Phone_Number:");
                        String ph = sc.nextLine();

                        Statement st = con.createStatement();
                        int no = st.executeUpdate("insert into student_detail values('" + Id + "','" + stu + "','" + dob
                                + "','" + clg + "','" + date + "','" + cus + "','" + ads + "','" + ph + "')");
                        if (no != 0) {
                            System.out.println("\t\t\t\t\t\t\t\t\tDetail Added Succsessfully");
                        } else {
                            System.out.println("\t\t\t\t\t\t\t\t\tDetail Not  Added Successfully");
                        }
                        ResultSet rs = st.executeQuery("select *from student_detail");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("\t\t\t\t\t\t\t\t\t**********************************************************************************");
                        while (rs.next()) {

                            System.out.println("\t\t\t\t\t\t\t\t\t"+rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
                                    + rs.getString(4) + "  " + rs.getString(5) + "  " + rs.getString(6) + "  "
                                    + rs.getString(7) + "  " + rs.getString(8));

                        }
                        System.out.println("\t\t\t\t\t\t\t\t\t**********************************************************************************");
                        break;

                    case 2:
                        System.out.print("\t\t\t\t\t\t\t\t         Enter the Student Id :");
                        int std = sc.nextInt();
                        Class.forName("oracle.jdbc.driver.OracleDriver");// step1:register or loading driver
                        Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM",
                                "Ravi@2002");// step2:Creating Connection
                        Statement st1 = con1.createStatement();
                        ResultSet rs1 = st1.executeQuery(
                                "SELECT STUDENT_ID,NAME,DOB,COLLEGE,DATE_OF_ADMISSION,COURSE,ADDRESS,PHONE_NUMBER FROM STUDENT_DETAIL WHERE STUDENT_ID="
                                        + std);
                        if (rs1.next()) {
                            System.out.println("");
                            System.out.println("");
                            
                            System.out.println("\t\t\t\t\t\t\t\t\t****************************************");
                            System.out.println("\t\t\t\t\t\t\t\t         Student Id: "+rs1.getString(1));
                            System.out.println("\t\t\t\t\t\t\t\t         Name: " + rs1.getString(2));
                            System.out.println("\t\t\t\t\t\t\t\t         DOB: "+ rs1.getString(3)); 
                            System.out.println("\t\t\t\t\t\t\t\t         College: "+ rs1.getString(4));
                            System.out.println("\t\t\t\t\t\t\t\t         Date of Admission: "+ rs1.getString(5));
                            System.out.println("\t\t\t\t\t\t\t\t         Course: "+ rs1.getString(6));
                            System.out.println("\t\t\t\t\t\t\t\t         Address: "+ rs1.getString(7));
                            System.out.println("\t\t\t\t\t\t\t\t         Phone Number: "+ rs1.getString(8));
                           
                        }
                        System.out.println("");
                        System.out.println("\t\t\t\t\t\t\t\t\t****************************************");
                        break;

                    case 3:
                        Class.forName("oracle.jdbc.driver.OracleDriver");// step1:register or loading driver
                        Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM",
                                "Ravi@2002");// step2:Creating Connection
                        Statement st2 = con2.createStatement();
                        ResultSet rs2 = st2.executeQuery("select *from student_detail");
                        int total = 60;
                        int count1 = 0;
                        while (rs2.next()) {
                            count1++;
                        }
                        int registered = count1;
                        System.out.println("");
                        System.out.println("\t\t\t\t\t\t\t\t\t****************************************");
                        System.out.println("\t\t\t\t\t\t\t\t\t*       TOTAL SEAT:" + total+"                  *");
                        System.out.println("\t\t\t\t\t\t\t\t\t*       SEAT REGISTERED :" + registered+"             *");
                        System.out.println("\t\t\t\t\t\t\t\t\t*       AVAILABLE SEAT:" + (total - registered)+"              *");
                        System.out.println("\t\t\t\t\t\t\t\t\t****************************************");    
                        break;
                    case 4:
                        
                        System.out.println("");
                        System.out.println("\t\t\t\t\t\t\t||....................THANK YOU FOR VISITING ADMISSION PORTAL!!!...............||");
                        System.out.println("");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\t\t\t\t\t\t\t\t\tPlease Choose Correct Option");

                }
            }

            catch (Exception ex) {
                System.out.println(ex);
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t||.......................WELCOME TO ADMISSION PORTAL.......................||");
        while (true) {
            project p1 = new project();
            Console c = System.console();
            Scanner sc = new Scanner(System.in);

            try {
               

                while (true) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");// step1:register or loading driver
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM",
                            "Ravi@2002");// step2:Creating Connection
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select *from ADMIN_DETAIL");
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t\t\t*****************************");
                    System.out.println("\t\t\t\t\t\t\t\t\t*        (1)Login As Admin  *");
                    System.out.println("\t\t\t\t\t\t\t\t\t*        (2)SignUp As Admin *");
                    System.out.println("\t\t\t\t\t\t\t\t\t*****************************");
                    System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Choice:  ");
                    int n1 = sc.nextInt();
                    switch (n1) {
                        case 1:
                            System.out.print("\n\t\t\t\t\t\t\t\t\tEnter The User Id: ");
                            sc.nextLine();
                            String Id = sc.nextLine();
                            System.out.print("\t\t\t\t\t\t\t\t\tEnter The Password:");
                            char ch[] = c.readPassword();
                            String pass = new String(ch);
                            int count = 0;
                            while (rs.next()) {
                                if (Id.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
                                    count++;
                                    break;
                                }
                            }
                            if (count !=0) {
                                System.out.println("");
                                System.out.println("\t\t\t\t\t\t\t\t||................WELCOME TO MENU BAR!!!.................||");
                                System.out.println("");
                                p1.menu1();
                                System.exit(0);
                            } else
                                System.out.println("\t\t\t\t\t\t\t\t\tWrong Id or Password..");
                            break;

                        case 2:
                            System.out.print("\n\t\t\t\t\t\t\t\t\tEnter The New User Id:");
                            sc.nextLine();
                            String Id1 = sc.nextLine();

                            System.out.print("\t\t\t\t\t\t\t\t\tEnter The Password:");
                    
                            String pass1 = sc.nextLine();
                    
                            int no = st.executeUpdate("insert into admin_detail values('" + Id1 + "','" + pass1 + "')");
                            if (no != 0) {
                                System.out.println("");
                                System.out.println("\t\t\t\t\t\t\t\t\t      !!!!!Registered Successfully!!!!!");
                                System.out.println("\t\t\t\t\t\t\t\t\t      !!!!!Now You Can Login!!!!!");
                                break;
                            } else {
                                System.out.println("\t\t\t\t\t\t\t\t      SignUp Denied!!!!!");
                                break;
                            }

                        default:
                            System.out.println("\t\t\t\t\t\t\t\t\tWrong Input");
                            break;
                    }

                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}