import java.util.Scanner;
class ArraySum
  {
    public static void arraySum(int a[],int size)
    {
       int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("sum of all numbers is:"+sum);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
         a[i]=sc.nextInt();
        }
      arraySum(a,size);
    }
  }