import java.sql.*;
public class secondjdbc {
    public static void main(String ar[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//step1:register or loading driver
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Ravi@2002");//step2:Creating Connection
            if(con!=null){
                System.out.println("Connected");
            }else{
                System.out.println("not Connected");
            }
            // int n=7;
            // String a="hariom";
            // String b="cse";
            Statement st=con.createStatement();
            // int no=st.executeUpdate("insert into student values('"+n+"','"+a+"','"+b+"')");
            // if(no!=0){
            //     System.out.println("added succsessfully");
            // }else{
            //     System.out.println("not added successfully");
            // }
            ResultSet rs=st.executeQuery("SELECT ID,NAME,BRANCH FROM STUDENT WHERE ID=1");
            if(rs.next()){

                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
