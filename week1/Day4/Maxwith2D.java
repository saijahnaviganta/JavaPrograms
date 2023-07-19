import java.util.Scanner;
class Maxwith2D
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row size");
      int row=sc.nextInt();
      System.out.println("Enter the column size");
      int column=sc.nextInt();
      int arr[][]=new int[row][column];
      System.out.println("Enter the values into array");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("The maximum element in array is");
      int max=arr[0][0];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              if(max<arr[i][j])
              {
                max=arr[i][j];
              }
            }
        }
      System.out.println(max);
    }
  }