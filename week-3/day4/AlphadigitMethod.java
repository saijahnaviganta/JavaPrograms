import java.util.Scanner;
class AlphadigitMethod
  {
    public static void alphaDigit(char ch)
    {
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z'))
      {
        System.out.println("It is an alphabet");
      }
      else 
        System.out.println("It is a digit");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter character");
      char ch=sc.next().charAt(0);
      alphaDigit(ch);
    }
  }