/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class CheckingEquality {
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int first=sc.nextInt();
    System.out.println("Enter second number");
    int second=sc.nextInt();
    if(first==second)
    {
      System.out.println(first+"is equal to"+second);
    }
    else
      System.out.println(first+"is not equal to"+second);
  }
}