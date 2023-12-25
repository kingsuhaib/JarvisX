package jarvis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;



public class WelcSc extends JFrame implements ActionListener{

    JButton b1;
    JButton b2;
    JButton b3;
    JTextField bg;
    JButton bgl;
    JLabel h;
    JLabel hd;
    JLabel hh;

WelcSc(){

    b1 = new JButton();
    b1.setFocusable(false);
    b1.setText("Manager");
    b1.setFont(new Font("Sans Serif", Font.BOLD,15));
    b1.setBackground(new Color(0xDC7633));
    b1.setBounds(820,250,200,50);
    b1.setForeground(new Color(0xFFFFFF));
    b1.setBorder(null);
    b1.addActionListener(this);

    b2 = new JButton();
    b2.setFocusable(false);
    b2.setText("Employee");
    b2.setFont(new Font("Sans Serif", Font.BOLD,15));
    b2.setBackground(new Color(0x2ECC71));
    b2.setBounds(820,320,200,50);
    b2.setForeground(new Color(0xFFFFFF));
    b2.setBorder(null);
    b2.addActionListener(this);

    b3 = new JButton();
    b3.setFocusable(false);
    b3.setText("Client");
    b3.setFont(new Font("Sans Serif", Font.BOLD,15));
    b3.setBackground(new Color(0xB557F6));
    b3.setBounds(820,390,200,50);
    b3.setForeground(new Color(0xFFFFFF));
    b3.setBorder(null);
    b3.addActionListener(this);

    h = new JLabel();
    h.setText("<html>"+"JarvisX - Skyrocketing "+"<br />"+"Management"+"</html");
    h.setFont(new Font("Helvetica", Font.BOLD, 30));
    h.setBounds(100,100,500,300);
    h.setForeground(new Color(0x333333));

    hd = new JLabel();
    hd.setText("<html>"+"JarvisX is a freelancing agency management software. The software "+"<br />"+"is based on java and aims to help freelancing agencies of different"+"<br />"+"sizes manage their workload better."+"</html");
    hd.setFont(new Font("Helvetica", Font.BOLD, 15));
    hd.setBounds(100,200,500,300);
    hd.setForeground(new Color(0x333333));
    hd.setVisible(true);

    hh = new JLabel();
    hh.setText("Please Login to Continue. ");
    hh.setFont(new Font("Helvetica", Font.BOLD, 30));
    hh.setBounds(100,350,500,300);
    hh.setForeground(new Color(0x4F64FB));


    bg = new JTextField();
    bg.setFont(new Font("Sans Serif", Font.BOLD,10));
    bg.setBackground(new Color(0xFFFFFF));
    bg.setBounds(50,50,600,560);
    bg.setForeground(new Color(0xFFFFFF));
    bg.setBorder(null);
    bg.setCaretColor(new Color(0xFFFFFF));
    bg.setVisible(true);
    bg.setEditable(false);

    bgl = new JButton();
    bgl.setFont(new Font("Sans Serif", Font.BOLD,10));
    bgl.setBackground(new Color(0x4F64FB));
    bgl.setBounds(100,305,100,3);
    bgl.setForeground(new Color(0x333333));
    bgl.setBorder(null);
    bgl.setRolloverEnabled(false);
    bgl.setVisible(true);

    this.setLayout(null);
    this.setTitle("JarvisX - The Agency Management System");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1200, 700);
    this.setVisible(true);
    this.setResizable(false);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(0x181818));
    this.setLocationRelativeTo(null);


    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(h);
    this.add(hd);
    this.add(hh);
    this.add(bgl);
    this.add(bg);


}
    @Override
    public void actionPerformed(ActionEvent a){
        //MANAGER
        if (a.getSource()==b1){
            this.dispose();
            LoginPanel lp = new LoginPanel(0);

        }
        //EMPLOYEE
        else if (a.getSource()==b2){
            this.dispose();
            LoginPanel lp = new LoginPanel("s");

        }
        //CLIENT
        else if(a.getSource()==b3){
            this.dispose();
            LoginPanel lp = new LoginPanel(2.0f);

        }
    }
}
