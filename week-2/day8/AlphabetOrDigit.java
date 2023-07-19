//9. WAP to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;
class AlphabetOrDigit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z'));
      {
        System.out.println("It is a alphabet");
      }
    }
  }