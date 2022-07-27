package mineSweeper;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import mineSweeper.mainMenuAssets.*;
import mineSweeper.mainMenuAssets.Buttons.*;

public class MainMenu extends JFrame{
    private beginnerB beg = new beginnerB();

    private intermediateB inter = new intermediateB();

    private expertB exp = new expertB();

    private JPanel mp;

    private Difficulties difLabel = new Difficulties();
    
    public MainMenu(){
        creatorMethod();
        addMethod();

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    private void creatorMethod(){
        mp = new JPanel(new FlowLayout());

        setTitle("Minesweeper");
    }

    private void addMethod(){
        addActionsToBut();

        mp.add(difLabel);
        mp.add(beg);
        mp.add(inter);
        mp.add(exp);
        this.add(mp);
    }

    private void addActionsToBut(){
        beg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setThisInvisible();
            }
        });

        inter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setThisInvisible();
            }
        });

        exp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setThisInvisible();
            }
        });
    }

    private void setThisInvisible(){
        setVisible(false);
    }
}
