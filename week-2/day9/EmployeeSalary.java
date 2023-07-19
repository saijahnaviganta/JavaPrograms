/*6. Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.*/
import java.util.Scanner;
class EmployeeSalary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the salary");
      double salary=sc.nextDouble();
      double annualsalary=salary*12;
      System.out.println("Annual salary is:"+annualsalary);
      if(annualsalary<=500000)
      {
        System.out.println("No need to pay tax");
        System.out.println("your net salary is"+annualsalary);
      }
      else if((annualsalary>500000)||(annualsalary<800000))
      {
         double tax=((annualsalary*5)/100);
        double netsalary=annualsalary-tax;
        System.out.println("your tax amount is"+tax);
        System.out.println("your net salary is:"+netsalary);
      }
      else if(annualsalary>1000000)
      {
        double tax=((annualsalary*15)/100);
        double netsalary=annualsalary-tax;
        System.out.println("your tax amount is"+tax);
        System.out.println("your net salary is:"+netsalary);
      }
      else
        System.out.println("Invalid amount");
    }
    }