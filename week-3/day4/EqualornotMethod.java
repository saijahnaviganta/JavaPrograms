import java.util.Scanner;
class EqualornotMethod
  {
    public static void equalNot(int a,int b)
    {
      if(a==b)
      {
        System.out.println("Both are equal");
      }
      else 
        System.out.println("Both are not equal");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      equalNot(a,b);
    }
  }