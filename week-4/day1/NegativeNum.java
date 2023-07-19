//WAP to print all negative elements in an array.
import java.util.Scanner;
class NegativeNum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter elements into an array");
      int a[]=new int[6];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Negative numbers are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
  }