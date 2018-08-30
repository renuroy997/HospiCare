import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PATIENTREG1{
    public static void main(String args[]){
    }
    public static void  reg(String p_id,String name,String f_name,String add,String cont,String email,String age,String gen ,String bg){
        
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
                    System.out.println("connection establsihed");
                    String sql="insert into hos1 values(?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1,p_id);
                    ps.setString(2,name);
                     ps.setString(3,f_name);
                     ps.setString(4,add);
                     ps.setString(5,cont);
                     ps.setString(6,email);
                    ps.setString(7,age);
                     ps.setString(8,gen);
                      ps.setString(9,bg);
                      ps.executeUpdate();
         }
         catch(Exception e){
             System.out.println("Exception caught");
         }
    }
    
}