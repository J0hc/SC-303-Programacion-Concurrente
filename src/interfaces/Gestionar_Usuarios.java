package interfaces;

import Inicio.Inicio_App;
import clases.DataBase;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Julián HC
 */
public class Gestionar_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    public Gestionar_Usuarios() {
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
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        idMod = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        idEl = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        idModUsuario = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        idElUsuarios = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("TUS ACCIONES");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
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

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel26.setText("CLIENTES");
        background.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel37.setText("AGREGAR USUARIOS ADMINISTRADORES");
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
        jPanel13.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 45, 180, 42));

        background.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 100));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel38.setText("MODIFICAR USUARIOS ADMINISTRADORES");

        jButton11.setBackground(new java.awt.Color(255, 232, 82));
        jButton11.setText("MODIFICAR");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        idMod.setForeground(new java.awt.Color(153, 153, 255));
        idMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(idMod)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        background.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel39.setText("ELIMINAR USUARIOS ADMINISTRADORES");

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ELIMINAR");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        idEl.setForeground(new java.awt.Color(153, 153, 255));
        idEl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idElActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel39)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idEl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idEl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        background.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 340, -1));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel40.setText("AGREGAR USUARIOS CLIENTES");

        jButton7.setBackground(new java.awt.Color(0, 134, 150));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("AGREGAR");
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
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        background.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 310, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel45.setText("MODIFICAR USUARIOS CLIENTES");

        idModUsuario.setForeground(new java.awt.Color(153, 153, 255));
        idModUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idModUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModUsuarioActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 232, 82));
        jButton12.setText("MODIFICAR");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(idModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        background.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 310, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        jLabel47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel47.setText("ELIMINAR USUARIOS CLIENTES");

        jButton9.setBackground(new java.awt.Color(204, 0, 204));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("ELIMINAR");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        idElUsuarios.setForeground(new java.awt.Color(153, 153, 255));
        idElUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idElUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idElUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(idElUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idElUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        background.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 310, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("SALIR");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        background.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 110, 40));

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Registro_App ventana = new Registro_App();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        Registro_Administradores ventana = new Registro_Administradores();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR permanentemente esta cuenta. " +
            "Esta acción no se puede revertir");

        String id = this.idEl.getText();

        if(eliminar == 0){
            try {
                DataBase.delete("DELETE FROM administradores WHERE ID=?", id);
                JOptionPane.showMessageDialog(null, "La cuenta ha sido eliminada con éxito");
            } catch (SQLException ex) {
                Logger.getLogger(Gestionar_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "La operacion fue cancelada");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Dashboard_Administrador ventana = new Dashboard_Administrador();
        ventana.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
         String id = this.idElUsuarios.getText();

        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR permanentemente esta cuenta. " +
            "Esta acción no se puede revertir");

        if(eliminar == 0){
            try {
                DataBase.delete("DELETE FROM usuarios WHERE ID=?", id);
                JOptionPane.showMessageDialog(null, "La cuenta ha sido eliminada con éxito");
            } catch (SQLException ex) {
                Logger.getLogger(Gestionar_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "La operacion fue cancelada");
        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String idMod = this.idMod.getText();
        
        if(idMod.equals("")){
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        Map<String, HashMap> Variables = new HashMap<>();

        try {
            Variables = DataBase.select("SELECT * FROM administradores", "Nombre", "Contrasegna", "Correo", "Edad", "Rol","ID");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        }
       
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String con = "";
        String corr = "";
        String edad = "";
        String rol = "";
        String id = "";
        boolean control = true;
        
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
                    rol = (String) Variables.get(clave).get(valor);
                }else if(valor.equals("variable6")){
                    id = (String) Variables.get(clave).get(valor);
                }
                
           /*     if(valor.equals("variable1") && registro.equals(usuario)){
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
              
              if(idMod.equals(id) && control){
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
        
        if(!control){
            //JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
            Admin_Cuenta_Admin ventana = new Admin_Cuenta_Admin();
            ventana.setVisible(true);
            this.setVisible(false);   
        }else{
            JOptionPane.showMessageDialog(null, "Error al encontrar el registro. Por favor, revise los datos",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }         
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void idModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModActionPerformed

    private void idElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idElActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idElActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         String idModUsuario = this.idModUsuario.getText();
        
        if(idModUsuario.equals("")){
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios",
                "ERROR DE INICIO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String resultado = DataBase.Conexion("jdbc:mysql://localhost:3306/green_world");
        Map<String, HashMap> Variables = new HashMap<>();

        try {
            Variables = DataBase.select("SELECT * FROM usuarios", "Nombre", "Contrasegna", "Correo", "Edad", "ID");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        }
       
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String con = "";
        String corr = "";
        String edad = "";
        String id = "";
        boolean control = true;
        
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
                
           /*     if(valor.equals("variable1") && registro.equals(usuario)){
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
              
              if(idModUsuario.equals(id) && control){
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
        
        if(!control){
            //JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
            Admin_Cuenta_Usuario ventana = new Admin_Cuenta_Usuario();
            ventana.setVisible(true);
            this.setVisible(false);   
        }else{
            JOptionPane.showMessageDialog(null, "Error al encontrar el registro. Por favor, revise los datos",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void idElUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idElUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idElUsuariosActionPerformed

    private void idModUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModUsuarioActionPerformed

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
    private javax.swing.JTextField idEl;
    private javax.swing.JTextField idElUsuarios;
    private javax.swing.JTextField idMod;
    private javax.swing.JTextField idModUsuario;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
