import java.util.*;
class Large
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int s=sc.nextInt();
      int arr[]=new int[s];
      System.out.println("enter the elements in the array");
      int temp=0;
      for(int i=0;i<s;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<s;i++)
        {
        for(int j=i+1;j<s;j++)
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
    }
      System.out.println("after sorting array elements");
      for(int i=0;i<s;i++)
        {
          System.out.println(arr[i]);
        }
      System.out.println("the second highest number is "+arr[s-2]);
  }
  }