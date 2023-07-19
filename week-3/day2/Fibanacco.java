import java.util.Scanner;
class Fibanacco
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int first=sc.nextInt();
      System.out.println("Enter the second number");
      int second=sc.nextInt();
      System.out.println("Enter the number");
      int num=sc.nextInt();
      System.out.println(first);
      System.out.println(second);
      for(int i=1;i<=num;i++)
        {
          int third=first+second;
          System.out.println(third);
          first=second;
          second=third;
        }
    }
  }