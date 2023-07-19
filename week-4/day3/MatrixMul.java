 /*Matrix Multiplication Write a program that takes two 2-dimensional arrays as input and performs matrix multiplication. The program should prompt the user to enter the size of the arrays and the elements of each array. After multiplying the matrices, the program should display the resulting matrix.*/
import java.util.Scanner;
class MatrixMul
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows in first matrix");
      int row1=sc.nextInt();
      System.out.println("Enter no of rows in second matrix");
      int row2=sc.nextInt();
      System.out.println("Enter no of columns in first matrix");
      int col1=sc.nextInt();
      System.out.println("Enter no of columns in second matrix");
      int col2=sc.nextInt();
      int arr[][]=new int[row1][col1];
      int arr1[][]=new int[row2][col2];
      int c[][]=new int[row1][col2];
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
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<col1;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
       System.out.println("Second Matrix are:");
      for(int i=0;i<row2;i++)
        {
          for(int j=0;j<col2;j++)
            {
              System.out.print(arr1[i][j]+" ");
            }
          System.out.println();
        }
      System.out.println("The Multiplication of two matrix are:");
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<col2;j++)
            {
              for(int k=0;k<col1;k++)
                { 
                  
               c[i][j]=c[i][j]+arr[i][k]*arr1[k][j];
               System.out.print(c[i][j]+" ");
            }
          System.out.println();
        }
    }
    }
  }