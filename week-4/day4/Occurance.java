/*WAP to find first occurrence of a character in a given string.
import java.util.Scanner;
class Occurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("The first occurance of character in a string is:");
      System.out.println(str.indexOf('a'));
        }
    }

import java.util.Scanner;
class Occurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      int str1=str.indexOf(ch);
      System.out.println("The first occurence is:"+str1);
    }
  }*/
import java.util.Scanner;
class Occurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      System.out.println(str.indexOf(ch));
    }
  }