/*1. Write a program that takes an integer input from the user and prints "Positive" if the number is greater than zero, "Negative" if the number is less than zero, and "Zero" if the number is equal to zero.*/
import java.util.Scanner;
class PositiveOrNegative
  {
    public static void main(String args[])
    {
      int Number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number:");
      Number=sc.nextInt();
      if(Number>0)
      {
        System.out.println("The Number is positive");
      }
        else if(Number<0)
      {
       System.out.println("The Number is Negative");
      }
      else
          System.out.println("The Number is equal to zero");
    }
  }
