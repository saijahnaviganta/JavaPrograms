/*Write a Java program to display the cube of the given number up to an integer.*/
/*Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1                                               Number is : 2 and cube of 2 is : 8                                               Number is : 3 and cube of 3 is : 27                                              Number is : 4 and cube of 4 is : 64*/
import java.util.Scanner;
class Cubee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto you want cube");
      int num=sc.nextInt();
      int result;
      for(int i=1;i<=num;i++)
        {
          result=i*i*i;
          System.out.println("Number is"+i+"and cube of"+i+"is:"+result);
        }
    }
  }