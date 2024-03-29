/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Nhat Thanh
 */
public class FindForm extends javax.swing.JFrame {

    private FindForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }
    
    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnFindNext() {
        return btnFindNext;
    }
    
    public void setBtnFindNext(JButton btnFindNext) {
        this.btnFindNext = btnFindNext;
    }

    public JRadioButton getRadioDown() {
        return radioDown;
    }
    
    public void setRadioDown(JRadioButton radioDown) {
        this.radioDown = radioDown;
    }
    
    public JRadioButton getRadioUp() {
        return radioUp;
    }
    
    public void setRadioUp(JRadioButton radioUp) {
        this.radioUp = radioUp;
    }

    public JTextField getTxtFind() {
        return txtFind;
    }   

    public void setTxtFind(JTextField txtFind) {
        this.txtFind = txtFind;
    }
   
    /**
     * Creates new form FindForm
     */
    public FindForm(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiobtnDirection = new javax.swing.ButtonGroup();
        lblFind = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnFindNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblDirection = new javax.swing.JLabel();
        radioUp = new javax.swing.JRadioButton();
        radioDown = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFind.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblFind.setText("Find What:");

        txtFind.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        btnFindNext.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnFindNext.setText("Find Next");

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCancel.setText("Cancel");

        lblDirection.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDirection.setText("Direction:");

        radiobtnDirection.add(radioUp);
        radioUp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radioUp.setText("Up");

        radiobtnDirection.add(radioDown);
        radioDown.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radioDown.setText("Down");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblFind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(radioUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioDown)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindNext)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(lblDirection)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindNext))
                .addGap(41, 41, 41)
                .addComponent(lblDirection)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(radioUp)
                    .addComponent(radioDown))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FindForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFindNext;
    private javax.swing.JLabel lblDirection;
    private javax.swing.JLabel lblFind;
    private javax.swing.JRadioButton radioDown;
    private javax.swing.JRadioButton radioUp;
    private javax.swing.ButtonGroup radiobtnDirection;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
