import java.util.Scanner;
class Abc
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();
      char ch[]=s.toCharArray();
      for(int i=0;i<s.length();i++)
      System.out.println(ch[i]);
    }
  }