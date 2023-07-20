class Shape
  {
    public void area()
    {
      int l=5,b=5;
      System.out.println("The area of rectangle is:"+(l*b));
    }
  }
class Square extends Shape
  {
    public void area()
    {
      int s=5;
      System.out.println("The area of square is:"+(s*s));
    }
  }
class Circle extends Shape
  {
    public void area()
    {
      double pi=3.14,r=5;
      double c=pi*r*r;
      System.out.println("The area of circle is:"+c);
    }
  }
class Triangle extends Shape
  {
    public void area()
    {
      double b=5.63,h=6.42;
      System.out.println("The area of triangle is:"+1/2*b*h);
    }
  }
class Overriding
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape square=new Square();
      square.area();
      Shape circle=new Circle();
      circle.area();
      Shape tri=new Triangle();
      tri.area(); 
    }
  }