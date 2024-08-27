/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián HC
 */
public class DonarArboles {
    
    String nombre;
    String cantArboles;
    String lugarEntrega;
    String fechaEntrega;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public DonarArboles(String nombre, String cantArboles, String lugarEntrega, String FechaEntrega) {
        this.nombre = nombre;
        this.cantArboles = cantArboles;
        this.lugarEntrega = lugarEntrega;
        this.fechaEntrega = FechaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantArboles() {
        return cantArboles;
    }

    public void setCantArboles(String cantArboles) {
        this.cantArboles = cantArboles;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.fechaEntrega = FechaEntrega;
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO donar_arboles(Nombre, Cantidad_Arboles, Lugar_Entrega, Fecha_Entrega, ID) VALUES(?,?,?,?,?)", nombre, cantArboles, lugarEntrega, fechaEntrega, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }      
    
    
    
}
