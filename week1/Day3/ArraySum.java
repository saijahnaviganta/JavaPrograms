import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      System.out.println("Enter the elements into array ");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("The array elements are:");
      for(int i=0;i<size;i++)
        {
          System.out.println(arr[i]);
          sum=sum+arr[i];
        }
      System.out.println("The sum of values of array are:");
      System.out.println(sum);
    }
  }