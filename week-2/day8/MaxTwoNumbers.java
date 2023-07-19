// 1. WAP to find maximum between two numbers.//
import java.util.Scanner;
class MaxTwoNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of num1:");
      int n1=sc.nextInt();
      System.out.println("Enter the value of num2:");
      int n2=sc.nextInt();
      if(n1>n2)
      {
        System.out.println("n1 is the maximum number");
      }
      else
        System.out.println("n2 is the maximum number");
    }
  }