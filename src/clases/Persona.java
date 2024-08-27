package clases;

/**
 *
 * Universidad Fidélitas - Facultad de Ingeniería
 * SC-303 Programación Cliente/Servidor Concurrente 
 * II Cuatrimestre, 2024
 * Proyecto Final - Grupo #3
 *
 *  305450804 - Julian Alfonso Hidalgo Chinchilla
 *  XXXXXXXXX - Freiser Yoseman Herrera Muñoz
 *  
 *
 */
public abstract class Persona {
    public String usuario;
    public String constrasegna;
    public String correo;
    public int edad;
    int ides =(int) (Math.random() * 1700); 
    String id = String.valueOf(ides);
    
    public Persona(){

    };

    public Persona(String usuario, String contrasegna, String correo, int edad){
        this.usuario = usuario;
        this.correo = correo;
        this.edad = edad;
        this.constrasegna = contrasegna;
        this.id = id;
    }

    public String getConstrasegna() {
        return constrasegna;
    }

    public void setConstrasegna(String constrasegna) {
        this.constrasegna = constrasegna;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //GETTER

    public String getUsuario(){
        return this.usuario;
    }
    
    public String getContrasegna(){
        return this.constrasegna;
    }
    
    public String getCorreo(){
        return this.correo;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getIdUsuario(){
        return this.id;
    }

    //SETTER
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setContrasegna(String contrasegna){
        this.constrasegna = contrasegna;
    }  

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
