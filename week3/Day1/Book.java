/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
import java.util.Scanner;
class Book
  {
    String title;
    String author;
    int publicationyear;
    public void initializeBook(String tit,String aut,int pubyear)
    {
      title=tit;
      author=aut;
      publicationyear=pubyear;
    }
    public void display()
    {
      System.out.println("The title of the book is"+title);
       System.out.println("The title of the book is"+author);
       System.out.println("The title of the book is"+publicationyear);
    }
    public static void main(String args[])
    {
      Book b=new Book();
      b.initializeBook("Java","Nageswar rao",2001);
      b.display();
    }
  }