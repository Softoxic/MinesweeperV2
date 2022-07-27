package mineSweeper.Game.GamePlay;

import mineSweeper.Game.Match;

public class DifVarSetter {

    private String dif;

    private int rows, columns, numberOfMines;

    private Match match;

    public DifVarSetter(String dif){
        this.dif = dif;
        setDifVars();
        initCompo();
    }

    private void setDifVars(){
        if(this.dif == "beginner") {
            this.rows = 9;
            this.columns = 9;
            this.numberOfMines = 10;
        }

        else if(this.dif == "intermediate") {
            this.rows = 16;
            this.columns = 16;
            this.numberOfMines = 30;
        }

        else {
            this.rows = 16;
            this.columns = 30;
            this.numberOfMines = 50;
        }
    }

    private void initCompo(){
        
    }

    public Match getMatch() {
        return match;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
