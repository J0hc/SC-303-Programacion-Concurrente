package interfaces;

import Helpers.Verificaciones;
import Inicio.Inicio_App;
import clases.Administrador;
import clases.DataBase;
import clases.DonarArboles;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julián HC
 */
public class Donar_Arboles extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    public Donar_Arboles() {
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
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fecha_entrega = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cantidad_arboles = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lugar_entrega = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 220, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("GREEN WORLD");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("GREEN WORLD");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("... PORQUE CADA ÁRBOL HACE LA DIFERENCIA.");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        fecha_entrega.setForeground(new java.awt.Color(153, 153, 255));
        fecha_entrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fecha_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_entregaActionPerformed(evt);
            }
        });
        background.add(fecha_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 370, 40));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("NOMBRE");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        nombre.setForeground(new java.awt.Color(153, 153, 255));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        background.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 370, 40));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("FECHA DE ENTREGA");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("CANTIDAD DE ÁRBOLES");
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        cantidad_arboles.setForeground(new java.awt.Color(153, 153, 255));
        cantidad_arboles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cantidad_arboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_arbolesActionPerformed(evt);
            }
        });
        background.add(cantidad_arboles, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 370, 40));

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("LUGAR DE ENTREGA");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lugar_entrega.setForeground(new java.awt.Color(153, 153, 255));
        lugar_entrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lugar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_entregaActionPerformed(evt);
            }
        });
        background.add(lugar_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 370, 40));

        jButton7.setBackground(new java.awt.Color(0, 134, 150));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ENVIAR DONACIÓN");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        background.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 170, 42));

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("VOLVER");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        background.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecha_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_entregaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void cantidad_arbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_arbolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_arbolesActionPerformed

    private void lugar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_entregaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        String nombre = this.nombre.getText();
        String cantidad_arboles = this.cantidad_arboles.getText();
        String lugar_entrega = this.lugar_entrega.getText();
        String fecha_entrega = this.fecha_entrega.getText();
        int resultado = 0;
        
        DonarArboles miDonacion = new DonarArboles(nombre,cantidad_arboles,lugar_entrega,fecha_entrega);
        
        boolean verificar = Verificaciones.espaciosBlanco(nombre,cantidad_arboles,lugar_entrega,fecha_entrega);
  
        try {
            System.out.println(verificar);
            //---INSERTAR EN TABLA DE BASE DE DATOS---
            if(!verificar) resultado = miDonacion.insertar();
        } catch (SQLException ex) {
            Logger.getLogger(DonarArboles.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Dashboard_Usuario ventana = new Dashboard_Usuario();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JTextField cantidad_arboles;
    private javax.swing.JTextField fecha_entrega;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lugar_entrega;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
