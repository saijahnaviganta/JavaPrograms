import java.util.Scanner;
class StudentScanner
  {
    public static void studentDetails(String sname,int sage,int smarks,float sper)
    {
      System.out.println("Name:"+sname+" "+"Age:"+sage+" "+"Marks:"+smarks+" "+"Percentage:"+sper);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter student name");
      String sname=sc.nextLine();
      System.out.println("Enter student age");
      int sge=sc.nextInt();
      System.out.println("Enter student marks");
      int smarks=sc.nextInt();
      System.out.println("Enter student percentage");
      float sper=sc.nextFloat();
      System.out.println("The student details are");
      studentDetails(sname,sge,smarks,sper);
    }
  }