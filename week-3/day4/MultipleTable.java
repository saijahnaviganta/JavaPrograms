/*5.Multiplication Table: Create an application that generates the multiplication table of a given number. Use a loop to display the table and conditional statements to check if the current number is a multiple of the given number.*/
import java.util.Scanner;
class MultipleTable
  {
    public static void multipleTable(int i,int n)
    {
      for(i=1;i<=10;i++)
        {
          int result=n*i;
          System.out.println(n"*"i=+result);
        }
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        multipleTable(int num);
        }
    }