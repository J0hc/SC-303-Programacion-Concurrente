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
 * Universidad Fidélitas - Facultad de Ingeniería
 * SC-303 Programación Cliente/Servidor Concurrente 
 * II Cuatrimestre, 2024
 * Proyecto Final - Grupo #3
 *
 *  305450804 - Julian Alfonso Hidalgo Chinchilla
 *  XXXXXXXXX - Freiser Yoseman Herrera Muñoz
 *  XXXXXXXXX - Rogelio Josué Vargas Fernández
 *
 */
public class Post {
    private String titulo;
    private String lugar;
    private String contenido;
    private String fecha;
    private String seccion;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
 
    public void setId(String id) {
        this.id = id;
    }

    public Post(){

    }

    public Post(String titulo, String lugar, String contenido, String fecha, String seccion){
        this.titulo = titulo;
        this.lugar = lugar;
        this.contenido = contenido;
        this.fecha = fecha;
        this.seccion = seccion;
        this.id = id;
    }

    //GETTER

    public String getTitulo(){
        return this.titulo;
    }

    public String getLugar(){
        return this.lugar;
    }

    public String getSeccion(){
        return this.seccion;
    }

    public String getFecha(){
        return this.fecha;
    }

    public String getContenido(){
        return this.contenido;
    }


    //SETTER

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    public void setSeccion(String seccion){
        this.seccion = seccion;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    //MÉTODOS PROPIOS

    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO post(Titulo, Lugar, Contenido, Seccion, Fecha, ID) VALUES(?,?,?,?,?,?)", titulo, lugar, contenido, seccion,fecha, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }
    
    public int actualizar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.update("UPDATE post SET Titulo=?, Lugar=?, Contenido=?, Seccion=?, Fecha=? WHERE ID=?", id, titulo, lugar, contenido, seccion, fecha, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }
    
        public int eliminar(String id){ 
        int resultado = 0;
        try {
            resultado = DataBase.delete("DELETE FROM post WHERE ID=?", id);
            } catch (SQLException ex) {
                Logger.getLogger(Post.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
        if(resultado == 1){
            JOptionPane.showMessageDialog(null, "Su post ha sido eliminado con éxito");
            return 1;
        }
        return 0;
    }
        
    public String select(String id){
        Map<String, HashMap> Variables = new HashMap<>();
        boolean coincidencia = false;
        
        try {
            Variables = DataBase.select("SELECT * FROM post", "Titulo", "ID");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Post.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
