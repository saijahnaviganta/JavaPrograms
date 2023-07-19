//WAP to calculate product of digits of a number.
  import java.util.Scanner;
class DigitsProduct
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int product=1;
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      while(n>0)
        {
         int digit=n%10;
          System.out.println(digit);
          n=n/10;
      product=product*digit;
        }
      System.out.println("Product of digits are:"+product);
    }
  }