import java.util.Scanner;
class Booktwo
  {
    String name;
    String author;
    int year;
    int id;
      public void insert(String n,String a,int y,int i)
        {
        name=n;
        author=a;
        year=y;
        id=i;
        }
      public void display()
        {
        System.out.println("The book name is:"+name);
          System.out.println("The author name is:"+author);
          System.out.println("The year is:"+year);
          System.out.println("The book id is:"+id);
        }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        Booktwo book[]=new Booktwo[3];
        for(int i=0;i<book.length;i++)
          {
            System.out.println("Enter Book"+(i+1)+"details");
            book[i]=new Booktwo();
            System.out.println("Enter Book name");
            String bname=sc.next();
            System.out.println("Enter author name");
            String bauthor=sc.next();
            System.out.println("Enter published year");
            int byear=sc.nextInt();
            System.out.println("Enter Book id");
            int bid=sc.nextInt();
            book[i].insert(bname,bauthor,byear,bid);
          }
        for(int i=0;i<book.length;i++)
          {
            book[i].display();
          }
        }
    }
