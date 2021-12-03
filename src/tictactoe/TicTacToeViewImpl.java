package tictactoe;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * This is the Tic tac toe view which can generate the view and add click listener.
 */
public class TicTacToeViewImpl extends JFrame implements TicTacToeView {

  /**
   * The Panel.
   */
  private final TicTacToePanel panel;

  /**
   * Instantiates a new Tic tac toe view.
   *
   * @param model the model
   */
  public TicTacToeViewImpl(ReadonlyTttModel model) {
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
  }

  @Override
  public void refresh() {
    panel.refresh();
  }


  @Override
  public void makeVisible() {
    setVisible(true);
  }
}
