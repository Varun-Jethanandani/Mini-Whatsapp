
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class MyConnection {
    public static java.sql.Connection connectDB(){
        try{
                 java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp","Varun","Ishika02*");
                JOptionPane.showMessageDialog(null,"Connection Successful","Connection!",JOptionPane.INFORMATION_MESSAGE);
                return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Connection unsuccessful" + e.getMessage(),"Connection!",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection unsuccessful" + e.getMessage(),"Connection!",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

