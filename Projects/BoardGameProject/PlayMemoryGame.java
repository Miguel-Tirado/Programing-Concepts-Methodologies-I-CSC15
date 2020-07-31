/* Miguel Tirado CSC 15
Gita Faroughg Project */
import java.util.*;
public class PlayMemoryGame 
{
   public static Scanner kb = new Scanner (System.in);
   public static MemoryGameBoard game = new MemoryGameBoard();


   
   public static void main (String[] args)
   {
      // Static variables
      int bestScore = 500;
      int turnCount;
      int pairsLeft = 0;
      boolean repeat = true;
      int row1;
      int col1;
      int row2;
      int col2;
      int min = 1;
      int max = game.BOARD_SIZE;
      String choice = "";
      String s = " is not a valid integer (1...4)";
      
      //Print headings 
      System.out.println("Welcome to the Memory Game.");
      System.out.println("The goal is to find all the matching pairs in as few turns as possible.");
      System.out.println("At each turn select two different positions on the board to see if they match.");
      System.out.println();
      System.out.println("Press any key to start the game.");
      kb.nextLine();
      while(!choice.equalsIgnoreCase("no"))
      {
         game.shuffleCards();
         turnCount = 0;
         pairsLeft = (game.BOARD_SIZE * game.BOARD_SIZE)/2;
         while(pairsLeft > 0)
         {
            turnCount++;
            game.showBoard();
            //game.displayGameBoardValues(); //change
            //System.out.println(); // change
            System.out.println("where is the first card you wish to see?");
            System.out.print("row: ");
            row1 = getValidInt(s,min, max,kb);
            System.out.print("col: ");
            col1 = getValidInt(s,min, max,kb);
            while(game.isFaceUp(row1,col1) == true)
            {
               row1 = getValidInt(s,min,max,kb);
               col2 = getValidInt(s,min,max,kb);

            }
            game.flipCard(row1,col1);
            System.out.println("where is the second card you wish to see?");
            System.out.print("row: ");
            row2 = getValidInt(s,min, max,kb);
            System.out.print("col: ");

            col2 = getValidInt(s,min, max,kb);
            while(game.isFaceUp(row2,col2) == true)
            {
               row2 = getValidInt(s,min,max,kb);
               col2 = getValidInt(s,min,max,kb);
            }
            game.flipCard(row2,col2);
            game.showBoard();
            if(game.cardsMatch(row1, col1, row2, col2))
            {
               System.out.println("You found a match");
               pairsLeft--;
            }
            else
            {
               game.flipCard(row1, col1);
               game.flipCard(row2, col2);
               System.out.println("No match was found");
            }           
         }
         kb.nextLine();
         System.out.println("CONGRATULATIONS! You found all the matching pairs!");
         System.out.println("You did it in " + turnCount + " turns");
         if(turnCount < bestScore)
         {
            System.out.println("This is your best score so far");
         }
         System.out.print("Do you want to start another game? ");
         choice = kb.nextLine();
         
      }
      System.out.println("goodbye");
      
   }
   public static int getValidInt(String prompt, int min, int max, Scanner kb)
   {
       int num = 0;
       boolean valid = false;
       String word = "";
       while (!(num >= min && num <=max))
       {
           if(kb.hasNextInt())
           {
              num = kb.nextInt();
              if (num >= min && num <= max)
              {
                  valid = true;
              }
              else {
                  System.out.println("Error: " + num + prompt);
                  
              }
           }
           else {
            word = kb.nextLine();
            System.out.println("Error: " +word + prompt);
            //System.out.println();
           }
       }
       return num;
   }
}