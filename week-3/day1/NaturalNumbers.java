//22. WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class NaturalNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value");
      int n=sc.nextInt();
      int i,sum=0;
      System.out.println("Sum of Natural Numbers are");
      for(i=1;i<=n;i++)
        {
          sum=sum+i;
        }
      System.out.println(sum);
    } 
    }
