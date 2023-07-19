/*5. Write a program that takes two input numbers from the user and prints whether the first number is divisible by the second number.*/
import java.util.Scanner;
class FirstWithSecond
  {
    public static void main(String args[])
    {
      int firstnumber,secondnumber;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the First Number");
      firstnumber=sc.nextInt();
      System.out.println("Enter the Second Number");
      secondnumber=sc.nextInt();
      if(firstnumber%secondnumber==0)
      {
        System.out.println("The first number is divisible by the second number");
      }
    }
  }
