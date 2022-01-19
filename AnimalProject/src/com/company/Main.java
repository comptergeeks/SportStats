package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {
     JFrame frame;
     JPanel panel;
     JButton b;
     JTextField players;

    public static void main(String[] args){
        new Main();
    }
    public Main() {
        frame = new JFrame("Sports Stats");
        frame.setSize(1000, 1000);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.add(panel);
        frame.setVisible(true);
        ImageIcon basketball = new ImageIcon("/Users/farhankhan/IdeaProjects/AnimalProject/basketball.png");

        b = new JButton(basketball);
        b.addActionListener(this);
        b.setSize(50, 50);
        b.setBackground(Color.black);
        b.setOpaque(true);

        players = new JTextField(20);
        players.setEditable(false);


        panel.setSize(100,100);
        panel.setVisible(true);
        panel.setBackground(Color.blue);
        panel.add(b);
        panel.add(players);

        //JButton b=new JButton(new ImageIcon("![](../../../basketball.png)"));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            Basketball michael = new Basketball("michael",500, 23, 10, true, 30, 20 );
            //Basketball ivan = new Basketball("ivan", 500, 23, 10, true, 30, 10);
            players.setText(String.valueOf(michael));
        }
    }
}
