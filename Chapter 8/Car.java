public class Car
{
  //instance variables
  private String make;
  private String model;
  private int year;
  private double mpg;
  private boolean title;
  private double milage;
  //constructor
  public Car(String m, String mo, int y, double mp,boolean t,double mil)
  {
     make = m;
     model = mo;
     year = y;
     mpg = mp;
     title = t;
     milage = mil;
  }
  // set of mutators
  public void setMake(String m)
  {
      if(m.equalsIgnoreCase("Toyota") || m.equalsIgnoreCase("Honda"))     
         make = m;
      else 
         System.out.println("Invalid make.");
  }
  public void setModel(String mo)
  {
      model = mo;
  }
  public void setYear(int y)
  {
      if ( y > 1800)
         year = y;
      else 
         System.out.println("not valid");
      
  }
  public void setMpg(double mp)
  {
      if(mp >0)
         mpg = mp;
  }
  public void setTitle(boolean t)
  {
      title = t;
  }
  public void setMilage(double mil)
  {
      if (mil > 0)
         milage = mil;
  }    
  //set of anccessor methods
  public String getMake()
  {
      return make;
  }
  public String getModel()
  {
      return model;
  }
  public int getYear()
  {
      return year;
  }
  public double getMpg()
  {
      return mpg;
  }
  public boolean geTitle()
  {
      return title;
  }
  public double getMilage()
  {
      return milage;
  }
  
  // Create a string representing the object
  public String toString()
  {
      String s ="Make : " + make;
      s = s + "\nModel: " + model;
      s = s + "\nYear: " + year;
      s = s + "\nMPG : " +mpg;
      s = s + "\nMilage: " + milage;     
      if(title)
         s = s + "\nClean title\n";
      else 
         s = s + "\nSalvage title\n";
      return s;
  }
}