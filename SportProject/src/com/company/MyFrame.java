package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JPanel implements ActionListener {
    public JFrame frame = new JFrame("Sports Statistics");
    public JPanel panel = new JPanel();
    private ImageIcon b = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\basketball.png");
    private ImageIcon s = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\soccerball.png");
    private ImageIcon f = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\football.png");
    private ImageIcon backarrow = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\bluearrow.png");
    private ImageIcon jordanPic = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\JORDAN.png");
    private ImageIcon ronaldoPic = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\ronaldo.png");
    private ImageIcon ricePic = new ImageIcon("D:\\new java projects\\SportProject\\src\\com\\company\\rice.png");
    public JButton basketball = new JButton(b);
    public JButton soccer = new JButton(s);
    public JButton football = new JButton(f);
    public JButton arrow = new JButton(backarrow);
    public JLabel playerStat = new JLabel();
    public JLabel label = new JLabel(jordanPic);
    public JLabel label2 = new JLabel(ronaldoPic);
    public JLabel label3 = new JLabel(ricePic);


    public void setJFrame() {
        frame.setSize(1000, 1000);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setVisible(true);
    }

    public void createPanel() {
        frame.add(panel);
        panel.setSize(1000, 1000);
        panel.setVisible(true);
        panel.setBackground(Color.DARK_GRAY);
        panel.add(basketball);
        basketball.setVisible(true);
        basketball.addActionListener(this);
        basketball.setBackground(null);
        basketball.setBorder(null);
        panel.add(playerStat);
        panel.add(soccer);
        soccer.setVisible(true);
        soccer.addActionListener(this);
        soccer.setBackground(null);
        soccer.setBorder(null);
        panel.add(football);
        football.setVisible(true);
        football.setBorder(null);
        football.addActionListener(this);
        football.setBackground(null);
        panel.add(playerStat);
        playerStat.setForeground(Color.white);
        playerStat.setFont(new Font("Century Gothic", Font.PLAIN, 20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.add(arrow);
        arrow.addActionListener(this);
        arrow.setBackground(null);
        arrow.setBorder(null);
        arrow.setVisible(true);
        if (e.getSource() == basketball){
            Basketball michael = new Basketball("Michael Jordan",4000000, 23, 48, true, 32.7, 83.5 );
            panel.setBackground(Color.black);
            hideButtons();
            panel.add(playerStat);
            playerStat.setText(michael.toString());
            panel.add(label);
        }
        if (e.getSource() == soccer){
            Soccer ronaldo = new Soccer("Christiano Ronaldo",36060437, 7, 0.73, 803, 229, 84);
            Color crimson = new Color(86, 8, 25);
            panel.setBackground(crimson);
            hideButtons();
            panel.add(playerStat);
            playerStat.setText(ronaldo.toString());
            panel.add(label2);
        }
        if (e.getSource() == football){
            Football rice = new Football("Jerry Rice",1000000, 80, 197, 1549, 22895, 14.8);
            Color gold = new Color(255, 215, 0);
            panel.setBackground(gold);
            hideButtons();
            panel.add(playerStat);
            playerStat.setText(rice.toString());
            panel.add(label3);
            playerStat.setForeground(Color.black);
        }
        if (e.getSource() == arrow) {
            createPanel();
            arrow.setVisible(false);
            panel.remove(arrow);
            arrow.setVisible(false);
            panel.remove(playerStat);
            panel.remove(label);
            panel.remove(label2);
            panel.remove(label3);
        }
    }
    public void hideButtons() {
        basketball.setVisible(false);
        soccer.setVisible(false);
        football.setVisible(false);
        panel.remove(basketball);
        panel.remove(soccer);
        panel.remove(football);
    }
}
