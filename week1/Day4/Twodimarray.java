import java.util.Scanner;
class Twodimarray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the row");
      int row=sc.nextInt();
       System.out.println("Enter the size of the column");
      int column=sc.nextInt();
      int arr[][]=new int[row][column];
      System.out.println("ENter the elements into array");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("The elements in array are");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
    }
  }