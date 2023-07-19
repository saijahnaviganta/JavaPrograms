//print the numbers  from 1 to 50 only those are divisible by 3
import java.util.Scanner;
class DivisibleThree
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      int i;
      for(i=0;i<=n;i++)
        {
          if(i%3==0)
          {
            System.out.println(i);
          }
        }
    }
  }