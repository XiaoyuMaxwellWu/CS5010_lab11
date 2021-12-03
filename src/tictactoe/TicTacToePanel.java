package tictactoe;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToePanel extends JPanel {
  private final JPanel[][] panels;
  private final JPanel box;
  private final JPanel description;
  private final JLabel info;
  private final ReadonlyTttModel model;
  private final JSplitPane sp;
  public TicTacToePanel(ReadonlyTttModel model) {
    this.model = model;
    Player[][] board = model.getBoard();
    setLayout(new GridLayout(3, 3));
    setBorder(new LineBorder(Color.BLACK));
    box = new JPanel();
    description = new JPanel();
    info = new JLabel();
    description.add(info);
    panels = new JPanel[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        final int row = i;
        final int col = j;
        panels[i][j] = new JPanel(){
          @Override
          protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (board[row][col] == null) return;
            g.drawString(board[row][col].toString(), 50, 100);
          }
        };
        box.add(panels[i][j]);
      }
    }
    sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    sp.setResizeWeight(0.8);
    sp.setEnabled(false);
    sp.setDividerSize(0);
    sp.add(box);
    sp.add(description);
    refresh();
  }
  public void refresh(){
    Player[][] board = model.getBoard();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == null) continue;
        panels[i][j].repaint();
      }
    }
    info.setText("Next turn is " + model.getTurn());
    if (model.isGameOver()) {
      if (model.getWinner() != null) {
        info.setText("Winner is " + model.getWinner());
      } else {
        info.setText("Game is draw");
      }
    }
  }
  public JSplitPane getSp(){
    return this.sp;
  }
  public JPanel[][] getPanels() {
    return panels;
  }
}
