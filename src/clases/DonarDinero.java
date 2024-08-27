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
public class DonarDinero {
    String nombre;
    String monto;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public DonarDinero(String nombre, String monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO donar_dinero(Nombre, Monto, ID) VALUES(?,?,?)", nombre, monto, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }      
}
