import java.util.*;
public class CarDriver
{
   public static void main(String[] args)
   {
      //String m, String mo, int y, double mp,boolean t,double mil)
      Scanner kb = new Scanner(System.in);
      String make = "";
      String model = "";
      int year = 0;
      double mpg = 0;
      boolean title = false;
      double milage =0;
      Car[] cars = new Car[1];
      for(int i = 0; i < cars.length;i++)
      {
         System.out.print("Enter the make: ");
         make = kb.nextLine();
         System.out.print("Enter the model: ");
         model = kb.nextLine();
         System.out.print("Enter the year: ");
         year = kb.nextInt();
         System.out.print("Enter the mpg: ");
         mpg = kb.nextDouble();
         System.out.print("Enter the title (True/False): ");
         title =kb.nextBoolean();
         System.out.print("Enter the milage: ");
         milage = kb.nextDouble();
         System.out.println();
         Car c1 = new Car(make, model, year, mpg,title, milage);
         cars[i] = c1;
         kb.nextLine();
      }
      System.out.println(Arrays.toString(cars));
      //cars[0]= c1.setMake("Chevy");
       
       cars[0].setMake("ford");
      //c1.setYear(1998);
      //System.out.println(c1);
   }
}   