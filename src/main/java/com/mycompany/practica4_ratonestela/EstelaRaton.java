package com.mycompany.practica4_ratonestela;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseMotionListener;


public class EstelaRaton extends javax.swing.JFrame {
    String color = "";
    int pos = 0;
    private String forma_estela="Circular";
    
    public EstelaRaton() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        colorfondo = new javax.swing.JComboBox<>();
        formaestela = new javax.swing.JComboBox<>();
        colorestela = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dibujandoEstela1 = new com.mycompany.practica4_ratonestela.DibujandoEstela();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(104, 120, 148));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(104, 120, 148));

        jPanel1.setBackground(new java.awt.Color(104, 120, 148));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setText("Estela del Ratón");

        colorfondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Negro", "Amarillo", "Verde" }));
        colorfondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorfondoActionPerformed(evt);
            }
        });

        formaestela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrada", "Circular" }));
        formaestela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaestelaActionPerformed(evt);
            }
        });

        colorestela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Rosa" }));
        colorestela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorestelaActionPerformed(evt);
            }
        });

        jLabel1.setText("Elige el color del fondo del lienzo");

        jLabel3.setText("Elige la forma de la estela");

        jLabel2.setText("Elige el color de la estela");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(colorestela, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formaestela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(177, 177, 177))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(colorfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorestela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formaestela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        dibujandoEstela1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dibujandoEstela1.setToolTipText("Mueve el ratón");
        dibujandoEstela1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dibujandoEstela1MouseMoved(evt);
            }
        });
        dibujandoEstela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dibujandoEstela1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout dibujandoEstela1Layout = new javax.swing.GroupLayout(dibujandoEstela1);
        dibujandoEstela1.setLayout(dibujandoEstela1Layout);
        dibujandoEstela1Layout.setHorizontalGroup(
            dibujandoEstela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dibujandoEstela1Layout.setVerticalGroup(
            dibujandoEstela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dibujandoEstela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dibujandoEstela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorfondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorfondoActionPerformed
        dibujandoEstela1.removePoints();
        switch (colorfondo.getSelectedItem().toString()) {
            case "Blanco":
                dibujandoEstela1.setColorFondo(Color.WHITE);
                dibujandoEstela1.repaint();
                break;
            case "Negro":
                dibujandoEstela1.setColorFondo(Color.BLACK);
                dibujandoEstela1.repaint();
                break;
            case "Amarillo":
                dibujandoEstela1.setColorFondo(Color.YELLOW);
                dibujandoEstela1.repaint();
                break;
            default:
                dibujandoEstela1.setColorFondo(Color.GREEN);
                dibujandoEstela1.repaint();
                break;
        }
        
    }//GEN-LAST:event_colorfondoActionPerformed

    private void formaestelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaestelaActionPerformed
        forma_estela = formaestela.getSelectedItem().toString();
        dibujandoEstela1.setFormaPoint(forma_estela);
    }//GEN-LAST:event_formaestelaActionPerformed

    private void colorestelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorestelaActionPerformed
        dibujandoEstela1.removePoints();
        switch (colorestela.getSelectedItem().toString()) {
            case "Rojo":
                dibujandoEstela1.setColorEstela(Color.RED);
                dibujandoEstela1.repaint();
                break;
            case "Azul":
                dibujandoEstela1.setColorEstela(Color.BLUE);
                dibujandoEstela1.repaint();
                break;
            case "Rosa":
                dibujandoEstela1.setColorEstela(Color.PINK);
                dibujandoEstela1.repaint();
                break;
        }
    }//GEN-LAST:event_colorestelaActionPerformed

    private void dibujandoEstela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dibujandoEstela1MouseExited
        dibujandoEstela1.removePoints();
        dibujandoEstela1.repaint();
    }//GEN-LAST:event_dibujandoEstela1MouseExited

    private void dibujandoEstela1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dibujandoEstela1MouseMoved
        dibujandoEstela1.addPoints(new Point(evt.getX(), evt.getY()), 0);
        //pos++;
        dibujandoEstela1.repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
    }//GEN-LAST:event_dibujandoEstela1MouseMoved

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
            java.util.logging.Logger.getLogger(EstelaRaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstelaRaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstelaRaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstelaRaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstelaRaton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> colorestela;
    private javax.swing.JComboBox<String> colorfondo;
    private com.mycompany.practica4_ratonestela.DibujandoEstela dibujandoEstela1;
    private javax.swing.JComboBox<String> formaestela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
