package mineSweeper.Game.GamePlay;

import javax.swing.*;

import mineSweeper.Game.GamePlay.GamePlayAssets.*;
import mineSweeper.Game.GamePlay.GamePlayAssets.infoPanelAssets.RestartB;

public class GameGUI extends JFrame{
    private JMenuBar mb;
    
    private int rows, columns, numberOfMines;   //timer;

    private Cell[][] cell;

    private JPanel mainPanel, GPanel, infoPanel;

    private JLabel timerLabel, mineNumLabel, livesLabel;

    private RestartB restart;

    public GameGUI(){
        initCompo();
    }

    private void initCompo(){
        
    }
}
