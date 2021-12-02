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

  private JButton grid[][];
  JPanel board;
  public TicTacToeViewImpl(String caption) {
    super(caption);
    setSize(500, 300);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    grid = new JButton[3][3];
   
    add(board);
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
        TicTacToePanel ticTacToePanel = new TicTacToePanel(i, j);
        final int row = i;
        final int col = j;
        ticTacToePanel.addMouseListener(new TicTacToeMouseAdapter(row, col, listener));
      }
    }
    
  }

  @Override
  public void refresh() {

  }

  @Override
  public void makeVisible() {

  }
}
