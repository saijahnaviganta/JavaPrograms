import java.util.Scanner;
class Sorting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int temp=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into an array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("After swapping elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }