/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Inicio.Inicio_App;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián HC
 */
public class Administrador extends Persona {
    boolean insertar = false;
    String rol;
    
    public Administrador(String usuario, String contrasegna, String correo, int edad, String rol){
        super(usuario, contrasegna, correo, edad);
        this.rol = rol;
    } 
    
    public Administrador(){
        
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO administradores(Nombre, Contrasegna, Correo, Edad, Rol, ID) VALUES(?,?,?,?,?,?)", usuario, constrasegna, correo, String.valueOf(edad), rol, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    } 
    
    public int actualizar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
       
        DataBase.update("UPDATE administradores SET Nombre=?, Contrasegna=?, Correo=?, Edad=?, Rol=? WHERE ID=?", id, usuario, constrasegna, correo, String.valueOf(edad), rol, id);
        
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }     
    
    public int eliminar(String id){ 
        int resultado = 0;
        try {
            resultado = DataBase.delete("DELETE FROM administradores WHERE ID=?", id);
            } catch (SQLException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
        if(resultado == 1){
            JOptionPane.showMessageDialog(null, "Su cuenta ha sido eliminada con éxito");
            Inicio_App ventana = new Inicio_App();
            ventana.setVisible(true);
            return 1;
        }
        return 0;
    }    
            
}
