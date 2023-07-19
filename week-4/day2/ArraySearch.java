import java.util.Scanner;
class ArraySearch
  {
    public static void arraySearch(int a[],int size,int value)
    {
      for(int i=0;i<size;i++)
        {
          if(a[i]==value)
          {
            System.out.println("The index of the searching value is:"+i);
            break;
          }
        }
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int a[]=new int[size];
          System.out.println("Enter the elements into array");
        for(int i=0;i<size;i++)
          {
            a[i]=sc.nextInt();
          }
          System.out.println("Enter the value you want to search");
      int value=sc.nextInt();
        arraySearch(a,size,value);
        }
    }