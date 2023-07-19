import java.util.Scanner;
class NestedIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int age,weight;
      System.out.println("enter you age");
      age=sc.nextInt();
      System.out.println("enter you weight");
      weight=sc.nextInt();
      if(age>=18)
      {
        if(weight>60)
        {
          System.out.println("you are elligilble to donate");
        }
        else{
          System.out.println("your weight is not enough");
        }
      }
      else
      {
        System.out.println("your age is not enough");
      }
      
    }
  }