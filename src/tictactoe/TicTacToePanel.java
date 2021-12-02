package tictactoe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class TicTacToePanel extends JPanel {

  public TicTacToePanel(int row, int col) {
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        grid[i][j] = new JButton();
//        grid[i][j].putClientProperty("INDEX", new Integer[]{i, j});
//        grid[i][j].putClientProperty("OWNER", null);
//        this.add(grid[i][j]);
//      }
//    }
    setBorder(new LineBorder(Color.BLACK));
    addMouseListener(new TicTacToeMouseAdapter(row, col));
  
  }


}
