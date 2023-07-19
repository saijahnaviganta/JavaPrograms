import java.util.Scanner;
class PosornegMethod
  {
    public static void posNeg(int i)
    {
      if(i>0)
      {
        System.out.println("It is a positive number");
      }
      else if(i<0)
      {
        System.out.println("It is a negative number");
      }
      else 
        System.out.println("number is equal to zero");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter i value");
      int i=sc.nextInt();
      posNeg(i);
    }
  }