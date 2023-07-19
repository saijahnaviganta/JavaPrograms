/*Write a program that prompts the user to enter a password. Use a loop to keep asking for the password until a correct one is entered. Use the break statement to exit the loop when the correct password is provided. Implement a menu that allows the user to continue or exit the program.*/
import java.util.Scanner;
class PasswordValidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      do
        {
      int strongpass=123;
      System.out.println("Enter the correct password");
      int Correcpass=sc.nextInt();
       if(strongpass==Correcpass)
       {
         System.out.println("password is correct");
         break;
       }
        else 
         System.out.println("re enter the password");
        }while(true);
      }
    }
