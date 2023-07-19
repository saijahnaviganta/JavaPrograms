/*14. WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;
class Gross
  {
    public static void main(String args[])
    {
    double grosssalary,hra,da,basicsalary;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter basic salary");
      basicsalary=sc.nextDouble();
      if(basicsalary<=10000)
      {
        hra=basicsalary*0.2;
        da=basicsalary*0.8;
      }
      else if((basicsalary>10000)&&(basicsalary<=20000))
      {
       hra=basicsalary*0.25;
        da=basicsalary*0.9;
      }
      else
      {
        hra=basicsalary*0.3;
        da=basicsalary*0.95;
      }
      grosssalary=basicsalary+hra+da;
      System.out.println("The gross salary is:"+grosssalary);
    }
  }