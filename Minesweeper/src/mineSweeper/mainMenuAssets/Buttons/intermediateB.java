package mineSweeper.mainMenuAssets.Buttons;

import javax.swing.*;
import java.awt.event.*;

import mineSweeper.Game.GameController;

public class intermediateB extends JButton{
    public intermediateB(){
        initCompo();
    }

    private void initCompo(){
        setText("intermediate");

        //  On click
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameController("intermediate");
            }
        });
    }
}
