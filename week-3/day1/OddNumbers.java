 //21.WAP to print all odd number between 1 to 100.
import java.util.Scanner;
class EvenNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int i;
      System.out.println("Even Numbers are:");
      for(i=1;i<n;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
    }
  }