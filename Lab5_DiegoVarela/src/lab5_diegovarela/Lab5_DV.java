/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_diegovarela;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Lab5_DV extends javax.swing.JFrame {

    static ArrayList<Escuadron> escuadrones = new ArrayList();
    static ArrayList<String> nombres = new ArrayList();
  static ArrayList<Villano> villanos = new ArrayList();
    static ArrayList<Heroe> heroes = new ArrayList();
    /**
     * Creates new form Lab5_DV
     */
    public Lab5_DV() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        menuheroe = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        menuvillano = new javax.swing.JPopupMenu();
        Modificar1 = new javax.swing.JMenuItem();
        Elminar1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_heroe = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_villano = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_agilfis = new javax.swing.JTextField();
        tf_agilmen = new javax.swing.JTextField();
        tf_fuerza = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_poder = new javax.swing.JTextField();
        tf_debilidad = new javax.swing.JTextField();
        cb_escuadron = new javax.swing.JComboBox<>();
        jb_agregarsuper = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rb_villano = new javax.swing.JRadioButton();
        rb_superheroe = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        Modificar.setText("Modificar");
        menuheroe.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        menuheroe.add(Eliminar);

        Modificar1.setText("Modificar");
        menuvillano.add(Modificar1);

        Elminar1.setText("Eliminar");
        Elminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elminar1ActionPerformed(evt);
            }
        });
        menuvillano.add(Elminar1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_heroe.setModel(new DefaultListModel());
        jl_heroe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_heroeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_heroe);

        jl_villano.setModel(new DefaultListModel());
        jl_villano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_villanoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_villano);

        jLabel1.setText("Superheroe");

        jLabel2.setText("Villanos");

        jLabel3.setText("Agregar Superhumano");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Poder:");

        jLabel6.setText("Debilidad:");

        jLabel7.setText("Escuadron:");

        jLabel8.setText("Agilidad mental:");

        jLabel9.setText("Fuerza:");

        jLabel10.setText("Agilidad fisica:");

        jb_agregarsuper.setText("Agregar a la lista");
        jb_agregarsuper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarsuperMouseClicked(evt);
            }
        });

        jLabel11.setText("Tipo:");

        rb_villano.setText("Villano");

        rb_superheroe.setText("Superheroe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(jb_agregarsuper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_escuadron, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_poder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_debilidad))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_agilmen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(tf_fuerza, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_agilfis)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_villano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_superheroe)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(tf_fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(tf_agilmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(tf_agilfis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_escuadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(rb_villano)
                    .addComponent(rb_superheroe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jb_agregarsuper))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar heroe o villano", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Escuadron", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulacion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarsuperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarsuperMouseClicked
        // TODO add your handling code here:
        nombres.add(tf_nombre.getText());
        int fuerza, agilment, agilfis;
        fuerza = Integer.parseInt(tf_fuerza.getText());
        agilment = Integer.parseInt(tf_agilmen.getText());
        agilfis = Integer.parseInt(tf_agilfis.getText());
        if (rb_villano.isSelected()) {
            if (nombre(tf_nombre.getText())==false) {
                if (fuerza + agilment + agilfis == 100) {
                    Villano x = new Villano(tf_nombre.getText(), tf_poder.getText(), tf_debilidad.getText(), fuerza, agilfis, agilment); 
                    villanos.add(x);
                    DefaultListModel modelo = (DefaultListModel) jl_villano.getModel();
                    modelo.addElement(x);
                    jl_villano.setModel(modelo);
                } else {
                    JOptionPane.showMessageDialog(null, "Su humano no cumple con los requisitos para ser un villano lo sentimos");
                }
            } else {
               JOptionPane.showMessageDialog(null, "No se pueden repetir nombres");
            }
        } else if (rb_superheroe.isSelected()) {
            if (nombre(tf_nombre.getText())==false) {
                if (fuerza + agilment + agilfis == 100) {
                    Heroe n = new Heroe(tf_nombre.getText(), tf_poder.getText(), tf_debilidad.getText(), fuerza, agilfis, agilment);
                    heroes.add(n);
                    DefaultListModel modelo = (DefaultListModel) jl_heroe.getModel();
                    modelo.addElement(n);
                    jl_heroe.setModel(modelo);
                }else{
                JOptionPane.showMessageDialog(null, "Su humano no cumple con los requisitos para ser un Heroe lo sentimos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pueden repetir nombres");
            }
        }
    }//GEN-LAST:event_jb_agregarsuperMouseClicked

    private void jl_heroeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_heroeMouseClicked
        // TODO add your handling code here:
         if (jl_heroe.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                menuheroe.show(evt.getComponent(),
                        evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_jl_heroeMouseClicked

    private void jl_villanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_villanoMouseClicked
        // TODO add your handling code here:
         if (jl_villano.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                menuvillano.show(evt.getComponent(),
                        evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_jl_villanoMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
         if (jl_heroe.getSelectedIndex() >= 0) {
                DefaultListModel modelo
                        = (DefaultListModel) jl_heroe.getModel();
                modelo.remove(jl_heroe.getSelectedIndex());
                jl_heroe.setModel(modelo);
                JOptionPane.showMessageDialog(this,
                        "Eliminado exitosamente");
            }
    }//GEN-LAST:event_EliminarActionPerformed

    private void Elminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elminar1ActionPerformed
        // TODO add your handling code here:
        if (jl_villano.getSelectedIndex() >= 0) {
                DefaultListModel modelo
                        = (DefaultListModel) jl_villano.getModel();
                modelo.remove(jl_villano.getSelectedIndex());
                jl_villano.setModel(modelo);
                JOptionPane.showMessageDialog(this,
                        "Eliminado exitosamente");
            }
    }//GEN-LAST:event_Elminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lab5_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5_DV().setVisible(true);
            }
        });
    }

    static boolean nombre(String g) {
        boolean existe = false;
        for (String nombre : nombres) {
            if (nombre.equals(g)) {
                existe = true;
                return existe;
            } else {
                return existe;
            }
        }
        return existe;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Elminar1;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem Modificar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_escuadron;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_agregarsuper;
    private javax.swing.JList<String> jl_heroe;
    private javax.swing.JList<String> jl_villano;
    private javax.swing.JPopupMenu menuheroe;
    private javax.swing.JPopupMenu menuvillano;
    private javax.swing.JRadioButton rb_superheroe;
    private javax.swing.JRadioButton rb_villano;
    private javax.swing.JTextField tf_agilfis;
    private javax.swing.JTextField tf_agilmen;
    private javax.swing.JTextField tf_debilidad;
    private javax.swing.JTextField tf_fuerza;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_poder;
    // End of variables declaration//GEN-END:variables
}