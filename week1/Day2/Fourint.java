/*Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.*/
import java.util.Scanner;
class Fourint
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first integer");
      int int1=sc.nextInt();
      System.out.println("Enter the second integer");
      int int2=sc.nextInt();
      System.out.println("Enter the third integer");
      int int3=sc.nextInt();
       System.out.println("Enter the fourth integer");
      int int4=sc.nextInt();
      if(int1==int2&&int2==int3&&int3==int4)
      {
        System.out.println("Four integers are equal");
      }
      else
        System.out.println("Four are not equal");
    }
  }