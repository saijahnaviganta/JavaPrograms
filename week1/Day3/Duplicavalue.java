import java.util.Scanner;
class Duplicavalue
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      System.out.println("Enter the values into array");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
               // System.out.println("The duplicate value is:"+arr[i]);
                count++;
                
              }
        
            }
          if(count>0)
          {
            System.out.println("The duplicate value is:"+arr[i]);
          }
        else
      System.out.println("There is no duplicate value in the array");
    }
  }
  }