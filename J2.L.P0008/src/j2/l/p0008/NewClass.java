/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.l.p0008;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat Thanh
 */
public class NewClass extends Frame implements ActionListener, Runnable{

    public int status = 0;
    public int Time = 0;
    public int count = 0;
    Thread th = null;
    //create ArrayList of two matrix
    ArrayList<String> array_3x3 = new ArrayList<String>();
    ArrayList<String> array_4x4 = new ArrayList<String>();

    public NewClass() {
        //call functions of program
        initComponents();
        Arraylist();
        Ramdom();
        //set up time for thread
        th = new Thread(this);
        th.start();
    }

    public static void main(String[] args) {
        new NewClass();
    }
    //create text on frame
    private JLabel lblMoveCount;
    private JLabel lblElapsed;
    private JLabel lblSỉze;
    private JButton button;
    //create all numbers of matrix 
    private Button bnt_num1, bnt_num2, bnt_num3, bnt_num4, bnt_num5, bnt_num6, bnt_num7, bnt_num8, bnt_num9, bnt_num10, bnt_num11, bnt_num12, bnt_num13, bnt_num14, bnt_num15, bnt_num16;
    private JComboBox cbbox;
    //set name of frame
    JFrame frame = new JFrame("Number");

    @SuppressWarnings("unchecked")
    private void initComponents() {
        //set text and location of "Move Count"
        lblMoveCount = new JLabel("Move count :  " + count);
        lblMoveCount.setBounds(60, 250, 120, 30);
        //set text and location of "Elapsed"
        lblElapsed = new JLabel("Elapsed : " + Time + " sec");
        lblElapsed.setBounds(60, 280, 100, 30);
        //set text and location of "Size"
        lblSỉze = new JLabel("Size :");
        lblSỉze.setBounds(60, 310, 50, 30);
        //set Combobox and option
        cbbox = new JComboBox();
        cbbox.addItem("3x3");
        cbbox.addItem("4x4");
        cbbox.setBounds(100, 315, 80, 20);
        cbbox.addActionListener(new java.awt.event.ActionListener() {
            /**
             * set location all of button on frame
             * @param evt 
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //if you choose 3x3 matrix
                if (cbbox.getSelectedIndex() == 0) {
                    status = 0;
                    //set random matrix and time
                    Ramdom();
                    Time = 0;
                    count = 0;
                    //hide button from 10-15
                    bnt_num10.setVisible(Boolean.FALSE);bnt_num11.setVisible(Boolean.FALSE);bnt_num12.setVisible(Boolean.FALSE);
                    bnt_num13.setVisible(Boolean.FALSE);bnt_num14.setVisible(Boolean.FALSE);bnt_num15.setVisible(Boolean.FALSE);
                    bnt_num16.setVisible(Boolean.FALSE);
                //if you choose 3x3 matrix
                } else {
                    status = 1;
                    //set random matrix and time
                    Ramdom();
                    Time = 0;
                    count = 0;
                    //show button from 10-15
                    bnt_num10.setVisible(Boolean.TRUE);bnt_num11.setVisible(Boolean.TRUE);bnt_num12.setVisible(Boolean.TRUE);
                    bnt_num13.setVisible(Boolean.TRUE);bnt_num14.setVisible(Boolean.TRUE);bnt_num15.setVisible(Boolean.TRUE);
                    bnt_num16.setVisible(Boolean.TRUE);
                }
            };
        });
        //set button to reset game
        JButton button = new JButton("New Game");
        //location of this button
        button.setBounds(60, 350, 110, 30);
        //set location of all button on the frame
        bnt_num1 = new Button();bnt_num1.setBounds(30, 50, 40, 40);
        bnt_num2 = new Button();bnt_num2.setBounds(80, 50, 40, 40);
        bnt_num3 = new Button();bnt_num3.setBounds(130, 50, 40, 40);
        bnt_num4 = new Button();bnt_num4.setBounds(30, 100, 40, 40);
        bnt_num5 = new Button();bnt_num5.setBounds(80, 100, 40, 40);
        bnt_num6 = new Button();bnt_num6.setBounds(130, 100, 40, 40);
        bnt_num7 = new Button();bnt_num7.setBounds(30, 150, 40, 40);
        bnt_num8 = new Button();bnt_num8.setBounds(80, 150, 40, 40);
        bnt_num9 = new Button();bnt_num9.setBounds(130, 150, 40, 40);
        bnt_num10 = new Button();bnt_num10.setBounds(180, 50, 40, 40);
        bnt_num11 = new Button();bnt_num11.setBounds(180, 100, 40, 40);
        bnt_num12 = new Button();bnt_num12.setBounds(180, 150, 40, 40);
        bnt_num13 = new Button();bnt_num13.setBounds(30, 200, 40, 40);
        bnt_num14 = new Button();bnt_num14.setBounds(80, 200, 40, 40);
        bnt_num15 = new Button();bnt_num15.setBounds(130, 200, 40, 40);
        bnt_num16 = new Button();bnt_num16.setBounds(180, 200, 40, 40);
        //show text label on the frame
        frame.add(lblMoveCount);
        frame.add(lblElapsed);
        frame.add(lblSỉze);
        frame.add(button);
        frame.add(cbbox);
        //show location for all button on the frame
        frame.add(bnt_num1);frame.add(bnt_num2);frame.add(bnt_num3);frame.add(bnt_num4);
        frame.add(bnt_num5);frame.add(bnt_num6);frame.add(bnt_num7);frame.add(bnt_num8);
        frame.add(bnt_num9);frame.add(bnt_num10);frame.add(bnt_num11);frame.add(bnt_num12);
        frame.add(bnt_num13);frame.add(bnt_num14);frame.add(bnt_num15);frame.add(bnt_num16);
        //set action for all button on the frame
        bnt_num1.addActionListener(this);bnt_num2.addActionListener(this);
        bnt_num3.addActionListener(this);bnt_num4.addActionListener(this);
        bnt_num5.addActionListener(this);bnt_num6.addActionListener(this);
        bnt_num7.addActionListener(this);bnt_num8.addActionListener(this);
        bnt_num9.addActionListener(this);bnt_num10.addActionListener(this);
        bnt_num11.addActionListener(this);bnt_num12.addActionListener(this);
        bnt_num13.addActionListener(this);bnt_num14.addActionListener(this);
        bnt_num15.addActionListener(this);bnt_num16.addActionListener(this);
        //hide if the matrix is 3x3
        status = 0;
        bnt_num10.setVisible(Boolean.FALSE);bnt_num11.setVisible(Boolean.FALSE);
        bnt_num12.setVisible(Boolean.FALSE);bnt_num13.setVisible(Boolean.FALSE);
        bnt_num14.setVisible(Boolean.FALSE);bnt_num15.setVisible(Boolean.FALSE);
        bnt_num16.setVisible(Boolean.FALSE);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ramdom();
                Time = 0;
                count = 0;
            }
        ;
        });
        //set size of frame
        frame.setSize(260, 460);
        frame.setLayout(null);
        //set action to exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //set the frame to center the screen
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }

    /**
     * set action for buttons to move on matrix 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //increace number of action of buttons on matrix 
        count++;
        //action for 3x3 matrix
        if (status == 0) {
            //set action for number 1 of button
            if (e.getSource() == bnt_num1) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num1.getLabel());
                    bnt_num1.setLabel(" ");
                }
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num1.getLabel());
                    bnt_num1.setLabel(" ");
                }
            }
            //set action for number 2 of button
            if (e.getSource() == bnt_num2) {
                if (bnt_num1.getLabel().equals(" ")) {
                    bnt_num1.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
                if (bnt_num3.getLabel().equals(" ")) {
                    bnt_num3.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
            }
            //set action for number 3 of button
            if (e.getSource() == bnt_num3) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num3.getLabel());
                    bnt_num3.setLabel(" ");
                }
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num3.getLabel());
                    bnt_num3.setLabel(" ");
                }
            }                        
            //set action for number 4 of button
            if (e.getSource() == bnt_num4) {
                if (bnt_num1.getLabel().equals(" ")) {
                    bnt_num1.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
                if (bnt_num7.getLabel().equals(" ")) {
                    bnt_num7.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
            }
            //set action for number 5 of button
            if (e.getSource() == bnt_num5) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
            }
            //set action for number 6 of button
            if (e.getSource() == bnt_num6) {
                if (bnt_num3.getLabel().equals(" ")) {
                    bnt_num3.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }

            }
            //set action for number 7 of button
            if (e.getSource() == bnt_num7) {
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num7.getLabel());
                    bnt_num7.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num7.getLabel());
                    bnt_num7.setLabel(" ");
                }
            }
            //set action for number 8 of button
            if (e.getSource() == bnt_num8) {
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
                if (bnt_num7.getLabel().equals(" ")) {
                    bnt_num7.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
            }
            //set action for empty of button
            if (e.getSource() == bnt_num9) {
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
            }
            //if all of buttons are right location
            if (bnt_num1.getLabel().equals("1") && bnt_num2.getLabel().equals("2") && bnt_num3.getLabel().equals("3") && bnt_num4.getLabel().equals("4")
                    && bnt_num5.getLabel().equals("5") && bnt_num6.getLabel().equals("6") && bnt_num7.getLabel().equals("7") && bnt_num8.getLabel().equals("8")) {
                    JOptionPane.showMessageDialog(this, "Congratulations! You won.");
            }
            //action for 4x4 matrix
        } else {
            //set action for number 1 of button
            if (e.getSource() == bnt_num1) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num1.getLabel());
                    bnt_num1.setLabel(" ");
                }
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num1.getLabel());
                    bnt_num1.setLabel(" ");
                }
            }
            //set action for number 2 of button
            if (e.getSource() == bnt_num2) {
                if (bnt_num1.getLabel().equals(" ")) {
                    bnt_num1.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
                if (bnt_num3.getLabel().equals(" ")) {
                    bnt_num3.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num2.getLabel());
                    bnt_num2.setLabel(" ");
                }
            }
            //set action for number 3 of button
            if (e.getSource() == bnt_num3) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num3.getLabel());
                    bnt_num3.setLabel(" ");
                }
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num3.getLabel());
                    bnt_num3.setLabel(" ");
                }
                if (bnt_num10.getLabel().equals(" ")) {
                    bnt_num10.setLabel(bnt_num3.getLabel());
                    bnt_num3.setLabel(" ");
                }
            }
            //set action for number 4 of button
            if (e.getSource() == bnt_num4) {
                if (bnt_num1.getLabel().equals(" ")) {
                    bnt_num1.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
                if (bnt_num7.getLabel().equals(" ")) {
                    bnt_num7.setLabel(bnt_num4.getLabel());
                    bnt_num4.setLabel(" ");
                }
            }
            //set action for number 5 of button
            if (e.getSource() == bnt_num5) {
                if (bnt_num2.getLabel().equals(" ")) {
                    bnt_num2.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num5.getLabel());
                    bnt_num5.setLabel(" ");
                }
            }
            //set action for number 6 of button
            if (e.getSource() == bnt_num6) {
                if (bnt_num3.getLabel().equals(" ")) {
                    bnt_num3.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
                if (bnt_num11.getLabel().equals(" ")) {
                    bnt_num11.setLabel(bnt_num6.getLabel());
                    bnt_num6.setLabel(" ");
                }
            }
            //set action for number 7 of button
            if (e.getSource() == bnt_num7) {
                if (bnt_num4.getLabel().equals(" ")) {
                    bnt_num4.setLabel(bnt_num7.getLabel());
                    bnt_num7.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num7.getLabel());
                    bnt_num7.setLabel(" ");
                }
                if (bnt_num13.getLabel().equals(" ")) {
                    bnt_num13.setLabel(bnt_num7.getLabel());
                    bnt_num7.setLabel(" ");
                }
            }
            //set action for number 8 of button
            if (e.getSource() == bnt_num8) {
                if (bnt_num5.getLabel().equals(" ")) {
                    bnt_num5.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
                if (bnt_num7.getLabel().equals(" ")) {
                    bnt_num7.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
                if (bnt_num14.getLabel().equals(" ")) {
                    bnt_num14.setLabel(bnt_num8.getLabel());
                    bnt_num8.setLabel(" ");
                }
            }
            //set action for number 9 of button
            if (e.getSource() == bnt_num9) {
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
                if (bnt_num12.getLabel().equals(" ")) {
                    bnt_num12.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
                if (bnt_num15.getLabel().equals(" ")) {
                    bnt_num15.setLabel(bnt_num9.getLabel());
                    bnt_num9.setLabel(" ");
                }
            }
            //set action for number 10 of button
            if (e.getSource() == bnt_num10) {
                if (bnt_num11.getLabel().equals(" ")) {
                    bnt_num11.setLabel(bnt_num10.getLabel());
                    bnt_num10.setLabel(" ");
                }
                if (bnt_num3.getLabel().equals(" ")) {
                    bnt_num3.setLabel(bnt_num10.getLabel());
                    bnt_num10.setLabel(" ");
                }
            }
            //set action for number 11 of button
            if (e.getSource() == bnt_num11) {
                if (bnt_num6.getLabel().equals(" ")) {
                    bnt_num6.setLabel(bnt_num11.getLabel());
                    bnt_num11.setLabel(" ");
                }
                if (bnt_num10.getLabel().equals(" ")) {
                    bnt_num10.setLabel(bnt_num11.getLabel());
                    bnt_num11.setLabel(" ");
                }
                if (bnt_num12.getLabel().equals(" ")) {
                    bnt_num12.setLabel(bnt_num11.getLabel());
                    bnt_num11.setLabel(" ");
                }
            }
            //set action for number 12 of button
            if (e.getSource() == bnt_num12) {
                if (bnt_num11.getLabel().equals(" ")) {
                    bnt_num11.setLabel(bnt_num12.getLabel());
                    bnt_num12.setLabel(" ");
                }
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num12.getLabel());
                    bnt_num12.setLabel(" ");
                }
                if (bnt_num16.getLabel().equals(" ")) {
                    bnt_num16.setLabel(bnt_num12.getLabel());
                    bnt_num12.setLabel(" ");
                }
            }
            //set action for number 13 of button
            if (e.getSource() == bnt_num13) {
                if (bnt_num7.getLabel().equals(" ")) {
                    bnt_num7.setLabel(bnt_num13.getLabel());
                    bnt_num13.setLabel(" ");
                }
                if (bnt_num14.getLabel().equals(" ")) {
                    bnt_num14.setLabel(bnt_num13.getLabel());
                    bnt_num13.setLabel(" ");
                }
            }
            //set action for number 14 of button
            if (e.getSource() == bnt_num14) {
                if (bnt_num13.getLabel().equals(" ")) {
                    bnt_num13.setLabel(bnt_num14.getLabel());
                    bnt_num14.setLabel(" ");
                }
                if (bnt_num8.getLabel().equals(" ")) {
                    bnt_num8.setLabel(bnt_num14.getLabel());
                    bnt_num14.setLabel(" ");
                }
                if (bnt_num15.getLabel().equals(" ")) {
                    bnt_num15.setLabel(bnt_num14.getLabel());
                    bnt_num14.setLabel(" ");
                }
            }
            //set action for number 15 of button
            if (e.getSource() == bnt_num15) {
                if (bnt_num9.getLabel().equals(" ")) {
                    bnt_num9.setLabel(bnt_num15.getLabel());
                    bnt_num15.setLabel(" ");
                }
                if (bnt_num14.getLabel().equals(" ")) {
                    bnt_num14.setLabel(bnt_num15.getLabel());
                    bnt_num15.setLabel(" ");
                }
                if (bnt_num16.getLabel().equals(" ")) {
                    bnt_num16.setLabel(bnt_num15.getLabel());
                    bnt_num15.setLabel(" ");
                }
            }
            //set action for empty number of button
            if (e.getSource() == bnt_num16) {
                if (bnt_num12.getLabel().equals(" ")) {
                    bnt_num12.setLabel(bnt_num16.getLabel());
                    bnt_num16.setLabel(" ");
                }
                if (bnt_num15.getLabel().equals(" ")) {
                    bnt_num15.setLabel(bnt_num16.getLabel());
                    bnt_num16.setLabel(" ");
                }
            }
             //if all of buttons are right their location
            if (bnt_num1.getLabel().equals("1") && bnt_num2.getLabel().equals("2") && bnt_num3.getLabel().equals("3") && bnt_num10.getLabel().equals("4")
                    && bnt_num4.getLabel().equals("5") && bnt_num5.getLabel().equals("6") && bnt_num6.getLabel().equals("7") && bnt_num11.getLabel().equals("8")
                    && bnt_num7.getLabel().equals("9") && bnt_num8.getLabel().equals("10") && bnt_num9.getLabel().equals("11") && bnt_num12.getLabel().equals("12")
                    && bnt_num13.getLabel().equals("13") && bnt_num14.getLabel().equals("14") && bnt_num15.getLabel().equals("15")) {
                JOptionPane.showMessageDialog(this, "Congratulations! You won.");
            }
        }
    }

    @Override
    public void run() {
        //loop for time and count
        for (Time = 0;; Time++) {
            lblElapsed.setText("Elapsed : " + Time + " sec");
            lblMoveCount.setText("Move count :" + count);
            try {
                //increase second
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * choose matrix
     */
    private void Ramdom() {
        if (status == 0) {
            Ramdom3x3();
        } else {
            Ramdom4x4();
        }
    }

    /**
     * set up 3x3 matrix
     */
    private void Ramdom3x3() {
        Collections.shuffle(array_3x3);
        bnt_num1.setLabel(array_3x3.get(0));bnt_num2.setLabel(array_3x3.get(1));
        bnt_num3.setLabel(array_3x3.get(2));bnt_num4.setLabel(array_3x3.get(3));
        bnt_num5.setLabel(array_3x3.get(4));bnt_num6.setLabel(array_3x3.get(5));
        bnt_num7.setLabel(array_3x3.get(6));bnt_num8.setLabel(array_3x3.get(7));
        bnt_num9.setLabel(array_3x3.get(8));
    }
    
    /**
     * set up 4x4 matrix
     */
    private void Ramdom4x4() {
        Collections.shuffle(array_4x4);
        bnt_num1.setLabel(array_4x4.get(0));bnt_num2.setLabel(array_4x4.get(1));
        bnt_num3.setLabel(array_4x4.get(2));bnt_num4.setLabel(array_4x4.get(3));
        bnt_num5.setLabel(array_4x4.get(4));bnt_num6.setLabel(array_4x4.get(5));
        bnt_num7.setLabel(array_4x4.get(6));bnt_num8.setLabel(array_4x4.get(7));
        bnt_num9.setLabel(array_4x4.get(8));bnt_num10.setLabel(array_4x4.get(9));
        bnt_num11.setLabel(array_4x4.get(10));bnt_num12.setLabel(array_4x4.get(11));
        bnt_num13.setLabel(array_4x4.get(12));bnt_num14.setLabel(array_4x4.get(13));
        bnt_num15.setLabel(array_4x4.get(14));bnt_num16.setLabel(array_4x4.get(15));
    }

    /**
     * set arraylist of number
     */
    private void Arraylist() {
        array_3x3.add("1");array_3x3.add("2");array_3x3.add("3");array_3x3.add("4");
        array_3x3.add("5");array_3x3.add("6");array_3x3.add("7");array_3x3.add("8");
        array_3x3.add(" ");
        array_4x4.add("1");array_4x4.add("2");array_4x4.add("3");array_4x4.add("4");
        array_4x4.add("5");array_4x4.add("6");array_4x4.add("7");array_4x4.add("8");
        array_4x4.add("9");array_4x4.add("10");array_4x4.add("11");array_4x4.add("12");
        array_4x4.add("13");array_4x4.add("14");array_4x4.add("15");
        array_4x4.add(" ");
    }
}
