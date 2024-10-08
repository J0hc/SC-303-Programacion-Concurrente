package interfaces;

import Helpers.Verificaciones;
import Inicio.Inicio_App;
import clases.Administrador;
import clases.CrearLugarReforestado;
import clases.DataBase;
import java.sql.SQLException;
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
public class Crear_Lugar_Reforestado extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    public Crear_Lugar_Reforestado() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        extencion = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        anotaciones = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julián HC\\Documents\\NetBeansProjects\\INTERFACES_GRAFICAS\\src\\main\\java\\com\\mycompany\\interfaces_graficas\\img\\favicon.png")); // NOI18N
        jLabel5.setText("GREEN WORLD");

        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(627, 627, 627))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CREAR NUEVO LUGAR REFORESTADO");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("NOMBRE");
        background.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(153, 153, 255));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        background.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 370, 40));

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("LUGAR");
        background.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        lugar.setBackground(new java.awt.Color(255, 255, 255));
        lugar.setForeground(new java.awt.Color(153, 153, 255));
        lugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarActionPerformed(evt);
            }
        });
        background.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 370, 40));

        jLabel46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("FECHA");
        background.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(153, 153, 255));
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        background.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 370, 40));

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("EXTENCIÓN");
        background.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 20));

        extencion.setBackground(new java.awt.Color(255, 255, 255));
        extencion.setForeground(new java.awt.Color(153, 153, 255));
        extencion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        extencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extencionActionPerformed(evt);
            }
        });
        background.add(extencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 370, 40));

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("ANOTACIONES");
        background.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        anotaciones.setBackground(new java.awt.Color(255, 255, 255));
        anotaciones.setColumns(20);
        anotaciones.setRows(5);
        jScrollPane1.setViewportView(anotaciones);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 370, 112));

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

        jButton7.setBackground(new java.awt.Color(0, 134, 150));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CREAR NUEVO LUGAR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        background.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 370, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fechaActionPerformed

    private void extencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extencionActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void lugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Dashboard_Administrador ventana = new Dashboard_Administrador();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        String nombre = this.nombre.getText();
        String lugar = this.lugar.getText();
        String anotaciones = this.anotaciones.getText();
        String fecha = this.fecha.getText();
        String extencion = this.extencion.getText();
        int resultado = 0;

        CrearLugarReforestado lugarUno = new CrearLugarReforestado(nombre, lugar, anotaciones,fecha, extencion);
        
        boolean verificar = Verificaciones.espaciosBlanco(nombre, lugar, anotaciones,fecha, extencion);
      
        try {
            System.out.println(verificar);
            //---INSERTAR EN TABLA DE BASE DE DATOS---
            if(!verificar) resultado = lugarUno.insertar();
            JOptionPane.showMessageDialog(null, "Se ha creado el evento con exito!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un problema creando el evento por favor confirme los datos.");
        }            
    }//GEN-LAST:event_jButton7ActionPerformed

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
    private javax.swing.JTextArea anotaciones;
    private javax.swing.JPanel background;
    private javax.swing.JTextField extencion;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lugar;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
