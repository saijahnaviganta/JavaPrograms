import java.util.Scanner;
class SubstringExtraction
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println(str.substring(6,11));
    }
  }