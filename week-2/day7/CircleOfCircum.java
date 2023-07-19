import java.util.Scanner;
class CircleOfCircum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the radius");
      double radius=sc.nextDouble(),pi=3.14,circumference;
      circumference=2*pi*radius;
      System.out.println("Circumference of circle is:"+circumference);
    }
  }