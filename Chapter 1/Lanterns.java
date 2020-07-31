/* Miguel Tirado CSC15
lab 1 02/02/2017*/
public class Lanterns {
   public static void main (String[] args) {
      drawLanterns();
   }
   public static void drawLanterns() {
      drawHead();
      drawBody();
      drawTail();
   }
    public static void drawHead() {
      drawBox1();
      System.out.println();
   }
   public static void drawBody() {
      drawBox1();
      drawBox2();
      drawBox4();
      drawBox1();
      System.out.println();
   }
   public static void drawTail() {
      drawBox1();
      drawBox3();
      drawBox2();
      drawBox2();
      drawBox3();
      drawBox3();
   }
   public static void drawBox1() {
      drawBox3();
      System.out.println("  *********       *********");
      drawBox4();
   }
   public static void drawBox2() {
      System.out.println("* | | | | | *   * | | | | | *");
   }
   public static void drawBox3() {
      System.out.println("    *****           *****");
   }
   public static void drawBox4() {
   System.out.println("*************   *************");
   }

   
   
}
     
  
      
       


   
  