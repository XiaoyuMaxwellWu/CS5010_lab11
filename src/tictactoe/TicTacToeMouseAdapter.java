package tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeMouseAdapter extends MouseAdapter {

  private int row;
  private int col;
  private TicTacToeController controller;
  public TicTacToeMouseAdapter(int row, int col, TicTacToeController controller){
    
    this.row = row;
    this.col = col;
    this.controller = controller;
  }
  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println(row + " " + col);
    controller.handleCellClick(row, col);
  }


}
