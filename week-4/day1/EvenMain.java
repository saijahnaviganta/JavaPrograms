import java.util.Scanner;
class EvenMain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter elements into array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Even elements are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }