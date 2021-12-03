package tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * The type Tic tac toe mouse adapter.
 */
public class TicTacToeMouseAdapter extends MouseAdapter {

  /**
   * The Row.
   */
  private final int row;
  /**
   * The Col.
   */
  private final int col;
  /**
   * The Controller.
   */
  private final TicTacToeController controller;

  /**
   * Instantiates a new Tic tac toe mouse adapter.
   *
   * @param row        the row
   * @param col        the col
   * @param controller the controller
   */
  public TicTacToeMouseAdapter(int row, int col, TicTacToeController controller) {
    this.row = row;
    this.col = col;
    this.controller = controller;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    controller.handleCellClick(row, col);
  }

}
