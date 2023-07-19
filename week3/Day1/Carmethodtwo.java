/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
import java.util.*;
class Carmethodtwo
  {
    String make;
    String model;
    int year;
    public void setCarDetails(String m,String mod,int y)
    {
      make=m;
      model=mod;
      year=y;
    }
    public void display()
    {
      System.out.println("The car make is:"+make);
      System.out.println("The car model is:"+model);
      System.out.println("The car year is:"+year);
    }
    public static void main(String args[])
    {
      Carmethodtwo c=new Carmethodtwo();
      Carmethodtwo c1=new Carmethodtwo();
      Carmethodtwo c2=new Carmethodtwo();
      c.setCarDetails("Audi","456f",1980);
      c1.setCarDetails("Hyundai","387l",1990);
      c2.setCarDetails("Toyota","245f",1900);
      c.display();
      c1.display();
      c2.display();
    }
  }