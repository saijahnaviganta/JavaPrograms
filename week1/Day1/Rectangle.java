/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
class Rectangle
  {
    public static void main(String args[])
    {
      double width=5.6,height=8.5;
      System.out.println("Area and perimeter of a rectangle is:");
      double area;
      area=width*height;
      System.out.println("Area is:"+area);
      double peri;
      peri=2*(width+height);
      System.out.println("Perimeter is:"+peri);
    }
  }