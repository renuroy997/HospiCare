import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
public class chpwd{
      static  Map<String,String> pwdMap=new HashMap <String ,String>(); 
 static {
            pwdMap .put("a","H");
              pwdMap .put("b","a");
                pwdMap .put("c","y");
                  pwdMap .put("d","H");
                    pwdMap .put("e","y");
                      pwdMap .put("f","u");
                        pwdMap .put("0","5");
                          pwdMap .put("1","6");
                           pwdMap .put("A","1");
                            pwdMap .put("B","2");
                             pwdMap .put("C","c");
                              pwdMap .put("D","d");
                               pwdMap .put("E","e");
                                pwdMap .put("F","f");
                                 pwdMap .put("G","g");  pwdMap .put("H","h");  pwdMap .put("I","i");  pwdMap .put("M","m");  pwdMap .put("N","n"); 
                                  pwdMap .put("O","o"); 
                                   pwdMap .put("V","v");  pwdMap .put("Y","8"); pwdMap .put("p","P");  pwdMap .put("r","R");  pwdMap .put("l","L");
        }
    public static void main(String args[]){
    }
    public static void pwd(String old,String neww,String re){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
             System.out.println("connection establsihed");
             String sql="select name from loggin where pas=old";
             PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            //System.out.println(rs.getString("pas"));*/
            
        }
        catch( Exception e){
            System.out.println("exception caught "+e);
        }
    }
}
