import java.util.Scanner;
class AddThreeNum
  {
    public static void addThree(int num1,int num2,int num3)
    {
      int result=num1+num2+num3;
      System.out.println(result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of number1");
      int num1=sc.nextInt();
      System.out.println("Enter value of number2");
      int num2=sc.nextInt();
      System.out.println("Enter value of number3");
      int num3=sc.nextInt();
      System.out.println("Addition of three numbers is");
      addThree(num1,num2,num3);
    }
  }