/* Miguel Tirado CSC 15 
Chapter 3 Parameters */
import java.util.Scanner;
public class Chapter3Shell
{
    
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("how many  different website do you have > ");
      int count = kb.nextInt();
      kb.nextLine();
      for (int i = 1; i <= count; i++)
      {
        siteName(kb);
      } 
      System.out.print("How many encrypted words do you have > ");
      int count1 = kb.nextInt();
      for (int i = 1; i <= count1; i++)
      {
        decrypt(kb);
      } 
      kb.nextLine();
      reverse(kb);
      System.out.print("How many different investment do you have >  ");
      int count2 = kb.nextInt();
      for (int i = 1; i <= count2; i++)
      {
        futureValue(kb);
      } 


           
   }
   
   public static void siteName(Scanner kb)
   { 
      
      System.out.print("Enter the URL of the website > ");
      String url = kb.nextLine();
      int dot1 = url.indexOf(".");
      int dot2 = url.lastIndexOf(".");
      String name = url.substring(dot1 + 1,dot2);
      System.out.println("Here is the name of the website > " + name);
      System.out.println();
           
     
   }
   public static void decrypt(Scanner kb)
   {
      System.out.print("Enter the encrypted word > ");
      String encrypt = kb.next();
      int len = encrypt.length();
      String decrypt = "";
      for(int i = 0; i < len; i = i + 2)
      {
         decrypt = decrypt + encrypt.charAt(i);
      }
      System.out.println("Here is the decrypt word > " + decrypt);
      System.out.println();
       
   } 
   public static void reverse(Scanner kb)
   {
      
      System.out.print("Enter your first and last name seperated by a space > ");
      String fullName = kb.nextLine();
      int space = fullName.indexOf(" ");
      String first = fullName.substring(0, space);
      String last = fullName.substring(space + 1 ); 
      System.out.println("Here is the name in reverse order: " + last + " " + first);
      System.out.println(); 
             
   } 
  public static void futureValue(Scanner kb)
  {
      System.out.print("Enter the investment > ");
      int investment = kb.nextInt();
      System.out.print("Enter the interest rate > ");
      double rate = kb.nextDouble();
      System.out.print("Enter the number of the years > ");
      int years = kb.nextInt();
      double futureV = investment * (Math.pow(1 + rate,years));
      System.out.println("your future value " + years + " is " + (int)futureV);    
      System.out.println();
     
  }  
}   

     
     
    
      
       

