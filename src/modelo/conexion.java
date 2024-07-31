/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection con;
    String bd="ActivosFijosOfi";
    String url="jdbc:mysql://127.0.0.1:3307/"+bd;
    String user="root";
    String pass="";
    
    public Connection conectar(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con=DriverManager.getConnection(url,user,pass);
         
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e+" Asi que no se pudo conectar a la base de datos");
        }
        return con;
    }
}
