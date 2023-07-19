/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.*/
import java.util.Scanner;
class EmployeeArray
  {
    String name;
    String designation;
    int salary;
    public void display()
    {
      System.out.println(name+" "+designation+" "+salary);
    }
    public static void main(String args[])
    {
      EmployeeArray emp[]=new EmployeeArray[3];
      for(int i=0;i<emp.length;i++)
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter employee"+(i+1)+"details");
          emp[i]=new EmployeeArray();
          System.out.println("Enter Employee name");
          emp[i].name=sc.next();
          System.out.println("Enter Employee designation");
          emp[i].designation=sc.next();
          System.out.println("Enter Employee salary");
          emp[i].salary=sc.nextInt();
        }
      for(int i=0;i<emp.length;i++)
        {
          emp[i].display();
        }
    }
  }
