//WAP to search all occurrences of a character in given string.
import java.util.Scanner;
class AllOccurance
  {
    public static void allOccur(String str,char c)
    {
      for(int i=0;i<str.length()-1;i++)
        {
      System.out.println(str.substring(c));
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("Enter the character");
      char c=sc.next().charAt(0);
      allOccur(str,c);
        }
    }