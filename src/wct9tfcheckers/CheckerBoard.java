/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wct9tfcheckers;

import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 *
 * @author wthuston
 */
class CheckerBoard {
    private GridPane board = null;
    private int numRows = 8;
    private int numCols = 8;
    private int size = (numRows*numCols);
    private int boardWidth = 600;
    private int boardHeight = 600;
    private Color lightColor = Color.RED;
    private Color darkColor = Color.BLACK;
    
    CheckerBoard(int numRows, int numCols, int boardWidth, int boardHeight) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }
    CheckerBoard (int numRows, int numCols, int boardWidth, int boardHeight, Color lightColor, Color darkColor){
        this(numRows, numCols, boardWidth, boardHeight);
        this.lightColor = lightColor;
        this.darkColor = darkColor;        
    }
    
    //Color[] squareColors = new Color[] {Color.RED, Color.BLACK};

    public GridPane build() {
        //builds the board UI
        GridPane grid = new GridPane();
        Color[] squareColors = new Color[] {lightColor, darkColor};
        for (int row=0;row < numRows;row++){
            for(int col=0;col<numCols;col++){
                grid.add(new Rectangle(size, size, squareColors[(row+col)%2]), col, row);
            }
        }
        return grid;
    }

    public GridPane getBoard(){
        if(board == null)
        {
            board = build();
            return board;
        }
        
        return board;
    }
    
    public int getNumRows(){
        return this.numRows;
    }
    public int getNumCols(){
        return this.numCols;
    }
    public int getWidth(){
        return this.boardWidth;
    }
    public int getHeight(){
        return this.boardHeight;
    }
    public Color getLightColor(){
        return this.lightColor;
    }
    public Color getDarkColor(){
        return this.darkColor;
    }
    
}