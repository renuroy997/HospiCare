import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class profile11{
    public static void main(String args[]){
    }
    public static void  profile(String eid,String ename,String age,String dept ){
         try{
             int i=0;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
                    System.out.println("connection establsihed");
                    String sql="insert into e values(?,?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1,eid);
                     ps.setString(2,ename);
                      ps.setString(3,age);
                       ps.setString(4,dept);
                       ps.executeUpdate();
                    
         }
         catch(Exception e){
             System.out.println("Exception"+e);
         }
    }
}