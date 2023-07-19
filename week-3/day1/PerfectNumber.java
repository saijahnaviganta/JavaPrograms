//WAP to print factor numbeer is perfect or not
import java.util.Scanner;
class PerfectNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int sum=0;
      for(int i=1;i<num;i++)
        {
          if(num%i==0)
          {
            sum=sum+i;
          }
        }
      System.out.println("sum is:"+sum);
      if(sum==num)
      {
        System.out.println("It is a perfect number");
      }
      else 
        System.out.println("It is not a perfect number");
    }
  }