//print the natural numbers between one range to another range
import java.util.Scanner;
class NaturalUser
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int first=sc.nextInt();
      System.out.println("Enter the last number");
      int last=sc.nextInt();
      System.out.println("Natural numbers are:");
      for(int i=first;i<=last;i++)
        {
            System.out.println(i);
          }
        }
    }