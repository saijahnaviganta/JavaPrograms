/*Email Validation:
Write a program that takes an email address as input and validates whether it is a valid email format. The email should meet the following criteria:
It should contain an "@" and "." symbol.
It should end with ".com" or ".org".
Write a program that prompts the user to enter an email address and performs the validation. Print "Valid email" if the email address is valid, otherwise print "Invalid email".*/
import java.util.Scanner;
class Emailvalid
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter e mail");
      String s=sc.nextLine();
      int count=0,ecount=0;
          if(s.contains("@")&&s.contains("."))
          {
            count++;
          }
      if(s.endsWith(".com")||s.endsWith(".org"))
      {
        ecount++;
      }
        if(count>0&&ecount>0)
        {
          System.out.println("Email is valid");
        }
        else 
          System.out.println("Email is invalid");
      }
        }