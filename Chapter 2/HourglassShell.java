/* Miguel Tirado CSC 15 LAB 3 FOR LOOPS */ 

public class HourglassShell {
  public static final int SIZE = 15;
	public static void main(String[] args) {
      line();
		top();
		middle();
		bottom();
      line();
	}
	
	public static void top() {
    
    for (int i = 1; i <= SIZE; i++)
    {
       for (int space = 1; space <= (1 * i); space++)
       { 
         System.out.print(" ");
       }
       System.out.print("\\");
       for (int colon = 1; colon <= SIZE * 2 - 2 * (i-1); colon++)
       {
         System.out.print(":");
       }
       System.out.println("/"); 
    }
  }
		 		 
	
	
	public static void middle() {
      for (int space2 = 1; space2 <= (SIZE + 1); space2++)
      {
         System.out.print(" ");
        
      }
       System.out.println("||");
   }
	
	public static void bottom() {
      for (int k = 1; k <= SIZE;k++)
      {
      for (int space1 = 1; space1 <= (-1 * k + (SIZE + 1));space1++)
      {
         System.out.print(" ");
      }
      System.out.print("/");
      for (int colon1 = 1; colon1 <= (2 * k); colon1++)
      {
         System.out.print(":");
      }
         System.out.println("\\");
      }
	}
	
	public static void line() {
      System.out.print("|");
      for (int n = 1; n <= (SIZE + 1) * 2; n++) {
         System.out.print("\"");
         
      }
      System.out.println("|");
	}
}