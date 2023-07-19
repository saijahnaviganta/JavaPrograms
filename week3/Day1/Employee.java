import java.util.Scanner;
class Employee
  {
    String name;
    int id;
    long salary;
    String designation;
    public void emp()
    {
     System.out.println("The name of employee:"+name);
      System.out.println("The salary is:"+salary);
      System.out.println("The designation is:"+designation);
    }
    public static void main(String args[])
    {
      Employee e=new Employee();
      e.name="jahnavi";
      e.id=14;
      e.salary=50000;
      e.designation="manager";
      Employee e1=new Employee();
      e1.name="swetha";
      e1.id=20;
      e1.salary=70000;
      e1.designation="accountant";
      e.emp();
      e1.emp();
    }
  }