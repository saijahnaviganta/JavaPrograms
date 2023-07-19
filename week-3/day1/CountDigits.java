//WAP to count the total number of digits in a number
import java.util.Scanner;
class CountDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      while(n>0)
        {
         int digit=n%10;
          System.out.println(digit);
          n=n/10;
          count=count+1;
        }
      System.out.println("count of digits are:"+count);
    }
  }