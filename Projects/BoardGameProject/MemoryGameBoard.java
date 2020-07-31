import java.util.*;
public class MemoryGameBoard
{
   //instance variables
   public static final int BOARD_SIZE = 4;
   public static final int NUM_SWAPS = 1000;
   private Card[][] gameBoard; // what do i add into the arrays?
   
   public MemoryGameBoard()
   {
      gameBoard = new Card[BOARD_SIZE + 1][BOARD_SIZE + 1];
      initializeCards();
   }
   public void shuffleCards() // do i need to pass a array or declare in the method?
   {
      turnCardsFaceDown();
      int r1,c1,r2,c2;
      Random rng = new Random();
      for (int i = 1; i <= NUM_SWAPS;i++)
      {
         r1 = rng.nextInt(BOARD_SIZE)+1;
         c1 = rng.nextInt(BOARD_SIZE)+1;
         r2 = rng.nextInt(BOARD_SIZE)+1;
         c2 = rng.nextInt(BOARD_SIZE)+1;
         Card swap = gameBoard[r1][c1];
         gameBoard[r1][c1] = gameBoard[r2][c2];
         gameBoard[r2][c2] = swap;
      }      
   } 
   public void showBoard()
   {
      hideBoard();
      System.out.println(this);
      //display gameBoard
   }
   public boolean cardsMatch(int row1, int col1, int row2, int col2)
   {
      return gameBoard[row1][col1].equals(gameBoard[row2][col2]);
   }
   public boolean isFaceUp(int row, int col)
   {
      return gameBoard[row][col].isFaceUp();
   }
   public void flipCard(int row, int col)
   {
      gameBoard[row][col].flipCard();
   }
   public String toString()
   {
      StringBuffer board = new StringBuffer();
      board.append(" ");
      for(int i = 1; i <= BOARD_SIZE;i++)
         board.append(i + " ");
      board.append("\n");
      //seperator
      board.append(" =");
      for(int i = 1; i <= BOARD_SIZE;i++)
         board.append("=="); 
      board.append("\n");
      
      for (int i = 1; i <= BOARD_SIZE;i++)
      {
         board.append(i + "| "); 
         for(int j =1; j <= BOARD_SIZE;j++)
         {
            board.append(gameBoard[i][j] + " "); 
         }
         board.append("|\n"); 
      }
      board.append(" =");
      for(int i = 1; i <= BOARD_SIZE; i++)
         board.append("=="); 
      board.append("\n");
      
      return board.toString();
         
   }
   public void initializeCards()
   {
      int count = 1;
      for (int i = 1; i <= BOARD_SIZE; i++)
      {
         for(int j = 1; j <= BOARD_SIZE; j++)
         {
            if(count > (BOARD_SIZE * 2))
               count = -1;
            gameBoard[i][j] = new Card((count/2)+1);//change here
            count = Math.abs(count) + 1; //chage here
         }
      }
      
   }
   public void hideBoard()
   {
      for(int i = 0; i < 20;i++)
      {
         System.out.println();
      }
   }
   public void turnCardsFaceDown()
   {
      for (int i = 1; i <= BOARD_SIZE;i++)
      {
         for (int j = 1; j <= BOARD_SIZE;j++)
         {
            gameBoard[i][j].setFaceDown();
         }
      }
      
   }
   public void displayGameBoardValues()
   {
      for (int i = 1; i <= BOARD_SIZE;i++)
      {
         for (int j = 1; j <= BOARD_SIZE;j++)
         {
            System.out.print(gameBoard[i][j].getValue() + " ");
            //System.out.println();
         }
         System.out.println();
      }
   }
}