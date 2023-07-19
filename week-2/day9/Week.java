import java.util.Scanner;
class Week
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the day:");
      String day=sc.nextLine();
      switch(day)
        {
          case "Monday":
            System.out.println("The day is Monday");
            break;
          case "Tuesday":
            System.out.println("The day is Tuesday");
            break;
          case "Wednesday":
            System.out.println("The day is Wednesday");
            break;
          case "Thursday":
            System.out.println("The day is Thursday");
            break;
          case "Friday":
            System.out.println("The day is Friday");
            break;
          case "Saturday":
            System.out.println("The day is Saturday");
            break;
          default:
            System.out.println("Invalid day");
            break;
        }
    }
  }