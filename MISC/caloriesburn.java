public class caloriesburn {
   public static void main(String[] args) {
      calories();
   }
   public static void calories(){
      //Calories/Minute = 0.0175 X MET X Weightin Kilograms
      //run for 30 minutes, basketball for 30 minutes, sleep for 6 hours
      int runMet = 10;
      int ballMet = 8;
      int sleepMet = 1;
      double pound = 150;
      double kilo = pound/ 2.2;
      double constant = 0.0175;
      double run = constant * runMet * kilo * 30; 
      double basketBall = constant * ballMet * kilo * 30;
      double sleep = constant * sleepMet * kilo * 6 * 60;
      double total = run + basketBall + sleep;
      System.out.println("Calories running :" + run);
      System.out.println("calories basketball:" + basketBall);
      System.out.println("Calories sleep :" + sleep);
      System.out.println("Total Calories burned: " + total);
  }
}
   
   