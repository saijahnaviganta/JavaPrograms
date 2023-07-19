//4. Write a program that takes an input number from the user and prints whether it is greater than 10.//
import java.util.Scanner;
class GreaterNumberMethod
  {
    public static void greaterNum(int i)
    {
      if(i>10)
      {
        System.out.println("It is a greater than 10");
      }
      else 
        System.out.println("It is not greater than 10");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value i");
      int i=sc.nextInt();
      greaterNum(i);
    }
  }