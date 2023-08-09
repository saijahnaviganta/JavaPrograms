abstract class Shape
  {
    abstract void area();
  }
class Rectangle extends Shape
  {
    public void area()
    {
      int length=5,breadth=10;
      System.out.println("The area of rectangle is:"+(length*breadth));
    }
  }
class Square extends Shape{
  public void area()
  {
    int side=5;
    System.out.println("The area of square is:"+(side*side));
  }
}
class Triangle extends Shape 
  {
    public void area()
    {
      double breadth=10,height=4;
      System.out.println("The area of triangle is:"+(1/2*breadth*height));
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
  }
class Abstractshape
  {
    public static void main(String args[])
    {
      Circle c=new Circle();
      c.area();
      Triangle t=new Triangle();
      t.area();
      Square s=new Square();
      s.area();
      Rectangle r=new Rectangle();
      r.area();
    }
  }