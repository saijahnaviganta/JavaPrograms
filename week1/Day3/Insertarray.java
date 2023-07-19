import java.util.Scanner;
class Insertarray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into an array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      int arr1[]=new int[size+1];
      System.out.println("Enter the element you want to insert");
      int value=sc.nextInt();
      System.out.println("Enter the position you want to insert an element");
      int pos=sc.nextInt();
      System.out.println("After inserting the array elements");
      for(int i=0;i<size+1;i++)
        {
          if(i==pos)
          {
            arr1[i]=value;
          }
          else if(i>pos)
          {
            arr1[i]=arr[i-1];
          }
          else
            arr1[i]=arr[i];
        }
      for(int i=0;i<size+1;i++)
        {
          System.out.println(arr1[i]);
        }
    }
  }