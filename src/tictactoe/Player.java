package tictactoe;

/**
 * Represents a player in the game of tic-tac-toe.
 */
public enum Player {
  /**
   * X player.
   */
  X("X"),
  /**
   * O player.
   */
  O("O");

  /**
   * The Disp.
   */
  private final String disp;

  /**
   * Instantiates a new Player.
   *
   * @param disp the disp
   */
  private Player(String disp) {
    this.disp = disp;
  }

  @Override
  public String toString() {
    return disp;
  }
}
