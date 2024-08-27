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
public class SolicitarReforestacion {
    String urgencia;
    String tipoTerreno;
    String disponibilidad;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public SolicitarReforestacion(String urgencia, String tipoTerreno, String disponibilidad) {
        this.urgencia = urgencia;
        this.tipoTerreno = tipoTerreno;
        this.disponibilidad = disponibilidad;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO solicitud_reforestacion(Urgencia, Tipo_Terreno, Disponibilidad, ID) VALUES(?, ? ,?,?)", urgencia, tipoTerreno, disponibilidad, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }     
    
}
