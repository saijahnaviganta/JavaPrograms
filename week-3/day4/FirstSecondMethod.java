/*5. Write a program that takes two input numbers from the user and prints whether the first number is divisible by the second number.*/
import java.util.Scanner;
class FirstSecondMethod
  {
    public static void firstSecond(int first,int second)
    {
      if(first%second==0)
      {
        System.out.println("First is divisible by second");
      }
      else 
        System.out.println("First is not divisible by second");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int first=sc.nextInt();
      System.out.println("Enter second number");
      int second=sc.nextInt();
      firstSecond(first,second);
    }
  }