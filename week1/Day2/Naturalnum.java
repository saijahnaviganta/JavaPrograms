//Write a Java program to display the first 10 natural numbers.//
import java.util.Scanner;
class Naturalnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto you want");
      int num=sc.nextInt();
      for(int i=0;i<=num;i++)
        {
          System.out.println(i);
        }
    }
  }