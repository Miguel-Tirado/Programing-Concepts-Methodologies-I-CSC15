public class Circle 
{
   private double x;
   private double y;
   private double radius;
   
   public Circle()
   {
      x = 0;
      y = 0;
      radius = 1;
   }
   public Circle(double xcor, double ycor, double r)
   {
      x = xcor;
      y = ycor;
      radius = r;
   }
   public double getX()
   {
      return x;
   }
   public double getY()
   {
      return y;
   }
   public double getRadius()
   {
      return radius;
   }
   public void setX(double newx)
   {
      x = newx;
   }
   public void setY(double newy)
   {
      y = newy;
   }
   public void setRadius(double newr)
   {
      radius = newr;
   }
   public double getArea()
   {
      return Math.PI*Math.pow(radius,2);
   }
   public double getPerimeter()
   {
      return Math.PI * 2 * radius;
   }
   public boolean equals(Circle otherCircle)
   {
      return (this.x == otherCircle.x && this.y == otherCircle.y && this.radius == otherCircle.radius);
      //return this.x ==c.x && this.y == c.y && this.radius == c.radius;
   }
   public String toString()
   {
     // String s = "x cordinate " + x;
     // s = s + "y cordinate " + y;
     //s = s + "radius " + radius; 
     return "center (" +x+" , "+y+")" + "Radius: " + radius;
   }
}   
