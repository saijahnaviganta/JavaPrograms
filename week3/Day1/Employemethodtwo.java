/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.*/
import java.util.*;
class Employemethodtwo
  {
    String name;
    String designation;
    int salary;
    public void setEmployeeDetails(String n,String d,int sal)
    {
    name=n;
      designation=d;
      salary=sal;
    }
    public void displayEmployeeDetails()
    {
      System.out.println("The employee name is:"+name);
      System.out.println("The employee designation is:"+designation);
        System.out.println("The employee salary is:"+salary);
    }
    public static void main(String args[])
    {
      Employemethodtwo emp=new Employemethodtwo();
      Employemethodtwo emp1=new Employemethodtwo();
      Employemethodtwo emp2=new Employemethodtwo();
      emp.setEmployeeDetails("Jahnavi","MCA",50000);
      emp1.setEmployeeDetails("Swetha","Pharmacy",70000);
    emp2.setEmployeeDetails("Rajeswari","teacher",90000);
      emp.displayEmployeeDetails();
      emp1.displayEmployeeDetails();
      emp2.displayEmployeeDetails();
    }
  }