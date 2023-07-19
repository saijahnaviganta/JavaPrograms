//4. Write a program that takes an input number from the user and prints whether it is greater than 10.//
import java.util.Scanner;
class NumberGreater
  {
    public static void main(String args[])
    {
      int Number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of Number:");
      Number=sc.nextInt();
      if(Number>10)
      {
        System.out.println("The Number is greater than 10");
      }
    }
  }