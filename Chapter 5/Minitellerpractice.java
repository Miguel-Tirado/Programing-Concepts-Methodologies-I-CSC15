import java.util.Scanner;
public class Minitellerpractice {

  public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   System.out.println(create(kb));
  }
  public static double create(Scanner kb)
  {
  String answer = " ";
  double amount0 = 0.0;
  System.out.println("Lets create an account for you.");
  String s ="Enter the Initial amount of money--->";
  amount0 = dataValidation(s,kb);
  while((amount0 < 100.0) || (amount0 < 0.0)){
            System.out.println("You must enter a positive amount of money");
            System.out.print("enter an valid amount");
            amount0 = dataValidation(s,kb);
            if (amount0 < 100.0) {
            System.out.println("You must deposit 100 or more to create a new account");
            }
            System.out.println("Do you want to create a new account?");
            answer = kb.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Your account has been created sucessfully");
            }
  }
  return amount0; 
  }
  
  public static double dataValidation(String prompt, Scanner kb){
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
