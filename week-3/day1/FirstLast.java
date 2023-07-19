//WAP to find first and last digit of a number.
import java.util.Scanner;
class FirstLast
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      int temp=n;
     int firstdigit=0;
      while(n>0)
        {
          firstdigit=n%10;
          n=n/10;
        }
      System.out.println("firstdigit is:"+firstdigit);
      int lastdigit=temp%10;
      System.out.println("Last digit is:"+lastdigit);
    }
  }