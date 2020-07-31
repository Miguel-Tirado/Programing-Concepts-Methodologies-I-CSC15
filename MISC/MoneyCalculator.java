
/* Miguel Tirado CSC 15 LAB 3 prt 1*/
public class MoneyCalculator 
{
   public static void main (String[] args)
   {
      int quarters = 12;
      int dimes = 20;
      int nickels = 30;
      int pennies = 150;
      int totalPennies = calculatePennies(quarters,dimes,nickels,pennies);
      int totalDollars = calculateDollar(totalPennies);
      int totalDimes = calculateDimes(totalPennies);
      int totalQuarters = calculateQuarter(totalPennies);
      int totalNickels = calculateNickels(totalPennies);
      output(quarters,dimes,nickels,pennies);
      lines();
      input(totalQuarters,totalDollars,totalNickels,totalPennies,totalDimes);
      lines();
      //System.out.println(totalDimes);
      //System.out.println(totalPennies);
      //System.out.println(totalDollars);
      //System.out.println(totalQuarters);
            
   }
   public static int calculatePennies(int quarter, int dimes, int nickels, int pennies)
   {
      int total = quarter * 25 + dimes * 10 + nickels * 5 + pennies;
      return total;
   }
   public static int calculateDollar(int pennies)
   {
      int dollar = pennies/100;
      return dollar;
   }
   public static int calculateQuarter(int pennies)
   {
      int quarter = pennies/25;
      return quarter;
   }
   public static int calculateDimes(int pennies)
   {
      int dimes = pennies/10;
      return dimes;
   }
   public static int calculateNickels(int pennies)
   {
      int nickels = pennies/5;
      return nickels;
   }
   public static void input(int q,int d, int n, int p, int di)
   {
      System.out.println("The amount of your dollars is:" + d);
      System.out.println("The amount of your quarters is:" + q);
      System.out.println("The amount of your dimes is:" + di);
      System.out.println("The amount of your nickels is:" + n);
      System.out.println("The amount of your pennies is:" + p);
  
   }
   public static void output(int qu,int dim,int ni, int pe)
   {
      System.out.println("you have:");
      System.out.println("\t" + qu + " Quarters ");
      System.out.println("\t" + dim + " Dimes ");
      System.out.println("\t" + ni + " Nickels ");
      System.out.println("\t" + pe + " pennies ");
   }
   public static void lines() 
   { 
      for (int i =1; i <= 38; i++)
      { 
         System.out.print("-");
      }
      System.out.println();
   }
}
  
 
   
      
      
      
     


   