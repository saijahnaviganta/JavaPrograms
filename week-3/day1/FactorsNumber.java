import java.util.Scanner;
class FactorsNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++)
        {
      if(n%i==0)
      {
        System.out.println("Factors of 12 are:"+i);
      }
    }
  }
  }