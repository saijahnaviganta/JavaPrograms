import java.util.Scanner;
class Searching
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int key=sc.nextInt();
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          if(key==arr[i])
          {
            System.out.println("Element is found at "+i);
          }
        }
    }
  }