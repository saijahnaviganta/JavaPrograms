import java.util.Scanner;
class StudentDetails
  {
    public static void main(String args[])
    {
      String sname;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the student name:");
      sname=sc.nextLine();
      long srollnumber;
      System.out.println("Enter the student rollno:");
      srollnumber=sc.nextLong();
      int sage;
      System.out.println("Enter the student age:");
      sage=sc.nextInt();
      float spercentage;
      System.out.println("Enter the student percentage:");
      spercentage=sc.nextFloat();
      char sgrade;
      System.out.println("Enter the student grade:");
      sgrade=sc.next().charAt(0);
      boolean smaritalstatus;
      System.out.println("Enter the marital status:");
      smaritalstatus=sc.nextBoolean();
      double smobilenumber;
      System.out.println("Enter the student mobile number:");
      smobilenumber=sc.nextDouble();
    }
  }