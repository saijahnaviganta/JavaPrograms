//check wheterh a number is amstrong or not
import java.util.Scanner;
class Armstrong
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int temp=num;
      int sum=0,result=1;
      int count=0;
      