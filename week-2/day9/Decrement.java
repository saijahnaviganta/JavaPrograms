import java.util.Scanner;
class Decrement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int i;
      for(i=n;i>0;i--)
        {
          System.out.println(i);
        }
    }
  }