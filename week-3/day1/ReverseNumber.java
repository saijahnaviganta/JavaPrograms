//WAP to print the number in reverse
import java.util.Scanner;
class ReverseNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int temp=num;
      int reverse=0;
      while(num>0)
        {
          int digit=num%10;
          reverse=(reverse*10)+digit;
          num=num/10;
        }
      System.out.println("Reverse of number is:"+reverse);
    }
  }