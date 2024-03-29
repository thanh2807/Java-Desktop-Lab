/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Form.FindForm;
import Form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
/**
 *
 * @author Nhat Thanh
 */
public class FindController {
    /**
     * *
     * find
     *
     * @param mainForm
     * @param findForm
     */
    public void find(MainForm mainForm, FindForm findForm) {
        // when user click button find
        findForm.getBtnFindNext().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtFind = findForm.getTxtFind().getText();
                int indexCurrent;
                int indexTextSearch = -1;
                // check user want to find after
                if (findForm.getRadioDown().isSelected()) {
                    // must choose selectionend to change index cusor
                    indexCurrent = mainForm.getTxtArea().getSelectionEnd();
                    indexTextSearch = mainForm.getTxtArea().getText().indexOf(txtFind, indexCurrent);
                } else {
                    try {
                        indexCurrent = mainForm.getTxtArea().getSelectionStart();
                        String textCurrentCheck = mainForm.getTxtArea().getText(0, indexCurrent);
                        indexTextSearch = textCurrentCheck.lastIndexOf(txtFind);
                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                }
                // check have text want to search or not
                if (indexTextSearch != -1) {
                    mainForm.getTxtArea().setSelectionStart(indexTextSearch);
                    mainForm.getTxtArea().setSelectionEnd(indexTextSearch + txtFind.length());
                } else {
                    JOptionPane.showMessageDialog(findForm, "Cannot find \"" + txtFind + "\"", "Result", 2);
                }
            }
        });
    }

    /**
     * when user click button cancel
     *
     * @param findForm
     */
    public void cancelFind(FindForm findForm) {
        findForm.getBtnCancel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findForm.setVisible(false);
            }
        });
    }

    /**
     * check user not input
     *
     * @param findForm
     */
    public void checkEmptyFind(FindForm findForm) {
        findForm.getTxtFind().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                if (findForm.getTxtFind().getText().trim().isEmpty()) {
                    findForm.getBtnFindNext().setEnabled(false);
                } else {
                    findForm.getBtnFindNext().setEnabled(true);
                }
            }
        });
    }
}
