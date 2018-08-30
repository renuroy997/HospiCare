import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class BILLING3{
    public static void main(String args[]){
    }
    public static void  billing(String pid,String pname,String gen,String disease,String adt,String doctorid,String dchgdt,String romchrg,String bildate,String svcchrges,String trchges,String paymode,String tchrge,String tpaid){
 
         try{
             int i=0;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
                    System.out.println("connection establsihed");
                    String sql="insert into bil values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1, pid);
                    ps.setString(2, pname);
                    ps.setString(3, gen);
                    ps.setString(4, disease);
                    ps.setString(5, adt);
                    ps.setString(6, doctorid);
                    ps.setString(7, dchgdt);
                    ps.setString(8, romchrg);
                    ps.setString(9, bildate);
                    ps.setString(10, svcchrges);
                    ps.setString(11, trchges);
                    ps.setString(12, paymode);
                    ps.setString(13, tchrge);
                    ps.setString(14, tpaid);
                    ps.executeUpdate();
                    
         }
         catch(Exception e){
             System.out.println("exception caught"+e);
    }
}
}
    