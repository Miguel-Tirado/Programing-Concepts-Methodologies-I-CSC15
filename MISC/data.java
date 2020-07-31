import java.util.*;
public class data 
{
   public static void main(String[] args)
   {
     Scanner kb = new Scanner (System.in);
     String choice = "";
     description();
     //choice = validChoice(kb);
     //System.out.print(choice);
     //String s = "Enter the amount to deposit---> ";
     //double amount = dataValidation(s,kb);
     
   }
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
   public static String validChoice(Scanner kb)
   {
      System.out.println("Please select one of the following options");
      System.out.println("Press C to create a new account");
      System.out.println("Press D to deposit");
      System.out.println("Press W to withdraw");
      System.out.println("Press B for Balance");
      System.out.println("Press Q to Quit");
      
      String choice ="";
      while (!(choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("B")))
      {
         System.out.print("Please input a valid choice ");
         choice = kb.nextLine();
      if (choice.equalsIgnoreCase("Q"))
      {
         System.out.print("You Quit");
         choice ="";
         return choice;
      }
   }
      return choice;
      
   }
    public static double create(Scanner kb)
  {
     String answer = "";
     double amount = 0.0;
     System.out.println("You must deposit 100 or more to create an account");
     System.out.println("Do you want to create a new account?");
     answer = kb.nextLine();
     if(answer.equalsIgnoreCase("yes")){
     System.out.print("please enter a initial amount--->");
     amount = kb.nextDouble();
         while(amount < 100.0){
            System.out.println("You must enter a positive amount above 100");
            System.out.print("Please enter a valid amount");
            amount = kb.nextDouble();
         }
     }
     else{
          
     }
     return 0;
  }
  public static void description( )
  {
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println("\\\\     Welcome to the Bank of America     \\\\");
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); 
  }
      
}
   

