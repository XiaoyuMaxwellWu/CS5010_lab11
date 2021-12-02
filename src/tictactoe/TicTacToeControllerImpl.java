package tictactoe;

import java.io.IOException;

public class TicTacToeControllerImpl implements TicTacToeController{
  private final TicTacToeView ticTacToeView;
  private final TicTacToe ticTacToe;

  public TicTacToeControllerImpl(TicTacToeView ticTacToeView, TicTacToe ticTacToe) {
    this.ticTacToeView = ticTacToeView;
    this.ticTacToe = ticTacToe;
  }

  private boolean ifQuit(String s, TicTacToe m) throws IOException {
//    if (s.equals("q") || s.equals("Q")) {
//      out.append("Game quit! Ending game state:\n");
//      out.append(m.toString());
//      out.append("\n");
//      return true;
//    }
    return false;
  }

  @Override
  public void playGame() {
//    if (!(ticTacToe instanceof TicTacToeModel)) {
//      throw new IllegalArgumentException("Invalid model");
//    }
//    try {
//      while (!m.isGameOver()) {
//        out.append(m.toString()).append("\n");
//        out.append("Enter a move for ").append(m.getTurn().name()).append(":").append("\n");
//
//        int[] pos = new int[2];
//        while (true) {
//          if (!scan.hasNext()) {
//            return;
//          }
//          String s1 = scan.next();
//          if (ifQuit(s1, m)) {
//            return;
//          }
//          if (s1.matches("[0-9]")) {
//            pos[0] = Integer.parseInt(s1);
//            if (!scan.hasNext()) {
//              return;
//            }
//            while (true) {
//              if (!scan.hasNext()) {
//                return;
//              }
//              String s2 = scan.next();
//              if (ifQuit(s2, m)) {
//                return;
//              }
//              if (s2.matches("[0-9]")) {
//                pos[1] = Integer.parseInt(s2);
//                break;
//              } else {
//                out.append("Not a valid number: ").append(s2).append("\n");
//              }
//            }
//          } else {
//            out.append("Not a valid number: ").append(s1).append("\n");
//            continue;
//          }
//
//          if (!(pos[0] < 4 && pos[0] > 0 && pos[1] < 4 && pos[1] > 0)) {
//            out.append("Not a valid move: ").append((char) (pos[0] + '0')).append(", ")
//                    .append((char) (pos[1] + '0')).append("\n");
//            continue;
//          }
//
//          try {
//            m.move(pos[0] - 1, pos[1] - 1);
//            break;
//          } catch (IllegalStateException ise) {
//            out.append(ise.getMessage()).append("\n");
//            continue;
//          } catch (IllegalArgumentException iae) {
//            out.append(String.format("Not a valid move: %d, %d\n", pos[0], pos[1]));
//            continue;
//          }
//
//        }
//        if (m.isGameOver()) {
//          out.append(m.toString()).append("\n");
//          out.append("Game is over! ");
//          if (m.getWinner() == null) {
//            out.append("Tie game.");
//          } else {
//            out.append(String.format("%s wins.\n", m.getWinner().toString()));
//          }
//          break;
//        }
//      }
//
//    } catch (IOException ioe) {
//      throw new IllegalStateException("Append failed", ioe);
//    }
  }

  @Override
  public void handleCellClick(int row, int col) {

  }
}
