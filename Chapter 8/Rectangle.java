public class Rectangle 
{
   //Instance Varaibles 
   private int x, y; // point
   private int width, height; // dimensions
   
   //constructor
   public Rectangle (int a, int b, int w, int h)
   {
      x = a;
      y = b;
      width = w;
      height = h;
   }
   //ancessor
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   public int getWidth()
   {
      return width;
   }
   public int getHeight()
   {
      return height;
   }

}