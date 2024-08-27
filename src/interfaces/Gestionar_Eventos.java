package interfaces;

import Helpers.Verificaciones;
import Inicio.Inicio_App;
import clases.DataBase;
import clases.Evento;
import clases.Usuario;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julián HC
 */
public class Gestionar_Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    
    String idEv;
    public Gestionar_Eventos() {
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
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        idMod = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ELIMINAR");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julián HC\\Documents\\NetBeansProjects\\INTERFACES_GRAFICAS\\src\\main\\java\\com\\mycompany\\interfaces_graficas\\img\\favicon.png")); // NOI18N
        jLabel5.setText("GREEN WORLD");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, -1, -1));

        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 13, -1, 50));

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("ACTUALIZAR EVENTO");
        background.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("AGREGAR EVENTO");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 7, -1, 20));

        jButton8.setBackground(new java.awt.Color(0, 134, 150));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("AGREGAR");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 45, 256, 42));

        background.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 100));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("RESULTADOS:");
        jPanel17.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, 20));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(153, 153, 255));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        jPanel17.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ELIMINAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, 40));

        background.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 340, 130));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(153, 153, 255));
        id.setText("Ingrese el ID del Evento a eliminar");
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        background.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 40));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("ACTUALIZAR EVENTO");

        idMod.setBackground(new java.awt.Color(255, 255, 255));
        idMod.setForeground(new java.awt.Color(153, 153, 255));
        idMod.setText("Ingrese el ID del evento a modificar");
        idMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 232, 82));
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("BUSCAR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(idMod, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        background.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 100));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TUS ACCIONES");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("RESULTADOS:");
        background.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("VOLVER");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        background.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 110, 40));

        jButton11.setBackground(new java.awt.Color(204, 0, 204));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("BUSCAR");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        background.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Crear_Evento ventana = new Crear_Evento();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Dashboard_Administrador ventana = new Dashboard_Administrador();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        String id = this.id.getText();
        boolean coincidencia = false;

        boolean resultado = Verificaciones.espaciosBlanco(id);        
        
        Evento evento = new Evento();
        
        if(resultado) {
            return;
        }
        
        String texto = evento.select(id);
        this.resultado.setText(texto);
        
        
        /*
        String id = this.id.getText();
        boolean coincidencia = false;

        if(id.equals("")){
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        Map<String, HashMap> Variables = new HashMap<>();

        try {
            Variables = DataBase.select("SELECT * FROM eventos", "Titulo", "Hora", "Fecha", "Cantidad_Voluntarios", "Correo_Administrador", "Lugar", "Cantidad_Arboles", "ID");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Gestionar_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                this.resultado.setText(nom + "  " + ID);
                return;
            }
        }   */
    }//GEN-LAST:event_jButton11ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR permanentemente su cuenta. " +
            "Esta acción no se puede revertir");

        String id = this.id.getText();
        Evento evento = new Evento();
        int resultado = evento.eliminar(id);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        String id = this.idMod.getText();

        if(id.equals("")){
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        Map<String, HashMap> Variables = new HashMap<>();

        try {
            Variables = DataBase.select("SELECT * FROM eventos", "Titulo", "Hora", "Fecha", "Cantidad_Voluntarios", "Fecha","Correo_Administrador", "Lugar", "Cantidad_Arboles", "ID");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Map<String, String> Mapa = new HashMap<>();
        String titulo = "";
        String hora = "";
        String fecha = "";
        String cantidad_Voluntarios = "";
        String correo_Administrador = "";
        String lugar = "";
        String cantidad_Arboles = "";
        String ID = "";
        boolean control = false;

        for (String clave : Variables.keySet()) {

            for(Object valor:  Variables.get(clave).keySet()){

                String registro = (String) Variables.get(clave).get(valor);

                if(registro.equals(id)){
                    ID =  (String) Variables.get(clave).get(valor);
                    control = true;
                }else if(valor.equals("variable1")){
                    titulo = (String) Variables.get(clave).get(valor);
                } else if(valor.equals("variable2")){
                    hora = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable3")){
                    fecha = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable4")){
                    cantidad_Voluntarios = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable5")){
                    
                } else if(valor.equals("variable6")){
                    correo_Administrador = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable7")){
                    lugar = (String) Variables.get(clave).get(valor);
                } else if(valor.equals("variable8")){
                    cantidad_Arboles = (String) Variables.get(clave).get(valor);    
                }else if(valor.equals("variable9")){
                    ID = (String) Variables.get(clave).get(valor);
                }
                
               // System.out.println("Mapa - " + Variables.toString());
                
                }
            
            if(control){   
                System.out.println("Registro " + titulo+ hora+ fecha+cantidad_Voluntarios+
                correo_Administrador+ lugar+ cantidad_Arboles+ idEv );
                idEv = ID;   
                Actualizar_Evento.setData(titulo, hora, fecha, cantidad_Voluntarios,
                correo_Administrador, lugar, cantidad_Arboles, idEv);
                Actualizar_Evento ventana = new Actualizar_Evento();
                ventana.setVisible(true);
                this.setVisible(false);
            }
            control = false;
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
    private javax.swing.JPanel background;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idMod;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
