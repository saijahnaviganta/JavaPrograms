import java.util.Scanner;
class Palindrome
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
      System.out.println(reverse);
      if(temp==reverse)
      {
        System.out.println("It is a palindrome");
      }
      else 
        System.out.println("It is not a palindrome");
    }
  }