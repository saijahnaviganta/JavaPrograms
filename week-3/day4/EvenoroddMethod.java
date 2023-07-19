import java.util.Scanner;
class EvenoroddMethod
  {
    public static void evenOdd(int i)
    {
      if(i%2==0)
      {
        System.out.println("It is a even number");
      }
      else 
        System.out.println("It is a odd number");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter i value");
      int i=sc.nextInt();
      evenOdd(i);
    }
  }