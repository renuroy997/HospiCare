import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ADMIT12{
    public static void main(String args[]){
    }
    public static void  admit(String pid,String pname,String rno,String adate,String add,String contact ){
         try{
             int i=0;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
                    System.out.println("connection establsihed");
                    String sql="insert into p values(?,?,?,?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1, pid);
                       ps.setString(2, pname);
                          ps.setString(3, rno);
                             ps.setString(4, adate);
                                ps.setString(5, add);
                                   ps.setString(6, contact);
                                   ps.executeUpdate();
         }
         catch(Exception e){
             System.out.println("connection establsihed"+e);
         }
    }}