import java.util.*;
import java.io.*;
public class LibraryDriver
{
  public static void main(String[] args) throws FileNotFoundException
  {
    
    Scanner kb = new Scanner(System.in);
    LibraryBook[] books = new LibraryBook[7];
    books = fillArray(books);
    boolean repeat = true;
    while (repeat)
    {
     System.out.println("--------Welcome To The Library AT CSUS---------- \n\n");
     System.out.println("Enter 1 to check out a book");
     System.out.println("Enter 2 to return a book"); 
     int choice = kb.nextInt();
     if (choice == 1)
     //display the options to check in or check out a book;
     //get the user's choice
     //if choice is 1
     {
         //display the books
         displayBooks(books);
         //call the method getChoice
         getChoice(books, kb);
     }
     else
     //else
     {
         displayBooks(books);
         checkIn(books,kb);
       //display the books
       //call the method check in
     }
     String repeatChoice;
     System.out.print("Another transaction y/n?");
     repeatChoice = kb.next();
     //System.out.println();
     if(repeatChoice.equalsIgnoreCase("y"))
     {
         repeat = true;
     }
     if (repeatChoice.equalsIgnoreCase("n"))
     {
         repeat = false;
         System.out.println();
         System.out.println("Thank You For Visiting The CSUS Library");
     }
     //ask the user if there is another transaction  
   }     
  }
  public static void checkIn(LibraryBook[] books, Scanner kb)
  {
     kb.nextLine();
     System.out.print("Enter the id of the book : ");
     boolean found = false;
     String id = kb.next();
     int i = 0;
     while ( i < books.length && found == false)
     //as long as i is less than the length of the array book and found is false
     {
          String s = books[i].getId();
           
          //get the id of the book at the index i
          //if the borrowed date and returned date is not null
          if(s.equalsIgnoreCase(id))
          {
               if (books[i].getBorrowedDate() != null && books[i].getReturnedDate() != null)
               {
               
                   //call the method setDateNull from the LibraryBook class to set the dates to null
                   books[i].setDateNull();
                   //set found to true
                   found = true;
                   System.out.println("Your book has been returned to the library. Thanks");
               }  
                
          
              //else if you find the book in the list and the returned date is not null
               else {  
                //output inavlid id   
                System.out.println("Invalid id");
                //break out of the loop
                break;
              }  
                 
          }
          //update the index i 
          i++;
  
          
    }
    //if the book was not found
    if (found == false){
      //dispaly that the id for the book is invalid
      System.out.println("the Id for the book is inavlid");
    }
  }
  //this method reads the info for the books from a file and stores it in the array
  public static LibraryBook[] fillArray(LibraryBook[] books) throws FileNotFoundException
  {
      int index = 0;
      File f = new File ("Book.txt");
      Scanner input = new Scanner (f);
      String author = "";
      String title = "";
      String id = "";
      while(input.hasNextLine())
      {
         title = input.nextLine();
         author = input.nextLine();
         id = input.nextLine();
         //books[index] = new LibraryBook(title , author, id);
         LibraryBook b = new LibraryBook(title, author, id);
         books[index] = b;
         System.out.println(books[index].toString());
         index++;
      }
       return books;  
  } 
  //this method displays the info about the books and their avaiability
  public static void displayBooks(LibraryBook[] books)
  {
      System.out.println("   LIBRARY OF CALIFORNIA STATE UNIVERSITY<SACRAMENTO");
      System.out.println("--------------------------------------------------");
      System.out.println("      ID     Title          Author");
      System.out.println("--------------------------------------------------");
      for (int i = 0; i < books.length;i++)
      {  
         System.out.println(i + 1 + "." + books[i]);
         if(books[i].getReturnedDate() == null)
            System.out.println(" " + "Available");
         else 
            System.out.println(" " + "Not Available");
      }

  }
  //this method allows the user to choose a book from the list. as long as the selected book is checked out
  //the user will be prompted for a valid book 
  public static void getChoice(LibraryBook[] books, Scanner kb)
  {
     System.out.println("\nChoose one of the avaible books,");
     System.out.print("Enter the number assosiated with the book: ");
     int num = kb.nextInt();
     //book[2].getBorrowedDate();
     //while(book[num].getBorrowedDate()) 
     //as long as the book is not avaiable*/)
     while (books[num-1].getBorrowedDate() != null && books[num-1].getReturnedDate() != null)
     {
        System.out.println("The selected book is not avaialable until: " + books[num-1].getReturnedDate());
        System.out.print("choose another book: ");
        num = kb.nextInt();
       //display the due date for the selected book
       //ask the user to enter a new book number
         
     }
     
     //call the method setdateBorrowed and setDateReturned
     books[num-1].setDateBorrowed();
     books[num-1].setDateReturned();
     //display the info the book that the user is boroowing
     System.out.println("You have checked out: ");
     System.out.println(books[num-1]);
     System.out.println("You must return the book by : ");
     System.out.println(books[num-1].getReturnedDate());
     
    // display the return date for the book 
  }
}           
      