package tictactoe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;

/**
 * This is the Tic tac toe panel. raws the game board and game status. Status includes indicating
 * whose turn it is, and if the game is over, who won.
 */
public class TicTacToePanel extends JPanel {
  /**
   * The Panels.
   */
  private final JPanel[][] panels;
  /**
   * The Info.
   */
  private final JLabel info;
  /**
   * The Model.
   */
  private final ReadonlyTttModel model;
  /**
   * The Sp.
   */
  private final JSplitPane sp;

  /**
   * Instantiates a new Tic tac toe panel.
   *
   * @param model the model
   */
  public TicTacToePanel(ReadonlyTttModel model) {
    this.model = model;
    JPanel box = new JPanel();
    box.setLayout(new GridLayout(3, 3));
    JPanel description = new JPanel();
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
            Player[][] board = model.getBoard();
            if (board[row][col] == null) return;
            g.drawString(board[row][col].toString(), 75, 75);
          }
        };
        panels[i][j].setBorder(new LineBorder(Color.BLACK));
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

  /**
   * Refresh the board.
   */
  public void refresh() {
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

  /**
   * Get sp j split pane.
   *
   * @return the j split pane
   */
  public JSplitPane getSp() {
    return this.sp;
  }

  /**
   * Get panels j panel.
   *
   * @return the j panel
   */
  public JPanel[][] getPanels() {
    return panels;
  }
}
