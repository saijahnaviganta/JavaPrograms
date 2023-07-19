//23. WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class SumEven
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value");
      int n=sc.nextInt();
      int i,sum=0;
      for(i=1;i<=n;i++)
        {
      if(i%2==0)
      {
        sum=sum+i;
      }
        }
      System.out.println("Sum of even numbers are:"+sum);
    }
  }