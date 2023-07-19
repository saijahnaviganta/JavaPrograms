import java.util.Scanner;
class TwoDim
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row size");
        int row=sc.nextInt();
     System.out.println("Enter the column size");
int col=sc.nextInt();
int a[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
      System.out.println("Enter the row one value");
      int row1=3;
      System.out.println("Enter the row two value");
      int row2=4;
        }
      for(int j=0;j<col;j++)
        {
      System.out.println("Enter the column one value");
      int col1=4;
      System.out.println("Enter the column two value");
      int rcol2=5;
        }
      int matrix[i][j]=sc.nextInt();
for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
      {
        System.out.println(matrix[i][j]);
      }
  }
}
  }