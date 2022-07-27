package mineSweeper.mainMenuAssets.Buttons;

import javax.swing.*;
import java.awt.event.*;

import mineSweeper.Game.GameController;

public class expertB extends JButton{
    public expertB(){
        initCompo();
    }

    private void initCompo(){
        setText("expert");

        //  On click
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameController("expert");
            }
        });
    }
}
