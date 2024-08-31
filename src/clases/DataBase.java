package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataBase {
    static Connection conexion;
    
    public static String Conexion(String dataBaseUrl){
        String url = dataBaseUrl;
        String usuario = "root";
        String contra = "test123";
        int resultado = 0;

        try{
            DataBase.conexion = DriverManager.getConnection(url, usuario, contra);
            resultado = 1;
        }catch(SQLException e){
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        }
        
        if(resultado == 1){
            return "Conexion establecida correctamente";
        }else{
            return "Conexion Fallada";
        }
    }
    
    public static Map<String, HashMap> select(String query, String ...fields) throws SQLException{
        
        String sql = query;
        Statement sta = DataBase.conexion.createStatement();
        ResultSet result = sta.executeQuery(sql);
     
        Map<String, HashMap> MapPrincipal = new HashMap<>();
        int cont = 1;
        Map<String, String> MapInterno = new HashMap<>();
        int contMap = 1;
        
        while(result.next()){
            cont = 1;
            for(String e : fields){
                String resultado = result.getString(e);
                String primero = "variable"+cont;
                MapInterno.put(primero, resultado);
                cont++;
            }
            
            String map = "mapa"+contMap;
            MapPrincipal.put(map, (HashMap) MapInterno);
            MapInterno = new HashMap<>();
            
            contMap++;
        }
        
     /*   
        while(result.next()){
            
            
            for(String e : fields){
                String resultado = result.getString(e);
                System.out.println(resultado);
                String primero = "variable"+cont;
                Variables.put(primero, resultado);
                cont++;
            }
   
        }
        
        */
        
        return MapPrincipal;
    }
    
    public static void insert(String query, String ...fields) throws SQLException{
        String sql = query;
        PreparedStatement sta = DataBase.conexion.prepareStatement(sql);
        int contador = 1; 

            for(String k: fields){
                sta.setString(contador, k);
                contador = contador+1;
            }

        int insertar = sta.executeUpdate();
        if(insertar > 0){
            //JOptionPane.showMessageDialog(null, "Se ha registrado correctamente...");
        }else{
            JOptionPane.showMessageDialog(null, "Error de registro. Por favor, revise los datos"
            , "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void update(String query, String id, String ...fields) throws SQLException{
        String sql = query;
        PreparedStatement sta = DataBase.conexion.prepareStatement(sql);
        int contador = 1; 

            for(String k: fields){
                sta.setString(contador, k);
                contador = contador+1;
            }

        int actualizar = sta.executeUpdate();
        if(actualizar > 0){
           //JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente...");
        }else{
            JOptionPane.showMessageDialog(null, "Error de actualización. Por favor, revise los datos"
            , "ERROR", JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public static int delete(String query, String id) throws SQLException{
        
        String sql = query;
        
        PreparedStatement sta = DataBase.conexion.prepareStatement(sql);
        
        sta.setString(1, id);
        
        int borrar = sta.executeUpdate();
        
        if(borrar > 0){
            return 1;
            //JOptionPane.showMessageDialog(null, "Se ha borrado correctamente...");
        }else{
            
            JOptionPane.showMessageDialog(null, "Error de borrado. Por favor, revise los datos"
            , "ERROR", JOptionPane.ERROR_MESSAGE);  
        return 0;
        }   
    }
    
}
