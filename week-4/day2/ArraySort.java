import java.util.Scanner;
class ArraySort
  {
    public static void arraySort(int a[],int size)
    {
      int temp;
      for( int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("After sorting the array elements are:");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
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
        }
      arraySort(a,size);
    }
  }
