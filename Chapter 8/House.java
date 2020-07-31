public class House
{
   private double squerefoot;
   private double price;
   private int bedRooms;
   private int year;
   private double bath;
   private int garage;
   private String description;
   private String address;
   public House(double sf, double p, int r, int y, double b, int g,String des,String a)
   {
      sf = squerefoot;bedRooms = r; bath = b; garage = g; price = p; year = y; description = des;address = a;

   }
   public String toString() 
   {
      String s = "Adress: " + address + " price: " + price + " Year: " + year + " rooms: " + bedRooms + " bathrooms: " + bath + " garage: " + garage;
      return s;
   } 
   public void setSF(double newsf)
   {
      squerefoot = newsf;
   }
   public void setRooms(int r)
   {
      bedRooms = r;
   }
   public void setBath(double b)
   {
      bath = b;
   }
   public void setPrice(double p)
   {
      price = p;
   }
   public void setYear(int y)
   {
      year = y;
   }
   public void setDescription (String des)
   {
      description = des;
   }
   public void setAddress(String addr)
   {
      address = addr;
   }
   
}