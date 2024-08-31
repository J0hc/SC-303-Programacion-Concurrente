package interfaces;

import Helpers.Verificaciones;
import Inicio.Inicio_App;
import clases.Administrador;
import clases.DataBase;
import clases.Usuario;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julián HC
 */
public class Admin_Cuenta_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    static Map<String, String> mapa = new HashMap();
    String id;
    
    public Admin_Cuenta_Admin() {
        initComponents();
        
        
        System.out.println(mapa.toString() + "IMPRESIÓN");
        
        
        for (String clave : mapa.keySet()){
            String registro = (String) mapa.get(clave);
            if(clave.equals("Nombre")){
                this.nombre.setText(registro);
            }
            if(clave.equals("Contrasegna")){
                this.contra.setText(registro);
            }
            if(clave.equals("Correo")){
                this.correo.setText(registro);
            }
            if(clave.equals("Edad")){
                this.edad.setText(registro);
            }
            if(clave.equals("ID")){  //CORREGIR
                this.rol.setText(registro);
            }
            if(clave.equals("Rol")){  //CORREGIR
                id = (String) mapa.get(clave);
            }
            
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        edad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        rol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julián HC\\Documents\\NetBeansProjects\\INTERFACES_GRAFICAS\\src\\main\\java\\com\\mycompany\\interfaces_graficas\\img\\favicon.png")); // NOI18N
        jLabel5.setText("GREEN WORLD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Esta acción es irrevertible y eliminará ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 7, -1, 20));

        jLabel23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("todos los datos asociados a esta cuenta.");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 33, -1, 20));

        jLabel24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("después de realizada esta acción, ");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 59, -1, 20));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("perderás todos los datos.");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 85, -1, 20));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ELIMINAR CUENTA");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 117, 170, 40));

        background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 350, 170));

        jLabel21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("... PORQUE CADA ÁRBOL HACE LA DIFERENCIA.");
        background.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("TUS DATOS.");
        background.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CERRAR SESIÓN");

        jButton7.setBackground(new java.awt.Color(0, 134, 150));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CERRAR SESIÓN");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 350, 110));

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setForeground(new java.awt.Color(153, 153, 255));
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        background.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 360, 50));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(153, 153, 255));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        background.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 360, 50));

        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setForeground(new java.awt.Color(153, 153, 255));
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        background.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 360, 50));

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("VOLVER");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        background.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 110, 40));

        jButton8.setBackground(new java.awt.Color(255, 232, 82));
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("ACTUALIZAR TU CUENTA");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        background.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 360, 50));

        contra.setBackground(new java.awt.Color(255, 255, 255));
        contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        background.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 50));

        rol.setBackground(new java.awt.Color(255, 255, 255));
        rol.setForeground(new java.awt.Color(153, 153, 255));
        rol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        background.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 360, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    static public void getData(Map<String, String> data){
       mapa = data;
    }
    
    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR permanentemente su cuenta. " +
            "Esta acción no se puede revertir");
        
        Administrador admin = new Administrador();
        int resultado = admin.eliminar(id);
        
        if(resultado == 1){
            this.setVisible(false);
        }     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Gestionar_Usuarios ventana = new Gestionar_Usuarios();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int sesion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?");

        if(sesion == 0){
            Inicio_App ventana = new Inicio_App();
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        
        String usuario = this.nombre.getText();
        String contra = this.contra.getText();
        String correo = this.correo.getText();
        String edad = this.edad.getText();
        String rol = this.rol.getText();
        this.id = id;
        int edadUsuario = 0; 
        int resultado = 0;
        
        try{        
            edadUsuario = Integer.parseInt(edad);
        }catch(Exception e){
            
        }
  
        Administrador miAdministrador = new Administrador(usuario,contra,correo,edadUsuario, rol);
        miAdministrador.setId(id);
        
        boolean verificar = Verificaciones.espaciosBlanco(usuario,contra,correo,edad, rol);
        Verificaciones.verificarCorreo(correo);
        Verificaciones.verificarEdad(edadUsuario);

        try {
            System.out.println(verificar);
            //---INSERTAR EN TABLA DE BASE DE DATOS---
            if(!verificar) resultado = miAdministrador.actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Cuenta_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rol;
    // End of variables declaration//GEN-END:variables
}
