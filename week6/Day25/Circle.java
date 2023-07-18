/*Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.*/
class Circle
  {
    double radius;
    double pi;
    Circle(double r,double p)
    {
      radius=r;
      pi=p; 
    }
    public void display()
    {
      double coc=2*pi*radius;
      System.out.println("circumference:"+coc);
    }
    public static void main(String args[])
    {
     Circle circle=new Circle(6.0,3.14);
      circle.display();
    }
  }