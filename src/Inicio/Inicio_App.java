package Inicio;

import clases.DataBase;
import interfaces.Admin_Cuenta_Admin;
import interfaces.Admin_Cuenta_Usuario;
import interfaces.Dashboard_Administrador;
import interfaces.Dashboard_Usuario;
import interfaces.Registro_App;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julián HC
 */
public class Inicio_App extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    public Inicio_App() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        admin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 220, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GREEN WORLD");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("GREEN WORLD");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("INICIAR SESIÓN");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("USUARIO");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("USUARIO");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        usuario.setForeground(new java.awt.Color(153, 153, 255));
        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 370, 40));

        jButton1.setBackground(new java.awt.Color(0, 134, 150));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR SESIÓN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 140, 50));

        jButton2.setBackground(new java.awt.Color(0, 134, 150));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRARSE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 140, 50));

        contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 370, 40));

        admin.setText("SOY ADMINISTRADOR");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        background.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usuario = this.usuario.getText();
        String contra = this.contra.getText();
        JCheckBox admin = this.admin;
        
        if(admin.isSelected()){
            inicioAdmin(usuario, contra);
        }else{
            inicioUsuario(usuario, contra);
        }
        
        System.out.println(admin);
        
        if(usuario.equals("") || contra.equals("")){
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void inicioUsuario(String nomb, String cont){
        String usuario = nomb; 
        String contra = cont;
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        
        Map<String, HashMap> Variables = new HashMap<>();
        
        try {
            Variables = DataBase.select("SELECT * FROM usuarios", "Nombre", "Contrasegna", "Correo", "Edad", "ID");
        } catch (SQLException ex) {
            Logger.getLogger(Inicio_App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean nombre = false;
        boolean contrasegna = false;
        boolean control = true;  
        
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String con = "";
        String corr = "";
        String edad = "";
        String id = "";
           
        
        for (String clave : Variables.keySet()) {
            
            for(Object valor:  Variables.get(clave).keySet()){
                
                String registro = (String) Variables.get(clave).get(valor);   

                if(valor.equals("variable1")){
                   nom =  (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable2")){
                    con = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable3")){
                    corr = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable4")){
                    edad = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable5")){
                    id = (String) Variables.get(clave).get(valor);
                }
                
                if(valor.equals("variable1") && registro.equals(usuario)){
                    nombre = true;
                    //Mapa.put("Nombre", (String) Variables.get(clave).get(valor));
                }
            
                if(valor.equals("variable2") && registro.equals(contra)){
                    contrasegna = true;
                   // Mapa.put("Contrasegna", (String) Variables.get(clave).get(valor)); 
                }
                
                //System.out.println(nom +con+ corr + edad + id);
                

                
                
               /* if(valor.equals("variable3") || valor.equals("variable4") || 
                        valor.equals("variable5") && nombre && contrasegna){
                    if(valor.equals("variable3")){
                        Mapa.put("Correo", (String) Variables.get(clave).get(valor));
                    }else if(valor.equals("variable4") ){
                        Mapa.put("Edad", (String) Variables.get(clave).get(valor));
                    }else if(valor.equals("variable5")){
                        Mapa.put("ID", (String) Variables.get(clave).get(valor));
                    }
                }
                */
            }
            
                if(nombre && contrasegna && control){
                    Mapa.put("Nombre", nom);
                    Mapa.put("Contrasegna", con);
                    Mapa.put("Correo", corr);
                    Mapa.put("Edad", edad);
                    Mapa.put("ID", id);
                    Admin_Cuenta_Usuario.getData(Mapa);
                    control = false;
                }
            
           
          //  System.out.println("Clave: " + clave + ", Valor: " + Variables.get(clave));        
        }
        
        if(nombre && contrasegna){
            //JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
            Dashboard_Usuario ventana = new Dashboard_Usuario();
            ventana.setVisible(true);
            this.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión. Por favor, revise los datos",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }     
    }
    
    public void inicioAdmin(String nomb, String cont){
        String usuario = nomb; 
        String contra = cont;
        
        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        
        Map<String, HashMap> Variables = new HashMap<>();
        
        try {
            Variables = DataBase.select("SELECT * FROM administradores", "Nombre", "Contrasegna", "Correo", "Edad", "Rol", "ID");
        } catch (SQLException ex) {
            Logger.getLogger(Inicio_App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean nombre = false;
        boolean contrasegna = false;
        boolean control = true;  
        
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String con = "";
        String corr = "";
        String edad = "";
        String rol = "";
        String id = "";
           
        
        for (String clave : Variables.keySet()) {
            
            for(Object valor:  Variables.get(clave).keySet()){
                
                String registro = (String) Variables.get(clave).get(valor);   

                if(valor.equals("variable1")){
                   nom =  (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable2")){
                    con = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable3")){
                    corr = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable4")){
                    edad = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable5")){
                    id = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable6")){
                    rol = (String) Variables.get(clave).get(valor);
                }
                
                if(valor.equals("variable1") && registro.equals(usuario)){
                    nombre = true;
                    //Mapa.put("Nombre", (String) Variables.get(clave).get(valor));
                }
            
                if(valor.equals("variable2") && registro.equals(contra)){
                    contrasegna = true;
                   // Mapa.put("Contrasegna", (String) Variables.get(clave).get(valor)); 
                }
                
                //System.out.println(nom +con+ corr + edad + id);
                

                
                
               /* if(valor.equals("variable3") || valor.equals("variable4") || 
                        valor.equals("variable5") && nombre && contrasegna){
                    if(valor.equals("variable3")){
                        Mapa.put("Correo", (String) Variables.get(clave).get(valor));
                    }else if(valor.equals("variable4") ){
                        Mapa.put("Edad", (String) Variables.get(clave).get(valor));
                    }else if(valor.equals("variable5")){
                        Mapa.put("ID", (String) Variables.get(clave).get(valor));
                    }
                }
                */
            }
            
                if(nombre && contrasegna && control){
                    Mapa.put("Nombre", nom);
                    Mapa.put("Contrasegna", con);
                    Mapa.put("Correo", corr);
                    Mapa.put("Edad", edad);
                    Mapa.put("Rol", rol);
                    Mapa.put("ID", id);

                    Admin_Cuenta_Admin.getData(Mapa);
                    control = false;
                }
            
           
          //  System.out.println("Clave: " + clave + ", Valor: " + Variables.get(clave));        
        }
        
        if(nombre && contrasegna){
            //JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
            Dashboard_Administrador ventana = new Dashboard_Administrador();
            ventana.setVisible(true);
            this.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión. Por favor, revise los datos",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }     
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Registro_App ra = new Registro_App();
        ra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox admin;
    private javax.swing.JPanel background;
    private javax.swing.JPasswordField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
