package tictactoe;

import java.io.IOException;

public class TicTacToeControllerImpl implements TicTacToeController{
  private final TicTacToeView ticTacToeView;
  private final TicTacToe ticTacToe;
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
    if(ticTacToe.isGameOver() || ticTacToe.getMarkAt(row, col)!=null)return;
    ticTacToe.move(row, col);
    ticTacToeView.refresh();
  }
}
