import java.util.Scanner;
class Unique
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
     boolean b[]=new boolean[arr.length];
      for(int m=0;m<b.length;m++)
        {
          b[m]=false;
        }
      for(int i=0;i<arr.length;i++)
        {
          int count=1;
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
          if(count==1)
            System.out.println("Unique elements are"+arr[i]);
        }
              }
            }
/*Sort the array elements. —> swap 

Find the second largest

Print the unique

Find the frequency of each element

Inserting  an element

Deleting an element

Searching an element*/