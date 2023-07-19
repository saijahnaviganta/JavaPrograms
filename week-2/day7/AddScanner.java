import java.util.Scanner;
class AddScanner
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a:");
      a=sc.nextInt();
      System.out.println("Enter the value of b:");
      b=sc.nextInt();
      int c=a+b;
      System.out.println("The sum is:"+c);
    }
  }