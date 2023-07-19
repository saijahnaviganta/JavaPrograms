/*10. WAP to check whether a character is uppercase or lowercase alphabet.*/
import java.util.Scanner;
class UpperOrLower
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      if(ch>='a'&&ch<='z')
      {
        System.out.println("It is a lower case character");
      }
      else
        System.out.println("It is a upper case character");
    }
  }