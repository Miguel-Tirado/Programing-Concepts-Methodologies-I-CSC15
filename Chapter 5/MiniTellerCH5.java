import java.util.Scanner;
public class MiniTellerCH5
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
   /* double balance = 0;
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
          validChoice(kb);
          if (choice.equalsIngoreCase("c")
            create(kb);     
          else if (choice.equalsIngoreCase("d")
            deposit(kb,balance);
          else if (choice.equalsIngoreCase("W")
          
          else if (choice.equalsIgnoreCase("B")
          
          //your code includes conditional statments
       }
                  
     } 
     System.out.println("The system is about to shut down"); 
    */  
     //description();
     
     //System.out.println(withdraw(kb, 1000));  
     //System.out.println(create(kb));
     System.out.println(deposit(kb,200));  
   
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
      String s = "Enter the amount of the withdraw--->";
      double amount = dataValidation(s,kb);
      if (balance - amount < 100)
         System.out.println("The balance can not go below 100");
      else if (amount > balance)
         System.out.println("Not Enouph fundings in your account");  
      else 
         balance = balance - amount;
      
         return balance;   
    
  }
  /*this method prompt the user for the amount to deposit
  call the method dataValidation to get the user's input
  add the amonmut to the balance, return the new balance*/
  public static double deposit(Scanner kb, double balance)
  {
      System.out.println("your balnace is " + balance);
      String s = "Enter the amount of the money to deposit-->";
      double deposit = dataValidation(s, kb);
      double total = balance + deposit;
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
     double amount0 = 0.0;
     System.out.println("You must deposit 100 or more to create an account");
     System.out.println("Do you want to create a new account?");
     answer = kb.nextLine();
     if(answer.equalsIgnoreCase("yes")){
     String s ="please enter a initial amount that is positive--->";
     amount0 = dataValidation(s,kb);
         while(amount0 < 100.0){
            System.out.println("You must enter a positive amount above 100");
            System.out.println("Please enter an valid amount");
            amount0 = dataValidation(s,kb);
         }
         System.out.println("you have sucesfully create an account");
         boolean account = true;
     }
     else{
     }     
     return amount0;
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
      String choice ="";
      while (!(choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("B")))
      {
         System.out.print("Please input a valid choice ");
         choice = kb.nextLine();
      if (choice.equalsIgnoreCase("Q"))
      {
         System.out.print("You Quit");
         choice ="Q";
         return choice;
      }
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
      double amount = 0; 
      while(amount <= 0)
      {
         System.out.print(prompt);
         while(!kb.hasNextDouble()) 
         {
            System.out.print(prompt);
            kb.nextLine();
         }
         amount = kb.nextDouble();
      }
      return amount;
   }  
 } 
 /*sample output
 ____________________________________________________________________________________________________
 
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 \\     Welcome to the Bank of America      \\
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> r
 Enter a valid choice ---> t
 Enter a valid choice ---> c
 lets cretae an account for you.
 Enter the initial amount of money--> -20
 You must enter a positive amount of money. 
 Enter a valid amount: 80
 You must deposit 100 or more to create a new account
 Do you want to cretae a new account? yes
 Enter the initial amount of money--> 100
 Your account has been cretaed successfully
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> w
 Enter the amount of the withdraw--> 20
 Your balance cannot go below 100 dollars. 
 your balance after withdraw will be :80.0
 The amount of the money that you have is-->100.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> w
 Enter the amount of the withdraw--> 100
 Your balance cannot go below 100 dollars. 
 your balance after withdraw will be :0.0
 The amount of the money that you have is-->100.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> d
 Your balance is--> 100.0
 Enter the amount of the money to deposit--> 200
 Your new balance after deposit is: 300.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> w
 Enter the amount of the withdraw--> 150
 The amount of the money you have--> 300.0
 The amount of the money that you have is-->150.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> c
 You already have an account.
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> B
 Your balance is --> 150.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> w
 Enter the amount of the withdraw--> 200
 You do not have enough money to withdraw
 The amount of the money that you have is-->150.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> w
 Enter the amount of the withdraw--> 51
 Your balance cannot go below 100 dollars. 
 your balance after withdraw will be :99.0
 The amount of the money that you have is-->150.0
 
 Hit enter key to continue --> 
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> q
 Thanks for being our loyal customer.
 Is there another user?yes/no yes
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> C
 lets cretae an account for you.
 Enter the initial amount of money--> 100
 Your account has been cretaed successfully
 
 Select one of the following options
 Press C to create a new account
 press D to deposit
 press W to withdraw
 press B for Balance
 Press Q to quit
 Enter your choice ---> q
 Thanks for being our loyal customer.
 Is there another user?yes/no no
 The system is about to shut down

 _____________________________________________________________________________________________________
 */