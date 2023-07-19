/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Studentmethodthree
{
  String name;
  int rollnumber;
  char grade;
  Studentmethodthree(String n,int r,char g)
  {
    name=n;
    rollnumber=r;
    grade=g;
  }
  public void display()
  {
    System.out.println("Student name :"+name);
    System.out.println("Student rollnumber :"+rollnumber);
    System.out.println("Student grade :"+grade);
  }
  public static void main(String args[])
  {
    Studentmethodthree student=new Studentmethodthree("Rishika",25,'A');
    Studentmethodthree student1=new Studentmethodthree("pandu",20,'A');
    Studentmethodthree student2=new Studentmethodthree("Rashmi",15,'A');
    student.display();
    student1.display();
    student2.display();
  }
}