/* Miguel Tirado 
CSC15 Lab 02/09/2017 */ 
public class Physics {
   public static void main(String[] args) {
      positionFormula();
   }
   public static void positionFormula() {
      double s0 = 12.0;
      double v0 = 3.5;
      double a = 9.8;
      int t = 10;
      double s = s0 + (v0 * t) + ((0.5 * a * t * t));
      System.out.println("The posotion is " + s);
   }
}