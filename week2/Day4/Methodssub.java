import java.util.Scanner;
class Methodssub
  {
    public void subtract()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("The subtraction is"+(a-b));
    }
    public static void main(String args[])
    {
      Methodssub s=new Methodssub();
      s.subtract();
    }
  }