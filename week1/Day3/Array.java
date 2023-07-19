import java.util.Scanner;
class Array
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("ENter the elements into array");
      for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
      System.out.println("The array elements are:");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }