/*Matrix Addition Write a program that takes two 2-dimensional arrays as input and performs matrix addition. The program should prompt the user to enter the size of the arrays and the elements of each array. After adding the two matrices, the program should display the resulting matrix.*/
import java.util.Scanner;
class MatrixAddition
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      int row=sc.nextInt();
      System.out.println("Enter column size");
      int col=sc.nextInt();
      int arr[][]=new int[row][col];
      int arr1[][]=new int[row][col];
      int sum[][]=new int[row][col];
      System.out.println("Enter the elements in first matrix");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("Enter the elements in second matrix");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              arr1[i][j]=sc.nextInt();
            }
        }
      System.out.println("First Matrix are:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
       System.out.println("Second Matrix are:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(arr1[i][j]+" ");
            }
          System.out.println();
        }
      System.out.println("The addition of two matrix are:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
               sum[i][j]=arr[i][j]+arr1[i][j];
               System.out.print(sum[i][j]+" ");
            }
          System.out.println();
        }
    }
  }