//print the odd
import java.util.Scanner;
class OddUser
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int first=sc.nextInt();
      System.out.println("Enter the last number");
      int last=sc.nextInt();
      System.out.println("Odd numbers are:");
      for(int i=first;i<=last;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
  }