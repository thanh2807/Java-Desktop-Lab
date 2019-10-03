/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.io.File;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author Nhat Thanh
 */
public class MainForm extends javax.swing.JFrame {
    
    private String textCheckSaved = "";
    private boolean saved = true;
    private File file = null;

    
    public JMenuItem getEditCopy() {
        return editCopy;
    }

    public JMenuItem getEditCut() {
        return editCut;
    }

    public JMenuItem getEditFind() {
        return editFind;
    }

    public JMenuItem getEditPaste() {
        return editPaste;
    }

    public JMenuItem getEditRedo() {
        return editRedo;
    }

    public JMenuItem getEditReplace() {
        return editReplace;
    }

    public JMenuItem getEditUndo() {
        return editUndo;
    }

    public JTextArea getTxtArea() {    
        return txtArea;
    }

    public void setEditCopy(JMenuItem editCopy) {
        this.editCopy = editCopy;
    }

    public void setEditCut(JMenuItem editCut) {
        this.editCut = editCut;
    }

    public void setEditFind(JMenuItem editFind) {
        this.editFind = editFind;
    }

    public void setEditPaste(JMenuItem editPaste) {
        this.editPaste = editPaste;
    }

    public void setEditRedo(JMenuItem editRedo) {
        this.editRedo = editRedo;
    }

    public void setEditReplace(JMenuItem editReplace) {
        this.editReplace = editReplace;
    }

    public void setEditUndo(JMenuItem editUndo) {
        this.editUndo = editUndo;
    }

    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }

    public JMenuItem getEditChangeFont() {
        return editChangeFont;
    }

    public void setEditChangeFont(JMenuItem editChangeFont) {
        this.editChangeFont = editChangeFont;
    }

    public JMenuItem getFileExit() {
        return fileExit;
    }

    public JMenuItem getFileNew() {
        return fileNew;
    }

    public JMenuItem getFileOpen() {
        return fileOpen;
    }

    public JMenuItem getFileSave() {
        return fileSave;
    }

    public JMenuItem getFileSaveAs() {
        return fileSaveAs;
    }

    public void setFileExit(JMenuItem fileExit) {
        this.fileExit = fileExit;
    }

    public void setFileNew(JMenuItem fileNew) {
        this.fileNew = fileNew;
    }

    public void setFileOpen(JMenuItem fileOpen) {
        this.fileOpen = fileOpen;
    }

    public void setFileSave(JMenuItem fileSave) {
        this.fileSave = fileSave;
    }

    public void setFileSaveAs(JMenuItem fileSaveAs) {
        this.fileSaveAs = fileSaveAs;
    }

    public String getTextCheckSaved() {
        return textCheckSaved;
    }

    public boolean isSaved() {
        return saved;
    }

    public File getFile() {
        return file;
    }

    public void setTextCheckSaved(String textCheckSaved) {
        this.textCheckSaved = textCheckSaved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public JMenuItem getEditSelectAll() {
        return editSelectAll;
    }

    public void setEditSelectAll(JMenuItem editSelectAll) {
        this.editSelectAll = editSelectAll;
    }
    
    
    
    /**
     * Creates new form MainForm
    */
    
    public MainForm() {
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

        ScrollPane = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        Separator1 = new javax.swing.JPopupMenu.Separator();
        fileSave = new javax.swing.JMenuItem();
        fileSaveAs = new javax.swing.JMenuItem();
        Separator2 = new javax.swing.JPopupMenu.Separator();
        fileExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        editUndo = new javax.swing.JMenuItem();
        editRedo = new javax.swing.JMenuItem();
        Separator3 = new javax.swing.JPopupMenu.Separator();
        editCut = new javax.swing.JMenuItem();
        editCopy = new javax.swing.JMenuItem();
        editPaste = new javax.swing.JMenuItem();
        editSelectAll = new javax.swing.JMenuItem();
        Separator4 = new javax.swing.JPopupMenu.Separator();
        editFind = new javax.swing.JMenuItem();
        editReplace = new javax.swing.JMenuItem();
        editChangeFont = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Nodepad");

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtArea.setRows(5);
        ScrollPane.setViewportView(txtArea);

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menuFile.setText("File");
        menuFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        fileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fileNew.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fileNew.setText("File");
        menuFile.add(fileNew);

        fileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fileOpen.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fileOpen.setText("Open");
        fileOpen.setToolTipText("");
        menuFile.add(fileOpen);
        menuFile.add(Separator1);

        fileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fileSave.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fileSave.setText("Save");
        menuFile.add(fileSave);

        fileSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        fileSaveAs.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fileSaveAs.setText("Save As");
        menuFile.add(fileSaveAs);
        menuFile.add(Separator2);

        fileExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        fileExit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fileExit.setText("Exit");
        fileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitActionPerformed(evt);
            }
        });
        menuFile.add(fileExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");
        menuEdit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        editUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        editUndo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editUndo.setText("Undo");
        menuEdit.add(editUndo);

        editRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        editRedo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editRedo.setText("Redo");
        menuEdit.add(editRedo);
        menuEdit.add(Separator3);

        editCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        editCut.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editCut.setText("Cut");
        menuEdit.add(editCut);

        editCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        editCopy.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editCopy.setText("Copy");
        menuEdit.add(editCopy);

        editPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        editPaste.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editPaste.setText("Paste");
        menuEdit.add(editPaste);

        editSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        editSelectAll.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editSelectAll.setText("Select All");
        menuEdit.add(editSelectAll);
        menuEdit.add(Separator4);

        editFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        editFind.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editFind.setText("Find");
        menuEdit.add(editFind);

        editReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        editReplace.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editReplace.setText("Replace");
        menuEdit.add(editReplace);

        editChangeFont.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        editChangeFont.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editChangeFont.setText("Change Font");
        menuEdit.add(editChangeFont);

        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fileExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JPopupMenu.Separator Separator1;
    private javax.swing.JPopupMenu.Separator Separator2;
    private javax.swing.JPopupMenu.Separator Separator3;
    private javax.swing.JPopupMenu.Separator Separator4;
    private javax.swing.JMenuItem editChangeFont;
    private javax.swing.JMenuItem editCopy;
    private javax.swing.JMenuItem editCut;
    private javax.swing.JMenuItem editFind;
    private javax.swing.JMenuItem editPaste;
    private javax.swing.JMenuItem editRedo;
    private javax.swing.JMenuItem editReplace;
    private javax.swing.JMenuItem editSelectAll;
    private javax.swing.JMenuItem editUndo;
    private javax.swing.JMenuItem fileExit;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenuItem fileSaveAs;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
