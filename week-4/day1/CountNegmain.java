import java.util.Scanner;
class CountNegmain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      int a[]=new int[5];
      System.out.println("Enter the elements into array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            count++;
          }
        }
          System.out.println("count of elements are:"+count);
        }
    }