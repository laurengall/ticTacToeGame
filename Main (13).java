
// importing classes
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ArrayLists to hold moves of players
    ArrayList<Integer> xmoves = new ArrayList<Integer>();
    ArrayList<Integer> omoves = new ArrayList<Integer>();
    // initialize user command
    int cmd = 0;
    // move key printed for user
    System.out.println("Move Key: ");
    System.out.println();
    System.out.println("1|2|3");
    System.out.println("4|5|6");
    System.out.println("7|8|9");
    System.out.println();
    // empty board printed for user
    System.out.println();
    System.out.println("_|_|_");
    System.out.println("_|_|_");
    System.out.println(" | | ");
    System.out.println();
    // initialize board
    String[][] board = new String[3][3];
    // x goes first
    xTurn(cmd, input, board, xmoves, omoves);
    oTurn(cmd, input, board, xmoves, omoves);
    xTurn(cmd, input, board, xmoves, omoves);
    oTurn(cmd, input, board, xmoves, omoves);
    xTurn(cmd, input, board, xmoves, omoves);
    oTurn(cmd, input, board, xmoves, omoves);
    xTurn(cmd, input, board, xmoves, omoves);
    oTurn(cmd, input, board, xmoves, omoves);
    xTurn(cmd, input, board, xmoves, omoves);
  }

  public static void xTurn(int cmd, Scanner input, String[][] board, ArrayList<Integer> xmoves,
      ArrayList<Integer> omoves) {
    System.out.println("It is X's turn. Input your desired move.");
    cmd = input.nextInt();
    xcheck(cmd, xmoves, input, omoves, board);
  }

  public static void oTurn(int cmd, Scanner input, String[][] board, ArrayList<Integer> xmoves,
      ArrayList<Integer> omoves) {
    System.out.println("It is O's turn. Input your desired move.");
    cmd = input.nextInt();
    ocheck(cmd, omoves, input, xmoves, board);
  }

  public static void xmove(int cmd, ArrayList<Integer> xmoves, String[][] board, String str) {
    switch (cmd) {
      case 1:
        xmoves.add(1);
        board[0][0] = str;
        break;
      case 2:
        xmoves.add(2);
        board[0][1] = str;
        break;
      case 3:
        xmoves.add(3);
        board[0][2] = str;
        break;
      case 4:
        xmoves.add(4);
        board[1][0] = str;
        break;
      case 5:
        xmoves.add(5);
        board[1][1] = str;
        break;
      case 6:
        xmoves.add(6);
        board[1][2] = str;
        break;
      case 7:
        xmoves.add(7);
        board[2][0] = str;
        break;
      case 8:
        xmoves.add(8);
        board[2][1] = str;
        break;
      case 9:
        xmoves.add(9);
        board[2][2] = str;
        break;
    }
  }

  public static void omove(int cmd, ArrayList<Integer> omoves, String[][] board, String str) {
    switch (cmd) {
      case 1:
        omoves.add(1);
        board[0][0] = str;
        break;
      case 2:
        omoves.add(2);
        board[0][1] = str;
        break;
      case 3:
        omoves.add(3);
        board[0][2] = str;
        break;
      case 4:
        omoves.add(4);
        board[1][0] = str;
        break;
      case 5:
        omoves.add(5);
        board[1][1] = str;
        break;
      case 6:
        omoves.add(6);
        board[1][2] = str;
        break;
      case 7:
        omoves.add(7);
        board[2][0] = str;
        break;
      case 8:
        omoves.add(8);
        board[2][1] = str;
        break;
      case 9:
        omoves.add(9);
        board[2][2] = str;
        break;
    }
  }

  public static void printBoard(String[][] board) {
    for (int i = 0; i < board.length; i++) {
      System.out.println();
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == null) {
          board[i][j] = " ";
        }
        System.out.print(board[i][j] + " |");
      }
    }
    System.out.println();
  }

  public static void xcheck(int cmd, ArrayList<Integer> xmoves, Scanner input, ArrayList<Integer> omoves,
      String[][] board) {
    boolean startOver = false;
    for (int i : xmoves) {
      while (i == cmd) {
        System.out.println("Not an available space. Please try again :");
        cmd = input.nextInt();
        startOver = true;
      }
    }
    for (int i : omoves) {
      while (i == cmd) {
        System.out.println("Not an available space. Please try again :");
        cmd = input.nextInt();
        startOver = true;
      }
    }
    if (startOver == true) {
      xcheck(cmd, xmoves, input, omoves, board);
    }
    xmove(cmd, xmoves, board, "X");
    printBoard(board);
  }

  public static void ocheck(int cmd, ArrayList<Integer> omoves, Scanner input, ArrayList<Integer> xmoves,
      String[][] board) {
    boolean startOver = false;
    for (int i : omoves) {
      while (i == cmd) {
        System.out.println("Not an available space. Please try again :");
        cmd = input.nextInt();
        startOver = true;
      }
    }
    for (int i : xmoves) {
      while (i == cmd) {
        System.out.println("Not an available space. Please try again :");
        cmd = input.nextInt();
        startOver = true;
      }
    }
    if (startOver == true) {
      ocheck(cmd, omoves, input, xmoves, board);
    }
    omove(cmd, omoves, board, "O");
    printBoard(board);
  }
}