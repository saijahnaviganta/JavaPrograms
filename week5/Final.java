import java.util.*;
class Sample
  {
    
    void display()
    {
      Scanner sc=new Scanner(System.in);
     final int x=sc.nextInt();
      System.out.println("value of x "+x);
      x=50;
       System.out.println("value of x "+x);
    }
  }
class FinalEx
  {
    public static void main(String args[])
    {
      
      Sample sample=new Sample();
      
      sample.display();
    }
  }