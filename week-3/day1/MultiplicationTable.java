//WAP to print multiplication table of any number
import java.util.Scanner;
class MultiplicationTable
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=10;i++)
        {
      int result=n*i;
      System.out.println("Multiplication of 2 table:"+result);
        }
    }
    }
