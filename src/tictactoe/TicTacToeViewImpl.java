package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToeViewImpl extends JFrame implements TicTacToeView {

  JPanel board;
  TicTacToe model;
  TicTacToePanel[][] panels;
  public TicTacToeViewImpl(String caption, TicTacToe model) {
    super(caption);
    this.model = model;
    panels = new TicTacToePanel[3][3];
    setSize(500, 300);
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
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        panels[i][j] = new TicTacToePanel(i, j);
        final int row = i;
        final int col = j;
        panels[i][j].addMouseListener(new TicTacToeMouseAdapter(row, col, listener, panels[i][j], model));
        board.add(panels[i][j]);
      } 
    }  
    add(board);
  }

  @Override
  public void refresh() {
    Player turn = model.getTurn();
    
  }


  @Override
  public void makeVisible() {

  }
}
