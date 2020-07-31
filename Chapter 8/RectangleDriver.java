import java.util.*;
public class RectangleDriver
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Please enter your x cord");
      int x = kb.nextInt();
      System.out.println("Please enter your y cord");
      int y = kb.nextInt();
      System.out.println("Please enter the width");
      int width = kb.nextInt();
      System.out.println("Please enter the height");
      int height = kb.nextInt();
      
      
      Rectangle rect = new Rectangle(x,y,width,height);
      System.out.println();
      System.out.println("Height: " + rect.getHeight());
      System.out.println("Width: " + rect.getWidth());
      System.out.println("x: " + rect.getX());
      System.out.println("y: " + rect.getY());
   }
}