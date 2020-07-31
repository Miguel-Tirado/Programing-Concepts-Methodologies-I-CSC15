import java.util.Scanner;
public class MiniTellerCH5Trial
{
   /* in the main method you need to call the method validChoice
  as long as the user's choice is not Q or q
    based on the user's choice call the appropriate methods such as balance, depoist, withdraw and cretate
    once the user select Q or q, prompt the user if there is another customer
  */
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String s = "Enter a valid amount: ";
      String choice ="";
      double balance = 0;
      boolean repeat = true;
      boolean account = false;
      String answer = "";
      description();
     // boolean user = true;
      //if(user)   
      while (repeat) 
      {
         //balance += create(kb);
         balance = 0;
         choice = "";
         account = false;
         //displayChoices();
         //choice = validChoice(kb);
         while(!choice.equalsIgnoreCase("Q"))
         { 
            displayChoices(); 
            choice = validChoice(kb);
            if(choice.equalsIgnoreCase("C"))
             if(balance > 0){
               System.out.println("you already have an account.");
               System.out.println();   
             }else   
               balance = create(kb);
            else if(choice.equalsIgnoreCase("W"))
               balance = withdraw(kb,balance);
            else if(choice.equalsIgnoreCase("D"))
               balance = deposit(kb,balance);
            else if(choice.equalsIgnoreCase("B")){
               System.out.println("Your balance is --> " + balance);
               System.out.println();
            }
            if(!choice.equalsIgnoreCase("Q")){
               System.out.println("Hit enter key to continue -->");
               kb.nextLine();
               kb.nextLine();
            }        
         }
            System.out.println("Thanks for being our loyal customer.");
            System.out.print("Is there another user?yes/no ");
            String quit = kb.nextLine();
            if(quit.equalsIgnoreCase("no"))
               repeat = false;
            if(quit.equalsIgnoreCase("yes"))
               System.out.println();
         
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
   String s = "";
   System.out.print("Enter the amount of the withdraw--> ");
   double amount = dataValidation(s,kb);
   if (amount > balance)
   {
      if (balance - amount < 0)
      {
         System.out.println("you do not have enouph money to withdraw");
         System.out.println("The amount of money that you have is--->" + balance);
         System.out.println();
      }
   }
      else if (balance - amount < 100)
      {
         System.out.println("Your balance can not go below 100 dollars.");
         double balance2 = balance - amount;
         System.out.println("Your balance after withdraw will be :" + balance2);
         System.out.println("the amount of the money that you have is--->" + balance);
         System.out.println();
      }
      else{
         System.out.println("The amount of money that you have--->" + balance);
         balance = balance - amount;
         System.out.println("the amount of the money that you have is--->" + balance);
         System.out.println();
     }
     return balance;      
 }
  /*this method prompt the user for the amount to deposit
  call the method dataValidation to get the user's input
  add the amonmut to the balance, return the new balance*/
  public static double deposit(Scanner kb, double balance) {
      System.out.println("your balnace is--->" + balance);
      String s ="";
      System.out.print("Enter the amount of the money to deposit-->");
      double amount = dataValidation(s, kb);
      double total = balance + amount;
      System.out.println("Your new balance after after deposit is : " + total);
      System.out.println();
      return total;
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
     String answer = "";
     System.out.println("Lets create an account for you.");
     System.out.print("Enter the intitial amount of money --->");
     double value = dataValidation("You must enter a positive amount of money.",kb);
     if (value < 0)
     {
     System.out.println("You must enter a positive amount of money.");
     value = dataValidation("You must enter a positive amount of money.",kb);
     }else 
     {
     while(!(value >= 100))
     {
         System.out.println("You must deposit 100 or more to create a new account");
         System.out.print("Do you want to create a new account? ");
         answer = kb.next();
         if (answer.equalsIgnoreCase("Yes"))
         {
         System.out.print("Enter the initial amount of money ---> ");
         value = kb.nextDouble();
         }
     }
     System.out.println("your account has been created sucesfully");
     boolean account = true;
    }
    return value;
  }
  
         
  /*
  This method outputs Welcome to the Bank of America message including all the back slashes
  */
  public static void description( )
  {
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println("\\\\     Welcome to the Bank of America     \\\\");
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); 
  }
  /*
  This method displays the choices that the user has*/
  public static void displayChoices()
  {  
      System.out.println("Please select one of the following options");
      System.out.println("Press C to create a new account");
      System.out.println("Press D to deposit");
      System.out.println("Press W to withdraw");
      System.out.println("Press B for Balance");
      System.out.println("Press Q to Quit");
  } 
  /*this method prompts the user to enter the choice
  as long as the user does not have a valid choice, it will keep prompting the user
  for a valid choice*/     
  public static String validChoice(Scanner kb)
  {
      System.out.print("enter your choice--->");
      String choice = kb.nextLine();
      
      
      while(!choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("d") && !choice.equalsIgnoreCase("w") && !choice.equalsIgnoreCase("b") && !choice.equalsIgnoreCase("q"))
      {
         System.out.print("Enter a valid choice---->");
         choice = kb.next();
      }
      return choice;
  } 
  /*This method accepts the scanner object and a message to be displayed on the screen
  Outputs the prompt on the screen sking the user to enter the amount
  As long as the amount is less than zero and as long as the user is entering an invalid 
  double value, this method should keep prompting the user for a valid amount.
  return the valid amount*/
  
  public static double dataValidation(String prompt, Scanner kb)
  {
      double num = 0; 
      num = kb.nextDouble();
      while(num <= 0)
      {
         System.out.println(prompt);
         if (num < 0)
         {
            System.out.print("Enter a valid amount");
         }
         while(!kb.hasNextDouble()) 
         {
            System.out.print(prompt);
            kb.nextLine();
         }
         num = kb.nextDouble();
      }
      return num;
   }  
 } 