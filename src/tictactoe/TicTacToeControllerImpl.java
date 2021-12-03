package tictactoe;

/**
 * The type Tic tac toe controller.
 */
public class TicTacToeControllerImpl implements TicTacToeController {
  /**
   * The Tic tac toe view.
   */
  private final TicTacToeView ticTacToeView;
  /**
   * The Tic tac toe.
   */
  private final TicTacToe ticTacToe;

  /**
   * Instantiates a new Tic tac toe controller.
   *
   * @param ticTacToeView the tic tac toe view
   * @param ticTacToe     the tic tac toe
   */
  public TicTacToeControllerImpl(TicTacToeView ticTacToeView, TicTacToe ticTacToe) {
    this.ticTacToeView = ticTacToeView;
    this.ticTacToe = ticTacToe;
  }


  @Override
  public void playGame() {
    ticTacToeView.addClickListener(this);
    ticTacToeView.makeVisible();
  }

  @Override
  public void handleCellClick(int row, int col) {
    if (ticTacToe.getMarkAt(row, col) != null) return;
    if (!ticTacToe.isGameOver()) {
      ticTacToe.move(row, col);
      ticTacToeView.refresh();
    }
  }
}
