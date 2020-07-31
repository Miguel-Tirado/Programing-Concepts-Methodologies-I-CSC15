public class Line
{
   private double x1, y1, x2, y2;
   public Line(double x1, double y1, double x2, double y2)
   {
      this.x1 = x1; this.x2 = x2; this.y1 = y1; this.y2 = y2;
   }
   //ancsessor
   public double getX1()
   {
      return x1;
   }
   public double getX2()
   {
      return x2;
   }
   public double getY1()
   {
      return y1;
   }
   public double getY2()
   {
      return y2;
   }
   //mutators
   public void setX1(double x1)
   {
      this.x1 = x1;
   }
   public void setY1(double y1)
   {
      this.y1 = y1;
   }
   public void setX2(double x2)
   {
      this.x2 = x2;
   }
   public void setY2(double y2)
   {
      this.y2 = y2;
   }
   public boolean equals(Line other)
   {
      boolean b =  this.x1 == other.x1 && this.y1 == other.y1;
      b = b && this.x2 == other.x2 && this.y2 == other.y2;
      return b;
   }
   public String toString()
   {
      String s = "PL: ( " + x1 + ", " + y1 + ")";
      s = s + "\np2: ( " + x2 + ", " + y2 + ")";
      return s;
   }
   public double getLength()
   {
      double d1 = x2 - x1;
      double d2 = y2 - y1;
      double distance = Math.pow(d1,2) + Math.pow(d2,2);
      distance = Math.sqrt(distance);
      
      return distance;
   }
   public double getSlope()
   {
      return (y2 - y1)/(x2 - x1);
   }
   public boolean isParrallel(Line other)
   {
      return this.getSlope() == other.getSlope();
   }
   public boolean isPerpendicular(Line other)
   {     
      return this.getSlope() * other.getSlope() == -1;
   }
   public String getFormula()
   {
      double slope = getSlope();
      double b = y1 - (slope * x1);
      return "y = " + slope + "x + " + b;     
   }
   public String getMidPoint()
   {
      double x3 = (x1 + x2)/2;
      double y3 = (y1 + y2)/2;
      return "(" + x3 + ", " + y3 + ")";
   }
   public double getB() // y = mx + b
   {
      double b = y1 - (this.getSlope() * x1);
      return b;
   }
   public String getIntersection(Line other)
   { 
      double ix = (this.getB() - other.getB())/ (this.getSlope() - other.getSlope());
      double iy = (this.getSlope() * ix) + getB();
      return "(" + ix + ", " + iy + ")";   
      
   }
   public String getQuadrant()
   {
      if ((x1 > 0 && y1 > 0) && (x2 > 0 && y2 > 0))
         return " first Quad";
      else if ((x1 < 0 && y1 > 0) && (x2 < 0 && y2 > 0))
         return " Second Quad";
      else if ((x1 < 0 && y1 < 0) && (x2 < 0 && y2 < 0))
         return "Third Quad";
      else if ((x1 > 0 && y1 < 0) && (x2 > 0 && y2 < 0))
         return "fourth Quad";
      else 
         return "In Between Quad";
   }        
}