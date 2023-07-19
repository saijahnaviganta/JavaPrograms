import java.util.Scanner;
class Traffic
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter AM or PM");
      String day=sc.nextLine();
      System.out.println("Enter the time");
      int time=sc.nextInt();
      if((day==AM)&&(time>=8)||(time<=10))
      {
        System.out.println("It shows red light");
      }
      else if((day==AM)&&(time>10)||(time<=12))
      {
        System.out.println("It shows green light");
      }
      else if((day==PM)&&(time>12)||(time<=5))
      {
        System.out.println("It shows yellow light");
      }
      else if((day==PM)&&(time>5)||(time<=12))
      {
        System.out.println("It shows red light");
      }
      else
      {
        System.out.println("Invalid time");
      }
    }
  }