import java.sql.*;  
class ACCFirstTask
{  
public static void main(String []a){  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/ACC","root","system");  
System.out.println("Connection with ACC made");  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  