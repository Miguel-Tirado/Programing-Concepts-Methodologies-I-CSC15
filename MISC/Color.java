import java.util.Scanner;
public class Color 
{
   public static void main(String[] args)
   {
      String col;
      Scanner kb = new Scanner(System.in);
      System.out.print("What color do you want? ");
      String color = kb.next();
      col = getColors(color);
      if (col.equals("unknown"))
      {
        System.out.println("unknown color: " + color); 
      }
      else
      System.out.println("You have chosen " + col + "."); 
   }
   public static String getColors(String a) 
   {
      if (a.equalsIgnoreCase("R"))
      {
         return "Red";
      }
      else if (a.equalsIgnoreCase("B"))
      {
         return "Blue";
      }
      else if (a.equalsIgnoreCase("G"))
      {
         return "Green";
      }
      else 
         return "unknown";
   }
}
 