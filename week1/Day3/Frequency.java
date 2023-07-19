import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      int count=1;
      boolean b[]=new boolean[arr.length];
      for(int m=0;m<b.length;m++)
        {
          b[m]=false;
        }
      for(int i=0;i<arr.length;i++)
        {
          if(b[i]==true)
            continue;
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]==arr[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println("Frequency of"+arr[i]+"--------->"+count);
        }
    }
  }