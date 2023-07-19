/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Employeemethodthree
  {
    String name;
    String designation;
    int salary;
    Employeemethodthree(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println(name+" "+designation+" "+salary);
    }
    public static void main(String args[])
    {
      Employeemethodthree emp=new Employeemethodthree("jahnavi","MCA",60000);
      Employeemethodthree emp1=new Employeemethodthree("swetha","MBA",50000);
      Employeemethodthree emp2=new Employeemethodthree("rajeswari","teacher",70000);
      emp.display();
      emp1.display();
      emp2.display();
    }
  }