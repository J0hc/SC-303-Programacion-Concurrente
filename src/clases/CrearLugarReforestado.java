/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Inicio.Inicio_App;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián HC
 */
public class CrearLugarReforestado {
    String nombre;
    String lugar;
    String anotaciones;
    String fecha;
    String extencion;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public CrearLugarReforestado(){
        
    }
    public CrearLugarReforestado(String nombre, String lugar, String anotaciones, String fecha, String extencion) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.anotaciones = anotaciones;
        this.fecha = fecha;
        this.extencion = extencion;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO lugares_reforestados(Nombre, Lugar, Anotaciones, Fecha, Extencion, ID) VALUES(?,?,?,?,?,?)", nombre, lugar, anotaciones, fecha, extencion, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    } 
    
    public int actualizar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.update("UPDATE lugares_reforestados SET Nombre=?, Lugar=?, Anotaciones=?, Fecha=?, Extencion=? WHERE ID=?", id, nombre, lugar, anotaciones, fecha, extencion, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }
    
    public int eliminar(String id){ 
        int resultado = 0;
        try {
            resultado = DataBase.delete("DELETE FROM lugares_reforestados WHERE ID=?", id);
            
        } catch (SQLException ex) {
                Logger.getLogger(CrearLugarReforestado.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
         if(resultado == 1){
            JOptionPane.showMessageDialog(null, "Su lugar reforestado ha sido eliminado con éxito");
         }
        return 0;
    }
    
    public String select(String id){
        Map<String, HashMap> Variables = new HashMap<>();
        boolean coincidencia = false;
        
        try {
            Variables = DataBase.select("SELECT * FROM lugares_reforestados", "Nombre", "ID");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CrearLugarReforestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String ID = "";

        for (String clave : Variables.keySet()) {

            for(Object valor:  Variables.get(clave).keySet()){

                String registro = (String) Variables.get(clave).get(valor);

                if(registro.equals(id)){
                    ID =  (String) Variables.get(clave).get(valor);
                    coincidencia = true;
                }else if(valor.equals("variable1")){
                    nom = (String) Variables.get(clave).get(valor);
                }
            }
            
            if(coincidencia){
                return (nom + ID);
            }
        }
        return "NO HAY COINCIDENCIAS";
    }
}
