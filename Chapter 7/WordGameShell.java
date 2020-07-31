import java.io.*;
import java.util.*;
/* Miguel Tirado csc 15 */

public class WordGameShell
{
   public static void main(String[] args)
   throws FileNotFoundException 
   {
     //declare two arrays of String with the size 20
     String[] correct = new String[20];
     String[] incorrect = new String[20];
     //fillArray(correct,incorrect);
     //description();
     fillArray(correct, incorrect);
     play(correct, incorrect);
   }
   public static void description()
   {
      System.out.print("The word is: ");
      
   }
   /*this method reads the file and fills in the array*/
   public static void fillArray(String[] correct, String[] incorrect)   throws FileNotFoundException
   {
      int index = 0;
      File a = new File("correct.txt");
      Scanner right = new Scanner(a);
      File b = new File("incorrect.txt");
      Scanner wrong = new Scanner(b);
      while(right.hasNext())
      {
         correct[index] = right.next();
         index++;
      }
      //System.out.println(Arrays.toString(correct));
      index = 0;
      while (wrong.hasNext())
      {
         incorrect[index] = wrong.next();
         index++;
      }
      //System.out.println(Arrays.toString(incorrect));

      //create two file objects with the .txt file that you have
      //use scanner object to fill in the arrays
   }
   public static void play(String[] correct, String[] incorrect)  throws FileNotFoundException
   {
      Scanner kb = new Scanner(System.in);
      int point = 0;
      int correctAnswer = 0;
      String answer;
      int randnum = 0;
      int list = 0; //chooses if the word will be from the correct or incorrect list
      String replay = "y";
      int replayCorrect = 0;
      int timesplayed = 0; 
      String repeat = "y";
      Random random = new Random();
      while(repeat.equalsIgnoreCase("y"))
      {
         timesplayed = 0;
         while(replay.equals("y")&& timesplayed  < 5)
         {   
            timesplayed++;
            Random rand = new Random();
            int n = rand.nextInt(2);
            if (n == 0)
            //generate a random number 0 or 1
            //if the random number is zero 
            {
               int index = rand.nextInt(20);
               while(correct[index] == null)
               {
                index = rand.nextInt(20);        
               }
               description();
               System.out.println(correct[index]);
               //System.out.println("The word is " + correct[index]);
               //System.out.print("mis-spelled? y/n :");
               String s1 = "mis-spelled y/n :";
               answer = dataValidation(s1, kb);
               //answer = kb.nextLine();
               correct[index] = null;
               if (answer.equalsIgnoreCase("n"))
               {
                  System.out.println("Correctomundo!");
                  point++;
               }
               if(answer.equalsIgnoreCase("y"))
               {
                  System.out.println("Incorrect :( ");
               }
                //display the word at the index from the correct list
                //ask the user if it is spelled correctly
                //store null at the given index to remove the word from the lits
                //update the points earned based on the user's answer                          
            } 
            else 
            {
               if (n == 1)
               {
                  //same as the if part except that a word from the incorrect list will be chosen
                  int index1 = rand.nextInt(20);
                  while(incorrect[index1] == null)
                  {
                     index1 = rand.nextInt(20);
                  }
                  description();
                  System.out.println(incorrect[index1]);
                  //System.out.println("The word is " + incorrect[index1]);
                  //System.out.print("mis-spelled y/n :");
                  String s1 = "mis-spelled y/n :";
                  answer = dataValidation(s1, kb);
                  //answer = kb.nextLine();
                  incorrect[index1] = null; 
                  if (answer.equalsIgnoreCase("y"))
                  {
                     System.out.println("Correctomundo!");
                     point++;
                  }
                  if (answer.equalsIgnoreCase("n"))
                  {
                     System.out.println("Incorrect :(");
                  }
              }
              
            }
        }
        System.out.println("You've played 5 times, give someone elese a turn!");
        System.out.println("you got " + point + " points");
        String s ="would you like to play again? y/n: "; 
        repeat = dataValidation(s, kb);
        if (repeat.equalsIgnoreCase("y"))
        {
            fillArray(correct , incorrect);
            point = 0;
            
        }
        //if the user played maximum number of times
        //display the appropriate messages
        //ask the user if she/he wants to play again
        //reset all the needed variables         
      }   
   }
   public static String dataValidation(String prompt, Scanner kb)
   {
      System.out.print(prompt);
      String responce = kb.nextLine();
      while (!responce.equalsIgnoreCase("y") && !responce.equalsIgnoreCase("n"))
      {
       
            System.out.println("Please enter \"y\" or \"n\". ");
            responce =kb.nextLine();
        
         
      }
      return responce;
   }
}