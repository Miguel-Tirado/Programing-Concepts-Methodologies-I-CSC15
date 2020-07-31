import java.util.*;
public class TwoDigitGuessGame 
{
   public static void main (String[] args) 
   {
      description();
      guessGame();
      
   }
   public static void description()
   {
      System.out.println("Try to guess my two-digit");
      System.out.println("number, and I'll tell you how");
      System.out.println("many digits from your guess");
      System.out.println("appear in my number.");
   }
   public static void guessGame()
   {
      Random rng = new Random ();
      Scanner kb = new Scanner(System.in);
      int numMatches = 0;
      int count = 0;
      System.out.print("Your Guess? ");
      int guess = kb.nextInt();
      while(!(guess > 0 && guess < 100))
      {
         System.out.println("Incoreect input, Please try again");
         System.out.print("Your Guess? ");
         guess = kb.nextInt();
      }
      int num = rng.nextInt(100);
      System.out.println("the ans is " + num);
      while(guess != num )
      {
         if (guess / 10 == num / 10 || guess / 10 == num % 10)
         {
            numMatches++;
         }
         if(guess / 10 != guess % 10 && (guess % 10 == num / 10) || (guess % 10 == num % 10))
         {
            numMatches++;
         }
         System.out.println("Incorrect (Hint: " + numMatches + " digits match)");
         System.out.print("Your Guess? ");
         guess = kb.nextInt();
         if (guess != num)
         {
            numMatches = 0;
         }
         count++;
      }
      System.out.println("You got it right in " + count + " tries.");
   }
}
   