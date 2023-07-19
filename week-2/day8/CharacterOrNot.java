//7. WAP to input any alphabet and check whether it is alphabet or not.//
import java.util.Scanner;
class CharacterOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
      {
        System.out.println(ch+" is an alphabet");
      }
      else
        System.out.println(ch+ " is not an alphabet");
           
    }
  }