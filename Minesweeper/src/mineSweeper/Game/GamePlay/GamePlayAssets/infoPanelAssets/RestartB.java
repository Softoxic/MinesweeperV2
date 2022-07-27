package mineSweeper.Game.GamePlay.GamePlayAssets.infoPanelAssets;

import java.awt.event.*;

import javax.swing.*;

import mineSweeper.Game.GameController;

public class RestartB extends JButton{
    private String dif;
    public RestartB(String dif){
        this.dif = dif;
        initCompo();
    }

    private void initCompo(){
        String smileIcon = "img/smile.png";

        setIcon(new ImageIcon(getClass().getResource(smileIcon)));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartButtonAction();
            }
        });
    }

    private void restartButtonAction(){
        new GameController(dif);
    }
}
