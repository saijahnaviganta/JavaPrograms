/*Assignment 1: Shape Hierarchy
Create an abstract class called "Shape" that has the following abstract methods:
get_area(): Returns the area of the shape.get_perimeter(): Returns the perimeter of the shape.
Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.*/
abstract class Shape
  {
    abstract void area();
    abstract void perimeter();
  }
class Rectangle extends Shape
  {
    public void area()
    {
      int length=5,breadth=10;
      System.out.println("The area of rectangle is:"+(length*breadth));
    }
    public void perimeter()
    {
      int length=5,breadth=10;
      int per=2*(length+breadth);
      System.out.println("The perimeter of rectangle is:"+per);
    }
  }
class Square extends Shape{
  public void area()
  {
    int side=5;
    System.out.println("The area of square is:"+(side*side));
  }
  public void perimeter()
  {
    int side=5;
    int per=4*side;
    System.out.println("The perimeter of square is:"+per);
  }
}
class Triangle extends Shape 
  {
    public void area()
    {
      double breadth=10,height=4;
      double a=0.5*breadth*height;
      System.out.println("The area of triangle is:"+a);
    }
    public void perimeter()
    {
      int a=5,b=6,c=7;
      System.out.println("The perimeter of triangle is:"+(a+b+c));
    }
  }
class Circle extends Shape 
  {
    public void area()
    {
      double pi=3.14;
      double r=5.2;
      System.out.println("The area of circle is:"+(pi*r*r));
    }
    public void perimeter()
    {
      double pi=3.14;
      double r=5.3;
      System.out.println("The perimeter of circle is:"+(2*pi*r));
    }
  }
class AssShape
  {
    public static void main(String args[])
    {
      Circle c=new Circle();
      c.area();
      c.perimeter();
      Triangle t=new Triangle();
      t.area();
      t.perimeter();
      Square s=new Square();
      s.area();
      s.perimeter();
      Rectangle r=new Rectangle();
      r.area();
      r.perimeter();
    }
  }