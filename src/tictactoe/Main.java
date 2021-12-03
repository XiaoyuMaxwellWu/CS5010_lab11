package tictactoe;

/**
 * Run a TicTacToe game interactively.
 */
public class Main {
  /**
   * Run a TicTacToe game interactively.
   */
  public static void main(String[] args) {
    TicTacToeModel model = new TicTacToeModel();
    TicTacToeView ticTacToeView = new TicTacToeViewImpl(model);
    TicTacToeController ticTacToeController = new TicTacToeControllerImpl(ticTacToeView, model);
    ticTacToeController.playGame();
  }
}
