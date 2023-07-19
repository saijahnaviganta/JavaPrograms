import java.util.Scanner;
class CalculatorSwitch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value a:");
      int a=sc.nextInt();
      System.out.println("Enter the value b:");
      int b=sc.nextInt();
      System.out.println("Enter the operator");
      char op=sc.next().charAt(0);
      switch(op)
        {
        case '+':
            System.out.println("The addition is:"+(a+b));
            break;
          case '-':
            System.out.println("The subtraction is:"+(a-b));
            break;
          case '*':
            System.out.println("The multiplication is:"+(a*b));
            break;
          case '%':
            System.out.println("The division is:"+(a%b));
            break;
          default:
            System.out.println("Invalid input");
            break;
        }
    }
  }