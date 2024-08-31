
package Helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián HC
 */
public class Verificaciones {

    public static void verificarCorreo(String correo){
        Pattern exp = Pattern.compile("[A-Za-z0-9+_.-]+@(.+)$");
        Matcher coincidencia = exp.matcher(correo);
        
        if(!coincidencia.find() && !correo.equals("")){
            JOptionPane.showMessageDialog(null,
                "Correo no válido",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
        return;
        }
    }
    public static boolean verificarCorreoBoolean(String correo) {
    Pattern exp = Pattern.compile("[A-Za-z0-9+_.-]+@(.+)$");
    Matcher coincidencia = exp.matcher(correo);

    if(!coincidencia.find() || correo.equals("")) {
        JOptionPane.showMessageDialog(null,
            "Correo no válido por favor utilizar el formato adecuado\n Ejemplo: usuario@gmail.com",
            "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}

    public static void verificarEdad(int edad){
        if(edad == 0){
            JOptionPane.showMessageDialog(null,
                "Edad no válida",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }   
    
    public static boolean verificarEdadBoolean(int edad) {
    if (edad == 0) {
        JOptionPane.showMessageDialog(null,
            "Edad no válida",
            "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}


    public static boolean espaciosBlanco(String ...campos){
        boolean retornoEspacio = false;
        for(String campo : campos){
            if(campo.equals("")){
                retornoEspacio = true;
            }
        }
        
        if(retornoEspacio) JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE); 
        
        if(retornoEspacio) return true;
        else return false;   
    }    
}
