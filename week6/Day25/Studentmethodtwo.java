/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
import java.util.*;
class Studentmethodtwo
  {
    String name;
    int rollnumber;
    char grade;
    public void setStudentDetails(String n,int roll,char g)
    {
      name=n;
      rollnumber=roll;
      grade=g;
    }
    public void displayStudentDetails()
    {
      System.out.println("Student's name:"+name);
      System.out.println("Student's rollnumber:"+rollnumber);
      System.out.println("Student's grade:"+grade);
    }
    public static void main(String args[])
    {
      Studentmethodtwo s=new Studentmethodtwo();
      s.setStudentDetails("Jahnavi",20,'A');
      Studentmethodtwo s1=new Studentmethodtwo();
      s1.setStudentDetails("swetha",22,'A');
      Studentmethodtwo s2=new Studentmethodtwo();
      s2.setStudentDetails("rajeswari",26,'A');
      s.displayStudentDetails();
      s1.displayStudentDetails();
      s2.displayStudentDetails();
    }
  }