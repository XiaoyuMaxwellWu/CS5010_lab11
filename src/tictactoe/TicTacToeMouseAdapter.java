package tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeMouseAdapter extends MouseAdapter {

  int row;
  int col;
  public TicTacToeMouseAdapter(int row, int col){
    
    this.row = row;
    this.col = col;
  }
  
  public void mouseClicked(MouseEvent e) {
    System.out.println(row + " " + col);
  }


}
