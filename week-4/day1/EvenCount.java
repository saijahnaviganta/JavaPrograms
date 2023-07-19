import java.util.Scanner;
class EvenCount
  {
    public static void evenCount(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
         if(a[i]%2==0)
         {
           count++;
         }
        }
      System.out.println("Count of even numbers are:"+count);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter the elements into array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      evenCount(a);
    }
  }