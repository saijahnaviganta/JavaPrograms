//WAP to print all negative elements in an array using method.
import java.util.Scanner;
class NegativeMethod
  {
    public static void negativeMethod(int a[])
    {
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
       negativeMethod(a);
    }
  }
