//Aim: Write a program to design a Calculator GUI and Perform arithmetic operations using Event Handling.
package JAVA_practical.pract7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    
    private JTextField  textField;
    private JButton[]  numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton, backspaceButton;
    private JPanel panel, textFieldPanel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Main() {
        setTitle("CalCulator");
        setSize(350,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setPreferredSize(new Dimension(300,50));
        textField.setFont(new Font("Arial", Font.PLAIN, 40));

        textFieldPanel = new JPanel(new BorderLayout());
        textFieldPanel.add(textField, BorderLayout.CENTER);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");
        backspaceButton = new JButton("<");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton, eqButton, clrButton, backspaceButton};
        for (JButton button : functionButtons) {
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
        }
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(textFieldPanel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(clrButton, gbc);
        gbc.gridx++;
        panel.add(addButton, gbc);
        gbc.gridx++;
        panel.add(subButton, gbc);
        gbc.gridx++;
        panel.add(backspaceButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(numberButtons[7], gbc);
        gbc.gridx++;
        panel.add(numberButtons[8], gbc);
        gbc.gridx++;
        panel.add(numberButtons[9], gbc);
        gbc.gridx++;
        panel.add(mulButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(numberButtons[4], gbc);
        gbc.gridx++;
        panel.add(numberButtons[5], gbc);
        gbc.gridx++;
        panel.add(numberButtons[6], gbc);
        gbc.gridx++;
        panel.add(divButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(numberButtons[1], gbc);
        gbc.gridx++;
        panel.add(numberButtons[2], gbc);
        gbc.gridx++;
        panel.add(numberButtons[3], gbc);
        gbc.gridx++;
        panel.add(eqButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 4;
        panel.add(numberButtons[0], gbc);

        add(panel);
        setVisible(true);

     
    }
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for(int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                
            }
        }
    }

}
