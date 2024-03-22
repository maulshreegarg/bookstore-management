/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysql;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.logging.Logger;
/**
 *
 * @author moone
 */
public class ConnectMySql 
{

    public ConnectMySql() 
{
        try
        {
   
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem","root","root");
    Statement st=c.createStatement();
    }
    catch(Exception e)
    {
       System.out.print(e);
    }
    }
}