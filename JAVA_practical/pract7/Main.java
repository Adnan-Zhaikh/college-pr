package JAVA_practical.pract7;
//Aim: Write a program to design a Calculator GUI and Perform arithmetic operations using Event Handling.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    
    private JTextField  textField;
    private JButton[]  numberButtons;
    private JButton[] functionButtons;
    private JButton[] addButton, subButton, mulButton, divButton, eqButton, clrButton, backspaceButton;
    private JPanel panel, textFieldPanel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Main() {
        setTitle("CalCulator");
        setSize(350,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
    }

}
