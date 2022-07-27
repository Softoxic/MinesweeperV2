package mineSweeper.Game;

public class Match{
    private String dif;

    private int rows, columns, numberOfMines;
    
    public Match(String dif, int rows, int columns, int numberOfMines){
        this.rows = rows;
        this.columns = columns;
        this.numberOfMines = numberOfMines;
    }
}
