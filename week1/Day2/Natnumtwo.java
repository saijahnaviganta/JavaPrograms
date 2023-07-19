/*Input number: 7                                                       The first n natural numbers are : 7                                                    1                                                                 2                                                                 3                                                                 4                                                                 5                                                                 6                                                                 7                                                                                                     The Sum of Natural Number upto n terms : 28 */
import java.util.Scanner;
class Natnumtwo
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Input number is");
      int num=sc.nextInt();
      System.out.println("The first n natural numbers are:");
      for(int i=1;i<=num;i++)
        {
          System.out.println(i);
         sum=sum+i;
        }
      System.out.println("The sum of natural number upto n terms are:"+sum);
    }
  }