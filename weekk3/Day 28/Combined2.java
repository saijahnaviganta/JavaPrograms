/*Create a class Shape with a method area that returns 0. Derive two classes Circle and Square from Shape. Override the area method in both derived classes to calculate and return the area of a circle and a square, respectively. Allow the user to input the required parameters (e.g., radius for a circle, side length for a square).*/
class Shape
  {
    public void area()
    {
      System.out.println("Area of circle and square");
    }
  }
class Circle extends Shape
  {
    public void area(int radius)
    {
      double pi=3.14;
      System.out.println("Area of circle is:"+(pi*radius*radius));
    }
  }
class Square extends Shape
  {
    public void area(int side)
    {
      System.out.println("Area of square is:"+(side*side));
    }
  }
class Combined2
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape c=new Circle();
      c.area(5);
      Shape sq=new Square();
      sq.area(6);
    }
  }