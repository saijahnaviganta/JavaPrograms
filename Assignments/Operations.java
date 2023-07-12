/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
public class Operations {
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n1=sc.nextInt();
    System.out.println("Enter a number");
    int n2=sc.nextInt();
    System.out.println("The difference of two numbers is"+(n1+n2));
    System.out.println("The product of two numbers is"+(n1*n2));
    System.out.println("The division of two numbers is"+(n1/n2));
    System.out.println("The increment of number is"+(++n1));
    System.out.println("The decrement of number is"+(--n2));
    System.out.println("The remainder of two numbers is"+(n1%n2));
  }
}