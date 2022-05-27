package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("HI");
        JLabel label = new JLabel("HELLO");
        JTextField number=new JTextField(8);
        int secret=new Random().nextInt(10)+1;
        System.out.println(secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num= Integer.parseInt(number.getText());
                System.out.println(num);
                if (num>secret){
                    label.setText("Smaller");
                }else if(num<secret){
                    label.setText("Bigger");
                }else {
                    label.setText("BINGO");
                }
               // label.setText("oh my god");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    public static void main(String[] args) {
     GuessFrame guessFrame=new GuessFrame();
     guessFrame.setVisible(true);
    }
}
