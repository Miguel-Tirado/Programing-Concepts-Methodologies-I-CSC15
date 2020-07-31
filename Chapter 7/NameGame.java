
import java.util.Scanner;
public class NameGame {
   public static void main (String[] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("What is your name? ");
      String fullname = kb.nextLine();
      int space = fullname.indexOf(" ");
      String first = fullname.substring(0, space);
      String last = fullname.substring(space + 1);
      String sfirst = fullname.substring(1, space);
      String slast = fullname.substring(space + 2);
      Song(first, last, sfirst, slast);
   }
   public static void Song(String f, String l,String f2, String f3) {
      System.out.println(f + " " + f + ", bo-B" + f2);
      System.out.println("Bannana-fana fo-F" + f2);
      System.out.println("Fee-fi-mo-M" + f2);
      System.out.println(f.toUpperCase() + "!");
      System.out.println(l + " " + l + ", bo-B" + f3);
      System.out.println("Bannana-fana fo-F" + f3);
      System.out.println("Fee-fi-mo-M" + f3);
      System.out.println(l.toUpperCase() + "!");
      System.out.println();
   }
}