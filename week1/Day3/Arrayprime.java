import java.util.Scanner;
class Arrayprime
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into an array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Prime numbers in array are");
      for(int i=0;i<size;i++)
        {
           for(int j=0;j<arr[i];j++)
             {
               if(arr[i]%j==0)
               {
                 count++;
               }
               if(count==2)
      {
        System.out.println(arr[i]);
      }
             }
        }
    }
  }