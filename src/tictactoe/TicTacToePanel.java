package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
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
    JTextField textField = new JTextField("X");
    textField.setEditable(false);

  }


}
