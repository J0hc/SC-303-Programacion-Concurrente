package interfaces;

import Helpers.Verificaciones;
import Inicio.Inicio_App;
import clases.CrearLugarReforestado;
import clases.DataBase;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
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
public class Gestionar_Lugar_Reforestado extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_App
     */
    String idEv;
    String idEV;
    public Gestionar_Lugar_Reforestado() {
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

        jButton6 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idMod = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        extencion = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        lugar = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        anotaciones = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("SALIR");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julián HC\\Documents\\NetBeansProjects\\INTERFACES_GRAFICAS\\src\\main\\java\\com\\mycompany\\interfaces_graficas\\img\\favicon.png")); // NOI18N
        jLabel5.setText("GREEN WORLD");

        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("VOLVER");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(477, 477, 477)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("ACTUALIZAR LUGAR REFORESTADO");
        background.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(78, 184, 222)));

        jLabel37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("AGREGAR LUGAR REFORESTADO");

        jButton9.setBackground(new java.awt.Color(0, 134, 150));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("AGREGAR");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel37))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        background.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, 100));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("RESULTADOS:");
        jPanel17.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, 20));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ELIMINAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 83, 170, 40));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(153, 153, 255));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        jPanel17.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 33, 320, 40));

        background.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 340, 130));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TUS ACCIONES");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        idMod.setBackground(new java.awt.Color(255, 255, 255));
        idMod.setForeground(new java.awt.Color(153, 153, 255));
        idMod.setText("Ingrese el ID del lugar a modificar");
        idMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModActionPerformed(evt);
            }
        });
        background.add(idMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 190, 40));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(153, 153, 255));
        id.setText("Ingrese el ID del lugar a eliminar");
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        background.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 40));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("EXTENCIÓN");
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 90, -1, 20));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(153, 153, 255));
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        jPanel15.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 117, 190, 40));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("NOMBRE");
        jPanel15.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, 20));

        extencion.setBackground(new java.awt.Color(255, 255, 255));
        extencion.setForeground(new java.awt.Color(153, 153, 255));
        extencion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        extencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extencionActionPerformed(evt);
            }
        });
        jPanel15.add(extencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 122, 190, 40));

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("ANOTACIONES");
        jPanel15.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 175, -1, 20));

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("LUGAR");
        jPanel15.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 7, -1, 20));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(153, 153, 255));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel15.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 33, 190, 40));

        lugar.setBackground(new java.awt.Color(255, 255, 255));
        lugar.setForeground(new java.awt.Color(153, 153, 255));
        lugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarActionPerformed(evt);
            }
        });
        jPanel15.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 33, 190, 40));

        jLabel46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("FECHA");
        jPanel15.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 91, -1, 20));

        anotaciones.setBackground(new java.awt.Color(255, 255, 255));
        anotaciones.setColumns(20);
        anotaciones.setRows(5);
        jScrollPane1.setViewportView(anotaciones);

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 213, 370, 100));

        jButton4.setBackground(new java.awt.Color(255, 232, 82));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 240, -1, 40));

        background.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 490, 320));

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BUSCAR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        background.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 42));

        jButton5.setBackground(new java.awt.Color(255, 232, 82));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("BUSCAR");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        background.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        String id = this.id.getText();
        boolean coincidencia = false;

        boolean resultado = Verificaciones.espaciosBlanco(id);        
        
        CrearLugarReforestado lugar = new CrearLugarReforestado();
        
        if(resultado) {
            return;
        }
        
        String texto = lugar.select(id);
        this.resultado.setText(texto);
        
        
       /* String id = this.id.getText();
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
           Variables = DataBase.select("SELECT * FROM lugares_reforestados", "Nombre", "ID");
        } catch (SQLException ex) {
            Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(Level.SEVERE, null, ex);
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
        }    */
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        Crear_Lugar_Reforestado ventana = new Crear_Lugar_Reforestado();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR permanentemente su cuenta. " +
            "Esta acción no se puede revertir");
        
        String id = this.id.getText();
        
        CrearLugarReforestado lugar = new CrearLugarReforestado();
        int resultado = lugar.eliminar(id);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nombre = this.nombre.getText();
        String lugar = this.lugar.getText();
        String fecha = this.fecha.getText();
        String extencion = this.extencion.getText();
        String anotaciones = this.anotaciones.getText();
        String id = idEV;
        int resultado = 0;
        
        System.out.println("IDD" + id);

        CrearLugarReforestado lugarUno = new CrearLugarReforestado(nombre, lugar, anotaciones,fecha, extencion);
        lugarUno.setId(id);
        boolean verificar = Verificaciones.espaciosBlanco(nombre, lugar, anotaciones,fecha, extencion);
      
        try {
            System.out.println(verificar);
            //---INSERTAR EN TABLA DE BASE DE DATOS---
            if(!verificar) resultado = lugarUno.actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
           Variables = DataBase.select("SELECT * FROM lugares_reforestados", "Nombre", "Lugar", "Anotaciones", "Fecha", "Extencion","ID");
        } catch (SQLException ex) {
            Logger.getLogger(Gestionar_Lugar_Reforestado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Map<String, String> Mapa = new HashMap<>();
        String nom = "";
        String lugar = "";
        String anotaciones = "";
        String fecha = "";
        String extencion = "";
        String ID = "";
        boolean control = false;
        
        for (String clave : Variables.keySet()) {
            
            for(Object valor:  Variables.get(clave).keySet()){
                
                String registro = (String) Variables.get(clave).get(valor);   

                if(registro.equals(id)){
                   ID =  (String) Variables.get(clave).get(valor);
                   control = true;
                }else if(valor.equals("variable1")){
                    nom = (String) Variables.get(clave).get(valor);
                } else if(valor.equals("variable2")){
                    lugar = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable3")){
                    anotaciones = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable4")){
                    fecha = (String) Variables.get(clave).get(valor);
                }  else if(valor.equals("variable5")){
                    extencion = (String) Variables.get(clave).get(valor);
                } else if(valor.equals("variable6")){
                    idEv = (String) Variables.get(clave).get(valor);
                }    
            }
            
            if(control){
                this.nombre.setText(nom); 
                this.lugar.setText(lugar);
                this.anotaciones.setText(anotaciones);
                this.fecha.setText(fecha);
                this.extencion.setText(extencion);
                idEV = ID;
            }
            
            control = false;
        }    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Dashboard_Administrador ventana = new Dashboard_Administrador();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

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
    private javax.swing.JTextField id;
    private javax.swing.JTextField idMod;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lugar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
