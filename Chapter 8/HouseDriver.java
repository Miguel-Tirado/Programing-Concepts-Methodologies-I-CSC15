public class HouseDriver
{
   public static void main(String[] args)
   {
      String s = "This house is a custum built in Fair Oaks area. \n open floor plan.This house has a big ";
      String a = " Fair Oaks California";
      House myHouse = new House(3000.0,30000.0,4,2016,1.5,1,s,a);
      System.out.println(myHouse);
   }
}