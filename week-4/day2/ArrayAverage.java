import java.util.Scanner;
class ArrayAverage
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      System.out.println("Enter the elements into array");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
          arrayAverage(a,size);
        }
    }
    public static void arrayAverage(int a[],int size);
    {
      int avg;int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
          avg=sum/size;
        }
    }
  }