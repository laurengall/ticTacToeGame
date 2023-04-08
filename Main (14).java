import java.util.Scanner; 
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    boolean running = true; 
    int cmd = 0;  
    
      System.out.println("Move Key: "); 
      System.out.println();
      System.out.println("1|2|3");
      System.out.println("4|5|6");
      System.out.println("7|8|9"); 
      System.out.println();    
      System.out.println();
      System.out.println("_|_|_");
      System.out.println("_|_|_");
      System.out.println(" | | "); 
      System.out.println();
      int[][] board = new int[3][3];  
      xTurn(cmd, input, board);
    while (running){
    }
  
  }
  public static void xTurn(int cmd, Scanner input, int[][] board){
    System.out.println("It is X's turn. Input your desired move."); 
      cmd = input.nextInt();
      move(cmd, board); 
  }
  public static void oTurn(int cmd, Scanner input){
    System.out.println("It is O's turn. Input your desired move."); 
      cmd = input.nextInt();
  }
  public static void move(int cmd, int[][] board){
    ArrayList<Integer> xmoves = new ArrayList<Integer>(); 
    ArrayList<Integer> omoves = new ArrayList<Integer>(); 
    switch(cmd){
      case 1: 
        xmoves.add(1); 
        board[0][0] = 1; 
        break; 
      case 2: 
        xmoves.add(2); 
        board[0][1] = 2; 
        break; 
      case 3: 
        xmoves.add(3); 
        board[0][2] = 3; 
        break;
      case 4: 
        xmoves.add(4); 
        board[1][0] = 4; 
        break;
      case 5: 
        xmoves.add(5); 
        board[1][1] = 5; 
        break;
      case 6: 
        xmoves.add(6); 
        board[1][2] = 6; 
        break;
      case 7: 
        xmoves.add(7); 
        board[2][0] = 7; 
        break;
        case 8: 
        xmoves.add(8); 
        board[2][1] = 8; 
        break;
        case 9: 
        xmoves.add(9); 
        board[2][2] = 9; 
        break;
    }
  }
}