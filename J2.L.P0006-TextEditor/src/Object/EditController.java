/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Form.ChangeFontForm;
import Form.FindForm;
import Form.ReplaceForm;
import Form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.DefaultEditorKit;
import javax.swing.undo.UndoManager;
/**
 *
 * @author Nhat Thanh
 */
public class EditController {
    /**
     * controller edit
     *
     * @param mainForm
     */
    public void controller(MainForm mainForm) {
        UndoManager manager = new UndoManager();
        mainForm.getTxtArea().getDocument().addUndoableEditListener(manager);

        canEdit(mainForm);
        canUndoRedo(mainForm, manager);

        undo(mainForm, manager);
        redo(mainForm, manager);
        copyPasteCut(mainForm);
        selectAll(mainForm);

        findController(mainForm);
        replaceController(mainForm);
        changeFontController(mainForm);
    }

    /**
     * check user can undo, redo, copy,...
     *
     * @param mainForm
     */
    private void canEdit(MainForm mainForm) {
        // when open editor can't undo, redo
        mainForm.getEditCopy().setEnabled(false);
        mainForm.getEditCut().setEnabled(false);
        mainForm.getEditFind().setEnabled(false);
        mainForm.getEditReplace().setEnabled(false);

        // check when content text area change
        mainForm.getTxtArea().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String textCurrent = mainForm.getTxtArea().getText();
                // can undo redo when user change text
                if (textCurrent.length() != 0) {
                    mainForm.getEditFind().setEnabled(true);
                    mainForm.getEditReplace().setEnabled(true);
                }
                // can show cut, copy
                if (mainForm.getTxtArea().getSelectedText() != null) {
                    mainForm.getEditCut().setEnabled(true);
                    mainForm.getEditCopy().setEnabled(true);
                } else {
                    mainForm.getEditCut().setEnabled(false);
                    mainForm.getEditCopy().setEnabled(false);
                }

            }
        });
    }

    /**
     * check can undo redo
     *
     * @param mainForm
     * @param manager
     */
    private void canUndoRedo(MainForm mainForm, UndoManager manager) {
        // when new app, user can't undo redo
        mainForm.getEditUndo().setEnabled(false);
        mainForm.getEditRedo().setEnabled(false);
        mainForm.getTxtArea().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {

                if (manager.canUndo()) {
                    mainForm.getEditUndo().setEnabled(true);
                } else {
                    mainForm.getEditUndo().setEnabled(false);
                }
                if (manager.canRedo()) {
                    mainForm.getEditRedo().setEnabled(true);
                } else {
                    mainForm.getEditRedo().setEnabled(false);
                }
            }
        });
    }

    /**
     * undo
     *
     * @param mainForm
     * @param manager
     */
    private void undo(MainForm mainForm, UndoManager manager) {
        mainForm.getEditUndo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.undo();
            }
        });
    }

    /**
     * redo
     *
     * @param mainForm
     * @param manager
     */
    private void redo(MainForm mainForm, UndoManager manager) {
        mainForm.getEditRedo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.redo();
            }
        });
    }

    /**
     * copy, past, cut
     *
     * @param mainForm
     */
    private void copyPasteCut(MainForm mainForm) {
        Action copy = new DefaultEditorKit.CopyAction();
        Action paste = new DefaultEditorKit.PasteAction();
        Action cut = new DefaultEditorKit.CutAction();

        mainForm.getEditCopy().addActionListener(copy);
        mainForm.getEditPaste().addActionListener(paste);
        mainForm.getEditCut().addActionListener(cut);

    }

    /**
     * select all
     *
     * @param mainForm
     */
    private void selectAll(MainForm mainForm) {
        mainForm.getEditSelectAll().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm.getTxtArea().selectAll();
            }
        });
    }

    /**
     * find controller
     *
     * @param mainForm
     */
    private void findController(MainForm mainForm) {
        mainForm.getEditFind().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FindForm findForm = new FindForm(mainForm, true);
                findForm.setVisible(true);
                findForm.getBtnFindNext().setEnabled(false);

                FindController findController = new FindController();
                findController.checkEmptyFind(findForm);
                findController.find(mainForm, findForm);
                findController.cancelFind(findForm);
            }
        });
    }

    /**
     * replace controller
     *
     * @param mainForm
     */
    private void replaceController(MainForm mainForm) {
        mainForm.getEditReplace().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReplaceForm replaceForm = new ReplaceForm(mainForm, false);
                replaceForm.setVisible(true);
                replaceForm.getBtnReplace().setEnabled(false);
                replaceForm.getBtnReplaceAll().setEnabled(false);

                ReplaceController replaceController = new ReplaceController();
                replaceController.checkEmptyReplace(replaceForm);
                replaceController.replace(mainForm, replaceForm);
                replaceController.replaceAll(mainForm, replaceForm);
                replaceController.cancelReplace(replaceForm);
            }
        });
    }

    /**
     * change font controller
     *
     * @param mainForm
     */
    private void changeFontController(MainForm mainForm) {
        mainForm.getEditChangeFont().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangeFontForm changeFontForm = new ChangeFontForm();
                changeFontForm.setVisible(true);

                ChangeFontController changeFontController = new ChangeFontController();
                changeFontController.setupChangeFont(mainForm, changeFontForm);
                changeFontController.setupChangeFontForm(changeFontForm);
                changeFontController.changeFont(mainForm, changeFontForm);
                changeFontController.changeSize(mainForm, changeFontForm);
                changeFontController.changeStyle(mainForm, changeFontForm);
                changeFontController.clickButtonChangeFontForm(mainForm, changeFontForm);
            }
        });
    }
}
