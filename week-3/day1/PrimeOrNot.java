import java.util.Scanner;
class PrimeOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int count=0,i;
      for(i=1;i<=num;i++)
        {
          if(num%i==0)
          {
            count++;
          }
        }

      if(count==2)
      {
        System.out.println("It is a prime number");
      }
      else 
        System.out.println("It is not a prime number");
    }
  }