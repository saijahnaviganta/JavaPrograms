//2. WAP to find maximum between three numbers.//
import java.util.Scanner;
class MaxThreeNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of num1:");
      int n1=sc.nextInt();
      System.out.println("Enter the value of num2:");
      int n2=sc.nextInt();
      System.out.println("Enter the value of num3:");
      int n3=sc.nextInt();
      if((n1>n2)&&(n1>n3))
      {
        System.out.println("n1 is the maximum number");
      }
      else if(n2>n3)
      {
        System.out.println("n2 is the maximum number");
      }
      else
        System.out.println("n3 is the maximum number");
    }
  }