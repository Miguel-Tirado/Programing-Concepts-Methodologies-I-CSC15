/* Miguel Tirado CSC 15 Project
calander */ 
import java.util.Scanner;
public class PrintCalender
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int month;
      int year;
      String choice;
      String repeat;
      //prompt the user to enter the year
      do{ 
         do
         { 
            System.out.print("Enter a valid year before 1800: ");
            year = kb.nextInt();
         }while(year < 1800);
         choice = choice(kb);
         if (choice.equalsIgnoreCase("m"))
         {
            do
            {
               System.out.print("Enter the month of the year1...12--->");
               month = kb.nextInt();
            }while(!(month <= 12 && month >= 1));
            printMonth(year,month);
         }else if (choice.equalsIgnoreCase("y"))
         {
            for (int i = 1;i <= 12;i++)
            {
               printMonth(year,i);
            }
         }else
         {
            System.out.println("Invalid Choice");
         }
         do
         {
            System.out.print(" Do you have another year to printthe calander:yes/no--->");
            repeat = kb.next();
         }while(!(repeat.equalsIgnoreCase("yes") || repeat.equalsIgnoreCase("no")));
      }while(repeat.equalsIgnoreCase("yes"));
      System.out.println("Goodbye"); 
   }   
   public static String choice(Scanner kb)
   {
      System.out.println("to get the month press m or M ");
      System.out.println("to get the year press y or Y ");
      System.out.print("Enter your Choice: ");
      return kb.next();
   }   
   /*this method prints the body of the calender for the given month*/
   public static void printMonth(int year, int month)
   {
      printMonthTitle(year, month);         //call the method printTitle with the values year and month
      printMonthBody(year, month);     //call the method printMonthBody with the values year and month 	   
   }
   /*this method prints the title of the days in each week(sunday Mon Tues Wed Thur Fir Sat)*/
   public static void printMonthTitle(int year, int month)
   {
      String monthName = getMonthName(month);                 //output the title for each month of the year
      System.out.println("        " +  monthName + " " + year);
      System.out.println("----------------------------");
      System.out.println("Sun Mon Tue Wed Thu Fri Sat");	
   }
	/*this method outputs the calender for each month of the year*/
   public static void printMonthBody(int year, int month)
   {
      int startDay = getStartDay(year, month);
      print(startDay, year, month);
	   //call the method getStartDay to get the start day for each month of the year
      //call the method print to print the calender for the month and pass the first day of the month as the parameter 
       
   }
   /*prints the calendar for the given month*/
   public static void print(int startDay, int year, int month)
   {
      getNumberOfDaysInMonth(year, month);
      int spaces = getStartDay(year, month);
      int days = getNumberOfDaysInMonth(year, month);
      for (int i = 0; i < spaces; i++)
      {
         System.out.print("    ");
      }
      for (int i =1; i <=days; i++)
      {
         System.out.printf("%-4d",i);
         spaces = spaces + 1;
         if (spaces ==7 || spaces == 14 || spaces == 21 || spaces == 28 || spaces == 35 || spaces == 38)
            System.out.println();
      }
      if (month == 11) 
      {
         int thanksgiving = thanks(startDay);
         System.out.println("\n**Thanksgiving day is on the " + thanksgiving + "rd");
      }
      System.out.println();
      System.out.println();
     
	  // call the method getNumberOfdaysInMonth to finde out the number of the days in the month 
	  //use a for loop to print spaces up to the start day for each month
	  //use another for loop to print the rest of the days in the calender
     //if the month is November calculate the thanksgiving day and output            }
	                   
   }
	
	/*this method calculates the date for thanksgiving, you need to use
	a switch statment. Thanksgiving is always on fourth Thursday of November. 
   depending on the first day of the month a constant needs to be added to 3 * 7 
   since we have three full weeks. if the first day of the month is on a
    Sunday then for that month thanksgiving will be 5 + 3 *7. */
	public static int thanks(int startDay)
	{
      int thanks =0;
      switch(startDay){
      case 0: thanks = 5 + 3 * 7;
      return thanks;
      
      case 1: thanks = 4 + 3 * 7;
      return thanks;
      
      case 2: thanks = 3 + 3 * 7;
      return thanks;
      
      case 3: thanks = 2 + 3 * 7;
      return thanks; 
      
      case 4: thanks = 1 + 3 * 7;
      return thanks;
      
      case 5: thanks = 0 + 3 * 7;
      return thanks;
      
      case 6: thanks = 2 * 7;
      return thanks;
      }
     
	   return 0;  
	}					 								  		  		  			  		  
	/*you can use this method from you previous HW  */  	    
   public static String getMonthName(int month)
   {
      if (month == 1){
         return "January";
         }
      else if (month == 2) {
         return "Feburary";
         }
      else if (month == 3) {
         return "March";
         }
      else if (month == 4) {
         return "April";
         }
      else if (month == 5) {
         return "May";
         }
      else if (month == 6) {
         return "June";
         }
      else if (month == 7) {
         return "July";
         }
      else if (month == 8) {
         return "August";
         }
      else if (month == 9) {
         return "September";
         }
      else if (month == 10) {
         return "October";
         }
      else if (month == 11) {
         return "November";
         }
      else if (month == 12) {
         return "December";
         }
      else {
      return "Unkown";
      }    
   }
	
	/*this method returns the atrt day of the month*/
   public static int getStartDay(int year, int month)
   {  
      int start = getTotalNumberOfDays(year, month);
      start = start + 3;
      start = start % 7;
      return start;
	   //call the method getTotalNumberOfDays and store it in a variable called start
		//add 3 to the variable start
		//return start % 7    
   }
	/*returns the total number of the days up to the given month in the given year */
   public static int getTotalNumberOfDays(int year, int month)
   { 
      int totalDays = 0;
      int addDays = 0;
      for (int i = year -1; i >= 1800; i--)
      {
         addDays = addDays + 365;
         if (isLeapYear(year))
         {
            addDays = addDays + 1;
         }
         totalDays = totalDays + addDays;
         addDays = 0;
      }
      for (int j = 1; j  <= (month - 1);j++) 
      {
         addDays = addDays + getNumberOfDaysInMonth(year, j);
         totalDays = totalDays + addDays;
         addDays = 0;
      }          
      return totalDays;
   }
   /*this method return the number of the days in the given month of the 
   given year. take leap year into consideration*/
   public static int getNumberOfDaysInMonth(int year, int month)
   {
      if (month == 1){
         return 31;
         }
     else if (month == 2) 
     {
         if (isLeapYear(year))
         {
            return 29;
         }
         return 28;
     }         
     else if (month == 3) {
         return 31;
         }
     else if (month == 4) {
         return 30;
         }
     else if (month == 5) {
         return 31;
         }
     else if (month == 6) {
         return 30;
         }
     else if (month == 7) {
         return 31;
         }
     else if (month == 8) { 
         return 31;
         }
     else if (month == 9) {
         return 30;
         }
     else if (month == 10) {
         return 31;
         }
     else if (month == 11) {
         return 30;
         }
     else if (month == 12) {
         return 31;
         }
     else {
     return 0;
     }                  
      
   }
	/*returns true if the given year is leap, false otherwise*/
   public static boolean isLeapYear(int year) 
   {
      if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0)))
      {
         return true;
      }
		   return false;    
   }      
   
}