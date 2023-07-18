/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.*;
class Person
  {
    String name;
    int age;
    String address;
    Person(String n,int a,String add)
    {
      name=n;
      age=a;
      address=add;
    }
    public void display()
    {
      System.out.println(name+" "+age+" "+address);
    }
    public static void main(String args[])
    {
      Person person=new Person("Jahnavi",21,"Sitara centre");
      Person person1=new Person("swetha",22,"Sitara centre");
      person.display();
      person1.display();
    }
  }