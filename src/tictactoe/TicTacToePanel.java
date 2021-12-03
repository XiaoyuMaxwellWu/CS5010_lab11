package tictactoe;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToePanel extends JPanel {
  private String text = "";
  
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
    JTextField textField = new JTextField("X");
    textField.setEditable(false);

  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  protected void paintComponent(Graphics g) {
    g.drawString(text, 50, 100);
    
  }
  
}
