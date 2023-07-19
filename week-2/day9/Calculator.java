import java.util.Scanner;
class Calculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the operator");
      char symbol=sc.next().charAt(0);
      System.out.println("Enter a value:");
      int a=sc.nextInt();
      System.out.println("Enter b value:");
      int b=sc.nextInt();
      if(symbol=='+')
      {
        int result=(a+b);
        System.out.println(result);
      }
      else if(symbol=='-')
      {
        int result=(a-b);
        System.out.println(result);
      }
      else if(symbol=='*')
      {
        int result=(a*b);
        System.out.println(result);
      }
      else if(symbol=='%')
      {
        int result=(a%b);
        System.out.println(result);
      }
      else
        System.out.println("Incorrect operator");
    }
  }