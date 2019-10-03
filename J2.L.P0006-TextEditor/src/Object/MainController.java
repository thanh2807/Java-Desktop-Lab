/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Form.MainForm;

/**
 *
 * @author Nhat Thanh
 */
public class MainController {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        EditController edit = new EditController();
        edit.controller(mainForm);
        FileController file = new FileController();
        file.controller(mainForm);
    }
}
