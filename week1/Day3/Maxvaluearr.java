import java.util.Scanner;
class Maxvaluearr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      System.out.println("Enter the elements into array");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
         int max=arr[0];
      for(int i=0;i<size;i++)
        {
          if(max<arr[i])
          {
            max=arr[i];
          }
        }
      System.out.println("The maximum value in array is:"+max);
    }
  }