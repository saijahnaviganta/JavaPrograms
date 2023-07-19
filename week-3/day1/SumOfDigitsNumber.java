 //WAP to calculate sum of digits of a number.
import java.util.Scanner;
class SumOfDigitsNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      while(n>0)
        {
         int digit=n%10;
          System.out.println(digit);
          n=n/10;
      sum=(sum+digit);
        }
      System.out.println("Sum of digits are:"+sum);
    }
  }