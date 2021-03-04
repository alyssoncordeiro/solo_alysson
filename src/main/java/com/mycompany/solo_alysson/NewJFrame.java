/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solo_alysson;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alysson Cordeiro
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtHal = new javax.swing.JLabel();
        fosforo = new javax.swing.JTextField();
        soloTipo = new javax.swing.JTextField();
        enxofre = new javax.swing.JTextField();
        magnesio = new javax.swing.JTextField();
        aluminio = new javax.swing.JTextField();
        potassio = new javax.swing.JTextField();
        hal = new javax.swing.JTextField();
        calcio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFosforo = new javax.swing.JLabel();
        txtPotassio = new javax.swing.JLabel();
        txtCalcio = new javax.swing.JLabel();
        txtMagnesio = new javax.swing.JLabel();
        txtEnxofre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        txtAluminio = new javax.swing.JLabel();
        txtCadSolo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Solo");

        txtHal.setText("H + AL:");

        fosforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fosforoActionPerformed(evt);
            }
        });

        soloTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloTipoActionPerformed(evt);
            }
        });

        enxofre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enxofreActionPerformed(evt);
            }
        });

        magnesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnesioActionPerformed(evt);
            }
        });

        aluminio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluminioActionPerformed(evt);
            }
        });

        potassio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potassioActionPerformed(evt);
            }
        });

        hal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halActionPerformed(evt);
            }
        });

        calcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcioActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Solo:");

        txtFosforo.setText("Fósforo:");

        txtPotassio.setText("Potássio:");

        txtCalcio.setText("Cálcio:");

        txtMagnesio.setText("Magnésio:");

        txtEnxofre.setText("Enxofre:");

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fósforo", "Potássio", "Cálcio", "Magnésio", "Enxofre", "Alumínio", "H + AL"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        txtAluminio.setText("Alumínio:");

        txtCadSolo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtCadSolo.setText("Cadastro de Solo");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHal)
                            .addComponent(txtAluminio)
                            .addComponent(txtEnxofre)
                            .addComponent(txtMagnesio)
                            .addComponent(txtCalcio)
                            .addComponent(jLabel1)
                            .addComponent(txtFosforo)
                            .addComponent(txtPotassio))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magnesio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enxofre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potassio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadSolo)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadSolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(soloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFosforo)
                    .addComponent(fosforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPotassio)
                    .addComponent(potassio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalcio)
                    .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMagnesio)
                    .addComponent(magnesio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnxofre)
                    .addComponent(enxofre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAluminio)
                    .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHal)
                    .addComponent(hal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fosforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fosforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fosforoActionPerformed

    private void soloTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soloTipoActionPerformed

    private void enxofreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enxofreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enxofreActionPerformed

    private void magnesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnesioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magnesioActionPerformed

    private void aluminioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluminioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluminioActionPerformed

    private void potassioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potassioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potassioActionPerformed

    private void halActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_halActionPerformed

    private void calcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dados = (DefaultTableModel) tabelaDados.getModel();
        Object[] dadosSolo  = {soloTipo.getText(), fosforo.getText(),
            potassio.getText(), calcio.getText(), magnesio.getText(),
            enxofre.getText(), aluminio.getText(), hal.getText()};
        dados.addRow(dadosSolo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        soloTipo.setText("");
        fosforo.setText("");
        potassio.setText("");
        calcio.setText("");
        magnesio.setText("");
        enxofre.setText("");
        aluminio.setText("");
        hal.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aluminio;
    private javax.swing.JTextField calcio;
    private javax.swing.JTextField enxofre;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField fosforo;
    private javax.swing.JTextField hal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField magnesio;
    private javax.swing.JTextField potassio;
    private javax.swing.JTextField soloTipo;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JLabel txtAluminio;
    private javax.swing.JLabel txtCadSolo;
    private javax.swing.JLabel txtCalcio;
    private javax.swing.JLabel txtEnxofre;
    private javax.swing.JLabel txtFosforo;
    private javax.swing.JLabel txtHal;
    private javax.swing.JLabel txtMagnesio;
    private javax.swing.JLabel txtPotassio;
    // End of variables declaration//GEN-END:variables
}
