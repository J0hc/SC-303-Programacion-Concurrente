package clases;

import java.sql.SQLException;
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
public class FormularioContactoCliente {
    private String nombre;
    private String correo;
    private String asunto;
    public int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public FormularioContactoCliente(){

    }

    public FormularioContactoCliente(String nombre, String correo, String asunto){
        this.nombre = nombre;
        this.correo = correo;
        this.asunto = asunto;
        this.id = id;
    }

    //GETTER
    public String getNombre(){
        return this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getAsunto(){
        return this.asunto;
    }


    //SETTER

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setAsunto(String asunto){
        this.asunto = asunto;
    }

    public int insertar() throws SQLException{
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        System.out.println(resultado);
        
        DataBase.insert("INSERT INTO mensajes_contacto(Nombre, Correo, Asunto, ID) VALUES(?,?,?,?)", nombre, correo, asunto, id);
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente"); 
        
        return 1;
    }      

}
