//WAP to print number of digits in a number.
import java.util.Scanner;
class Extraction
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      while(n>0)
        {
         int digit=n%10;
          System.out.println(digit);
          n=n/10;
        }
    }
  }