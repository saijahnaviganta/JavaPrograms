import java.util.Scanner;
class ReverseArray
  {
    public static void reverse(int a[],int size)
    {
      
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements into array");
      for(i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      reverse()
    }
  }