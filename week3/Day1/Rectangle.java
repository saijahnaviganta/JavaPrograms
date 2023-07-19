/*Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle*/
import java.util.Scanner;
class Rectangle
  {
    int length;
    int width;
    public void area()
    {
      int area=length*width;
      System.out.println("The area of rectangle:"+area);
    }
    public void perimeter()
    {
      int perimeter=2*(length+width);
      System.out.println("The perimeter of the rectangle:"+perimeter);
    }
    public static void main(String args[])
    {
      Rectangle rect=new Rectangle();
      rect.length=15;
      rect.width=25;
      rect.area();
      rect.perimeter();
    }
  }