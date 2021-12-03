package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class TicTacToeViewImpl extends JFrame implements TicTacToeView {

  JPanel board;
  JPanel description;
  ReadonlyTttModel model;
  TicTacToePanel[][] panels;
  public TicTacToeViewImpl(ReadonlyTttModel model) {
    this.model = model;
    panels = new TicTacToePanel[3][3];
//    setSize(500,500);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    pack();
    setVisible(true); 
  }

  @Override
  public void addClickListener(TicTacToeController listener) {

//    for (int i = 0; i < grid.length; i++) {
//      for (int j = 0; j < grid[0].length; j++) {
//        final int row = i;
//        final int col = j;
//        grid[i][j].addActionListener(l -> listener.handleCellClick(row, col));
//      }
//    }
    board = new JPanel(new GridLayout(3,3));
    description = new JPanel();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        panels[i][j] = new TicTacToePanel(i, j);
        panels[i][j].addMouseListener(new TicTacToeMouseAdapter(i, j, listener, panels[i][j]));
        board.add(panels[i][j]); 
      } 
    }
    JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    sp.setResizeWeight(0.7);
    sp.setEnabled(false);
    sp.setDividerSize(0);
    sp.add(board);
    sp.add(description);
    add(sp);
    
  }

  @Override
  public void refresh() {
    Player[][] board = model.getBoard();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if(board[i][j]==null)continue;
        panels[i][j].setText(board[i][j].toString());
        panels[i][j].repaint();
      }
    }
  }


  @Override
  public void makeVisible() {

  }
}
