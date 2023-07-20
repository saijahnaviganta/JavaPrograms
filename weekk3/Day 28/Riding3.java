/*In this assignment, you are required to create a base class called Shape and two derived classes called Circle and Rectangle. The Shape class should have a method named area that returns 0. The Circle class should override the area method to calculate and return the area of the circle, given its radius. The Rectangle class should override the area method to calculate and return the area of the rectangle, given its length and width.

Your task is to write the Shape, Circle, and Rectangle classes and demonstrate the use of method overriding by creating objects of each class, calling the area method on them, and printing the calculated areas.*/
class Shape
  {
    public void area()
    {
      System.out.println("Area of circle and square");
    }
  }
class Circle extends Shape
  {
    public void area()
    {
      int radius=5;
      double pi=3.14;
      System.out.println("Area of circle is:"+(pi*radius*radius));
    }
  }
class Rectangle extends Shape
  {
    public void area()
    {
      int length=5,breadth=10;
      System.out.println("Area of rectangle is:"+(length*breadth));
    }
  }
class Riding3
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape c=new Circle();
      c.area();
      Shape r=new Rectangle();
      r.area();
    }
  }


