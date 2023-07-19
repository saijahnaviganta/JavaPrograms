import java.util.Scanner;
class ArrayFrequency
  {
    public static void arrayFrequency(int a[],int size)
    {
      for(int k=0;k<size;k++)
        {
          b[k]=false;
        }
      System.out.println("Element--------------Frequency");
      for(int i=0;i<size;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<size;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println(a[i]+"------------"+count);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter boolean value");
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      arrayFrequency(a,size,b);
    }
  }