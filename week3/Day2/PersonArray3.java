/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.Scanner;
class PersonArray3
  {
    String name;
    int age;
    String address;
    PersonArray3(String n,int a,String ad)
    {
      name=n;
      age=a;
      address=ad;
    }
    public void display()
    {
      System.out.println(name+" "+age+" "+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      PersonArray3 arr[]=new PersonArray3[3];
      for(int i=0;i<arr.length;i++)
        {
          String pname=sc.next();
          int page=sc.nextInt();
          String paddress=sc.next();
          arr[i]=new PersonArray3(pname,page,paddress);
        }
      for(int i=0;i<arr.length;i++)
        {
          arr[i].display();
        }
    }
  }
