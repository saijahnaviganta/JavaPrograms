/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
import java.util.Scanner;
class StudentArray
  {
    String name;
    int rollnumber;
    char grade;
    public void setValues(String n,int r,char g)
    {
      name=n;
      rollnumber=r;
      grade=g;
    }
    public void display()
    {
      System.out.println(name+" "+rollnumber+" "+grade);
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        StudentArray arr[]=new StudentArray[3];
          for(int i=0;i<arr.length;i++)
            {
        System.out.println("Enter student"+(i+1)+"details");
        arr[i]=new StudentArray();
        System.out.println("Enter student name");
        String sname=sc.next();
        System.out.println("Enter rollnumber");
        int sroll=sc.nextInt();
        System.out.println("Enter grade");
        char sgrade=sc.next().charAt(0);
        arr[i].setValues(sname,sroll,sgrade);
        }
    for(int i=0;i<arr.length;i++)
  {
   arr[i].display(); 
  }
    }
  }