package mineSweeper.mainMenuAssets.Buttons;

import javax.swing.*;
import java.awt.event.*;

import mineSweeper.Game.GameController;

public class beginnerB extends JButton{
    public beginnerB(){
        initCompo();
    }

    private void initCompo(){
        setText("beginner");

        //  On click
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameController("beginner");
            }
        });
    }
}
