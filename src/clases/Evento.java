package clases;

import Inicio.Inicio_App;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Evento {
    String titulo;
    String correoAdmin;
    String lugar;
    String cantArboles;
    String fecha;
    String voluntarios;
    String hora;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public Evento(String titulo, String correoAdmin, String lugar, String cantArboles, String fecha, String voluntarios, String hora) {
        this.titulo = titulo;
        this.correoAdmin = correoAdmin;
        this.lugar = lugar;
        this.cantArboles = cantArboles;
        this.fecha = fecha;
        this.voluntarios = voluntarios;
        this.hora = hora;
    }
    
    public Evento(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCantArboles() {
        return cantArboles;
    }

    public void setCantArboles(String cantArboles) {
        this.cantArboles = cantArboles;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(String voluntarios) {
        this.voluntarios = voluntarios;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO eventos(Titulo, Hora, Fecha, Cantidad_Voluntarios, Correo_Administrador, Lugar, Cantidad_Arboles, ID) VALUES(?,?,?,?,?,?,?,?)", titulo, hora, fecha, voluntarios, correoAdmin, lugar, cantArboles, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }    
    
    public int actualizar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(titulo+ hora+ fecha+ voluntarios+ correoAdmin+ lugar+ cantArboles + id);
       
        DataBase.update("UPDATE eventos SET Titulo=?, Hora=?, Fecha=?, Cantidad_Voluntarios=?, Correo_Administrador=?, Lugar=?, Cantidad_Arboles=? WHERE ID=?", id, titulo, hora, fecha, voluntarios, correoAdmin, lugar, cantArboles, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }    
    public int eliminar(String id){ 
        int resultado = 0;
        try {
            resultado = DataBase.delete("DELETE FROM eventos WHERE ID=?", id);
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
        if(resultado == 1){
            JOptionPane.showMessageDialog(null, "Su evento ha sido eliminado con éxito");
            return 1;
        }
        return 0;
    }
    
    public String select(String id){
        Map<String, HashMap> Variables = new HashMap<>();
        boolean coincidencia = false;
        
        try {
            Variables = DataBase.select("SELECT * FROM eventos", "Titulo", "ID");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
