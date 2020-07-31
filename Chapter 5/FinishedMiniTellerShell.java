import java.util.Scanner;
public class FinishedMiniTellerShell
{
  /* in the main method you need to call the method validChoice
  as long as the user's choice is not Q or q
    based on the user's choice call the appropriate methods such as balance, depoist, withdraw and cretate
    once the user select Q or q, prompt the user if there is another customer
  */
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    String choice ="";
    double balance = 0;
    description();
    boolean repeat = true;
    String answer = "";
    boolean account = false;
    while (repeat)  //as long as there is another user
    {
       balance = 0;
       choice = "";
       account = false;
       while (!choice.equalsIgnoreCase("Q"))// as long as the user has not selected quit
       {
          //your code includes conditional statments
       }
                  
     } 
     System.out.println("The system is about to shut down");    
   
  }
  /*This method accepts a Scanner object and the balance of the money that the person has as its parameter
  prompt the user to enter the amount of the money to withdraw
  call the method dataValiation to get the user's input
  if the user's input is more than the balance display that the user cannot withdraw that amount
  if the  balance - the user's input is less than 100 then no withdraw can be done
  otherwise the withdraw can be done therefore the user's input must be subtracted from the balance. then return the new balance  
  */
  public static double withdraw(Scanner kb, double balance)
  {      
      Stringn s =    
    
  }
  /*this method prompt the user for the amount to deposit
  call the method dataValidation to get the user's input
  add the amonmut to the balance, return the new balance*/
  public static double deposit(Scanner kb, double balance)
  {
         return 0;
  }
  /*
  this method prompts the user to enter the initial amount of the money to cretae the account
  call the method dataValidation
  if the user's input is less than 100, the account cannot be cretaed
  otherwise the account will be cretaed and a message will be displayed
  indicating that the account has been cretaed, the initial amount of the money will be returned
  */
  public static double create(Scanner kb)
  {
     return 0;
  }
         
  /*
  This method outputs Welcome to the Bank of America message including all the back slashes
  */
  public static void description( )
  {
  }
  /*
  This method displays the choices that the user has*/
  public static void displayChoices()
  {  
  } 
  /*this method prompts the user to enter the choice
  as long as the user does not have a valid choice, it will keep prompting the user
  for a valid choice*/     
  public static String validChoice(Scanner kb)
  {
            
      return "";
  } 
  /*This method accepts the scanner object and a message to be displayed on the screen
  Outputs the prompt on the screen sking the user to enter the amount
  As long as the amount is less than zero and as long as the user is entering an invalid 
  double value, this method should keep prompting the user for a valid amount.
  return the valid amount*/
  
  public static double dataValidation(String prompt, Scanner kb)
  {
           return 0;
        
     
  }  
 } 