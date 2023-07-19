/*2. Write a program that takes two integer inputs from the user and prints "Equal" if the two numbers are equal, and "Not Equal" if they are not equal.*/
import java.util.Scanner;
class EqualOrNot
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a:");
      a=sc.nextInt();
      System.out.println("Enter the value of b:");
      b=sc.nextInt();
      if(a==b)
      {
        System.out.println("The two numbers are equal");
      }
      else
      System.out.println("The two numbers are not equal");
    }
  }
