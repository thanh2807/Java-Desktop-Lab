/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Form.MainForm;
import Form.ReplaceForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
/**
 *
 * @author Nhat Thanh
 */
public class ReplaceController {
    /**
     * replace
     *
     * @param mainForm
     * @param replaceForm
     */
    public void replace(MainForm mainForm, ReplaceForm replaceForm) {
        replaceForm.getBtnReplace().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textAreaCurrent = mainForm.getTxtArea().getText();
                String textFind = replaceForm.getTxtFindWhat().getText();
                String textReplace = replaceForm.getTxtReplaceWhat().getText();
                mainForm.getTxtArea().setText(textAreaCurrent.replaceFirst(textFind, textReplace));
                int indexCurrent = mainForm.getTxtArea().getText().lastIndexOf(textReplace) + textReplace.length();

                int indexTextSearch = -1;
                indexTextSearch = mainForm.getTxtArea().getText().indexOf(textFind, indexCurrent);
                // check have text want to search or not
                if (indexTextSearch != -1) {
                    mainForm.getTxtArea().setSelectionStart(indexTextSearch);
                    mainForm.getTxtArea().setSelectionEnd(indexTextSearch + textFind.length());
                } else {
                    JOptionPane.showMessageDialog(replaceForm, "Cannot find \"" + textFind + "\"", "Result", 2);
                }
            }
        });
    }

    /**
     * replace all
     *
     * @param mainForm
     * @param replaceForm
     */
    public void replaceAll(MainForm mainForm, ReplaceForm replaceForm) {
        replaceForm.getBtnReplaceAll().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // check textarea empty to show warning
                if (mainForm.getTxtArea().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(replaceForm, "No text field found!!!", "Error", 2);
                } else {
                    String textAreaCurrent = mainForm.getTxtArea().getText();
                    String textFind = replaceForm.getTxtFindWhat().getText();
                    String textReplace = replaceForm.getTxtReplaceWhat().getText();
                    mainForm.getTxtArea().setText(textAreaCurrent.replaceAll(textFind, textReplace));
                }
            }
        });
    }

    /**
     * check empty replace
     *
     * @param replaceForm
     */
    public void checkEmptyReplace(ReplaceForm replaceForm) {
        replaceForm.getTxtFindWhat().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                if (replaceForm.getTxtFindWhat().getText().trim().isEmpty()) {
                    replaceForm.getBtnReplace().setEnabled(false);
                    replaceForm.getBtnReplaceAll().setEnabled(false);
                } else {
                    replaceForm.getBtnReplace().setEnabled(true);
                    replaceForm.getBtnReplaceAll().setEnabled(true);
                }
            }
        });
    }

    /**
     * cancel replace
     *
     * @param replaceForm
     */
    public void cancelReplace(ReplaceForm replaceForm) {
        replaceForm.getBtnCancel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replaceForm.setVisible(false);
            }
        });
    }
}
