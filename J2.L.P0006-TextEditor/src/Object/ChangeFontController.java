/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Form.ChangeFontForm;
import Form.MainForm;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Nhat Thanh
 */
public class ChangeFontController {
    /**
     * init font form
     *
     * @param changeFontForm
     */
    public void setupChangeFontForm(ChangeFontForm changeFontForm) {
        changeFontForm.getPnlReview().setPreferredSize(new Dimension(150, 50));
        changeFontForm.setTitle("Font");
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        changeFontForm.getListFont().setListData(fonts);
        String styles[] = {"Regular", "Bold", "Italic", "Bold Italic"};
        changeFontForm.getListFontStyle().setListData(styles);
        String sizes[] = {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "36", "40", "72"};
        changeFontForm.getListSize().setListData(sizes);
    }

    /**
     * set up change font
     *
     * @param mainForm
     * @param changeFontForm
     */
    public void setupChangeFont(MainForm mainForm, ChangeFontForm changeFontForm) {
        String fontCurrent = mainForm.getTxtArea().getFont().getFamily();
        int styleCurrent = mainForm.getTxtArea().getFont().getStyle();
        int sizeCurrent = mainForm.getTxtArea().getFont().getSize();
        changeFontForm.getListFont().setSelectedValue(fontCurrent, true);
        changeFontForm.getListFontStyle().setSelectedIndex(styleCurrent);
        changeFontForm.getListSize().setSelectedValue(Integer.toString(sizeCurrent), true);
        changeFontForm.getTxtSize().setText(Integer.toString(sizeCurrent));
        changeFontForm.getTxtFont().setText(fontCurrent);
        changeFontForm.getTxtFontStyle().setText(changeFontForm.getListFontStyle().getSelectedValue());
    }

    /**
     * when user change font
     *
     * @param mainForm
     * @param changeFontForm
     */
    public void changeFont(MainForm mainForm, ChangeFontForm changeFontForm) {
        changeFontForm.getListFont().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String fontChoose = changeFontForm.getListFont().getSelectedValue();
                int styleCurrent = changeFontForm.getTextPreview().getFont().getStyle();
                int sizeCurrent = changeFontForm.getTextPreview().getFont().getSize();
                changeFontForm.getTxtFont().setText(fontChoose);
                changeFontForm.getTextPreview().setFont(new Font(fontChoose, styleCurrent, sizeCurrent));
            }
        });
    }

    /**
     * when user change style
     *
     * @param mainForm
     * @param changeFontForm
     */
    public void changeStyle(MainForm mainForm, ChangeFontForm changeFontForm) {
        changeFontForm.getListFontStyle().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int styleChoose = changeFontForm.getListFontStyle().getSelectedIndex();
                String fontCurrent = changeFontForm.getTextPreview().getFont().getFontName();
                int sizeCurrent = changeFontForm.getTextPreview().getFont().getSize();
                switch (styleChoose) {
                    case 0:
                        changeFontForm.getTxtFontStyle().setText("Regular");
                        break;
                    case 1:
                        changeFontForm.getTxtFontStyle().setText("Bold");
                        break;
                    case 2:
                        changeFontForm.getTxtFontStyle().setText("Italic");
                        break;
                    case 3:
                        changeFontForm.getTxtFontStyle().setText("Bold Italic");
                        break;
                }
                changeFontForm.getTxtFontStyle().setFont(new Font(fontCurrent, styleChoose, sizeCurrent));
            }
        });
    }

    /**
     * when user change size
     *
     * @param mainForm
     * @param changeFontForm
     */
    public void changeSize(MainForm mainForm, ChangeFontForm changeFontForm) {
        changeFontForm.getListSize().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String sizeChoose = changeFontForm.getListSize().getSelectedValue();
                String fontCurrent = changeFontForm.getTextPreview().getFont().getFontName();
                int styleCurrent = changeFontForm.getTextPreview().getFont().getStyle();
                changeFontForm.getTxtSize().setText(sizeChoose);
                changeFontForm.getTextPreview().setFont(new Font(fontCurrent, styleCurrent, Integer.parseInt(sizeChoose)));
            }
        });
        changeFontForm.getTxtSize().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String sizeChoose = changeFontForm.getTxtSize().getText();
                if (sizeChoose != "") {
                    String fontCurrent = changeFontForm.getTextPreview().getFont().getFontName();
                    int styleCurrent = changeFontForm.getTextPreview().getFont().getStyle();
                    changeFontForm.getTextPreview().setFont(new Font(fontCurrent, styleCurrent, Integer.parseInt(sizeChoose)));
                }
            }
        });
    }

    /**
     * click cancel or oke
     *
     * @param mainForm
     * @param changeFontForm
     */
    public void clickButtonChangeFontForm(MainForm mainForm, ChangeFontForm changeFontForm) {
        changeFontForm.getBtnOK().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fontCurrent = changeFontForm.getListFont().getSelectedValue();
                int styleCurrent = changeFontForm.getListFontStyle().getSelectedIndex();
                int sizeCurrent = Integer.parseInt(changeFontForm.getTxtSize().getText());
                mainForm.getTxtArea().setFont(new Font(fontCurrent, styleCurrent, sizeCurrent));
                changeFontForm.setVisible(false);
            }
        });
        changeFontForm.getBtnCancel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFontForm.setVisible(false);
            }
        });
    }
}
