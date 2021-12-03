package tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import sun.tools.jps.Jps;

public class TicTacToeMouseAdapter extends MouseAdapter {

  private int row;
  private int col;
  private TicTacToeController controller;
  private TicTacToePanel panel;
  private TicTacToe model;
  public TicTacToeMouseAdapter(int row, int col, TicTacToeController controller, TicTacToePanel panel, TicTacToe model){
    
    this.row = row;
    this.col = col;
    this.controller = controller;
    this.panel = panel;
    this.model = model;
    
  }
  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println(row + " " + col);
    controller.handleCellClick(row, col);
  }


}
