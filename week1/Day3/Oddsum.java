import java.util.Scanner;
class Oddsum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into an array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Odd numbers in array are:");
      for(int i=0;i<size;i++)
        {
          if(arr[i]%2!=0)
          {
            System.out.println(arr[i]);
            sum=sum+arr[i];
          }
        }
      System.out.println("The sum of odd numbers are:");
      System.out.println(sum);
    }
  }