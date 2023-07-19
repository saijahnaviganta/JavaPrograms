//WAP to print factorial of a number
import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the factorial number");
      int n=sc.nextInt();
      int fact=1;
      for(int i=n;i>0;i--)
        {
          fact=fact*i;
        }
      System.out.println("Factorial is:"+fact);
    }
  }