import java.util.Scanner;
class LastOccurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("Enter the chaar");
      char c=sc.next().charAt(0);
      System.out.println("Last occurance of character in a string is");
      System.out.println(str.lastIndexOf(c));
    }
  }