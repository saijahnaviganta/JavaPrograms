/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
 
Input the 5 numbers :                                                       1                                                                 2                                                                 3                                                                 4                                                                 5                                                                                The sum of 5 no is : 15                                                          The Average is : 3.0        */
import java.util.Scanner;
class Sumndavg
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b,c,d,e;
      System.out.println("Input the 5 numbers:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      d=sc.nextInt();
      e=sc.nextInt();
      int sum=a+b+c+d+e;
      System.out.println("The sum of 5 no is:"+sum);
      float avg=sum/5;
      System.out.println("The average is:"+avg);
    }
  }