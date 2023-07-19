/*Write a program that prints all odd numbers between 1 and 100. Use the continue statement to skip even numbers. Implement a menu that allows the user to continue or exit the program.*/
import java.util.Scanner;
class OneToHund
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int first=sc.nextInt();
      System.out.println("Enter last number");
      int last=sc.nextInt();
      for(int i=first;i<=last;i++)
        {
          if(i%2==0)
          {
            continue;
          }
          System.out.println(i);
          }
        }
    }
 