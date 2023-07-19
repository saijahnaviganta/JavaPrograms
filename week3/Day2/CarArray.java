/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
import java.util.Scanner;
class CarArray
  {
    String make;
    String model;
    int year;
    public void display()
    {
      System.out.println(make+" "+model+" "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      CarArray car[]=new CarArray[5];
      for(int i=0;i<car.length;i++)
        {
          System.out.println("Enter car"+(i+1)+"details");
          car[i]=new CarArray();
          System.out.println("Enter car make");
          car[i].make=sc.next();
          System.out.println("Enter car model");
          car[i].model=sc.next();
          System.out.println("Enter year of a car");
          car[i].year=sc.nextInt();
        }
      for(int i=0;i<car.length;i++)
        {
          car[i].display();
        }
    }
  }