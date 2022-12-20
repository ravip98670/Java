import java.sql.*;
public class firstjdbc {
    public static void main(String ar[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//step1:register or loading driver
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Ravi@2002");//step2:Creating Connection
            if(con!=null){
                System.out.println("Connected");
            }else{
                System.out.println("not Connected");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
