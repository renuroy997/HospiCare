import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DISCHARGE2{
    public static void main(String args[]){
    }
    public static void  discharge(String pid,String name,String gender,String bg,String disease ,String adate,String rno,String did,String ddate){
         try{
            
           int i=0;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
                    System.out.println("connection establsihed");
                       String sql="insert into di values(?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1, pid);
                      ps.setString(2, name);
                        ps.setString(3, gender);
                          ps.setString(4, bg);
                            ps.setString(5, disease);
                              ps.setString(6, adate);
                                ps.setString(7, rno);
                                  ps.setString(8, did);
                                    ps.setString(9, ddate);
                                    ps.executeUpdate();
         }
         catch(Exception e){
              System.out.println("Exception caught"+e);
         }
    }
}