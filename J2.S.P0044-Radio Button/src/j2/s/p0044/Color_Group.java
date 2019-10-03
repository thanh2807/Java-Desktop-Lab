/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.s.p0044;

import java.awt.Color;

/**
 *
 * @author Nhat Thanh
 */
public class Color_Group extends javax.swing.JFrame {

    /**
     * Creates new form Color_Group
     */
    public Color_Group() {
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
        radioGroup = new javax.swing.JPanel();
        radioRed = new javax.swing.JRadioButton();
        radioGreen = new javax.swing.JRadioButton();
        radioBlack = new javax.swing.JRadioButton();
        radioBlue = new javax.swing.JRadioButton();
        pnlBackground = new javax.swing.JPanel();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radioRed);
        radioRed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radioRed.setText("Red");
        radioRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRedActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioGreen);
        radioGreen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radioGreen.setText("Green");
        radioGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGreenActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBlack);
        radioBlack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radioBlack.setText("Black");
        radioBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBlackActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBlue);
        radioBlue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radioBlue.setText("Blue");
        radioBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBlueActionPerformed(evt);
            }
        });

        text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout radioGroupLayout = new javax.swing.GroupLayout(radioGroup);
        radioGroup.setLayout(radioGroupLayout);
        radioGroupLayout.setHorizontalGroup(
            radioGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(radioGroupLayout.createSequentialGroup()
                        .addGroup(radioGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioRed)
                            .addComponent(radioGreen)
                            .addComponent(radioBlack)
                            .addComponent(radioBlue))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        radioGroupLayout.setVerticalGroup(
            radioGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioRed)
                .addGap(34, 34, 34)
                .addComponent(radioGreen)
                .addGap(39, 39, 39)
                .addComponent(radioBlack)
                .addGap(43, 43, 43)
                .addComponent(radioBlue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRedActionPerformed
        // TODO add your handling code here:
        pnlBackground.setBackground(Color.RED);
        text.setText("Red is selected");
        text.setForeground(Color.WHITE);
    }//GEN-LAST:event_radioRedActionPerformed

    private void radioGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGreenActionPerformed
        // TODO add your handling code here:
        pnlBackground.setBackground(Color.GREEN);
        text.setText("Green is selected");
        text.setForeground(Color.WHITE);
    }//GEN-LAST:event_radioGreenActionPerformed

    private void radioBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBlackActionPerformed
        // TODO add your handling code here:
        pnlBackground.setBackground(Color.BLACK);
        text.setText("Black is selected");
        text.setForeground(Color.WHITE);
    }//GEN-LAST:event_radioBlackActionPerformed

    private void radioBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBlueActionPerformed
        // TODO add your handling code here:
        pnlBackground.setBackground(Color.BLUE);
        text.setText("Blue is selected");
        text.setForeground(Color.WHITE);
    }//GEN-LAST:event_radioBlueActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Color_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Color_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Color_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Color_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Color_Group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JRadioButton radioBlack;
    private javax.swing.JRadioButton radioBlue;
    private javax.swing.JRadioButton radioGreen;
    private javax.swing.JPanel radioGroup;
    private javax.swing.JRadioButton radioRed;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
