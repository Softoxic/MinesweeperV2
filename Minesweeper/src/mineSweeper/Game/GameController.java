package mineSweeper.Game;

import mineSweeper.Game.GamePlay.*;
import mineSweeper.Game.GamePlay.GamePlayAssets.Cell;

public class GameController {
    private static Cell[][] cell;

    public GameController(String dif){
        DifVarSetter gameplay = new DifVarSetter(dif);
        GameGUI gameGui = new GameGUI();
    }
}
