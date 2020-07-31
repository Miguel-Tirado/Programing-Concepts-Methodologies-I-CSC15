import java.util.*;
public class CircleDriver
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double x =0;
      double y = 0;
      double radius = 0;
      Circle[] c = new Circle[2];
      for (int i = 0; i < c.length;i++)
      {
         System.out.print("Enter x-Cord: ");
         x = kb.nextInt();
         System.out.print("Enter y-Cord: ");
         y = kb.nextInt();
         System.out.print("Enter radius: ");
         radius = kb.nextInt();
         Circle a = new Circle(x, y, radius);
         
         System.out.println("x-cordinate of the center is: " + a.getX());
         System.out.println("y-cordinate of the center is: " + a.getY());
         System.out.println("radius is: " + a.getRadius());
         System.out.println("perimeter is: " + a.getPerimeter());
         System.out.println("area is: " + a.getArea());
         System.out.println(a.toString());
         System.out.println();
      }
      if(c[0].equals(c[1]))
      {
         System.out.println("Circle 1 equals Circle 2");
      }
      else 
         System.out.println("They do not equal");
   }
}