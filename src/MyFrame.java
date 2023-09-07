import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{

    JButton button1, button2, button3;
    
    MyFrame() {

        button1 = new JButton("button1");
        button1.setBounds(100, 100, 250, 100);
        button1.addActionListener(this);
        button2 = new JButton("button2");
        button2.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MadLibs");
        this.setLayout(null);
        this.setSize(400,400);
        this.setVisible(true);

        this.add(button1, BorderLayout.NORTH);
        this.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("You pressed button 1");
        }
        if (e.getSource() == button2) {
            System.out.println("You pressed button 2");
        }
    }
}
