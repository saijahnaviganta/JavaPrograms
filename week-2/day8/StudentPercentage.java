/*13. WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.Scanner;
class StudentPercentage
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter english marks:");
      int english=sc.nextInt();
      System.out.println("Enter science marks");
      int science=sc.nextInt();
      System.out.println("Enter maths marks:");
      int maths=sc.nextInt();
       System.out.println("Enter social marks:");
      int social=sc.nextInt();
       System.out.println("Enter hindi marks:");
      int hindi=sc.nextInt();
      float sum=(english+science+maths+social+hindi);
      double percentage=(sum/500)*100;
      System.out.println("percentage is"+percentage);
      if(percentage>=90)
      {
        System.out.println("A grade");
      }
      else if(percentage>=80)
      {
        System.out.println("B grade");
      }
      else if(percentage>=70)
      {
        System.out.println("C grade");
      }
      else if(percentage>=60)
      {
        System.out.println("D grade");
      }
      else if(percentage>=40)
      {
        System.out.println("E grade");
      }
      else if(percentage<40)
      {
        System.out.println("F grade");
      }
    }
  }