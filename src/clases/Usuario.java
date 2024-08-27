/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Inicio.Inicio_App;
import interfaces.Admin_Cuenta_Usuario;
import interfaces.Registro_App;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián HC
 */
public class Usuario extends Persona {
    boolean insertar = false;
    
    public Usuario(String usuario, String contrasegna, String correo, int edad){
        super(usuario, contrasegna, correo, edad);
        
    }
    
    public Usuario(){
        
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO usuarios(Nombre, Contrasegna, Correo, Edad, ID) VALUES(?,?,?,?,?)", usuario, constrasegna, correo, String.valueOf(edad), id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }
    
    public int actualizar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.update("UPDATE usuarios SET Nombre=?, Contrasegna=?, Correo=?, Edad=? WHERE ID=?", id, usuario, constrasegna, correo, String.valueOf(edad), id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }

    public int eliminar(String id){ 
        int resultado = 0;
        try {
            resultado = DataBase.delete("DELETE FROM usuarios WHERE ID=?", id);
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
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
