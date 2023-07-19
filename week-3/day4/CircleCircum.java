import java.util.Scanner;
class CircleCircum
  {
    public static void circleCircum(int radius,double pi)
    {
      double circumference=2*pi*radius;
      System.out.println("Circumference of circle is:"+circumference);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius");
       int radius=sc.nextInt();
      System.out.println("Enter pi value");
      double pi=sc.nextDouble();
      circleCircum(radius,pi);
    }
  }