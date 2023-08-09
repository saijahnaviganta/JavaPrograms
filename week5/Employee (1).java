import java.util.Scanner;
class Employe
  {
    private String name;
    private int id;
    private String designation;
    private long salary;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return this.name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return this.id;
    }
    public void setDesignation(String designation)
    {
      this.designation=designation;
    }
    public String getDesignation()
    {
      return this.designation;
    }
    public void setSalary(long salary)
    {
      this.salary=salary;
    }
    public long getSalary()
    {
      return this.salary;
    }
  }
class EmployeeDetails
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    Employe e[]=new Employe[size];
    public void createEmployee()
    {
     for(int i=0;i<size;i++)
       {
         e[i]=new Employe();
         System.out.println("Enter employe name");
         String name=sc.next();
         e[i].setName(name);
         System.out.println("Enter employe id");
         int id=sc.nextInt();
         e[i].setId(id);
         System.out.println("Enter employe designation");
         String designation=sc.next();
         e[i].setDesignation(designation);
       }
    }
    public void display()
    {
      for(int i=0;i<size;i++)
        {
        System.out.println(e[i].getName()+" "+e[i].getId()+" "+e[i].getDesignation());
        }
    }
    public void updateByName(String name)
    {
       for(int i=0;i<size;i++)
         {
           if(name==e[i].getName())
           {
               e[i].setName(sc.next());
             System.out.println("Employe is updated");
             display();
           }
         }
    }
    public void deleteByName(String n)
    {
      for(int i=0;i<size;i++)
        {
      System.out.println("Enter the index you want to delete");
          int index=sc.nextInt();
          for(int j=index;j<size-1;j++)
            {
              e[j]=e[j+1];
            }
        }
    }
    public void show()
    {
      for(int i=0;i<size-1;i++)
        {
          System.out.println(e[i].getName()+" "+e[i].getId()+" "+e[i].getDesignation());
        }
    }
  }
class Employee
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    EmployeeDetails ed=new EmployeeDetails();
    ed.createEmployee();
      System.out.println("Employess details are");
       ed.display();
    System.out.println("Enter the name you want to insert");
String name=sc.next();
ed.updateByName(name);
      System.out.println("Enter the name you want to delete");
      String n=sc.next();
      ed.deleteByName(n);
      ed.show();
  }    
  }