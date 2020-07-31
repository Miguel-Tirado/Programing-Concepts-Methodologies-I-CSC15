
import java.util.*;
public class LibraryBook
{
   //declare all the instance variables such as title, author, borrower, id 
   private String title;
   private String author;
   private String borrower;
   private String id;      
   private Date dateBorrowed ;
   private Date dateReturned;
   //initilalize the instance variables using the paramter being passed to this method
   public LibraryBook(String t, String a, String i) // id is the ISBN and has deashes therefore is will be a string
   {
      title = t;
      author = a;
      id = i;
      
   }
   //initialize the instance variable borrower to the new value
   public  void borrowBook(String b)
   {
      borrower = b;
     
          
     
   } 
   public  void setDateBorrowed()
   {
      Calendar calendar = Calendar.getInstance();  
      dateBorrowed = calendar.getTime();       
   }
   public  void setDateReturned( )
   {
      Calendar calendar = Calendar.getInstance();
      calendar.add(Calendar.DATE, 15);
      dateReturned = calendar.getTime();
   }
   //this method stes both dateBorrowed and dateReturned to null which indicates that the book is avaiable
   public void setDateNull()
   {
      dateBorrowed = null;
      dateReturned = null;
      
   } 
   //accessor method returns the id
   public String getId()
   {
      return id;
   }
   //retruns the date that the book was borrowed     
   public Date getBorrowedDate()
   {
      return dateBorrowed;
       //return null;
   }
   //returns the returned date
   public Date getReturnedDate()
   {
      return dateReturned;
      //return null; 
   } 
   //sets the borrower to null when the book is returned     
   public  void returnBook()
   {
      borrower = null;
       //if (id.equalsto(input))
         
   }
   //returns the title of the book 
   public String getTitle()
   {
      return title;
      //return "";
   }
   //returns the author of the book
   public String getAuthor()
   {
      return author;
       //return "";
   }
   public String getBorrower()
   {
      return "";
   }
   //compares two books, if they have the same id return true, otherwise return false
   public  boolean equals(LibraryBook b)
   {
      return this.id == b.id; //&& this.author
      //return false;
   }
   //returns a string representing a book, including the id, titile and author
   public String toString()
   {
      String s = "";
      s = s + id + ", " + title + ", " + author;
      //s =  s + "Author : " + author;
      //s = s + "ID : " + id;
      return s;
     //return "";
   }  
}                        