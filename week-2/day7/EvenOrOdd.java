/*3. Write a program that takes an integer input from the user and prints "Even" if the number is even, and "Odd" if the number is odd.*/
import java.util.Scanner;
class EvenOrOdd
  {
    public static void main(String args[])
    {
      int Number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of Number:");
      Number=sc.nextInt();
      if(Number%2==0)
      {
        System.out.println("The Number is even number");
      }
      else
        System.out.println("The Number is odd number");
    }
  }