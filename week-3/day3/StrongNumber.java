import java.util.Scanner;
class StrongNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int temp=num;
      int sum=0;
      while(num>0)
        {
          int digit=num%10;
          int fact=1;
          for(int i=1;i<=digit;i++)
            {
              fact=fact*i;
            }
          sum=sum+fact;
          num=num/10;
        }
      if(sum==temp)
      {
        System.out.println("it is a strong number");
      }
      else 
        System.out.println("it is not a strong number");
    }
  }