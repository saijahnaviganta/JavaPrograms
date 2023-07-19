import java.util.Scanner;
class NestedIfThree
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      if(num<=5)   //outer if
      {
        if(num<3)       //first inner if
        {
          System.out.println("number is lessthan 3");
        }
        if(num!=3)   // second inner if
        {
          System.out.println("number is equal to 3");
        }
        else
        {
          System.out.println("numb is not equal to 3");
        }
      }
      else{
        System.out.println("number is greather than 5");
      }
      
    }
  }
 