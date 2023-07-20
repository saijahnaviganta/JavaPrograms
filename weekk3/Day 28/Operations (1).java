/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class MathOperations
  {
    public void calculate(int a,int b,int c)
    {
       System.out.println("The addition of three numbers is:"+(a+b+c));
    }
    public void calculate(float a,float b)
    {
      System.out.println("The subraction of two numbers:"+(a-b));
    }
    public void calculate(int a,int b)
    {
      System.out.println("The multiplication of two numbers:"+(a*b));
    }
    public void calculate(int a,float b)
    {
      System.out.println("The division of two numbers is:"+(a/b));
    }
  }
public class Operations
  {
    public static void main(String args[])
    {
      MathOperations mo=new MathOperations();
      mo.calculate(5,10,15);
      mo.calculate(15.9f,12.8f);
      mo.calculate(10,5);
      mo.calculate(5,6.3f);
    }
  }