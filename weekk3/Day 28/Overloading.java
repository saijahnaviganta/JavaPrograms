class Shapes
  {
    void area(int l,int b)
    {
      System.out.println("The area of Rectangle is:"+(l*b));
    }
    void area(float side)
    {
      System.out.println("The area of square is:"+side*side);
    }
    void area(double r)
    {
      double pi=3.14;
      double c=pi*r*r;
      System.out.println("The area of circle is:"+c);
    }
    void area(float b,int h)
    {
      System.out.println("The area of triangle iss:"+(1/2*b*h));
    }
  }
class Overloading
  {
    public static void main(String args[])
    {
      Shapes s=new Shapes();
      s.area(5,10);
      s.area(5);
      s.area(5.6);
      s.area(5,6);
    }
  }