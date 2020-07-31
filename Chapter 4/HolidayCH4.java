/* Miguel Tirado CSC 15 lab 
Chapeter 4 */ 
import java.util.Scanner;
public class HolidayCH4 {
   public static void main (String[] args) 
   {
      String name = "";
      int month = 0;
      int day = 0;
      int year = 0;
      Scanner kb = new Scanner(System.in);
      printDirections();
      System.out.print("How many times do you want to run the code: ");
      int count = kb.nextInt();
      System.out.println("You may enter the month as:");
      System.out.println("\t * a numeric value (1..12)\n or as");
      System.out.println("\t * an unabbreviated month name (January or february etc...)");
      System.out.println();
     
      String monthName = "";
      int monthNumber;
      for (int i = 1; i <= count; i++)
      {
         System.out.print("Enter the month: ");
         if(kb.hasNextInt())
         {
            month = kb.nextInt();
            monthName = getName(month);
         }
         else if(kb.hasNext())
         {
            monthName =kb.next();
            month = getNumber(monthName);
         }
         System.out.print("Enter the day: ");
         day = kb.nextInt();
         System.out.print("Enter the year: ");
         year = kb.nextInt();
         System.out.println();
         System.out.print("The Date is: " + month + "/" +  day + "/" + year + "\t");
         System.out.print(monthName + " " + day + "," + " " + year);
         String H = getHoliday(day, month,year);
         System.out.println("\t" + H);
         System.out.println();
         
         
      }
       
      //System.out.println(getName(1));
      //System.out.println(getNumber("September"));
   }
   public static String getName(int month)
   {
      if (month == 1)
      {
         return "January";
      }
      else if(month == 2)
      {
         return "Febuary";
      }
      else if (month == 3)
      {
         return "March"; 
      }
      else if (month == 4)
      {
         return "April";
      }
      else if (month == 5)
      {
         return "May";
      }
      else if (month == 6)
      {
         return "June";
      }
      else if (month == 7)
      {
         return "July";
      }
      else if (month == 8)
      {
         return "Agust";
      }
      else if (month == 9)
      {
         return "September";
      }
      else if (month == 10)
      {
         return "October";
      }
      else if (month == 11)
      {
         return "November";
      }
      else if (month == 12)
      {
         return "December";
      } 
      else 
         return "unkown";
   }
   public static int getNumber(String name)
   {
      if(name.equalsIgnoreCase("January"))
         return 1;
      else if (name.equalsIgnoreCase("Febuary"))
         return 2;
      else if (name.equalsIgnoreCase("March"))
         return 3;
      else if (name.equalsIgnoreCase("April"))
         return 4;
      else if (name.equalsIgnoreCase("May"))
         return 5;
      else if (name.equalsIgnoreCase("June"))
         return 6;
      else if (name.equalsIgnoreCase("July"))
         return 7;
      else if (name.equalsIgnoreCase("August"))
         return 8;
      else if (name.equalsIgnoreCase("September"))
         return 9;
      else if (name.equalsIgnoreCase("October"))
         return 10;
      else if (name.equalsIgnoreCase("November"))
         return 11;
      else if (name.equalsIgnoreCase("December"))
         return 12;
      else 
         return -1;
   } 
   public static boolean isEaster(int month, int day, int year)
   {
      int goldenNumber = (year % 19) + 1;
      int a = (24 + 19*(goldenNumber - 1)) % 30;
      int b = a - a/28;
      int c = (year + year/4 + b - 13) % 7;
      int d = b - c;
      int easterMonth = 3 + (d + 40)/44;
      int easterDay = d + 28 - 31*(easterMonth/4); 
      return (easterMonth == month && easterDay == day);
   }
   public static String getHoliday (int d, int m, int y)
   {
      String holiday = " ";
      switch(m)
      {
        case 1:switch(d)
            {
            case 1: holiday = "New Year's day";
               break; 
            case 16: holiday = "Martin Luther King";
               break;
            }
        break;
        case 2: switch(d)
            {
            case 2: holiday = "Ground Hog day";
               break; 
            case 19: holiday = "Abraham Lincoln's Birthday";
               break;
            case 14: holiday = "Valentines day";
               break;
            case 22: holiday = "George Washington's Birthday";
               break;
            }
        break;
        case 3: switch(d)
             {
             case 17: holiday = "Saint Patricks Day";
               break;
             }
        break;
        case 4: switch(d) 
             {
             case 1: holiday = "April Foll's Day";
               break;
             case 22: holiday = "Earth Day";
               break;
             case 28: holiday = "Arbor Day";
               break;
             case 4: holiday = "Grandma's Birthday";
               break;
             
             }
        break;
        case 5: switch(d)
             {
             case 1: holiday = "May Day";
               break;
             case 5: holiday = "Cinco de Mayo";
               break;
             }
        break;
        case 7: switch(d) 
             {
             case 4: holiday = "Independence Day";
                break;
             }
        case 8: switch(d)
             {  
             case 6: holiday = "International Friendship Day";
               break;
             }  
        break;
        case 10: switch(d)
             {
             case 9: holiday = "Columbus Day";
               break;
             case 31: holiday = "Halloween";
               break;
             }
        break;
        case 11: switch(d)
             {
             case 11: holiday = "Veterans Day";
               break;
             }
        break;
        case 12: switch(d)
             { 
             case 25: holiday = "Christmas";
               break;
             case 31: holiday = "New Year's Eve";
               break;
             }
        break;            
        default: holiday = "";
      }
      // issue here needs to be fixed!!!!
      
      if(isEaster(d,m,y) && holiday.length > 0)
         return ("Easter and " + holiday);
      else if(isEaster(d,m,y))
         return ("Easter");
      else 
         return holiday;
   
   }
   public static void printDirections(){
      System.out.println("This program will ask you for a month, day, and year and will");
      System.out.println("print the corresponding date in two standard date formats.");
   }
   
}
   
   
   