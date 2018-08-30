import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class LOGGIN1 {
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
                         
        }
    public static void main(String args[]){
    }
     static public  Boolean pswrd(String user1,String pass){
    
         String str1=null;
     try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@Localhost:1521/xe";
            String user ="system";
            String passwrd="Renu@1234";
            Connection conn=DriverManager.getConnection(url,user,passwrd);
            System.out.println("connection establsihed");
      
            String gd="select pas from loggin where use=?";
            
            PreparedStatement ps1=conn.prepareStatement(gd);
            ps1.setString(1,user1);
            ResultSet fr=ps1.executeQuery();
            while(fr.next())
            {
               str1=fr.getString("pas");
                System.out.println("database retrive"+fr.getString("pas"));
            }
        }
        catch(Exception e){
            System.out.println("exception caught"+e);
        }
      
          System.out.println("heyyy encryption technique");
      String opwd=pass;
       System.out.println(" heyyb boss"+opwd);

       String dpwd="";
      // String sqlt="select pas from loggin where use=?";
              
       char ch[]=opwd.toCharArray();
         for(char c:ch){
             if(pwdMap.containsKey(""+c)){
                  System.out.println("hey if");
                 String value=pwdMap.get(""+c);
                 System.out.println(value);
                 dpwd+=value;
             }
            else
             {
                 dpwd+="~";
             }
         }
        System.out.println("dpwd " +dpwd);
     if(dpwd.equals(str1)){
         return true;
         
     }
     else
         return false;
     }
   
    
}
