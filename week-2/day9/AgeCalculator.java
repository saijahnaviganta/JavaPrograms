/*2. Age Calculator : Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/
import java.util.Scanner;
class AgeCalculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter present year");
      int year=sc.nextInt();
      System.out.println("Enter date of birth");
      int dob=sc.nextInt();
      int age=year-dob;
      System.out.println("age is:"+age);
      if(age>=18)
      {
        System.out.println("Major");
      }
      else
        System.out.println("Minor");
    }
  }