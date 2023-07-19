/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
import java.util.Scanner;
class BookArray
  {
    String name;
    String Author;
    int publishedyear;
    int id;
    public void display()
    {
      System.out.println("Book name:"+name);
      System.out.println("Author name:"+Author);
      System.out.println("Published year:"+publishedyear);
      System.out.println("Book id:"+id);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BookArray book[]=new BookArray[3];
      for(int i=0;i<book.length;i++)
        {
          book[i]=new BookArray();
          System.out.println("Enter Book"+i+"details");
          System.out.println("Enter the book name");
          book[i].name=sc.next();
          System.out.println("Enter the author name");
          book[i].Author=sc.next();
          System.out.println("Enter the published year");
          book[i].publishedyear=sc.nextInt();
          System.out.println("Enter the book id");
          book[i].id=sc.nextInt();
        }
      for(int i=0;i<book.length;i++)
        {
          book[i].display();
        }
    }
  }