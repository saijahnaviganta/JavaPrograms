/*Assignment 1: Method Overloading

In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:

add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.

Your task is to write the Calculator class and demonstrate the use of these methods by calling each of them with appropriate arguments and printing the results.*/
class Calculator
  {
    public void add(int a,int b)
    {
      System.out.println("Sum of two numbers is:"+(a+b));
    }
    public void add(int a,int b,int c)
    {
      System.out.println("Sum of three numbers is:"+(a+b+c));
    }
    public void add(int a,int b,int c,int d)
    {
      System.out.println("Sum of four numbers is:"+(a+b+c+d));
    }
  }
class Loading3
  {
    public static void main(String args[])
    {
      Calculator c=new Calculator();
      c.add(5,10);
      c.add(5,10,15);
      c.add(5,10,15,20);
    }
  }
