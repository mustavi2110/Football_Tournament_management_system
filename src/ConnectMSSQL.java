
 import java.sql.Connection;
 import java.sql.DriverManager;  
 import java.sql.ResultSet;  
 import java.sql.Statement;  

public class ConnectMSSQL {  
     public void connectDB(){  
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor",   "sa", "123456");  
             
         } catch (Exception e) {  
             e.printStackTrace();   
         }  
     } 

 }  