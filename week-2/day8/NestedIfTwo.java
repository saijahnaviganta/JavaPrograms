import java.util.Scanner;
class NestedIfTwo
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int age,weight,gap;
      System.out.println("enter you age");
      age=sc.nextInt();
      System.out.println("enter you weight");
      weight=sc.nextInt();
      System.out.println("enter you moths gap");
      gap=sc.nextInt();
      if(age>=18)
      {
        if(weight>60)
        {
          if(gap>3)
        {
          System.out.println("you are elligible");
        }
        }
        else{
          System.out.println("your weight and gap is not enough");
        }
        
      }
      else
      {
        System.out.println("your age is not enough");
      }
      
    }
  }