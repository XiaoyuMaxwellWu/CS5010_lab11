package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class TicTacToeViewImpl extends JFrame implements TicTacToeView {

  private final ReadonlyTttModel model;
  private final TicTacToePanel panel ;
  public TicTacToeViewImpl(ReadonlyTttModel model) {
    this.model = model;
    this.panel = new TicTacToePanel(model);
    setSize(500, 500);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    this.add(panel.getSp());
  }

  @Override
  public void addClickListener(TicTacToeController listener) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        panel.getPanels()[i][j].addMouseListener(new TicTacToeMouseAdapter(i, j, listener));
      }
    }
//    description.add(info);
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        panels[i][j].addMouseListener(new TicTacToeMouseAdapter(i, j, listener));
//        board.add(panels[i][j]);
//      }
//    }
//    JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
//    sp.setResizeWeight(0.8);
//    sp.setEnabled(false);
//    sp.setDividerSize(0);
//    sp.add(board);
//    sp.add(description);
//    add(sp);
//    refresh();
  }

  @Override
  public void refresh() {
//    Player[][] board = model.getBoard();
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        if (board[i][j] == null) continue;
//        panels[i][j].setText(board[i][j].toString());
//        panels[i][j].repaint();
//      }
//    }
//    info.setText("Next turn is " + model.getTurn());
//    if (model.isGameOver()) {
//      if (model.getWinner() != null) {
//        info.setText("Winner is " + model.getWinner());
//      } else {
//        info.setText("Game is draw");
//      }
//    }
    panel.refresh();
  }


  @Override
  public void makeVisible() {
    setVisible(true);
  }
}
